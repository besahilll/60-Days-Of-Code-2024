/*Move all negative elements to end maintaining the order of elements
Time complexity: O(n)
Space Complexity: O(n)*/
class Move_negative_maintain_order{
    public void segregateElements(int[] arr) {
        
     int[] result=new int[arr.length];
     int posIndex=0;
     
     //store positive integers
     for(int value:arr){
         if(value>0){
             result[posIndex++]=value;
         }
     }
     //store negative integers
     for(int value:arr){
         if(value<0){
             result[posIndex++]=value;
         }
     }
     
     System.arraycopy(result,0,arr,0,arr.length);
}