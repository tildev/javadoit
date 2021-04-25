package com.tildev.step05;

/**
 * Student class
 *
 * @date    : 2021-04-25 오후 11:50
 * @author  : tildev
 */
public class Student {
    int studentID;
    private String studentName;
    int grade;
    String address;

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
