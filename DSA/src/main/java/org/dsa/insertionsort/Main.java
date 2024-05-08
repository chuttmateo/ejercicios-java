package org.dsa.insertionsort;

public class Main {
    public static void main(String[] args) {
        //
        int[] nums = {6,2,4,5,3,1};

        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.printf("%d ", num);
        }
        System.out.println();

        //Insertion Sort
        int j;
        int tempValue;
        for (int i = 1; i < nums.length; i++) {
            j=i-1;
            tempValue=nums[i];
            while (j >= 0 && tempValue < nums[j]){
                nums[j+1] = nums[j]; //shifting
                j--;
            }
            nums[j+1] = tempValue;
        }
        //end

        System.out.println("After Sorting");
        for (int num : nums) {
            System.out.printf("%d ", num);
        }

    }
}
