package Lista_7.Ex_3;

public class Comissionado extends Empregado {
	
	private double totalVenda;
	private double taxaComissao;
	
	
	public Comissionado(String nome, String sobrenome, String cpf, double totalVenda, double taxaComissao) {
		super(nome, sobrenome, cpf);
		this.setTotalVenda(totalVenda);
		this.setTaxaComissao(taxaComissao);
	}


	public double getTotalVenda() {
		return totalVenda;
	}


	public void setTotalVenda(double totalVenda) {
		this.totalVenda = totalVenda;
	}


	public double getTaxaComissao() {
		return taxaComissao;
	}


	public void setTaxaComissao(double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}
	
	public double vencimento() {
		return totalVenda * taxaComissao;
		
	}

}
