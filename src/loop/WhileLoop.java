package loop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number=scan.nextInt();

        int count=1;

        while(count<number){
            System.out.print(count+",");
            count++;
        }

    }


}

