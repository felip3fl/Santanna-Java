//Apostila Caelum fj11 captulo 4

package caeum.captulo04_orientacaoObjeto.exercicio4_12;

// Exercicio 1 -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

//Funcionario é o nome dessa classe! Essa classe não possui o main

public class Funcionario {

	private String nome;
	private String departamento;
	private double salario; //
	//String dataDeEntrada;//
	private String rg;//
	private boolean ativoNaEmpresa = false;//

	Data dataDeEntrada;

	Funcionario() {
		System.out.println("Contrutor OK");
	}

	// Data dataDeEntradaa;

	// METODOS ////////////////////////////////////////////////

	void mensagemErro() {
		System.out.print("[ ERRO! ]\n");
	}

	// NOME ///////////////////////////////////////////////////

	boolean getNome(String nomeFuncionario) {
		if (nomeFuncionario.length() < 30 && nomeFuncionario.length() > 0) {
			this.nome = nomeFuncionario.toUpperCase();
			return true;
		} else
			mensagemErro();
		return false;
	}

	String setNome() {
		return this.nome;
	}

	// DEPARTAMENTO ///////////////////////////////////////////

	// class Data {
	boolean getDepartamento(String departamento) {
		if (departamento.length() > 0 && departamento.length() < 100) {
			this.departamento = departamento.toUpperCase();
			return true;
		} else {
			mensagemErro();
			return false;
		}
	}

	String setDepartamento() {
		return departamento;
	}

	// }

	// SALARIO ////////////////////////////////////////////////

	boolean getSalario(double valorSalario) {
		if (valorSalario < 100000 && valorSalario > 0) {
			this.salario = valorSalario;
			return true;
		} else {
			mensagemErro();
			return false;
		}

	}

	Double setSalario() {
		return this.salario;
	}

	// DATA DE ENTRADA /////////////////////////////////////////

	// RG ////////////////////////////////////////////////////////

	boolean getRg(String valorRg) {
		if (valorRg.length() < 12 && valorRg.length() > 0) {
			this.rg = valorRg;
			return true;
		} else {
			mensagemErro();
			return false;
		}
	}

	String setRg() {
		return this.rg;
	}

	// ATIVO NA EMPRESA /////////////////////////////////////////////

	boolean getAtivoEmpresa(String valor) {

		switch (valor.toUpperCase()) {
		case "SIM":
		case "TRUE":
			this.ativoNaEmpresa = true;
			return true;

		case "FALSE":
		case "NAO":
		case "NÃO":
			this.ativoNaEmpresa = false;
			return true;

		default:
			mensagemErro();
			return false;
		}
	}

	String setAtivoEmpresa() {
		if (ativoNaEmpresa) {
			return "ATIVO";
		} else {
			return "NÃO ATIVO";
		}
	}

	// IMPRIMIR /////////////////////////////////////////////////////////

	void getFichaFuncionario() {

		System.out.println("\n[ IMPRIMINDO ]");
		System.out.println("NOEM: " + setNome());
		System.out.println("DEPARTAMENTO: " + setDepartamento());
		System.out.println("SALARIO: " + setSalario());
		System.out.println("DATA DE ENTRADA: " + this.dataDeEntrada.setDia() + "/"
				+ this.dataDeEntrada.setMes() + "/" + this.dataDeEntrada.setAno());
		System.out.println("RG: " + setRg());
		System.out.println("FUNCIONARIO ATIVO: " + setAtivoEmpresa());
	}

}