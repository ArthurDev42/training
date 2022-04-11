/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionTask;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arthur
 */
public class University {
    private String universityName;
    private List<Faculty> facultyList;

    public University(String universityName, ArrayList<Faculty> facultyList) {
        this.facultyList = facultyList;
    }

    public String getUniversityName() {
        return universityName;
    }

    public List<Faculty> getFacultyList() {
        return facultyList;
    }
}
