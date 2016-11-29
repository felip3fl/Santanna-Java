package caeum.exercicios;

public class Empresa {
	
	Empresa(){
		System.out.println("LOG: CONSTRUTOR EMPRESA ACIONADO");
	}
	
	String nome;
	String cnpj;
	
	Funcionario[] empregados;
	
	void adiciona(Funcionario f, int contador) {
		this.empregados[contador] = f;
	}
	
	void getFichaEmpregados(){
		for (int i=0;i<empregados.length;i++){
			this.empregados[i].getFichaFuncionario(i);
			//System.out.println("LOG: VETOR EMPREGADOS = "+empregados.length);
		}
	}
}
