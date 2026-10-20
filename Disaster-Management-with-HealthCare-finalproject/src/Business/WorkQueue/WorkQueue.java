/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    private ArrayList<WorkRequest> queue;
 
    // Constructor
    public WorkQueue() {
        queue = new ArrayList<>();
    }
 
    // Add a work request to the queue
    public void addRequest(WorkRequest request) {
        queue.add(request);
    }
 
    // Retrieve and remove the next work request from the queue
    public WorkRequest getNextRequest() {
        if (!queue.isEmpty()) {
            return queue.remove(0); // Retrieves and removes the head of the queue
        }
        return null;
    }
}
