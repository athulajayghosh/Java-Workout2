import java.io.PrintStream;

public class Employee {
    String name;
    int empID;
    String result="Demoted" ;
    int ass1;
    int ass2;
    int ass3;
    
    Employee(String name,int empID, int ass1,
             int ass2,int ass3){
        this.name=name;
        this.empID=empID;
        this.ass1=ass1;
        this.ass2=ass2;
        this.ass3=ass3;

        if (ass1>75 && ass1<=100 &&
                ass2>75 && ass2<=100 &&
                ass3>75 && ass3<=100){
            result = "Promoted";
        }
    }

    public float calculatePercentage(){
        float perc = (((ass1+ass2+ass3)*100)/300);
        System.out.println("%"+perc);
        return perc;
    }

    public void showData(){
        System.out.println("Name: "+name);
        System.out.println("Emp ID:  "+empID);
        System.out.println("Result:"+result);
        System.out.println("Percentage: "+calculatePercentage());
    }
}
