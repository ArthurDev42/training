/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionTask.customexceptions;

/**
 *
 * @author arthur
 */
public class IncorrectGradeException extends Exception {

    public IncorrectGradeException() {
    }

    public IncorrectGradeException(String message) {
        super(message);
    }

    public IncorrectGradeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectGradeException(Throwable cause) {
        super(cause);
    }
}
