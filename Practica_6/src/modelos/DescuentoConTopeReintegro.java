package modelos;

import Exceptions.ExceptionDescuento;

public class DescuentoConTopeReintegro implements IDescuento{

	private double monto;
	private double porcentaje;
	private int topeDeReintegro;
	
	public DescuentoConTopeReintegro(double monto, double procentaje, int topeDeReintegro) {
		super();
		this.monto = monto;
		this.porcentaje = procentaje;
		this.topeDeReintegro = topeDeReintegro;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getProcentaje() {
		return porcentaje;
	}

	public void setProcentaje(double procentaje) {
		this.porcentaje = procentaje;
	}

	public int getTopeDeReintegro() {
		return topeDeReintegro;
	}

	public void setTopeDeReintegro(int topeDeReintegro) {
		this.topeDeReintegro = topeDeReintegro;
	}

	@Override
	public double calcularDescuento() throws ExceptionDescuento {
		double montoConDescuento=0;
		double aux=(this.getMonto()*this.getProcentaje()/100);
		if(aux>=this.getMonto()) {
			throw new ExceptionDescuento(this);
		}
		else {
			if(aux>this.getTopeDeReintegro()) {
				montoConDescuento=this.monto-this.topeDeReintegro;
			}
			else {
				montoConDescuento=this.getMonto()-aux;
			}
		}
		return montoConDescuento;
	}
	
	
}
