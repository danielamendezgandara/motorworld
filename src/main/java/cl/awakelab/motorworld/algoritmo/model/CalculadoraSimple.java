package cl.awakelab.motorworld.algoritmo.model;

import java.util.List;

import cl.awakelab.motorworld.algoritmo.interfaces.CalculadoraBeneficios;



public class CalculadoraSimple implements CalculadoraBeneficios{

	@Override
	public int calcula(List<Integer> ventas) {
		// TODO Auto-generated method stub
		int totalVentas = 0;
		for (Integer venta: ventas) {
			 totalVentas = totalVentas + venta;
		}
		double beneficio = (3.0/100.0)*totalVentas;
		return (int) beneficio;
		
	}

	

}
