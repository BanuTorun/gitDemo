package loop;

import java.util.Scanner;
//nested loop
public class DrinkType {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please type your selection");
        int typeSelection=scan.nextInt();
        System.out.println("Please type your drink selection");
        int drinkSelection=scan. nextInt();
        System.out.println("what would like to drink?");
        String drink=scan.next();
        System.out.println("How much is it?");
        double price=scan.nextDouble();

       // int typeSelection=1;
       // int drinkSelection=1;
       // double price;
       // String drink;

        if(typeSelection==1){
            System.out.println("Hot drinks: 1.tea,2.coffee");
            if(drinkSelection==1){
                price=2.0;
                drink="tea";
            }else if(drinkSelection==2){
                price=4.0;
                drink="coffee";

            }else{
                System.out.println("invalid hot drink selection");
            }
        }else if(typeSelection==2){
            System.out.println("cold drink:1.ice-Tea, 1.Lemonade");
            if(drinkSelection==1){
                price=3.2;
                drink="ice-tea";
            }else if(drinkSelection==2){
                price=3.5;
                drink="lemonade";
            }else{
                System.out.println("invalid cold drink selection");
            }
        }else{
            System.out.println("invalid drink selection");
        }
    }
}
