/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionTask;

import static exceptionTask.AcademicSubject.CIVIL_LAW;
import static exceptionTask.AcademicSubject.CRIMINALISTICS;
import static exceptionTask.FacultyName.*;
import exceptionTask.customexceptions.IncorrectGradeException;
import exceptionTask.customexceptions.NoOneFacultyException;
import exceptionTask.customexceptions.NoOneGroupException;
import exceptionTask.customexceptions.NoOneStudentException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
//  В университете есть несколько факультетов, в которых учатся студенты, объединенные в группы. 
//  У каждого студента есть несколько учебных предметов по которым он получает оценки. 
//  Необходимо реализовать иерархию студентов, групп и факультетов.
//
//  Посчитать средний балл по всем предметам студента
//  Посчитать средний балл по конкретному предмету в конкретной группе и на конкретном факультете
//  Посчитать средний балл по предмету для всего университета
//  Релизовать следующие исключения:
//
//  Оценка ниже 0 или выше 10
//  Отсутсвие предметов у студента (должен быть хотя бы один)
//  Отсутствие студентов в группе
//  Отсутствие групп на факультете
//  Отсутствие факультетов в университете
    
    public static void main (String ... args){
        
        University university = initUniversity();
        
        //  Посчитать средний балл по всем предметам студента
        try {
            // uncomment for exception
//            university.getFacultyList().get(1).getGroupList().get(0).getStudentsList().get(0).getAcademicSubjectsMap().put(CIVIL_LAW, Integer.valueOf(11));
            double d1 = UniversityDriver.calculateGpaStudent(university.getFacultyList().get(1).getGroupList().get(0).getStudentsList().get(0));
        } catch (IncorrectGradeException e) {
            e.printStackTrace();
        }
        
        //  Посчитать средний балл по конкретному предмету в конкретной группе и на конкретном факультете
        try {
            // uncomment for exception
//            university.getFacultyList().get(1).getGroupList().get(0).getStudentsList().clear();
            double d2 = UniversityDriver.calculateGpaGroup(university.getFacultyList().get(1).getGroupList().get(0), AcademicSubject.CIVIL_LAW);
        } catch (IncorrectGradeException e) {
            e.printStackTrace();
        } catch (NoOneStudentException e) {
            e.printStackTrace();
        }
        
        //  Посчитать средний балл по предмету для всего университета
        try {
            // uncomment for exception
//            university.getFacultyList().clear();
            double d3 = UniversityDriver.calculateGpaAll(university, AcademicSubject.CRIMINALISTICS);
        } catch (IncorrectGradeException e) {
            e.printStackTrace();
        } catch (NoOneFacultyException e) {
            e.printStackTrace();
        } catch (NoOneGroupException e) {
            e.printStackTrace();
        } catch (NoOneStudentException e) {
            e.printStackTrace();
        }
    }
    
    public static University initUniversity() {
        int[] groupNumbers = {111, 112, 115, 116};
        University university = new University("University name", new ArrayList<Faculty>());
        university.getFacultyList().add(DataGenerator.generateFaculty(FACULTY_OF_CRIMINAL_LAW, groupNumbers[0], groupNumbers[1]));
        university.getFacultyList().add(DataGenerator.generateFaculty(FACULTY_OF_CIVIL_LAW, groupNumbers[2], groupNumbers[3]));
        return university;
    }
    
}
