package modelos;

public class Item {
	private Producto producto;
	private int cantidad;
	
	public Item() {
	}
	
	public Item(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public String calcularTotal() {
		double aux=this.getCantidad()*this.getProducto().getPrecio();
		if(this.getCantidad()>=10) {
			aux=aux-(aux*30/100);
		}
		return String.valueOf(aux);
	}
	
	
}
