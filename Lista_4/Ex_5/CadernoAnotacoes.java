package Lista_4.Ex_5;

import java.util.ArrayList;

public class CadernoAnotacoes {
	
	
	ArrayList<String> listaAnotacoes = new ArrayList<>();
	
	public void adicionarAnotacao(String anotacao) {
		listaAnotacoes.add(anotacao);
	}
	
	public void visualizarAnotacoes() {
		if(listaAnotacoes.isEmpty()) {
			System.out.println("LISTA VAZIA!");		
		}else {
			listaAnotacoes.forEach(anotacao ->{
				System.out.println(anotacao);
			}
			);
		}
		
	}
	
	public void apagarAnotacoes() {
		listaAnotacoes.clear();
	}

}
