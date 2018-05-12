
public class FactoriaProductos {
	public Product crearProducto(String tipoProducto) {
		
		Product productoTemporal=null;
		
		switch(tipoProducto) {
			case "P":
				productoTemporal=new Product();
				break;
			case "G":
				productoTemporal=new Generador();
				break;
			case "V":
				productoTemporal=new Vehiculo();
				break;
			case "M":
				productoTemporal=new Motocicleta();
				break;
			case "A":
				productoTemporal=new Automovil();
				break;
		}
		
		return productoTemporal;
	}
}
