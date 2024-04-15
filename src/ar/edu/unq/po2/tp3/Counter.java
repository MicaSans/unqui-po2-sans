package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	//Variable de instancia
	private ArrayList<Integer> contador;
	
	//Constructor
	public Counter() {
		contador = new ArrayList<>();
	}
	
	//Metodo agrego un numero a la lista
	public void addNumber(int numero) {
		contador.add(numero);
	}

	//Metodo verificar si es numero par
	public boolean esPar(int numero) {
		return numero % 2 == 0;
	}
	
	//Metodo para obtener la cantidad de numeros no pares en la lista
	public int getEvenOcurrences() {
		int contadorDeImpares = 0;
		for (int numero : contador) {
			if(!(esPar(numero)))
				contadorDeImpares++;
		}
		return contadorDeImpares;
	}
}
