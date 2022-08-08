public class Carros {
    private String cor;
    private String modelo;
    private int capacidadeDoTanque;

    public Carros() {}
    public Carros(String cor, String modelo, int capacidadeDoTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return this.cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return this.modelo;
    }

    void setCapacidadeDoTanque(int capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    int getCapacidadeDoTanque() {
        return this.capacidadeDoTanque;
    }

    public double totalValorTanque(double valorDoCombustivel) {
        return capacidadeDoTanque * valorDoCombustivel;
    }
}
