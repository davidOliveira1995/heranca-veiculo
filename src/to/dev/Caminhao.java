package to.dev;

public class Caminhao extends Veiculo {

    private int eixos;

    public Caminhao(int eixos) {
        this.eixos = eixos;
    }

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public void exibirDados() {
        System.out.println("-");
        System.out.println("A placa do veiculo é: " + getPlaca());
        System.out.println("O ano de fabricação é: " + getAno());
        System.out.println("A quantidade de eixos é: " + getEixos());
    }
}
