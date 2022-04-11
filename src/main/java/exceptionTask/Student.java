/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionTask;

import java.util.Map;

/**
 *
 * @author arthur
 */
public class Student {
    private String name;
    private String surname;
    private Map<AcademicSubject, Integer> academicSubjectsMap;

    public Student(String name, String surname, Map<AcademicSubject, Integer> academicSubjectsMap) {
        this.name = name;
        this.surname = surname;
        this.academicSubjectsMap = academicSubjectsMap;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Map<AcademicSubject, Integer> getAcademicSubjectsMap() {
        return academicSubjectsMap;
    }
    
    
}
