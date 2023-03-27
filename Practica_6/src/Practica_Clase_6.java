import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import modelos.Compra;
import modelos.DescuentoConTopeReintegro;
import modelos.DescuentoFijo;
import modelos.IDescuento;
import modelos.Item;
import modelos.Producto;

public class Practica_Clase_6 {

	public static void main(String[] args) {
		/*Leer un archivo*/
		try {
			Compra carrito=new Compra();
			int i=0;
			for(String linea:Files.readAllLines(Paths.get("src\\archivos\\items.txt"))) {
				//System.out.println(linea);
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
			//IDescuento descuento=new DescuentoConTopeReintegro(carrito.getTotal(),20,200);
			IDescuento descuento=new DescuentoFijo(carrito.getTotal(),500);
			carrito.setDescuento(descuento);
			carrito.aplicarDescuento();
			System.out.println("Total de la compra con Descuento: "+carrito.getTotal());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
