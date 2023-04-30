package to.dev;

public class Onibus extends Veiculo {

    private int assentos;

    public Onibus(int assentos) {
        this.assentos = assentos;
    }

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    @Override
    public void exibirDados() {
        System.out.println("-");
        System.out.println("A placa do veiculo é: " + getPlaca());
        System.out.println("O ano de fabricação é: " + getAno());
        System.out.println("A quantidade de assentos é: " + getAssentos());
    }
}
