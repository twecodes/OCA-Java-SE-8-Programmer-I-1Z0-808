package academy.learnprogramming;

import a.b.c.d.*;
import java.util.Random;
import java.lang.System;

public class ImportExample {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(5));

        MyClass myClass = new MyClass();
        ExampleClass exampleClass = new ExampleClass();
    }
}
