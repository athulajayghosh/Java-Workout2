import java.util.Random;

public class TestMedicine {
    public static void main (String args[]){
        int i;
        Random rn = new Random();

        Tablet[] tabs = new Tablet[3];
        Syrup[] syrs = new Syrup[3];
        Ointment[] oint = new Ointment[3];
        for (i=0;i<3;i++) {
            int n = rn.nextInt(3) + 1;

            if (n==1){
                tabs[i]= new Tablet();
                tabs[i].displayLabel();
            }
            else if (n==2){
                syrs[i] = new Syrup();
                syrs[i].displayLabel();
            }
            else{
                oint[i] = new Ointment();
                oint[i].displayLabel();
            }
        }

    }
}
