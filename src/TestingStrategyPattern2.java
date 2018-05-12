
public class TestingStrategyPattern2 {

	public static void main(String[] args) {
		FactoriaProductos factoriaProducto = new FactoriaProductos();
		
		Product p1 = factoriaProducto.crearProducto("P");
		Product p2 = factoriaProducto.crearProducto("G");
		Product p3 = factoriaProducto.crearProducto("V");
		Product p4 = factoriaProducto.crearProducto("M");
		Product p5 = factoriaProducto.crearProducto("A");
		
		//p1.intentarDesplazarse();
		p2.intentarDesplazarse();
		p3.intentarDesplazarse();
		p4.intentarDesplazarse();
		p5.intentarDesplazarse();

	}

}
