package bootCamp_Day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer>  list = new ArrayList<>();
        list.addAll( Arrays.asList(  1,2,3,4,5,6,7,8,9,10  ) );

        list.remove(2);
        System.out.println(list.size());


        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(  Arrays.asList('A', 'A', 'B', 'C', 'C', 'D'  , 'A', 'A', 'A', 'E' )  );

        Collections.swap(chars ,4, 2  );

        System.out.println(chars);

        // frequency of 'A'
       int countA =  Collections.frequency(chars, 'A');

        System.out.println("countA = " + countA);

        System.out.println("----------------------------------------");
        for(Character each : chars ){
            int countEach = Collections.frequency(chars, each);
            if(countEach == 1) {
                System.out.println(each);
            }
        }

        System.out.println("-----------------------------------------");
        int[] arr = {1,1,1,2,2,2,2,3,3,3,3,4,4,4,4};
        ArrayList<Integer>  numbersList = new ArrayList<>();     //{1,2,3,4};

        for(int each : arr){
            if(!numbersList.contains(each)){
                numbersList.add(each);
            }
        }


        System.out.println(numbersList);



    }

}
