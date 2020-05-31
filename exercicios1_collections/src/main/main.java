package main;

import java.util.*;

import model.telefone;

public class main {

	public static void main(String[] args) {
			List<telefone> lista = new ArrayList<telefone>();
			
			telefone a = new telefone("29-6738808", 1);
			telefone b = new telefone("11-55436963", 2);
			telefone c = new telefone("15-55276867", 3);
			
			lista.add(a);
			lista.add(b);
			lista.add(c);
			
			telefone telefone;
			Iterator<telefone> iterador = lista.iterator();
			while (iterador.hasNext()) {
				telefone=iterador.next();
			System.out.println("Número do telefone: "+telefone.getNumeroTelefone());
			System.out.println("Tipo do telefone: "+telefone.getTipoTelefone());
			System.out.println("\n");
			}
		}
	}

}
