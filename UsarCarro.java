package proz;

public class UsarCarro {
    public static void main(String[] args) {
        Carro carro1;
        carro1 = new Carro();

        carro1.marca = "Nissan";
        carro1.modelo = "GT-R";
        carro1.anoFabricacao = 2022;
        carro1.cor = "Prata";
        carro1.placa = "XYZ-1234";
        carro1.quilometragem = 10000.0;
        carro1.combustivel = "Gasolina";
        carro1.numPortas = 2;
        carro1.potenciaMotor = 600.0;
        carro1.preco = 250000.0;

        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano de fabricação: " + carro1.anoFabricacao);
        System.out.println("Cor: " + carro1.cor);
        System.out.println("Placa: " + carro1.placa);
        System.out.println("Quilometragem: " + carro1.quilometragem);
        System.out.println("Combustivel: " + carro1.combustivel);
        System.out.println("Número de portas: " + carro1.numPortas);
        System.out.println("Potencia do motor: " + carro1.potenciaMotor);
        System.out.println("Preço: " + carro1.preco);
    }
}
