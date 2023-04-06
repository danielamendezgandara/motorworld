package cl.awakelab.motorworld;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cl.awakelab.motorworld.algoritmo.model.CalculadoraCompleja;
import cl.awakelab.motorworld.algoritmo.model.CalculadoraSimple;

@SpringBootApplication
public class MotorworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotorworldApplication.class, args);
		
		Random rand = new Random();
		 List<Integer>  ventas = new ArrayList<Integer>();

		 CalculadoraSimple calculadoraSimple = new CalculadoraSimple();
		 CalculadoraCompleja calculadoraCompleja = new CalculadoraCompleja();
		 System.out.println("---------------------------------------------------");
		 System.out.println("Demostración Cálculo de Beneficios para Vendedores");
		 System.out.println("---------------------------------------------------");
		 System.out.println("Tomando 10 valores de montos de ventas aleatorios...");
	
		 for(int i = 0 ; i< 10 ; i++) {
			 int randomNum = rand.nextInt((2000 - 100) + 1) + 100; 
			 ventas.add(randomNum);
			 System.out.print(randomNum + " ");
		 }
		 
		 System.out.println("\n");
		 
		 
		 int beneficioSimple = calculadoraSimple.calcula(ventas); 
		 
		 System.out.println("Beneficio con Algoritmo Simple : " + beneficioSimple + " US$");

		
		 int beneficioComplejo = calculadoraCompleja.calcula(ventas);
		 
		 System.out.println("Beneficio con Algoritmo Complejo : " + beneficioComplejo + " US$");

	}

}
