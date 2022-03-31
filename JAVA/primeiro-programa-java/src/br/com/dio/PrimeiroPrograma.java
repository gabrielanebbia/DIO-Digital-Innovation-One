package br.com.dio;
/* Importando a class de outro arquivo necessita do import */
import br.com.dio.model.Gato;

public class PrimeiroPrograma {
	
	public static void main(String[] args) {
		
		Gato gato = new Gato();
				
		/* Mostra os valores como string*/
		System.out.println(gato); /* Gato [nome=null, cor=null, idade=null]*/
		
		/* Importando uma class dentro do mesmo arquivo, não precisa do import */
		Livros livros = new Livros();
		
		/* Mostra o endereço de memória porque não foi utilizado o toString()*/
		System.out.println(livros); /* br.com.dio.Livros@3764951d */
	}

}

class Livros {
	private String nome;
	private String npag;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNpag() {
		return npag;
	}
	public void setNpag(String npag) {
		this.npag = npag;
	}
}
