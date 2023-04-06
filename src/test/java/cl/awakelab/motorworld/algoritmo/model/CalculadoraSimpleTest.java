package cl.awakelab.motorworld.algoritmo.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CalculadoraSimpleTest {

	@Test
	public void testCalculaSimpleCaso1() {
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
		CalculadoraSimple calculadoraSimple = new CalculadoraSimple();
		int esperado = 161;
		int resultado = calculadoraSimple.calcula(ventasMes);
		assertEquals(esperado, resultado, 0) ;
		}
	
	@Test
	public void testCalculaSimpleCaso2() {
		List<Integer> ventasMes = new ArrayList<Integer>();
		 ventasMes.add(124);
		 ventasMes.add(1999);
		 ventasMes.add(200);
		 ventasMes.add(568);
		 ventasMes.add(130);
		CalculadoraSimple calculadoraSimple = new CalculadoraSimple();
		int esperado = 90;
		int resultado = calculadoraSimple.calcula(ventasMes);
		assertEquals(esperado, resultado, 0) ;
		}
	
	@Test
	public void testCalculaSimpleCondicionBorde() {
		List<Integer> ventasMes = new ArrayList<Integer>();
		CalculadoraSimple calculadoraSimple = new CalculadoraSimple();
		int esperado = 0;
		int resultado = calculadoraSimple.calcula(ventasMes);
		assertEquals(esperado, resultado, 0) ;
		}


}
