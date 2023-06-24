package Construtores;

public class Caminhao extends Veiculo {
    String cargaMaxima;

    public Caminhao(String marca, String modelo, int ano, double quilometragem, String placa, String cargaMaxima) {
        super(marca, modelo, ano, quilometragem, placa);
        this.cargaMaxima = cargaMaxima;
    }
}

