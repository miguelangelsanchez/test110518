
public class Product {
	private String name;
	
	public PuedeDesplazarse tipoDesplazamiento;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public Product() {
		setName("nombreGeneralProducto");
		System.out.println("soy el producto con el nombre: " + getName() );
	}
	
	public void intentarDesplazarse() {
		tipoDesplazamiento.desplazarse();
	}
	
	public void asignandoNuevoDesplazamiento(PuedeDesplazarse nuevoTipoDesplazamiento) {
		tipoDesplazamiento = nuevoTipoDesplazamiento;
	}
}
