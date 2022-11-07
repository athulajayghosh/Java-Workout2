public class OneBHK {
    static float totalPrice=0;
    float roomArea;
    float hallArea;
    float price;

    public OneBHK(){
        roomArea = 500;
        hallArea = 1000;
        price = 1500000;
    }
    public OneBHK(float roomArea,float hallArea,float price){
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
        totalPrice=totalPrice+this.price;
    }
    public void show(){
        System.out.println("One BHK");
        System.out.println("Room Area:"+roomArea+" Sqft");
        System.out.println("Hall Area:"+hallArea+" Sqft");
        System.out.println("Price: "+price);
    }
    public void printTotal(){
        System.out.println("Total Price: "+totalPrice);
    }
}
