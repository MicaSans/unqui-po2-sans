package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {

	//Variable de instancia
	private ArrayList<Integer> operador;
	
	//Constructor
	public Multioperador() {
		operador = new ArrayList<>();
	}

	//Metodos
	public void agregarNumero(int numero) {
		operador.add(numero);
	}
	
	public int sumarNumeros(ArrayList<Integer> numeros) {
		int suma = 0;
		for (int numero : numeros) {
			suma += numero;
		}
		return suma;
	}
	
	public int restarNumeros(ArrayList<Integer> numeros) {
		if (numeros.isEmpty()) {
			return 0;
		} //Si no hay numeros para restar, devuelve 0
		int resta = numeros.get(0);
		for (int i = 1; i < numeros.size(); i++) {
			resta -= numeros.get(i);
		}
		return resta;
	}
	
	public int multiplicarNumeros(ArrayList<Integer> numeros) {
		if (numeros.isEmpty()) {
			return 1;
		} //Si no hay numeros para multiplicar, devolver 1
		int producto = 1;
		for (int numero : numeros) {
			producto *= numero;
		}
		return producto;
	}
	
	//Getter
	public ArrayList<Integer> getOperador() {
        return operador;
    }
}
