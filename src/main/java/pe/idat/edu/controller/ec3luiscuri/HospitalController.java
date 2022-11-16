package pe.idat.edu.controller.ec3luiscuri;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.idat.edu.dto.ec3luiscuri.HospitalDTOResponse;
import pe.idat.edu.service.ec3luiscuri.HospitalService;

@Controller
@RequestMapping(path = "/hospital/v1")
public class HospitalController {
	
	@Autowired
	private HospitalService service;
	
	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<HospitalDTOResponse>> listar(){
		return new ResponseEntity<List<HospitalDTOResponse>>(service.listarHospital(), HttpStatus.OK);
	}
}
