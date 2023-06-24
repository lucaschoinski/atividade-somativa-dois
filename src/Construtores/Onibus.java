package Construtores;

public class Onibus extends Veiculo {
    int assentos;

    public Onibus(String marca, String modelo, int ano, double quilometragem, String placa, int cargaMaxima) {
        super(marca, modelo, ano, quilometragem, placa);
        this.assentos = cargaMaxima;
    }
}
