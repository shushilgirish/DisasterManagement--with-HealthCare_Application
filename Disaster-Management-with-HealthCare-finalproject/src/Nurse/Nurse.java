/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nurse;

import Business.Hospital.Doctor.Doctor;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author shush
 */
public class Nurse {
    private int nurse_id;
    private String nurse_name;
    private int prof_experience;
    private WorkQueue workQueue;
    private WorkRequest currentRequest;
   
    // Constructor
    public Nurse(int nurse_id,String nurse_name,int prof_exp) {
        workQueue = new WorkQueue();
        this.nurse_id = nurse_id;
       
        this.nurse_name = nurse_name;
        this.prof_experience = prof_exp;
        currentRequest = null;
    }

    public int getNurse_id() {
        return nurse_id;
    }

    public void setNurse_id(int nurse_id) {
        this.nurse_id = nurse_id;
    }

    public String getNurse_name() {
        return nurse_name;
    }

    public void setNurse_name(String nurse_name) {
        this.nurse_name = nurse_name;
    }

    public int getProf_experience() {
        return prof_experience;
    }

    public void setProf_experience(int prof_experience) {
        this.prof_experience = prof_experience;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public WorkRequest getCurrentRequest() {
        return currentRequest;
    }

    public void setCurrentRequest(WorkRequest currentRequest) {
        this.currentRequest = currentRequest;
    }
 
    // Add a work request
    public void addWorkRequest(String message, int senderId, int receiverId) {
        WorkRequest request = new WorkRequest(message, senderId, receiverId);
        workQueue.addRequest(request);
    }
 
    // Claim the next work request
    public WorkRequest claimNextRequest() {
        currentRequest = workQueue.getNextRequest();
        return currentRequest;
    }
 
    // Process the current work request
    public void processCurrentRequest() {
        if (currentRequest != null) {
            System.out.println("Processing request: " + currentRequest.getMessage());
            // Add processing logic here
            currentRequest = null; // Mark as processed
        } else {
            System.out.println("No current request to process.");
        }
    }
 
   
}
    

