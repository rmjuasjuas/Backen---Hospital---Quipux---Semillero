package com.paciente.historial.Domain.Service;

import com.paciente.historial.Domain.Model.DTO.PacienteDTO;
import com.paciente.historial.Domain.Model.Entity.PacienteEntity;
import com.paciente.historial.Domain.Repository.PacientesRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PacienteService {

    private final PacientesRepository pacientesRepository;

    public PacienteService(PacientesRepository pacientesRepository) {
        this.pacientesRepository = pacientesRepository;
    }

    // Método GET existente
    public List<PacienteEntity> listarPaciente() {
        return pacientesRepository.findAll();
    }

    // NUEVO - Método POST para crear paciente
    public PacienteEntity crearPaciente(PacienteDTO pacienteDTO) {
        // Convertir DTO a Entity usando Builder
        PacienteEntity paciente = PacienteEntity.builder()
                .nombrePaciente(pacienteDTO.getNombrePaciente())
                .edad(pacienteDTO.getEdad())
                .historial(pacienteDTO.getHistorial())
                .tratamiento(pacienteDTO.getTratamiento())
                .fechaRegistro(pacienteDTO.getFechaRegistro() != null ?
                        pacienteDTO.getFechaRegistro() : new Date())
                .build();

        // Guardar en la base de datos
        return pacientesRepository.save(paciente);
    }
}