/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20;

import java.util.ArrayList;
import java.util.List;

public class PacienteDAO {
    private List<Paciente> pacientes = new ArrayList<>();

    public void guardarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public Paciente buscarPaciente(int idPaciente) {
        for (Paciente paciente : pacientes) {
            if (paciente.getIdPaciente() == idPaciente) {
                return paciente;
            }
        }
        return null;
    }
}

