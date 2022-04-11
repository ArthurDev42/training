/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package exceptionTask;

/**
 *
 * @author arthur
 */
public enum AcademicSubject {
    CRIMINALISTICS("Criminalistics"),
    CIVIL_LAW("civil law"),
    ADMONISTRATIVE_LAW("administrative law"),
    PROCEDURAL_AND_EXECUTIVE_LEGISLATION("procedural and executive legislation"); 
    
    private String academicSubjectsName;

    private AcademicSubject(String academicSubjectsName) {
        this.academicSubjectsName = academicSubjectsName;
    }

    public String getAcademicSubjectsName() {
        return academicSubjectsName;
    }
    
    
}
