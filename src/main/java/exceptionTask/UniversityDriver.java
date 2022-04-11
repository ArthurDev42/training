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
public class UniversityDriver {
    
//  Посчитать средний балл по всем предметам студента
    public static double calculateGpaStudent(Student st) {
        Map<AcademicSubject, Integer> map = st.getAcademicSubjectsMap();
        int summ = 0;
        for (AcademicSubject key: map.keySet()) {
            summ += (int) map.get(key);
        }
        return (double) summ / map.size();
    }
    
    //  Посчитать средний балл по конкретному предмету в конкретной группе и на конкретном факультете
    public static double calculateGpaGroup(Group group, AcademicSubject academicSubject) {
        int summ = 0;
        for (Student l: group.getStudentsList()) {
            summ += l.getAcademicSubjectsMap().get(academicSubject);
        }
        return summ / group.getStudentsList().size();
    }
    
    //  Посчитать средний балл по предмету для всего университета
    public static double calculateGpaAll(University university, AcademicSubject academicSubject) {
        university.getFacultyList().get(0).getGroupList().get(0).getStudentsList().get(0).getAcademicSubjectsMap().containsKey(university);
        int summ = 0;
        int count = 0;
        for (Faculty f: university.getFacultyList()) {
            for (Group g: f.getGroupList()) {
                for (Student s: g.getStudentsList()) {
                    if(s.getAcademicSubjectsMap().containsKey(academicSubject)) {
                        summ += s.getAcademicSubjectsMap().get(academicSubject);
                        count++;
                    }
                }
            }
        }
        return (count != 0) ? summ / count : 0;
    }
    
    
    
    
}
