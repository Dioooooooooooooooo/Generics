package Arithmetic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        double num2 = 0;
        int op;

        System.out.print("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number ");
        num2 = sc.nextDouble();
        System.out.print(
                "0 - ADDITION\n" +
                "1 - SUBTRACTION\n" +
                "2 - MULTIPLICATION\n" +
                "3 - DIVISION\n" +
                "4 - MINIMUM NUMBER\n" +
                "5 - MAXIMUM NUMBER\n" + "Enter an operation: ");
        op = sc.nextInt();

        Arithmetic<Integer, Double> arith = new Arithmetic<>(num1, num2);

        switch (op){
            case 0:
                System.out.println("Addition: " + arith.add());
                break;
            case 1:
                System.out.println("Subtraction: " + arith.subtract());
                break;
            case 2:
                System.out.println("Subtraction: " + arith.multiply());
                break;
            case 3:
                System.out.println("Subtraction: " + arith.divide());
                break;
            case 4:
                System.out.println("Subtraction: " + arith.getMin());
                break;
            case 5:
                System.out.println("Subtraction: " + arith.getMax());
                break;
        }



    }
}