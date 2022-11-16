package pe.idat.edu.service.ec3luiscuri;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.edu.dto.ec3luiscuri.HospitalDTORequest;
import pe.idat.edu.dto.ec3luiscuri.HospitalDTOResponse;
import pe.idat.edu.model.ec3luiscuri.Hospital;
import pe.idat.edu.repository.ec3luiscuri.HospitalRepository;

@Service
public class HospitalServiceImpl implements HospitalService {
	
	@Autowired
	private HospitalRepository repository;

	@Override
	public void guardarHospital(HospitalDTORequest hospital) {
		// TODO Auto-generated method stub
		Hospital h = new Hospital();
		h.setNombre(hospital.getNombre());
		h.setDescripcion(h.getDescripcion());
		h.setDistrito(hospital.getDistritoHospital());
		repository.save(h);

	}

	@Override
	public void actualizarHospital(HospitalDTORequest hospital) {
		// TODO Auto-generated method stub
		Hospital h = new Hospital();
		h.setIdHospital(hospital.getId());
		h.setNombre(hospital.getNombre());
		h.setDescripcion(h.getDescripcion());
		h.setDistrito(hospital.getDistritoHospital());
		repository.saveAndFlush(h);
	}

	@Override
	public void eliminarHospital(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public List<HospitalDTOResponse> listarHospital() {
		// TODO Auto-generated method stub
		List<HospitalDTOResponse> listar = new ArrayList<>();
		HospitalDTOResponse dto = null;
		List<Hospital> h = repository.findAll();
		for(Hospital hospital : h) {
			dto = new HospitalDTOResponse();
			listar.add(dto);
		}
		return listar;
	}

	@Override
	public HospitalDTOResponse obtenerHospitalId(Integer id) {
		// TODO Auto-generated method stub
		Hospital hospital = repository.findById(id).orElse(null);
		HospitalDTOResponse dto = new HospitalDTOResponse();
		dto.setId(hospital.getIdHospital());
		dto.setNombre(hospital.getNombre());
		dto.setDescripcionHospital(hospital.getDescripcion());
		dto.setDistritoHospital(hospital.getDistrito());
		
		return dto;
	}

}
