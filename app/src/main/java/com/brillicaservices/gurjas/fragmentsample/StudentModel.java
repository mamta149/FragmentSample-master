package com.brillicaservices.gurjas.fragmentsample;

public class StudentModel {

    String studentName;
    String collegeName;

    public StudentModel(String studentName, String collegeName){
        this.studentName = studentName;
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
