
// User se salary, years of service, and department code input lo aur bonus decide karo:

// Rules:

// Salary > 50,000 and Years >= 5 → "High Bonus"

// Salary 30,000–50,000 and Years >= 3 → "Medium Bonus"

// Department code = "HR" → "Special Bonus" (ignore salary/years)

// Baaki sab → "No Bonus"// 


import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.print("Years of service: ");
        int service = sc.nextInt();

        System.out.print("Department Code: ");
        String dept = sc.next();

        // Priority: HR gets Special Bonus first
        if(dept.equalsIgnoreCase("HR")) {
            System.out.println("Bonus: Special Bonus");
        }
        else if(salary > 50000 && service >= 5) {
            System.out.println("Bonus: High Bonus");
        }
        else if(salary >= 30000 && salary <= 50000 && service >= 3) {
            System.out.println("Bonus: Medium Bonus");
        }
        else {
            System.out.println("Bonus: No Bonus");
        }

        sc.close();
    }
}
