/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionTask.customexceptions;

/**
 *
 * @author arthur
 */
public class NoOneGroupException extends Exception {

    public NoOneGroupException() {
    }

    public NoOneGroupException(String message) {
        super(message);
    }

    public NoOneGroupException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoOneGroupException(Throwable cause) {
        super(cause);
    }
    
}
