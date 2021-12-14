/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diusmartcity;

/**
 *
 * @author SRJOY
 */
public class PaymentData {
    private int studentId;
    private String type;
    private Double amount;
    private String date;
    private String transactionId;

    public PaymentData(int studentId, String type, Double amount, String date, String transactionId) {
        this.studentId = studentId;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.transactionId = transactionId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    
}
