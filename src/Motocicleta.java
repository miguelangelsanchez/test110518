
public class Motocicleta extends Vehiculo {
	public String modeloMoto;

	public String getModeloMoto() {
		return modeloMoto;
	}
	
	public void setModeloMoto(String modeloMoto) {
		this.modeloMoto=modeloMoto;
	}
	
	public Motocicleta() {
		super();
		setModeloMoto("modeloMotocicleta01");
		System.out.println("soy la motocicleta modelo: " + getModeloMoto() );
	}
	
}
