package pe.idat.edu.service.ec3luiscuri;

import java.util.List;

import pe.idat.edu.model.ec3luiscuri.UsuarioCliente;

public interface UsuarioClienteService {
	
	void guardarUsuarioCliente(UsuarioCliente usuario);
	void actualizarUsuarioCliente(UsuarioCliente usuario);
	void eliminarUsuarioCliente(Integer id);
	List<UsuarioCliente> listarUsuario();
	UsuarioCliente obtenerUsuarioId(Integer id);

}
