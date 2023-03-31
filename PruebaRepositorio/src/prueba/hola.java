package prueba;

public class hola {
	private String nombre;
	private String edad;
	private String id;

	public hola(String nombre, String edad, String id) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static void main(String[] args) {
	}

	@Override
	public String toString() {
		return "hola [nombre=" + nombre + ", edad=" + edad + ", id=" + id + "]";
	}

	

}
