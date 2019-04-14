public class Carro {
    public String placa;
    public String modelo;
    public int velocidade;

    public Carro(String placa, String modelo) {
        this.placa  = placa;
        this.modelo = modelo;
    }

    public Carro() { }


    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void acelerar() {
        this.velocidade = velocidade + 10;
    }
}
