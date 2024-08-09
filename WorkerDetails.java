package com.xworkz.supermarketsystem.workerdetails;

public class WorkerDetails {

    public String workerName;
    public int workerSalary;
    public int workerAge;

    public WorkerDetails(String workerName, int workerSalary, int workerAge) {
        this.workerName = workerName;
        this.workerSalary = workerSalary;
        this.workerAge = workerAge;
    }

    public void displayDetails(){
        System.out.println("The Worker name is:" + workerName);
        System.out.println("The Worker Salary is:" + workerSalary);
        System.out.println("The Worker age is:" + workerAge);
    }
}
