/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionTask;

import exceptionTask.customexceptions.IncorrectGradeException;
import exceptionTask.customexceptions.NoOneFacultyException;
import exceptionTask.customexceptions.NoOneGroupException;
import exceptionTask.customexceptions.NoOneStudentException;
import java.util.Map;

/**
 *
 * @author arthur
 */
public class UniversityDriver {
    
//  Посчитать средний балл по всем предметам студента 
    public static double calculateGpaStudent(Student student) throws IncorrectGradeException {
        Map<AcademicSubject, Integer> map = student.getAcademicSubjectsMap();
        int summ = 0;
        for (AcademicSubject key: map.keySet()) {
            if((map.get(key) < 0) || (map.get(key) > 10)) 
                throw new IncorrectGradeException(student.getName() + " " + student.getSurname() + " The grade more than 10 or less than 0");
            summ += (int) map.get(key);
        }
        return (double) summ / map.size();
    }
    
    //  Посчитать средний балл по конкретному предмету в конкретной группе и на конкретном факультете
    public static double calculateGpaGroup(Group group, AcademicSubject academicSubject) throws IncorrectGradeException, NoOneStudentException {
        int summ = 0;
        if(group.getStudentsList().isEmpty()) throw new NoOneStudentException("No one student exists in group " + group.getGroupNumber());
        for (Student student: group.getStudentsList()) {
            if((student.getAcademicSubjectsMap().get(academicSubject) < 0) || (student.getAcademicSubjectsMap().get(academicSubject) > 10))
                throw new IncorrectGradeException(student.getName() + " " + student.getSurname() + " has grade more than 10 or less than 0");
            summ += student.getAcademicSubjectsMap().get(academicSubject);
        }
        return summ / group.getStudentsList().size();
    }
    
    //  Посчитать средний балл по предмету для всего университета
    public static double calculateGpaAll(University university, AcademicSubject academicSubject) 
            throws IncorrectGradeException, NoOneFacultyException, NoOneGroupException, NoOneStudentException {
        int summ = 0;
        int count = 0;
        if(university.getFacultyList().isEmpty()) throw new NoOneFacultyException("No one faculty exists in " + university.getUniversityName());
        for (Faculty faculty: university.getFacultyList()) {
            if(faculty.getGroupList().isEmpty()) throw new NoOneGroupException("No one group exists in " + faculty.getFacultyName().getFacultyTitle());
            for (Group group: faculty.getGroupList()) {
                if(group.getStudentsList().isEmpty()) throw new NoOneStudentException("No one student exists in group " + group.getGroupNumber());
                for (Student student: group.getStudentsList()) {
                    if(student.getAcademicSubjectsMap().containsKey(academicSubject)) {
                        if((student.getAcademicSubjectsMap().get(academicSubject) < 0) || (student.getAcademicSubjectsMap().get(academicSubject) > 10)) 
                            throw new IncorrectGradeException(student.getName() + " " + student.getSurname() + " The grade more than 10 or less than 0");
                        summ += student.getAcademicSubjectsMap().get(academicSubject);
                        count++;
                    }
                }
            }
        }
        return (count != 0) ? summ / count : 0;
    }
}
