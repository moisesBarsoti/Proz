package proz.construtoras;

public class UsarPosicoesDoFutebol {
    public static void main(String[] args) {
        PosicoesDoFutebol corinthans;
        corinthans = new PosicoesDoFutebol(
            "Matheus Donelli", 
            "Matheuzinho (ou Léo Maná)", 
            "Hugo", 
            "Cacá", 
            "Caetano", 
            "Raniele", 
            "Breno Bidon", 
            "Rodrigo Garro", 
            "Igor Coronado", 
            "Wesley", 
            "Yuri Alberto"
            );

            System.out.println("  ");
            System.out.println("Formação 4-2-3-1");
            System.out.println("  ");
    
            System.out.println("Goleiro: " + corinthans.goleiro);
            System.out.println("Lateral direito: " + corinthans.lateralDireito);
            System.out.println("Lateral esquerdo: " + corinthans.lateralEsquerdo);
            System.out.println("Zagueiro: " + corinthans.zagueiro1);
            System.out.println("Zagueiro: " + corinthans.zagueiro2);
            System.out.println("Volante: " + corinthans.vol1);
            System.out.println("Volante: " + corinthans.vol2);
            System.out.println("Meia: " + corinthans.meia1);
            System.out.println("Meia: " + corinthans.meia2);
            System.out.println("Meia: " + corinthans.meia3);
            System.out.println("Atacante: " + corinthans.atacante);
    }
}