package proz;

public class UsarTimeDoCorinthans {
    public static void main(String[] args) {
        PosicoesDoFutebol corinthans;
        corinthans = new PosicoesDoFutebol();

        corinthans.goleiro = "Matheus Donelli";
        corinthans.lateralDireito = "Hugo";
        corinthans.lateralEsquerdo = "L. Mana";
        corinthans.zagueiro1 = "Caca";
        corinthans.zagueiro2 = "Caetano";
        corinthans.vol1 = "Breno";
        corinthans.vol2 = "Raniele";
        corinthans.meia1 = "R. Garro";
        corinthans.meia2 = "Coronado";
        corinthans.meia3 = "Wesley";
        corinthans.atacante = "Yuri Alberto";

        System.out.println("Time do Corinthans:");
        System.out.println("Goleiro: " + corinthans.goleiro);
        System.out.println("LD: " + corinthans.lateralDireito);
        System.out.println("LE: " + corinthans.lateralEsquerdo);
        System.out.println("Vol: " + corinthans.vol1);
        System.out.println("Vol2: " + corinthans.vol2);
        System.out.println("Meia1: " + corinthans.meia1);
        System.out.println("Meia2: " + corinthans.meia2);
        System.out.println("Meia3: " + corinthans.meia3);
        System.out.println("Atacante: " + corinthans.atacante);
    }
}
