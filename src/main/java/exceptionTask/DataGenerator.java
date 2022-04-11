/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionTask;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Random;

/**
 *
 * @author arthur
 */
public class DataGenerator {

    static Faculty generateFaculty(FacultyName facultyName, int groupOne, int groupTwo) {
        return new Faculty(facultyName, generateGroupList(facultyName, groupOne, groupTwo));
    }

    private static List<Group> generateGroupList(FacultyName facultyName, int groupOne, int groupTwo) {
        List<Group> groupsList = new ArrayList<Group>();
        groupsList.add(new Group(groupOne, generateStudentList(facultyName)));
        groupsList.add(new Group(groupTwo, generateStudentList(facultyName)));
        return groupsList;
    }
    
    private static List<Student> generateStudentList(FacultyName facultyName) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("NameOne", "SurnameOne", generateAcademicSubjectListWithGrades(facultyName)));
        studentList.add(new Student("NameTwo", "SurnameTwo", generateAcademicSubjectListWithGrades(facultyName)));
        studentList.add(new Student("NameThree", "SurnameThree", generateAcademicSubjectListWithGrades(facultyName)));
        studentList.add(new Student("NameFour", "SurnameFour", generateAcademicSubjectListWithGrades(facultyName)));
        return studentList;
    }
    
    private static EnumMap<AcademicSubject, Integer> generateAcademicSubjectListWithGrades(FacultyName facultyName) {
        EnumMap<AcademicSubject, Integer> academicSubjectsList = null;
            switch(facultyName) {
                case FACULTY_OF_CRIMINAL_LAW:
                academicSubjectsList = generateCriminalLawAcademicSubjectsList();
                break;
                case FACULTY_OF_CIVIL_LAW:
                academicSubjectsList = generateCivilLawAcademicSubjectsList();
                break;
            }
        return academicSubjectsList;
    }
    
    private static EnumMap<AcademicSubject, Integer> generateCriminalLawAcademicSubjectsList() {
        EnumMap<AcademicSubject, Integer> academicSubjectsList = new EnumMap<AcademicSubject, Integer>(AcademicSubject.class);
        Random random = new Random();
        academicSubjectsList.put(AcademicSubject.CRIMINALISTICS, random.nextInt(10));
        academicSubjectsList.put(AcademicSubject.ADMONISTRATIVE_LAW, random.nextInt(10));
        academicSubjectsList.put(AcademicSubject.PROCEDURAL_AND_EXECUTIVE_LEGISLATION, random.nextInt(10));
        return academicSubjectsList;
    }
    
    private static EnumMap<AcademicSubject, Integer> generateCivilLawAcademicSubjectsList() {
        EnumMap<AcademicSubject, Integer> academicSubjectsList = new EnumMap<AcademicSubject, Integer>(AcademicSubject.class);
        Random random = new Random();
        academicSubjectsList.put(AcademicSubject.CIVIL_LAW, random.nextInt(10));
        academicSubjectsList.put(AcademicSubject.ADMONISTRATIVE_LAW, random.nextInt(10));
        academicSubjectsList.put(AcademicSubject.PROCEDURAL_AND_EXECUTIVE_LEGISLATION, random.nextInt(10));
        return academicSubjectsList;
    }
    
}
