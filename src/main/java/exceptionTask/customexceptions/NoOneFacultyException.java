/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionTask.customexceptions;

/**
 *
 * @author arthur
 */
public class NoOneFacultyException  extends Exception {

    public NoOneFacultyException() {
    }

    public NoOneFacultyException(String message) {
        super(message);
    }

    public NoOneFacultyException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoOneFacultyException(Throwable cause) {
        super(cause);
    }
    
}
