package task5;

public class Calculator {
    interface IntegerMath {
        int operation(int a, int b);
    }

    public int operateBinary(int a, int b,IntegerMath op) {
        //invoking one "int operation(int a, int b)" of IntegerMath realization
        //which described below in "main" method
        return op.operation(a, b);
    }

    public static void main(String... args) {
        //creating new instance of Calculator
        Calculator myApp = new Calculator();

        //creating new anonymous local class instance of IntegerMath with "int operation(int a, int b)" realisation
//        IntegerMath test = new IntegerMath() {
//            @Override
//            public int operation(int a, int b) {
//                return a + b;
//            }
//        };
//        same as lambda expression of
        IntegerMath addition = (a, b) -> a + b;

        //creating new anonymous local class instance of IntegerMath with "int operation(int a, int b)" realisation
//        IntegerMath test = new IntegerMath() {
//            @Override
//            public int operation(int a, int b) {
//                return a - b;
//            }
//        };
//        same as lambda expression:
        IntegerMath subtraction = (a, b) -> a - b;


        //invoking them in "int operateBinary(int a, int b,IntegerMath op)"
        System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " +  myApp.operateBinary(20, 10, subtraction));
    }
}

