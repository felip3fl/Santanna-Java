package caeum.exercicios;

public class testaEmpresa {
	
	public static void main(String[] args){
		
		Empresa empresa = new Empresa();		
		
		// PREENCHENDO CAMPOS DA EMPRESA ////////////////////////
		
		empresa.nome = "Empresa 1";
		empresa.cnpj = "123.123.123.123.2";
		
		
		// PRENCHENDO CAMPOS DO FUNCIONARIOS ///////////////////
		
		empresa.empregados = new Funcionario[2];
		
		for (int i=0; i < empresa.empregados.length;i++){ // AUTO-PREENCHIMENTO
			Funcionario f = new Funcionario();
			Data data = new Data();
			
			System.out.println("LOG: PRENCHENDO FUNCIONARIO "+i);
			f.getNome("FELIPE "+i);
			f.getDepartamento("TI "+i);
			f.getSalario(2200+i);
			f.dataDeEntrada = data;
			f.dataDeEntrada.getDia(20+i);
			f.dataDeEntrada.getMes(1+i);
			f.dataDeEntrada.getAno(1999+i);
			f.getRg("123123123-"+i);
			f.getAtivoEmpresa("nao");
			
			System.out.println("LOG: ADICIONANDO O FUNCIONARIO "+i);
			empresa.adiciona(f, i);
		}
		
		empresa.getFichaEmpregados();
		
		
	}
	
}
