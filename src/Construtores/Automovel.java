package Construtores;

public class Automovel extends Veiculo {
    String motorizacao;
    String motor;

    public Automovel(String marca, String modelo, int ano, double quilometragem, String placa,
                    String motorizacao, String motor) {
        super(marca, modelo, ano, quilometragem, placa);
        this.motorizacao = motorizacao;
        this.motor = motor;
    }
}
