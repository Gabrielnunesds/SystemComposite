package projeto;

public class Heroi implements ComponenteHeroi{
    public String nomeHeroi;
    public String classeHeroi;
    public String racaHeroi;

    public int nivelHeroi;

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

