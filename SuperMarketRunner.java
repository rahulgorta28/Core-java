package com.xworkz.supermarketsystem;

import com.xworkz.supermarketsystem.workerdetails.WorkerDetails;
import com.xworkz.supermarketsystem.workerdetails.systemlogic.SuperMarket;

public class SuperMarketRunner {
    public static void main(String[] args) {
        WorkerDetails workerDetails = new WorkerDetails("Rajesh",8000,34);
        SuperMarket superMarket = new SuperMarket(workerDetails);
        superMarket.getWorkerDetails();

    }
}
