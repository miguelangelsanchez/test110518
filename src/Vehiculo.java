
public class Vehiculo extends Product{
	private String placas;
	
	public void setPlacas(String placas) {
		this.placas=placas;
	}
	
	public String getPlacas() {
		return placas;
	}
	
	public Vehiculo() {
		super();
		setPlacas("placas dinamicas");
		System.out.println("soy el vehiculo con las placas: " + getPlacas() );
		tipoDesplazamiento = new SeDesplaza();
	}
}
