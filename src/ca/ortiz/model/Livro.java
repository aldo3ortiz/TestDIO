package ca.ortiz.model;

public class Livro {

	private String lNome;
	private int lAno;
	
	public Livro() {
		
	}
	
	public Livro(String lNome, int lAno) {
		this.lNome = lNome;
		this.lAno = lAno;		
	}
	
	///GETTERS
	
	public String getlNome(){
		return lNome;
	}
	
	public int getlAno() {
		return lAno;
	}
	
	///SETTERS
	
	public void setlNome(String lNome) {
		this.lNome = lNome;
	}
	
	public void setlAno(int lAno) {
		this.lAno = lAno;
	}
	
	
	public String toString() {
		return "Livro [nome=" + lNome + ", ano=" + lAno + "]";
	}
	
}
