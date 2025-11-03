package com.paciente.historial.Infraestucture;

import com.paciente.historial.Domain.Model.DTO.PacienteDTO;
import com.paciente.historial.Domain.Model.Entity.PacienteEntity;
import com.paciente.historial.Domain.Service.PacienteService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historial")
public class PacientesController {

    private final PacienteService pacienteService;

    public PacientesController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    // GET existente - Listar todos los pacientes
    @GetMapping
    public List<PacienteEntity> listarPaciente() {
        return pacienteService.listarPaciente();
    }

    // NUEVO - POST para crear paciente
    @PostMapping
    public ResponseEntity<PacienteEntity> crearPaciente(@RequestBody PacienteDTO pacienteDTO) {
        try {
            PacienteEntity nuevoPaciente = pacienteService.crearPaciente(pacienteDTO);
            return new ResponseEntity<>(nuevoPaciente, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
