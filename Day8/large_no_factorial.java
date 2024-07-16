class Solution {
    static ArrayList<Integer> factorial(int N) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0,1);
        int size=1;
        //variable to traverse from 2 to n
        int val=2,c=0;
        while(val<=N){
            //traverse arraylist from right to left
            for(int i=size-1;i>=0;i--){
                //updat value in arraylist
                int temp=result.get(i)*val +c;
                //store the last digit at index and add remaining to carry
                result.set(i,temp%10);
                //update carry
                c=temp/10;
            }
            
            //insert carry to the beginning of arraylist
            while(c!=0){
                result.add(0,c%10);
                c=c/10;
                size++;
            }
            val++;
        }
        return result;
    }
}
