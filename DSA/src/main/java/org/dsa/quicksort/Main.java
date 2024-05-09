package org.dsa.quicksort;

public class Main {
    public static void main(String[] args) {
        //O(n log n)
        int[] nums = {5,3,6,1,4,2};

        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.printf("%d ", num);
        }
        System.out.println();

        //Quick Sort
        quickSort(nums, 0, nums.length-1);
        //

        System.out.println("After Sorting");
        for (int num : nums) {
            System.out.printf("%d ", num);
        }
    }
    public static void quickSort(int[] arr, int low, int high){
        if (low < high){
            int pi= partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low -1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}
