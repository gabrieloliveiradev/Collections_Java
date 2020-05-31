package main;

import java.util.List;
import java.util.ArrayList;

public class TestandoListas {
	public static void main(String[] args) {
		//Aplicando valores as variaveis
		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";

		// Criando a ArrayLista aulas
		ArrayList<String> aulas = new ArrayList<>();
				
		//Adionando os valores na ArrayList aulas
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
				
		//Imprimindo os valores
		System.out.println(aulas);  //Imprimindo o vetor
		System.out.println(aulas.size()); //Imprimindo o tamanho do vetor

		// cuidado! <= faz sentido aqui? Não, pois não há itens suficiente no array  e o programa dará erro.
		// for que tenta percorrer e imprimir o valor das aulas
		for (int i = 0; i <= aulas.size(); i++) {
			System.out.println("Aula: "+ aulas.get(i));//Imprimindo as memórias do vetor
		}
	}
}
