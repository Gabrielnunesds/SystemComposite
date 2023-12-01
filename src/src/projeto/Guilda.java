package projeto;

import java.util.ArrayList;
import java.util.List;

public class Guilda implements ComponenteHeroi{
    private String nomeGuilda;
    private List<ComponenteHeroi> herois = new ArrayList<>();

    public Guilda(String nomeGuilda) {
        this.nomeGuilda = nomeGuilda;
    }

    public void adicionarHeroi(ComponenteHeroi heroi) {
        herois.add(heroi);
    }

    @Override
    public void mostrar() {
        System.out.println("Guilda: " + nomeGuilda);
        System.out.print("---------------------------------------------------------\n");
        for (ComponenteHeroi heroi : herois) {
            heroi.mostrar();
            System.out.print("---------------------------------------------------------\n");
        }

    }
}
