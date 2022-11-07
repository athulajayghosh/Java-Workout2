public class DriverClass {
    public static void main (String args[]){
        TwoBHK a = new TwoBHK();
        TwoBHK b = new TwoBHK(500,600,700,1300000);
        TwoBHK c = new TwoBHK(300,700,1000,3500000);

        a.show();
        b.show();
        c.show();
        c.printTotal();
    }
}
