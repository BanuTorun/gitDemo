package loop;

public class DoWhileLoop {
    public static void main(String[] args) {
         int apples=1;
         do{
             System.out.println("Eating an apples- "+apples);
             apples++;
         }while(apples<=10);
        System.out.println("No more apples");

        System.out.println("===========================================");

        int number=1;
        int until=10;
        do{
            System.out.print(number+" ,");
            number++;
        }while(number<=until);
    }
}
