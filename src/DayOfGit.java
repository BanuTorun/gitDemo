import java.util.Arrays;

public class DayOfGit {
    public static void main(String[] args) {
        String []arr={"Ismail,Aras,Tulpar,Banu"};
        System.out.println(Arrays.toString(arr));
        birthday("01/01/1977","13.09.2014","17.06.2016");
    }
    public static int birthday(String dob1, String dob2, String dob3){
        dob1="01.01.1977";
        dob2="13.09.2014";
        dob3="17.06.2016";
        int result= Integer.parseInt(dob1.substring(6));
        result+= Integer.parseInt(dob1.substring(6));
        result+= Integer.parseInt(dob1.substring(6));
                return result;
    }
}
