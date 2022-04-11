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
public class Faculty {
    private FacultyName facultyName;
    private List<Group> groupList;

    public Faculty(FacultyName facultyName, List<Group> groupList) {
        this.facultyName = facultyName;
        this.groupList = groupList;
    }

    public FacultyName getFacultyName() {
        return facultyName;
    }

    public List<Group> getGroupList() {
        return groupList;
    }
    
    
    
}
