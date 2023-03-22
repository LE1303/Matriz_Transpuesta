package matriz;

import java.util.Scanner;

public class MatrizTranspuesta {
	public static void main(String[] args) {
		int Matriz[][] = {{3,5,9},{5,6,8},{8,7,4}};
		
		//imprime tal cual la matríz
		System.out.println("Esta es la matríz Original: ");
		for (int i = 0; i < Matriz.length; i++) {
			for (int j = 0; j < Matriz.length; j++) {
				System.out.print(Matriz[i][j] + " ");
			}
			System.out.println("");
		}
		//Imprime la matríz transpuesta, en el ciclo for lo que se hace es que en vez de imprimirlos
		//de acuerdo al orden ahora van cambiando de posición.
		System.out.println("Esta es la matriz transpuesta: ");
		for (int i = 0; i < Matriz.length; i++) {
			for (int j = 0; j < Matriz.length; j++) {
				System.out.print(Matriz[j][i] + " ");
			}
			System.out.println("");
		}
		//System.out.print(" ");
	}

}
