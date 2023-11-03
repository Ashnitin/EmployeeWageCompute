package com.bridglabz;

public class EmployeeWage {
    public static final int IS_PART_Time=1;
    public static final int IS_FULL_TIME=2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpEage;

    public EmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }
    public void computeEmpWage(){
        //variable
        int empHrs=0, totalEmphrs=0, totalWorkingDays = 0;
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
        totalEmpEage=totalEmphrs*empRatePerHour;
    }
    @Override
    public String toString() {
        return "Total Emp wage For Company: " +company+ " is: "+totalEmpEage;
    }
    public static void main(String[] args) {
        EmployeeWage Dmart=new EmployeeWage("Dmart",20,20,100);
        EmployeeWage reliance=new EmployeeWage("Reliance",10,4,20);
        Dmart.computeEmpWage();
        System.out.println(Dmart);
        reliance.computeEmpWage();
        System.out.println(reliance);
    }
}
