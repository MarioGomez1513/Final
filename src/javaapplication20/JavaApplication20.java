/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication20;

/**
 *
 * @author mario
 */
public class JavaApplication20 {

  
    public static void main(String[] args) {
        HistoriaClinica historiaClinica = new HistoriaClinica();
        ObservadorNotificaciones observador = new ObservadorConsola();
        historiaClinica.agregarObservador(observador);

        PacienteDAO pacienteDAO = new PacienteDAO();

        Paciente paciente1 = new Paciente(1, "Juan");
        pacienteDAO.guardarPaciente(paciente1);

        historiaClinica.agregarControlPrenatal(new ControlPrenatal("2023-01-01", 65.5));
        historiaClinica.agregarEnfermedadCronica(new EnfermedadCronica("Hipertensión", "Presión arterial alta"));

        int idPacienteBuscado = 1;
        Paciente pacienteEncontrado = pacienteDAO.buscarPaciente(idPacienteBuscado);

        if (pacienteEncontrado != null) {
            System.out.println("Historia clínica del paciente " + pacienteEncontrado.getNombre() + ":");
            System.out.println("Controles Prenatales: " + historiaClinica.getControlesPrenatales());
            System.out.println("Enfermedades Crónicas: " + historiaClinica.getEnfermedadesCronicas());
        } else {
            System.out.println("Paciente no encontrado.");
        }
    }
}

