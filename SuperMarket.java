package com.xworkz.supermarketsystem.workerdetails.systemlogic;

import com.xworkz.supermarketsystem.workerdetails.WorkerDetails;

public class SuperMarket {

    WorkerDetails workerDetails;

    public SuperMarket(WorkerDetails workerDetails) {
        this.workerDetails = workerDetails;
    }
    public void getWorkerDetails(){
        this.workerDetails.displayDetails();
    }
}
