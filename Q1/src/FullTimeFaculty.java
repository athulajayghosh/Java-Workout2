import java.util.Scanner;

class FullTimeFaculty extends Faculty {
    float basic;
    float allowance;
    public void AddData(){
        Scanner X = new Scanner(System.in);
        System.out.println("Enter Faculty ID:");
        super.facultyid= X.nextInt();
        System.out.println("Enter Basic:");
        this.basic= X.nextFloat();
        System.out.println("Enter Allowance:");
        this.allowance= X.nextFloat();
    }
    public void CalculateSalary(){
        super.salary=(basic+allowance);
    }
    public void ShowData(){
        CalculateSalary();
        System.out.println("ID= "+facultyid);
        System.out.println("Salary= "+salary);
    }

}
