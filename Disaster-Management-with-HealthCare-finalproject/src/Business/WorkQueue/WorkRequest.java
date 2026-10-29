/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import java.util.Date;

/**
 *
 * @author raunak
 */
public class WorkRequest {
    private String message;
    private int senderId;
    private int receiverId;
    private Date msgdate;

    public Date getMsgdate() {
        return msgdate;
    }

    public void setMsgdate(Date msgdate) {
        this.msgdate = msgdate;
    }
 
    // Constructor
    public WorkRequest(String message, int senderId, int receiverId) {
        this.message = message;
        this.senderId = senderId;
        this.receiverId = receiverId;
    }
 
    // Getters
    public String getMessage() {
        return message;
    }
 
    public int getSenderId() {
        return senderId;
    }
 
    public int getReceiverId() {
        return receiverId;
    }
 
    // Setters
    public void setMessage(String message) {
        this.message = message;
    }
 
    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }
 
    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }
}
