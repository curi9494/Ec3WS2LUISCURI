package pe.idat.edu.service.ec3luiscuri;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.edu.model.ec3luiscuri.UsuarioCliente;
import pe.idat.edu.repository.ec3luiscuri.UsuarioClienteRepository;

@Service
public class UsuarioClienteServiceImpl implements UsuarioClienteService {
	
	@Autowired
	private UsuarioClienteRepository repository;

	@Override
	public void guardarUsuarioCliente(UsuarioCliente usuario) {
		// TODO Auto-generated method stub
		repository.save(usuario);
		

	}

	@Override
	public void actualizarUsuarioCliente(UsuarioCliente usuario) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(usuario);

	}

	@Override
	public void eliminarUsuarioCliente(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public List<UsuarioCliente> listarUsuario() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public UsuarioCliente obtenerUsuarioId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
