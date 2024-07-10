import java.util.*;
class Intersection_2_array{
    public static void main(String ars[]){
        int[] arr1={1,2,3,3,4};
        int[] arr2={4,5,7};

        int left=0,right=0;
        List<Integer> res=new ArrayList<>();
        while(left<arr1.length && right<arr2.length){

            //neglecting duplicates
            while(left>0 && left<arr1.length && arr1[left]==arr1[left-1]){
                left++;
            }
            while(right>0 && right<arr2.length && arr2[right]==arr2[right-1]){
                right++;
            }

            if(left>=arr1.length && right>=arr2.length){
                break;
            }
            if(arr1[left]<arr2[right]){
                left++;
            }else if(arr2[right]<arr1[left]){
                right++;
            }else{
                res.add(arr1[left]);
                left++;
                right++;
            }
        }
        System.out.println(res);
    }
}