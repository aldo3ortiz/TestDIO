package ca.ortiz;

import ca.ortiz.model.Gato;
import ca.ortiz.model.Livro;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		/*
		int a = 2;
		int b = 3;
		System.out.println("Hello World " + (a+b));
		*/
		
		Gato gato = new Gato();
		gato.setNome("felix");
		gato.setCor("preto");
		gato.setIdade(10);
				
		//System.out.println(gato.toString());
		System.out.println(gato);
		
		Livro livro = new Livro();
		livro.setlNome("Hoje");
		livro.setlAno(2022);
		
		System.out.println(livro);
		
	}

}
