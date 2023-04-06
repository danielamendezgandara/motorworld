package cl.awakelab.motorworld.algoritmo.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;


class CalculadoraComplejaTest {

	@Test
	public void testCalculaComplejaCaso1() {
		List<Integer> ventasMes = new ArrayList<Integer>();
		 ventasMes.add(136);
		 ventasMes.add(460);
		 ventasMes.add(395);
		 ventasMes.add(122);
		 ventasMes.add(441);
		 ventasMes.add(256);
		 ventasMes.add(1690);
		 ventasMes.add(699);
		 ventasMes.add(525);
		 ventasMes.add(654);
		CalculadoraCompleja calculadoraCompleja = new CalculadoraCompleja();
		int esperado = 276;
		int resultado = calculadoraCompleja.calcula(ventasMes);
		assertEquals(esperado, resultado, 0) ;
	}
	

	@Test
	public void testCalculaComplejaCaso2() {
		List<Integer> ventasMes = new ArrayList<Integer>();
		 ventasMes.add(460);
		 ventasMes.add(200);
		 ventasMes.add(1575);
		 ventasMes.add(830);
		 ventasMes.add(850);
		CalculadoraCompleja calculadoraCompleja = new CalculadoraCompleja();
		int esperado = 152;
		int resultado = calculadoraCompleja.calcula(ventasMes);
		assertEquals(esperado, resultado, 0) ;
	}
	
	@Test
	public void testCalculaComplejaCondicionBorde() {
		List<Integer> ventasMes = new ArrayList<Integer>();
		CalculadoraCompleja calculadoraCompleja = new CalculadoraCompleja();
		int esperado = 0;
		int resultado = calculadoraCompleja.calcula(ventasMes);
		assertEquals(esperado, resultado, 0) ;
	}

}
