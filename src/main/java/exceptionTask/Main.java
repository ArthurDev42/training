/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionTask;

import static exceptionTask.FacultyName.*;
import java.util.ArrayList;

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
        
        University university = new University("University name", new ArrayList<Faculty>());
        university.getFacultyList().add(DataGenerator.generateFaculty(FACULTY_OF_CRIMINAL_LAW, 111, 112));
        university.getFacultyList().add(DataGenerator.generateFaculty(FACULTY_OF_CIVIL_LAW, 115, 116));
        
        double d = UniversityDriver.counter(university.getFacultyList().get(1).getGroupList().get(0).getStudentsList().get(0));
        
        System.out.println(d);
        
    }
    
    public static void init() {
        
    }
    
}
