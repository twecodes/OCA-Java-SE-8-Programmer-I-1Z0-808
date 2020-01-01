package academy.learnprogramming;

import static academy.learnprogramming.Config.*;
import static java.lang.Math.*;
import static java.lang.System.out;

public class StaticImportsExample {

    public static void main(String[] args) {
        int min = Math.min(5,7);
        out.println("min="+min);
        out.println(PI);

        //Config.printConfig();
        printConfig();
        out.println("name="+NAME);
        out.println("columnCount="+MAX_COLUMN_COUNT);
    }
}
