package projeto;

public class Heroi implements ComponenteHeroi{
    private String nomeHeroi;
    private String classeHeroi;
    private String racaHeroi;
    private int nivelHeroi;

    public Heroi(String nomeHeroi, String classeHeroi,String racaHeroi,int nivelHeroi) {
        this.nomeHeroi = nomeHeroi;
        this.classeHeroi = classeHeroi;
        this.racaHeroi = racaHeroi;
        this.nivelHeroi = nivelHeroi;
    }

    @Override
    public void mostrar() {
        System.out.println("Herói: " + nomeHeroi + " | Classe: " + classeHeroi + " | Raça: " + racaHeroi + " | Nivel: " + nivelHeroi);
    }
}

