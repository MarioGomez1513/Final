/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20;

interface ObservadorNotificaciones {
    void notificarCambio(HistoriaClinica historiaClinica);
}

class ObservadorConsola implements ObservadorNotificaciones {
    @Override
    public void notificarCambio(HistoriaClinica historiaClinica) {
        System.out.println("Se ha realizado un cambio en la historia clínica.");
        System.out.println("Controles Prenatales: " + historiaClinica.getControlesPrenatales());
        System.out.println("Enfermedades Crónicas: " + historiaClinica.getEnfermedadesCronicas());
    }
}
