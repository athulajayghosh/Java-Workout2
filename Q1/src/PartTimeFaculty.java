import java.util.Scanner;

public class PartTimeFaculty extends Faculty {
    int hour;
    float rate;

    public void AddData(){
        Scanner X = new Scanner(System.in);
        System.out.println("Enter Faculty ID:");
        super.facultyid= X.nextInt();
        System.out.println("Enter Hour:");
        this.hour= X.nextInt();
        System.out.println("Enter Rate:");
        this.rate= X.nextFloat();
    }
    public void CalculateSalary(){
        super.salary=(hour*rate);
    }
    public void ShowData(){
        CalculateSalary();
        System.out.println("ID= "+facultyid);
        System.out.println("Salary= "+salary);
    }
}
