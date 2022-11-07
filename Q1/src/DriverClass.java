public class DriverClass {
    public static void main (String args[])
    {
        FullTimeFaculty a = new FullTimeFaculty();
        FullTimeFaculty b = new FullTimeFaculty();
        a.AddData();
        a.ShowData();
        b.AddData();
        b.ShowData();
        PartTimeFaculty x =new PartTimeFaculty();
        PartTimeFaculty y =new PartTimeFaculty();
        x.AddData();
        x.ShowData();
        y.AddData();
        y.ShowData();
    }
}
