package loop;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,34,56,789};

        for(int each:arr){
            if(each%2==0){
                System.out.println("Even Number: "+each);
            }
        }
        System.out.println();
        System.out.println("===========================================");

        String[]array={"BBBAAACCCCDE"};

        for(String each: array){
            if (each.contains("B")){
                System.out.println("Found B and getting out");
                break;
            }
            System.out.println(each+" ");
        }
        for(int i=0; i<array.length;i++){
            System.out.println(array[i]);
            System.out.println(Arrays.toString(array));
        }

    }
}
