import java.util.Scanner;

public class Tile {
    int edgeLength;

    Tile() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Edge length of tile:");
        edgeLength=scn.nextInt();
    }
}
