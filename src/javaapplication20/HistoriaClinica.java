/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20;

import java.util.ArrayList;
import java.util.List;

public class HistoriaClinica {
    private List<ObservadorNotificaciones> observadores = new ArrayList<>();
    private List<ControlPrenatal> controlesPrenatales = new ArrayList<>();
    private List<EnfermedadCronica> enfermedadesCronicas = new ArrayList<>();

    public void agregarObservador(ObservadorNotificaciones observador) {
        observadores.add(observador);
    }

    private void notificarCambios() {
        for (ObservadorNotificaciones observador : observadores) {
            observador.notificarCambio(this);
        }
    }

    public void agregarControlPrenatal(ControlPrenatal control) {
        controlesPrenatales.add(control);
        notificarCambios();
    }

    public void agregarEnfermedadCronica(EnfermedadCronica enfermedad) {
        enfermedadesCronicas.add(enfermedad);
        notificarCambios();
    }

    public List<ControlPrenatal> getControlesPrenatales() {
        return controlesPrenatales;
    }

    public List<EnfermedadCronica> getEnfermedadesCronicas() {
        return enfermedadesCronicas;
    }
}
