package proz.construtoras;

public class Carro {
    String marca;
    String modelo;
    int anoFabricacao;
    String cor;
    String placa;
    double quilometragem;
    String combustivel;
    int numPortas;
    double potenciaMotor;
    double preco;

    Carro(
        // Parâmetros
        String marcaP,
        String modeloP,
        int anoFabricacaoP,
        String corP,
        String placaP,
        double quilometragemP,
        String combustivelP,
        int numPortasP,
        double potenciaMotorP,
        double precoP
    ) 
    {
        marca = marcaP;
        modelo = modeloP;
        anoFabricacao = anoFabricacaoP;
        cor = corP;
        placa = placaP;
        quilometragem = quilometragemP;
        combustivel = combustivelP;
        numPortas = numPortasP;
        potenciaMotor = potenciaMotorP;
        preco = precoP;
    }

}
