/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
/**
 *
 * @author Moises Stredel
 @author Danier Herrera
 */
public class Actividad {
    public static void main(String args[])
    {
        String nombre = JOptionPane.showInputDialog("ingrese el nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        String texto = "Hola, mi nombre es " + nombre + ", tengo " + edad + " años, y esta es la actividad de la exposición 6.";
        JOptionPane.showMessageDialog(null, texto);
    }
}
