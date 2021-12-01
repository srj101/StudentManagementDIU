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
public class Student {
    private String email;
    private String name;
    private String phone;
    private String address;
    private Double gpa;
    private String fathersName;
    private String mothersName;
    private String nationality;
    private String department;
    private String gender;
    private String bloogGroup;
    private Double payable;
    private Double paid=0.0;
    private String waiver="0%";

    public Student(String name, String phone, String address, Double gpa, String fathersName, String mothersName, String nationality, String department, String gender, String bloogGroup) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.gpa = gpa;
        this.fathersName = fathersName;
        this.mothersName = mothersName;
        this.nationality = nationality;
        this.department = department;
        this.gender = gender;
        this.bloogGroup = bloogGroup;
        this.email = this.name.replaceAll("\\s+", "")+"15-"+(int)(Math.random()*(4000-3000+1)+3000)+"@diu.edu.bd";
        
        if(this.department.equals("CSE")){
            this.payable = 850000.0;
        }
        if(this.department.equals("EEE")){
            this.payable = 950000.0;
        }
        if(this.department.equals("Pharmacy")) {
            this.payable = 750000.0;
        }
        if(this.department.equals("BBA")){
            this.payable = 650000.0;
        }
        if(this.department.equals("NFE")){
            this.payable = 499500.0;
        }
        
        if(this.gpa>8.00) {
            this.payable = this.payable - this.payable*0.2;
            this.waiver = "20%";
        }
        
        
        
    }



    public String getEmail() {
        return email;
    }

    public Double getPayable() {
        return payable;
    }

    public Double getPaid() {
        return paid;
    }

    public String getWaiver() {
        return waiver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloogGroup() {
        return bloogGroup;
    }

    public void setBloogGroup(String bloogGroup) {
        this.bloogGroup = bloogGroup;
    }
    
    
    
    
}
