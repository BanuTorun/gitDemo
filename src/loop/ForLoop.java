package loop;

import java.util.Arrays;

public class ForLoop {
    public static void main(String[] args) {
        for(int n=1; n<=5; n++){
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println("===============================================");

        for( int i=1; i<=10; i+=2){
            System.out.print(i+" ");

        }
        System.out.println();
        int j;
        for(j=10;j>=0;j-- ){
            System.out.print(j+" ");
        }

        System.out.println();
        System.out.println("==========================================");

        for(int k=0; k<20;k++){
            if(k%2==0){
                System.out.println("even number: "+k);
            }else{
                System.out.println("odd number: "+k);
            }
        }

        System.out.println();
        System.out.println("===========================================");

        String[] fruits=new String [3];
        fruits[0]="apple";
        fruits[1]="fig";
        fruits[2]="banana";

        for(int f=0; f<3;f++ ){
            System.out.println(Arrays.toString(fruits));
            System.out.println(fruits[f]);
        }



    }

}
