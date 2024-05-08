package org.dsa.bubblesort;

public class Main {
    public static void main(String[] args) {
        //O(n2)
        int[] nums = {6,2,4,5,3,1};

        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.printf("%d ", num);
        }
        System.out.println();

        //bubble sort
        int tempValue;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length -i - 1; j++) {
                if (nums[j] > nums[j + 1]){
                    //swapping
                    tempValue = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tempValue;
                }
            }
        }





        System.out.println("After Sorting");
        for (int num : nums) {
            System.out.printf("%d ", num);
        }
    }
}
