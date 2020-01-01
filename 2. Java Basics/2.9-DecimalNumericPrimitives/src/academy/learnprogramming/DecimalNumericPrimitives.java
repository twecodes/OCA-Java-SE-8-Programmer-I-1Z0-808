package academy.learnprogramming;

public class DecimalNumericPrimitives {

    public static void main(String[] args) {
        //float myNumber = 25.4; //Incompatible types; Required float found double
        float myNumber = 25.4f;
        //double before = 10_.25; //Illegal unberscore
        //double after = 10._25; //Illegal unberscore
        //double first = _10.25; //Illegal unberscore
        //double last = 10.25_; //Illegal unberscore

        double myDouble = 2.54; //default is double
        double myDouble2 = 2.54F; //converted to double
        double anotherDouble = 2.54D; //D or d can be used for double it is optional

        double scientific = 5.000125E03;
        double scientific2 = 5.000125E3;
        //double scientific3 = 5.000125F3; //will not compile due to F
        double myDouble3 = 5000.125;

        System.out.println("scientific="+scientific);
        System.out.println("scientific2="+scientific2);
        System.out.println("myDouble3="+myDouble3);

        double hexPi = 0x1.91eb851eb851fp1;
        System.out.println("hexPi="+hexPi);

    }
}
