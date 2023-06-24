package Construtores;
abstract class Veiculo {
    String marca;
    String modelo;
    int ano;
    double quilometragem;
    String placa;

    public Veiculo(String marca, String modelo, int ano, double quilometragem, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
        this.placa = placa;
    }
}