package pe.idat.edu.service.ec3luiscuri;

import java.util.List;

import pe.idat.edu.model.ec3luiscuri.Cliente;

public interface ClienteService {
	void guardarCliente(Cliente cliente);
	void actualizarCliente(Cliente cliente);
	void eliminarCliente(Integer id);
	List<Cliente> listarCliente();
	Cliente obtenerClienteId(Integer id);
}
