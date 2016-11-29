package caeum.captulo04_orientacaoObjeto.exercicio4_12;

class Data {
	int dia;
	int mes;
	int ano;

	boolean getDia(int dia) {
		if (dia <= 31 && dia > 0) {
			this.dia = dia;
			return true;
		} else {
			//mensagemErro();
			return false;
		}
	}

	boolean getMes(int mes) {
		if (mes <= 12 && mes > 0) {
			this.mes = mes;
			return true;
		} else {
			//mensagemErro();
			return false;
		}
	}
	
	boolean getAno(int ano) {
		if (ano <= 2020 && ano > 1920) {
			this.ano = ano;
			return true;
		} else {
			//mensagemErro();
			return false;
		}
	}

	int setDia() {
		return this.dia;
	}

	int setMes() {
		return this.mes;
	}

	int setAno() {
		return this.ano;
	}

}
