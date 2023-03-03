package com.bridgelabz;

public class Start {

    public void CheckEmpPresentOrNot(){
        System.out.println("Checking whether the Employee is Present or Absent...");
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if(empCheck==1.0)
            System.out.println("Employee is PRESENT.");
        else
            System.out.println("Employee is ABSENT.");
    }
    public static void main(String[] main){
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        Start obj= new Start();
        obj.CheckEmpPresentOrNot();
    }
}
