public class TwoBHK extends OneBHK{
    float room2Area;

    public TwoBHK(){
        room2Area = 700;
        super.price= 2000000;
        totalPrice=totalPrice+price;
    }
    public TwoBHK(float roomArea,float room2Area,float hallArea,float price){
        super.roomArea = roomArea;
        this.room2Area = room2Area;
        super.hallArea = hallArea;
        super.price = price;
        totalPrice=totalPrice+price;
    }
    public void show(){
        System.out.println("Two BHK");
        System.out.println("Room Area 1:"+roomArea+" Sqft");
        System.out.println("Room Area 2:"+room2Area+" Sqft");
        System.out.println("Hall Area:"+hallArea+" Sqft");
        System.out.println("Price: "+price);
    }
}
