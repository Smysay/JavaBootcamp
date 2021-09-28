package bootCamp_Day01;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};
        //                0  1  2  3  4

        System.out.println(numbers[3]);

        int[] numbers2 = {10,20,30,40,50, 60};

        System.out.println(  Arrays.equals(numbers,numbers2) );


        String[] arr = {"A", "B", "C", "D", "E"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for(String each  : arr ){
            System.out.println(each);
        }

        System.out.println("-----------------------------------------");
        int[] nums = {1,2,3,4,5,6,7,8};
        //            0 1 2 3 4 5 6 7

        int[] result = new int[nums.length];

        for(int i = nums.length-1, j=0 ;  i>=0 ;  i--, j++ ){
            result[j] = nums[i];
        }

        System.out.println( Arrays.toString(result)  );







    }


}
