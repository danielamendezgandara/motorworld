package cl.awakelab.motorworld.algoritmo.model;

import java.util.ArrayList;
import java.util.List;

import cl.awakelab.motorworld.algoritmo.interfaces.CalculadoraBeneficios;



public class CalculadoraCompleja implements CalculadoraBeneficios {

	@Override
	public int calcula(List<Integer> ventas) {
		
		int totalVentas = 0;
		List<Integer> beneficiosAdicionales = new ArrayList<Integer>();
		int beneficioVenta = 0;
	    int beneficiosTotales = 0;
		for (Integer venta: ventas) {
			if(venta > 1000) {
			   beneficioVenta = (int) Math.round((5.0/100)*venta);
			   beneficiosAdicionales.add(beneficioVenta);
			}else if ( 500 < venta  && venta <1000) {
				beneficioVenta = (int) Math.round((2.0/100)*venta);
			    beneficiosAdicionales.add(beneficioVenta);			   
			}
			totalVentas = totalVentas + venta;
		}
		
		for(Integer beneficio : beneficiosAdicionales) {
		    beneficiosTotales = beneficiosTotales + beneficio;
		}
		double beneficio = (1.0/100.0)*totalVentas + beneficiosTotales;
		if(totalVentas > 5000) {
			   beneficio = beneficio + 100;
			}
		
		return (int) beneficio;
		
		
	}




}
