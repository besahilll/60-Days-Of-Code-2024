//One number 'A' from set {1, 2,....,N} is missing and one number 'B' occurs twice in array. Find these two numbers.
class Solve {
    int[] findTwoElement(int arr[], int n) {
         int b[]=new int[2];
        int max=Integer.MIN_VALUE;
        int a[]=new int[n+1];
        for(int i=0;i<arr.length;i++)
        {
            a[arr[i]]++;
        }
        for(int i=1;i<a.length;i++)
        {
            if(a[i]==2)
            {
                b[0]=i;
                break;
            }
        }
        for(int i=1;i<a.length;i++)
        {
            if(a[i]==0)
            {
                b[1]=i;
                break;
            }
        }
        return b;
    }
}