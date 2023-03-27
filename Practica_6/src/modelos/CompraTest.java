package modelos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CompraTest {
	private Compra objCompraTest;
	
	@BeforeEach
	public void serUp() {
		objCompraTest=new Compra();
	}

	@Test
	void testCalcularTotalCompra() {
		Item it=new Item();
		it.setCantidad(3);
		it.setProducto(new Producto("Cepillo",10));
		objCompraTest.agregarItem(it);
 		Item it2=new Item();
		it2.setCantidad(2);
		it2.setProducto(new Producto("Pasta",100));
		objCompraTest.agregarItem(it2);;
		//ERROR LOCO
		//System.out.println(objCompraTest.calcularTotalCompra());
		String esperado="230.0";
		String resultante=objCompraTest.calcularTotalCompra();
		System.out.println(resultante);
		boolean aux=resultante.equals(esperado);
		System.out.println(aux);
		assertTrue(aux);
	}

}
