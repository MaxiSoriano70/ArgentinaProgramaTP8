package Exceptions;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelos.Compra;
import modelos.DescuentoPorcentaje;
import modelos.IDescuento;
import modelos.Item;
import modelos.Producto;

class TestDescuentoConPorcentaje {

private Compra carrito;
	
	@BeforeEach
	public void serUp() {
		carrito=new Compra();
	}
	
	@Test
	void test() throws NumberFormatException, IOException {
		int i=0;
		for(String linea:Files.readAllLines(Paths.get("src\\archivos\\items.txt"))) {
			String nombre=linea.split(";")[0];
			int cantidad=Integer.parseInt(linea.split(";")[1]);
			double precio=Double.parseDouble(linea.split(";")[2]);
			Producto prod=new Producto(nombre,precio);
			Item item=new Item(prod,cantidad);
			carrito.agregarItem(item);;
			i++;
			System.out.println("Total de "+prod.getNombre()+": "+item.calcularTotal());
		}
		System.out.println("Total de la compra sin Descuento: "+carrito.calcularTotalCompra());
		//DESCUENTO DE UN 100% NO DEBE DARME DESCUENTO
		IDescuento descuento=new DescuentoPorcentaje(carrito.getTotal(),100);
		carrito.setDescuento(descuento);
		carrito.aplicarDescuento();
		System.out.println("Total de la compra con Descuento: "+carrito.getTotal());
		assertTrue(carrito.getTotal()==270);
	}

}
