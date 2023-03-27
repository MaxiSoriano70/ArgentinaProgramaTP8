package Exceptions;

import modelos.IDescuento;

public class ExceptionDescuento extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IDescuento descuento;

	public ExceptionDescuento(IDescuento descuento) {
		super();
		this.descuento = descuento;
	}

	public IDescuento getDescuento() {
		return descuento;
	}

	public void setDescuento(IDescuento descuento) {
		this.descuento = descuento;
	}
}
