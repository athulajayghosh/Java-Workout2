public class CountObject {
    private static int count;
    public CountObject(){
        count++;
    }
    protected void finalize(){
        count--;
    }
    public static void main (String args[]){
        //creating objects
        CountObject ob1 = new CountObject();
        CountObject ob2 = new CountObject();
        CountObject ob3 = new CountObject();
        CountObject ob4 = new CountObject();
        CountObject ob5 = new CountObject();
        System.out.println("Total Alive Objets After creating:"+CountObject.count);
        ob5 =null;
        ob1 = null;
        System.gc();
        System.out.println("Total Alive Objets after deleting:"+CountObject.count);
    }
}
