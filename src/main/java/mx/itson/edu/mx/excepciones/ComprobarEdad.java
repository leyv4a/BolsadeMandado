/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.edu.mx.excepciones;

/**
 *
 * @author alumnog
 */
public class ComprobarEdad extends Exception {

    public ComprobarEdad(String mensaje) {
        super(mensaje);

    }
public void validadEdad ( int edad) throws ComprobarEdad {

    if (edad<18 || edad>25) {
        throw new ComprobarEdad("La edad debe estar entre 18 y 25 años"); 
    }
}
}
