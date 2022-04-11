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
    public static double counter(Student st) {
        Map<AcademicSubject, Integer> map = st.getAcademicSubjectsMap();
        int summ = 0;
        for (AcademicSubject key: map.keySet()) {
            summ += (int) map.get(key);
        }
        return (double) summ / map.size();
    }
    
    //  Посчитать средний балл по конкретному предмету в конкретной группе и на конкретном факультете
    public static double counter2(Group group, AcademicSubject academicSubject) {
        int summ = 0;
        for (Student l: group.getStudentsList()) {
            summ += l.getAcademicSubjectsMap().get(academicSubject);
        }
        return summ / group.getStudentsList().size();
    }
    
    //  Посчитать средний балл по предмету для всего университета
    public static double counter3() {
        
        
        
        return 0;
    }
    
    
    
    
}
