package com.newProject;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit =false;
        while (!quit){
            menu();
            System.out.print("Enter your choice : ");
            String ForP = scanner.nextLine();
            switch (ForP) {
                case "1":
                    fullTime();
                    break;
                case "2":
                    partTime();
                    break;
                case "0":
                    quit = true;
                    break;
                default:
                    System.out.println("enter 1 or 2 ");
            }
        }
        }
        static void menu(){
            System.out.println("------------- Wage Calculator ---------------");
            System.out.println("'1' - for Full Time");
            System.out.println("'2' - for Part Time");
            System.out.println("'0' - for Quit ");

        }
        static void partTime(){
            System.out.print("Enter name : ");
            String name = scanner.nextLine();
            System.out.print("Enter rate per hour : ");
            double rate = scanner.nextDouble();
            System.out.print("no. of hours worked : ");
            int hours = scanner.nextInt();
            PartTimeEmployee newPartEmployee = new PartTimeEmployee(name,rate,hours);
            System.out.println("monthly wage of "+ newPartEmployee.getName()+" : "+newPartEmployee.getWage());
        }
        static void fullTime(){
            System.out.print("Enter name : ");
            String name = scanner.nextLine();
            FullTimeEmployee newFullEmployee = new FullTimeEmployee(name,5000);
            System.out.println(" wage of "+ newFullEmployee.getName()+" : "+newFullEmployee.getMonthlySalary());
        }

    }


