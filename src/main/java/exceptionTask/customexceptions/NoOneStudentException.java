/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionTask.customexceptions;

/**
 *
 * @author arthur
 */
public class NoOneStudentException extends Exception {

    public NoOneStudentException() {
    }

    public NoOneStudentException(String message) {
        super(message);
    }

    public NoOneStudentException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoOneStudentException(Throwable cause) {
        super(cause);
    }
    
}
