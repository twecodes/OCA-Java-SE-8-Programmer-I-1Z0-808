package academy.learnprogramming;

public class Main {

    /**
     * This is main method.
     * @param args
     */
    public static void main(String[] args) {
        //printing the size of arguments
        System.out.println("args-size=" + args.length);

        /* printing the arguments
        * like
        * Java Certification*/
        for(int i=0; i<args.length; i++) {
            System.out.println("args["+i+"]="+args[i]);
        }

        sum(4,3);
    }

    /**
     * Calcuate sum of two integers.
     * @param a operand
     * @param b operand
     * @return a+b
     */
    public static int sum(int a, int b){
        return a+b;
    }
}
