package bootCamp_Day01;

public class LoopsPractice {

    public static void main(String[] args) {
        
        String str = "SumeyseA ";
            //        01234567

        String result = "";
        for(int i = str.length()-1 ; i >= 0; i--){
            result += str.charAt(i);
        }

        System.out.println( result);


        String result2 = "";
        int j = str.length()-1;
        while(j >= 0){

            result2 += str.charAt(j);
            j--;
        }

        System.out.println(result2);

        System.out.println("==========================================");

        String s1 = "aaabbbccc";
        String r = "";   // "abc"

        for(String each   : s1.split("") ){
            if( r.contains(each)){
                continue; // skips
              // break; // exits the loop
            }
            r += each;
        }


        System.out.println(r);

        
        
        
    }
    
}
