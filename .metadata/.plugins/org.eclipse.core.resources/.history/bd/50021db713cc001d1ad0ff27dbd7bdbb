package modelos;

public class DescuentoFijo implements IDescuento{
	private double monto;
	private int descuentoFijo;

	public DescuentoFijo(double monto,int descuentoFijo) {
		super();
		this.monto=monto;
		this.descuentoFijo = descuentoFijo;
	}

	public int getDescuentoFijo() {
		return descuentoFijo;
	}

	public void setDescuentoFijo(int descuentoFijo) {
		this.descuentoFijo = descuentoFijo;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	@Override
	public double calcularDescuento() {
		double aux=this.getMonto()-this.getDescuentoFijo();
		return aux;
	}
	
	
}
