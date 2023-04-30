package to.dev;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.add(new Veiculo("XPO-0987", 2010));
        veiculos.add(new Veiculo("ABC-1209", 2008));
        veiculos.add(new Veiculo("TYV-1099", 2022));
        veiculos.add(new Caminhao("HHY-9981", 2008,5));
        veiculos.add(new Caminhao("GFT-2201", 2023, 7));

        ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();
        veiculos.add(new Veiculo("TYH-2201", 2021));
        veiculos.add(new Caminhao("NMJ-2200", 2012,7));

        ArrayList<Onibus> onibuses = new ArrayList<Onibus>();
        veiculos.add(new Onibus("XSD-2011", 2009, 42));
        veiculos.add(new Onibus("ERQ-1022", 2022, 52));

        for(Veiculo veiculo : veiculos) {
            veiculo.exibirDados();
        }

        for (Caminhao caminhao : caminhoes) {
            caminhao.exibirDados();
        }

        for (Onibus onibus : onibuses) {
            onibus.exibirDados();
        }
    }
}
