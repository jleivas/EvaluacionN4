package cl.awakelab.model;

public class Usuario {

	private int idUser;
	private String usuario;
	private String contrase�a;
	
	public Usuario() {
		super();
	}
	
	public Usuario(String usuario, String contrase�a) {
		this.usuario = usuario;
		this.contrase�a = contrase�a;
	}


	public int getIdUser() {
		return idUser;
	}


	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getContrase�a() {
		return contrase�a;
	}


	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}


	@Override
	public String toString() {
		return "Usuario [idUser=" + idUser + ", usuario=" + usuario + ", contrase�a=" + contrase�a + "]";
	}
	
	
}
