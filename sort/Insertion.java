package sort;

import java.util.Arrays;
/**
 * Write a description of class Insertion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Insertion
{
  
  /**
   * Returns the sorted array
   */
  public static int[] sort(int[] arr) {
    // Your algorithm goes here!
    int[] newArray = new int[arr.length];
    int j = 0;
    newArray[0] = arr[0];
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            if (newArray[j] > arr[i + 1]) {
                int oldVal = newArray[j];
                j++;
                newArray[j] = oldVal;
                newArray[j - 1] = arr[i + 1];
            }
        }
        if (newArray[j] > arr[i]) {
            newArray[j] = arr[i];
        }
    }
    return newArray;
  }
  
  public static void main(String[] args) {
    int[] arr = {53,85,93,25,39,27,42,5,24,45,33,51,5,80,4,7,91,
      31,66,71,32,19,79,58,61,82,89,63,7,4,50,10,48,24,75,19,22,
      73,54,51,25,33,20,52,79,97,70,54,63,49};    
    
    System.out.println(Arrays.toString(sort(arr)));
    // Test the sort
    testSort(sort(arr));
  }
  
  public static void testSort(int[] arr) {
    for (int i=0; i<arr.length-1; i++) {
      if (arr[i] > arr[i+1]) {
        System.out.println("FAIL at index "+i);
        System.out.println(Arrays.toString(arr));
        return;
      }
    }
    System.out.println("SUCCESS!");
  }

}
