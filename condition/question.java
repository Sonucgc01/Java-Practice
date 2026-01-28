//Write a Java program that:

//Prompts the user to enter a number (integer) representing marks.

//Checks whether the marks are greater than or equal to 60.

//If the marks are 60 or more, print:


import java.util.Scanner;

class question {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int marks = Integer.parseInt(sc.nextLine());

        if (marks >= 60) {
            System.out.println("you are passed55");
        } else {
            System.out.println("you are fail");
        }
   sc.close();
    }

}