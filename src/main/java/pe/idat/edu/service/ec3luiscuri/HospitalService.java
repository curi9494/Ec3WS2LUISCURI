package pe.idat.edu.service.ec3luiscuri;

import java.util.List;

import pe.idat.edu.dto.ec3luiscuri.HospitalDTORequest;
import pe.idat.edu.dto.ec3luiscuri.HospitalDTOResponse;

public interface HospitalService {
	void guardarHospital(HospitalDTORequest hospital);
	void actualizarHospital(HospitalDTORequest hospital);
	void eliminarHospital(Integer id);
	List<HospitalDTOResponse> listarHospital();
	HospitalDTOResponse obtenerHospitalId(Integer id);

}
