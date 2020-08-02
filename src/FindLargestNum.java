public class FindLargestNum {
    public static void main(String[] args) {

        double n1=-2.5 ,n2=3.8, n3=1.6;

        if(n1>=n2 && n1>=n3){
            System.out.println(n1+" is the largest number");
        }else if(n2>=n1 && n2>=n3){
            System.out.println(n2+" is teh largest number");
        }else{
            System.out.println(n3+" is the largest number");
        }
    }
}
