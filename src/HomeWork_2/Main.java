package HomeWork_2;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        printArr(randomArr(16));
    }

//          int[] arr = {2, 3, 2, 3, 3, 2, 3, 2};
//          for (int i = 0; i < arr.length; i++) {
//              if (arr[i] == 2) {
//                  arr[i]++;
//              } else {
//                  arr[i]--;
//              }
//          }
//          System.out.println(Arrays.toString(arr));


//          int[] array = new int[8];
//          for(int i = 0; i < array.length; i++) {
//              array[i] = i * 3;
//          }
//          System.out.println(Arrays.toString(array));


//            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//            for(int i = 0; i < arr.length; i++) {
//                if(arr[i] < 6) {
//                    arr[i] *= 2;
//                }
//            }
//            System.out.println(Arrays.toString(arr));


    public static int[][] randomArr (int n) {
        int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j || (i + j) == n - 1) {
                    arr[i][j] = 1;
                }
            }
        }
        return arr;
    }

    public static void printArr (int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}