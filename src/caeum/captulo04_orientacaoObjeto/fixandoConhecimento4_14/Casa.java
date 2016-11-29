package caeum.captulo04_orientacaoObjeto.fixandoConhecimento4_14;

public class Casa {

    private String cor;
    private Porta porta1 = new Porta();
    private Porta porta2 = new Porta();
    private Porta porta3 = new Porta();

    public void pinta(String s) {
        cor = s;
    }

    public String getCor() {
        return cor;
    }

    public void setPorta(int porta, boolean aberta) {
        switch (porta) {
            case 1:
                porta1.setAberta(aberta);
                break;
            case 2:
                porta2.setAberta(aberta);
                break;
            case 3:
                porta3.setAberta(aberta);
                break;
        }
    }

    int quantasPortasEstaoAbertas() {
        int contaPortas = 0;
        if (porta1.getAberta()) {
            contaPortas++;
        }
        if (porta2.getAberta()) {
            contaPortas++;
        }
        if (porta3.getAberta()) {
            contaPortas++;
        }
        return contaPortas;
    }
}