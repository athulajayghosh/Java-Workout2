public class CallByReference {
    int a, b;
    CallByReference(int i, int j)
    {
        a=i;
        b=j;
    }
    void swap(CallByReference ob)
    {
        int c;
        c=ob.a;
        ob.a=ob.b;
        ob.b=c;
        System.out.println("After swapping inside Method");
        System.out.println(" a = " + ob.a);
        System.out.println("b = " + ob.b);
    }
}
class SwapCallByRef {
    public static void main(String[] args) {
        CallByReference ob = new CallByReference(2, 3);
        System.out.println("before swapping outside Method");
        System.out.println(" a = " + ob.a);
        System.out.println("b = " + ob.b);
        ob.swap(ob);
        System.out.println("After swapping outside Method");
        System.out.println(" a = " + ob.a);
        System.out.println("b = " + ob.b);
    }
}


