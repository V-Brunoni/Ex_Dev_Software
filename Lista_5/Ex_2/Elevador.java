package Lista_5.Ex_2;

public class Elevador {
	
	private int andar;
	private int t_andar;
	private int capacidade;
	private int pessoas;
	
	
	public Elevador(int a, int t, int c, int p) {
		this.andar = a;
		this.t_andar = t;
		this.capacidade = c;
		this.pessoas = p;
	}
	
	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}
	
	public int getTotalAndar() {
		return t_andar;
	}
	public void setTotalAndar(int t_andar) {
		this.t_andar = t_andar;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public int getPessoas() {
		return pessoas;
	}
	public void setPessoas(int pessoas) {
		this.pessoas = pessoas;
	}
	
	public void inicializa(int capacidade, int t_andar) {
		this.capacidade = capacidade;
		this.t_andar = t_andar;
	}
	
	public void entra() {
		if(pessoas < capacidade) {
			this.pessoas +=1;
		}
		
	}
	
	public void sai() {
		if(pessoas > 0) {
		this.pessoas -=1;	
		}
		
	}
	
	public void sobe() {
		if(andar < t_andar) {
		this.andar +=1;	
		}
		
	}
	
	public void desce() {
		if(andar > 0) {
		this.andar -=1;	
		}
		
	}
	

}
