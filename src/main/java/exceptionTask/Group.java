/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionTask;

import java.util.List;

/**
 *
 * @author arthur
 */
public class Group {
    
    private int groupNumber;
    private List<Student> studentsList;

    public Group(int groupNumber, List<Student> studentsList) {
        this.groupNumber = groupNumber;
        this.studentsList = studentsList;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }
    
}
