// an array arr[] of N integers, calculate the median.
class Solution
{
    public int find_median(int[] v)
    
    {   Arrays.sort(v);
        int a;
        if (v.length%2==0){
            a=(v[v.length/2]+v[(v.length/2)-1])/2;
        }else{
            a=v[v.length/2];
        }
    return a;}
}