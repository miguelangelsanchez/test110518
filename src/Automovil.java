
public class Automovil extends Vehiculo {
	public String modeloAutomovil;
	
	public String getModeloAutomovil() {
		return modeloAutomovil;
	}
	
	public void setModeloAutomovil(String modeloAutomovil) {
		this.modeloAutomovil=modeloAutomovil;
	}
	
	public Automovil() {
		super();
		setModeloAutomovil("modeloAutomovil01");
		System.out.println("soy el automovil modelo: " + getModeloAutomovil() );
	}
}
