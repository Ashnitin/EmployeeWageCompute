package com.bridglabz;

public class EmployeeWage {
    //constant
    public static final int IS_PART_Time=1;
    public static final int IS_FULL_TIME=2;
    public static int computeEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
        //variable
        int empHrs=0,totalEmphrs=0,totalWorkingDays=0;
        //computation
        while(totalEmphrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays){
            totalWorkingDays++;
            int empCheck=(int) Math.floor(Math.random()*10)%3;
            switch (empCheck){
                case IS_PART_Time :
                    empHrs=4;
                    break;
                case  IS_FULL_TIME:
                    empHrs=8;
                    break;
                default:
                    empHrs=0;
            }
            totalEmphrs +=empHrs;
            System.out.println("Day: "+totalWorkingDays+"Emp Hr: "+empHrs);
        }
        int totalEmpWage = totalEmphrs * empRatePerHour;
        System.out.println("Total Emp Wage For Company : "+company+" is :"+totalEmpWage);
        return totalEmpWage;
    }
    public static void main(String[] args) {
        computeEmpWage("Dmart",20,20,100);
        computeEmpWage("Reliance",10,4,20);
    }
}
