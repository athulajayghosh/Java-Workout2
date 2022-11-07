import java.util.Scanner;

public class Floor {
    int length;
    int width;

    void getData(){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Length:");
        length=scn.nextInt();
        System.out.println("Enter Width:");
        width=scn.nextInt();
    }

    void totaltile(Tile t){
        int n;
        n=(length*width)/(t.edgeLength*t.edgeLength);
        System.out.println("Total Tile needed:"+n);
    }
}
