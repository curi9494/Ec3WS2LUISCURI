package pe.idat.edu.dto.ec3luiscuri;

public class UsuarioClienteDTOResponse {
	
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public UsuarioClienteDTOResponse(String token) {
		super();
		this.token = token;
	}

	public UsuarioClienteDTOResponse() {
		super();
	}
	
}
