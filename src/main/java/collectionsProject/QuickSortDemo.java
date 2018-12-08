/**
 * package with examples used in the T-University
 */
package collectionsProject;

import java.util.Arrays;
import java.util.Random;


/**
 * Class that implements the method sort
 * @author disern
 *
 */
class QuickSort {

    private int input[];
    private int length;

    /**
     * public method to sort the given array of numbers
     * @param numbers
     */
    public void sort(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            return;
        }
        this.input = numbers;
        length = numbers.length;
        quickSort(0, length - 1);
    }

    /*
     * This method implements in-place quicksort algorithm recursively.
     */
    private void quickSort(int low, int high) {
        int i = low;
        int j = high;

        // pivot is middle index
        int pivot = input[low + (high - low) / 2];

        // Divide into two arrays
        while (i <= j) {

        	while (input[i] < pivot) {
                i++;
            }
            while (input[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                // move index to next position on both sides
                i++;
                j--;
            }
        }

        // calls quickSort() method recursively
        if (low < j) {
            quickSort(low, j);
        }

        if (i < high) {
            quickSort(i, high);
        }
    }

    /**
     * Swap the value of two numbers
     * @param i
     * @param j
     */
    private void swap(int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}


/**
 * @author disern
 *
 */
public class QuickSortDemo{

    public static void main(String args[]) {
    	    	
    	Random randomGenerator = new Random(12345);   // constant seed to the generator
    	
    	int[] arrayNumbers = new int[50];
    	for (int i=0; i<arrayNumbers.length; i++) {
    		arrayNumbers[i] = randomGenerator.nextInt(1000);
    	}
    	
        System.out.println("Initial array :" + Arrays.toString(arrayNumbers));

        QuickSort sortAlgorithm = new QuickSort();

        // sorting integer array using quicksort algorithm
        sortAlgorithm.sort(arrayNumbers);

        // sorted array
        System.out.println("Sorted array :" + Arrays.toString(arrayNumbers));
        
        
        // example:
        // Initial array :[251, 80, 241, 828, 55, 84, 375, 802, 501, 389, 517, 942, 390, 806, 12, 384, 787, 303, 532, 175, 801, 351, 792, 316, 428, 781, 425, 943, 871, 439, 729, 397, 501, 825, 903, 555, 952, 831, 10, 108, 396, 582, 99, 758, 318, 580, 412, 691, 350, 728]
     	// Sorted array :[10, 12, 55, 80, 84, 99, 108, 175, 241, 251, 303, 316, 318, 350, 351, 375, 384, 389, 390, 396, 397, 412, 425, 428, 439, 501, 501, 517, 532, 555, 580, 582, 691, 728, 729, 758, 781, 787, 792, 801, 802, 806, 825, 828, 831, 871, 903, 942, 943, 952]


    }
}
