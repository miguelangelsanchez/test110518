
public class Generador extends Product {
	private String numeroGenerador;
	
	public String getNumeroGenerador() {
		return numeroGenerador;
	}
	
	public void setNumeroGenerador(String numeroGenerador) {
		this.numeroGenerador=numeroGenerador;
	}
	
	public Generador() {
		super();
		
		setNumeroGenerador("generador01");
		
		System.out.println("soy el generador con numero: " + getNumeroGenerador() );
		
		tipoDesplazamiento = new NoSeDesplaza();
	}
}
