/*Move all negative elements to beginning without maintaining order
Time complexity: O(n)
Space Complexity: O(n)*/
import java.util.*;
class Move_negative_number{
    public static void move_number(int[] arr){
        int left=0, right=arr.length-1;

        while(left<right){
            while(arr[left]<0)left++;
            while(arr[right]>0)right--;

            if(left>=right)break;

            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp; 
        }
    }
    public static void main(String[] args){
        int[] arr={-1,3,4,2,-6,-5,7,8,9};
        move_number(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}