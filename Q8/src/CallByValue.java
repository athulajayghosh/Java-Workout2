public class CallByValue {

        public static void swapFunction(int a, int b) {
            int c = a;
            a = b;
            b = c;
            System.out.println("After swapping inside function");
            System.out.println(" a = " + a);
            System.out.println("b = " + b);

        }
        public static void main(String[] args){
            int a = 10;
            int b = 20;
            System.out.println("before swapping outside function");
            System.out.println(" a = " + a);
            System.out.println("b = " + b);
            swapFunction(a, b);
            System.out.println("After swapping outside function");
            System.out.println(" a = " + a);
            System.out.println("b = " + b);
        }
}

