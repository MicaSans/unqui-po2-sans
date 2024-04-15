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

	public int mayorNumeroConDigitosPares() {
		Integer numeroMaximo = 0;
		int cantidadMaxima = 0;
		for (Integer numero : contador) {
			Integer numeroRecorrido = numero;
			int contadorDeNumeros = 0;
			while (numeroRecorrido >= 1) {
				int restante = (int)(numeroRecorrido % 10);
				if(this.esPar(restante) && restante != 0) {
					contadorDeNumeros ++;
				}
				numeroRecorrido = (numeroRecorrido - restante)/10;
			}
			if(contadorDeNumeros > cantidadMaxima) {
				cantidadMaxima = contadorDeNumeros;
				numeroMaximo = numero;
			}
		}
		return numeroMaximo;
	}

	public int multiplosEntre(int x, int y) {
		int numeroMax = 0;
		int numeroMin = 0;
		if(x > y) {
			numeroMax = x;
			numeroMin = y;
		}else {
			numeroMax = y;
			numeroMin = x;
		}
		if(numeroMax % numeroMin != 0) {
			return -1;
		}else {
			return this.mayorNumeroMultiploEntre(numeroMax,numeroMin);
		}
	}

	private int mayorNumeroMultiploEntre(int x, int y) {
		int indice = 1000;
		while(indice % x != 0 || indice % y != 0) {
			indice --;
		}
		return indice;
	}
}
