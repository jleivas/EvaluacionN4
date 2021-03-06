package cl.awakelab.model;

public class Actividad {

	private int idActividad;
	private int idCliente;
	private int idProf;
	private int idAsesoria;
	private int idRevision;
	private String nombre;
	private int precio;
	private String fechaVisita;
	private boolean situacionVisita;
	
	public Actividad() {
		super();
	}
	
	public Actividad(int idCliente, int idProf, int idAsesoria, int idRevision, String nombre, int precio,
			String fechaVisita, boolean situacionVisita) {
		this.idCliente = idCliente;
		this.idProf = idProf;
		this.idAsesoria = idAsesoria;
		this.idRevision = idRevision;
		this.nombre = nombre;
		this.precio = precio;
		this.fechaVisita = fechaVisita;
		this.situacionVisita = situacionVisita;
	}

	public int getIdActividad() {
		return idActividad;
	}



	public void setIdActividad(int idActividad) {
		this.idActividad = idActividad;
	}



	public int getIdCliente() {
		return idCliente;
	}



	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}



	public int getIdProf() {
		return idProf;
	}



	public void setIdProf(int idProf) {
		this.idProf = idProf;
	}



	public int getIdAsesoria() {
		return idAsesoria;
	}



	public void setIdAsesoria(int idAsesoria) {
		this.idAsesoria = idAsesoria;
	}



	public int getIdRevision() {
		return idRevision;
	}



	public void setIdRevision(int idRevision) {
		this.idRevision = idRevision;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getPrecio() {
		return precio;
	}



	public void setPrecio(int precio) {
		this.precio = precio;
	}



	public String getFechaVisita() {
		return fechaVisita;
	}



	public void setFechaVisita(String fechaVisita) {
		this.fechaVisita = fechaVisita;
	}



	public boolean isSituacionVisita() {
		return situacionVisita;
	}



	public void setSituacionVisita(boolean situacionVisita) {
		this.situacionVisita = situacionVisita;
	}



	@Override
	public String toString() {
		return "Actividad [idActividad=" + idActividad + ", idCliente=" + idCliente + ", idProf=" + idProf
				+ ", idAsesoria=" + idAsesoria + ", idRevision=" + idRevision + ", nombre=" + nombre + ", precio="
				+ precio + ", fechaVisita=" + fechaVisita + ", situacionVisita=" + situacionVisita + "]";
	}
	
	
}
