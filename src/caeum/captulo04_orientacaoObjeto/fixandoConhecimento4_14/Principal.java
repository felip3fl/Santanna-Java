package caeum.captulo04_orientacaoObjeto.fixandoConhecimento4_14;

public class Principal {

    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.pinta("amarela");
        casa.setPorta(1, true);
        casa.setPorta(2, false);
        casa.setPorta(3, true);
        System.out.println("A casa " + casa.getCor() + " está com " + casa.quantasPortasEstaoAbertas() + " porta(s) aberta(s).");
    }
}