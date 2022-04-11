/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package exceptionTask;

/**
 *
 * @author arthur
 */
public enum FacultyName {
    FACULTY_OF_CRIMINAL_LAW("Faculty of criminal law"),
    FACULTY_OF_CIVIL_LAW("Faculty of civil law");
    
    private String facultyTitle;

   FacultyName(String facultyTitle) {
       this.facultyTitle = facultyTitle;
   }
   
   public String getFacultyTitle() {
       return facultyTitle;
   }
   
}
