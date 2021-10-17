import java.util.Scanner;

public class RunEmployee {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Employee employee = new Employee();
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();

        System.out.print("Enter the name: ");
        employee.setName(sc.nextLine());

        System.out.print("Press F for Full Time or P for Part Time: ");
        String press = sc.nextLine();


        if(press.equalsIgnoreCase("F")) {
            System.out.print("Enter your monthly salary: ");
            fullTimeEmployee.setMonthlySalary(sc.nextDouble());
            System.out.println("Name: " + employee.getName() + "\nMonthly Salary: " + fullTimeEmployee.getMonthlySalary());

        } else if(press.equalsIgnoreCase("P")) {
            System.out.println("Enter rate per hour and no. of hours worked seperated by space: ");
            System.out.println("Sample: 107.50 13");
            String[] input = sc.nextLine().split(" ");
    
            partTimeEmployee.setRatePerHour(Double.parseDouble(input[0]));
            partTimeEmployee.setHoursWorked(Integer.parseInt(input[1]));
          
            System.out.printf("\nName: " + employee.getName() + "\nWage: %.2f",partTimeEmployee.getWage());

        } else {
            System.out.println("YOU ENTERED AN INVALID INPUT!");
        }
        
        sc.close();
    
    }
}
