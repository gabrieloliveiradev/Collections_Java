package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MinhasCollections {

	public static void main(String[] args) {
		//Iniciando a listagem do Array e criando o objeto minhaLista e adicionando ao objeto minha lista
		List<Integer> minhaLista = new ArrayList<Integer>();
		//Adicção de valores
		minhaLista.add(1);  
		minhaLista.add(2);
		minhaLista.add(2);
				
		//Imprimindo os valores da lista
		for (Integer listaElementos : minhaLista) {
			System.out.println(listaElementos);
		}

		//Inicializando a listagem do Set e criando o objeto meuSet, 
		//com um dos valores repitidos que não será implementado no set
		Set<Integer> meuSet = new HashSet<Integer>();
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(3);
		meuSet.add(1); 

		//Criação do Iterator que vai imprimir os valores do set
		Iterator<Integer> iMeuSet = meuSet.iterator();

		//Imprimindo os valores
		while(iMeuSet.hasNext()){
			System.out.println(iMeuSet.next());
		}
		
	}

}
