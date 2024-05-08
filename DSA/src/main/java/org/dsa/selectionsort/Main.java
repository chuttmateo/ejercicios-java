package org.dsa.selectionsort;

public class Main {
    public static void main(String[] args) {
        //O(n2)
        int[] nums = {6,2,4,5,3,1};

        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.printf("%d ", num);
        }
        System.out.println();

        //Selection Sort
        int minIndex;
        int tempValue;

        for (int i = 0; i < nums.length - 1; i++) { //this minus 1 is because the last iteration is not needed since this value "arr[length - 1]" is already sorted
            minIndex = i;
            for (int j = i; j < nums.length - 1; j++) {
                if ( nums[minIndex] > nums[j + 1]){
                    minIndex = j + 1;
                }
            }
            //swapping
            tempValue = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = tempValue;

        }


        System.out.println("After Sorting");
        for (int num : nums) {
            System.out.printf("%d ", num);
        }

    }
}
