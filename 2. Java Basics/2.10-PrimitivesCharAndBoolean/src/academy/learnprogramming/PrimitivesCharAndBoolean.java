package academy.learnprogramming;

public class PrimitivesCharAndBoolean {

    public static void main(String[] args) {
        char ch = 'a';
        //char ch = 'ab'; // it will not compile
        char ch1 = '1';
        char uniChar = '\u03A9'; // upper case greek omega character
        char romanNumber = '\u216C'; // roman 50 number i.e. L

        System.out.println("ch="+ch);
        System.out.println("ch1="+ch1);
        System.out.println("uniChar="+uniChar);
        System.out.println("romanNumber="+romanNumber);

        boolean myBoolean = true;
        boolean myFalseBoolean = false;

        System.out.println("myBoolean="+myBoolean);
        System.out.println("myFalseBoolean="+myFalseBoolean);

        //boolean true = false; // it will not compile and give variable expected error
    }
}
