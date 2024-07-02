package proz.construtoras;

public class PosicoesDoFutebol {
    String goleiro;
    String lateralDireito;
    String lateralEsquerdo;
    String zagueiro1;
    String zagueiro2;
    String vol1;
    String vol2;
    String meia1;
    String meia2;
    String meia3;
    String atacante;

    PosicoesDoFutebol(
        // Parâmetros
        String goleiroP,
        String lateralDireitoP,
        String lateralEsquerdoP,
        String zagueiro1P,
        String zagueiro2P,
        String vol1P,
        String vol2P,
        String meia1P,
        String meia2P,
        String meia3P,
        String atacanteP
    ) 
    {
        goleiro = goleiroP;
        lateralDireito = lateralDireitoP;
        lateralEsquerdo = lateralEsquerdoP;
        zagueiro1 = zagueiro1P;
        zagueiro2 = zagueiro2P;
        vol1 = vol1P;
        vol2 = vol2P;
        meia1 = meia1P;
        meia2 = meia2P;
        meia3 = meia3P;
        atacante = atacanteP;
    }

}
