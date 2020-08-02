public class VowelConsonant {
    public static void main(String[] args) {
        char ch='i';

        if(ch=='a'||ch=='e'||ch=='o'||ch=='u'){
            System.out.println(ch+" is vowel");

        }else{
            System.out.println(ch+" is consonant");
        }

        char ch1='z';

        switch(ch1){
            case 'a':
            case 'i':
            case 'u':
            case 'o':
            case 'e':
                System.out.println(ch1+" is vowel");
                break;
            default:
                System.out.println(ch1+" is consonant");
        }

    }
}
