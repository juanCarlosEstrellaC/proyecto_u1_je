package com.example.demo.medica.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.medica.modelo.CitaMedica;
import com.example.demo.medica.modelo.Medico;
import com.example.demo.medica.modelo.Paciente;
import com.example.demo.medica.repository.ICitaMedicaRepository;
import com.example.demo.medica.repository.IMedicoRepository;
import com.example.demo.medica.repository.IPacienteRepository;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{

	@Autowired
	private ICitaMedicaRepository iCitaMedicaRepository;
	
	@Autowired // si no hace alguna logica puedo mandar directamente por el repository y no del service
	private IPacienteRepository iPacienteRepository;
	
	@Autowired
	private IMedicoRepository iMedicoRepository;
	
	@Override
	public void agendar(String cedulaPacinte, String cedulaMedico) {
		
		
		CitaMedica citaMed = new CitaMedica();
		citaMed.setFecha(LocalDateTime.now());
		Paciente paci = this.iPacienteRepository.buscar(cedulaPacinte);
		citaMed.setPaciente(paci);
		Medico medi = this.iMedicoRepository.buscar(cedulaMedico);
		citaMed.setMedico(medi);
		
		BigDecimal valor = null;
		if (medi.getEspecialidad().equals("General")) {
			valor = medi.getPrecioConsulta();
		}else {
			//Especialista:
			valor = medi.getPrecioConsulta().add(new BigDecimal(3.5));

		}
		
		citaMed.setPrecio(valor);
		
		this.iCitaMedicaRepository.insertar(citaMed);
	}

}
