package Pojos;
// Generated Apr 24, 2020 1:59:53 PM by Hibernate Tools 4.3.1



/**
 * Student generated by hbm2java
 */
public class Student  implements java.io.Serializable {


     private Integer studentId;
     private String name;
     private String address;
     private String email;
     private String dob;
     private Integer classLevel;
     private Integer status;
     private String dateTime;
     private Integer userId;

    public Student() {
    }

    public Student(String name, String address, String email, String dob, Integer classLevel, Integer status, String dateTime, Integer userId) {
       this.name = name;
       this.address = address;
       this.email = email;
       this.dob = dob;
       this.classLevel = classLevel;
       this.status = status;
       this.dateTime = dateTime;
       this.userId = userId;
    }

    public Student(Integer studentId) {
        this.studentId = studentId;
    }
    
   
    public Integer getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDob() {
        return this.dob;
    }
    
    public void setDob(String dob) {
        this.dob = dob;
    }
    public Integer getClassLevel() {
        return this.classLevel;
    }
    
    public void setClassLevel(Integer classLevel) {
        this.classLevel = classLevel;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getDateTime() {
        return this.dateTime;
    }
    
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }




}

