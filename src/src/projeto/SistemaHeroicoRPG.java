package projeto;

import java.util.Random;
import java.util.Scanner;

public class SistemaHeroicoRPG {
    public static void main(String[] args) {

        System.out.println("guilda de aventureiros Stonehaven\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o nome dos integrantes da grupo Lâminas da Aurora:\n");

        System.out.print("\nDigite o nome do primeiro herói: ");
        String nomeHeroi1 = scanner.nextLine();
        Heroi heroi1 = criarHeroiAleatorio(nomeHeroi1);

        System.out.print("Digite o nome do segundo herói: ");
        String nomeHeroi2 = scanner.nextLine();
        Heroi heroi2 = criarHeroiAleatorio(nomeHeroi2);

        System.out.print("Digite o nome do terceiro herói: ");
        String nomeHeroi3 = scanner.nextLine();
        Heroi heroi3 = criarHeroiAleatorio(nomeHeroi3);

        System.out.print("Digite o nome do quarto herói:");
        String nomeHeroi4 = scanner.nextLine();
        Heroi heroi4 = criarHeroiAleatorio(nomeHeroi4);

        System.out.print("\ndigite o nome dos integrantes da grupo Espectros da Tempestade:\n");
        System.out.print("\nDigite o nome do primeiro herói: ");
        String nomeHeroi5 = scanner.nextLine();
        Heroi heroi5 = criarHeroiAleatorio(nomeHeroi5);

        System.out.print("Digite o nome do segundo herói: ");
        String nomeHeroi6 = scanner.nextLine();
        Heroi heroi6 = criarHeroiAleatorio(nomeHeroi6);

        System.out.print("Digite o nome do terceiro herói: ");
        String nomeHeroi7 = scanner.nextLine();
        Heroi heroi7 = criarHeroiAleatorio(nomeHeroi7);

        System.out.print("Digite o nome do quarto herói: ");
        String nomeHeroi8 = scanner.nextLine();
        Heroi heroi8 = criarHeroiAleatorio(nomeHeroi8);

        GrupoHeroico grupo1 = new GrupoHeroico("Lâminas da Aurora");
        grupo1.adicionarHeroi(heroi1);
        grupo1.adicionarHeroi(heroi2);
        grupo1.adicionarHeroi(heroi3);
        grupo1.adicionarHeroi(heroi4);
        GrupoHeroico grupo2 = new GrupoHeroico("Espectros da Tempestade");
        grupo2.adicionarHeroi(heroi5);
        grupo2.adicionarHeroi(heroi6);
        grupo2.adicionarHeroi(heroi7);
        grupo2.adicionarHeroi(heroi8);


        Guilda guilda = new Guilda("Stonehaven");
        guilda.adicionarHeroi(grupo1);
        guilda.adicionarHeroi(grupo2);

        // Exibindo a estrutura
        System.out.print("---------------------------------------------------------\n");
        grupo1.mostrar();
        System.out.print("---------------------------------------------------------\n");
        grupo2.mostrar();
        System.out.print("---------------------------------------------------------\n");
        guilda.mostrar();
        System.out.print("---------------------------------------------------------\n");
        scanner.close();
    }


    private static Heroi criarHeroiAleatorio (String nomeHeroi){
        String[] classes = {"Guerreiro", "Mago", "Arqueiro", "Curandeiro", "Paladino", "Bárbaro", "Bruxo", "Monge", "Ladino", "Artífice"};
        Random random1 = new Random();
        String classeAleatoria = classes[random1.nextInt(classes.length)];

        String[] raca = {"Anão", "Elfo", "Halfling", "Humano", "Draconato", "Gnomo", "Meio-Orc"};
        Random random2 = new Random();
        String racaAleatoria = raca[random2.nextInt(raca.length)];

        Random random3 = new Random();
        int nivelAleatorio = random3.nextInt(1, 12);


        return new Heroi(nomeHeroi, classeAleatoria, racaAleatoria, nivelAleatorio);
    }
}
