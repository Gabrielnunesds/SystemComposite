package projeto;

import java.util.ArrayList;
import java.util.List;

public class GrupoHeroico implements ComponenteHeroi{
    private String nomeGrupo;
    private List<ComponenteHeroi> herois = new ArrayList<>();

    public GrupoHeroico(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }

    public void adicionarHeroi(ComponenteHeroi heroi) {
        herois.add(heroi);
    }

    @Override
    public void mostrar() {
        System.out.println("Grupo: " + nomeGrupo);
        System.out.println("Heróis em " + nomeGrupo + ":");

        for (ComponenteHeroi heroi : herois) {
            heroi.mostrar();
        }
    }
}
