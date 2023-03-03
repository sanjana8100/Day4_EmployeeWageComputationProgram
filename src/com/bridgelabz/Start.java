package com.bridgelabz;

public class Start {
    public double CheckEmpPresentOrNot(){
        System.out.println("Checking whether the Employee is Present or Absent...");
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if(empCheck==1.0)
            System.out.println("Employee is PRESENT.");
        else
            System.out.println("Employee is ABSENT.");
        return empCheck;
    }

    public int CalculateDailyEmpWage(double EmpPresent){
        int empHours,empWage,empWagePerHour=20;
        switch((int) EmpPresent){
            case 1:
                empHours = 8;
                System.out.println("Employee is working FULL TIME.");
                break;
            case 2:
                empHours = 4;
                System.out.println("Employee is working PART TIME.");
                break;
            default:
                empHours=0;
                break;
        }

        empWage = empHours * empWagePerHour;
        System.out.println("Employee Hours: "+empHours);
        System.out.println("Employee Daily Wage: "+empWage);
        return empWage;
    }
    public static void main(String[] main){
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        Start obj= new Start();
        double empPresent = obj.CheckEmpPresentOrNot();
        int empDailyWage= obj.CalculateDailyEmpWage(empPresent);

    }
}
