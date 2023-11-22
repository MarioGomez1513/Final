/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20;

/**
 *
 * @author mario
 */
public class ControlPrenatal {
    private String fecha;
    private double peso;

    public ControlPrenatal(String fecha, double peso) {
        this.fecha = fecha;
        this.peso = peso;
    }

    public String getFecha() {
        return fecha;
    }

    public double getPeso() {
        return peso;
    }
}
