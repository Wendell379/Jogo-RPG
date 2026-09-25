//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);


    IO.println("BEM-VINDO AO MUSHOKU TENSEI");
    IO.println("Digite o nome do seu personagem: ");
    String nomeJogador = scanner.nextLine();

    IO.println("Escolha sua Classe:");
    IO.println("1 Mago");
    IO.println("2 Guerreiro");
    IO.println("Sua opção: ");
    int opcaoClasse = scanner.nextInt();

    Personagen jogador;

    if (opcaoClasse == 1) {

        jogador = new Personagen(nomeJogador, 80, 120, 20);
        jogador.aprenderHabilidade(new Magia("Bola de Fogo", RankPoder.INICIANTE, ElementosMagicos.Fogo, 25, 15));
        jogador.aprenderHabilidade(new Magia("Jato de Água", RankPoder.INICIANTE, ElementosMagicos.Agua, 20, 10));
    } else {

        jogador = new Personagen(nomeJogador, 120, 20, 80);
        jogador.aprenderHabilidade(new TecnicaEspada("Corte Relâmpago", RankPoder.INICIANTE, EstiloEspada.DEUS_DA_ESPADA, 15, 20));
        jogador.aprenderHabilidade(new TecnicaEspada("Estocada Veloz", RankPoder.INICIANTE, EstiloEspada.DEUS_DA_AGUA, 10, 15));
    }

    Personagen guerreiro = new Personagen("Lucas", 90, 0, 40);
    guerreiro.aprenderHabilidade(new TecnicaEspada("Golpe Pesado", RankPoder.INICIANTE, EstiloEspada.DEUS_DO_NORTE, 10, 15));
    IO.println("BATALHA: " + jogador.getNome() + " vs " + guerreiro.getNome() + " ");

    int Turno = 1;
    while (jogador.getVidaAtual() > 0 && guerreiro.getVidaAtual() > 0) {
        IO.println("TURNO " + Turno);
        IO.println(jogador.getNome() + " | HP: " + jogador.getVidaAtual() + " | MP: " + jogador.getManaAtual() + " | SP: " + jogador.getStaminaAtual());
        IO.println(guerreiro.getNome() + " | HP: " + guerreiro.getVidaAtual());

        IO.println("Escolha qual habilidade usar:");
        for (int i = 0; i < jogador.getQuantidadeHabilidades(); i++) {
            Habilidade h = jogador.getHabilidades()[i];
            IO.println("[" + (i + 1) + "] " + h.getNomeAb() + " (" + h.getRank() + ")");
        }

        IO.println("Sua opção: ");
        int escolha = scanner.nextInt() - 1;


        if (escolha >= 0 && escolha < jogador.getQuantidadeHabilidades()) {
            jogador.getHabilidades()[escolha].fazer(jogador, guerreiro);
        } else {
            IO.println("Opção inválida! Você perdeu a vez.");
        }


        if (guerreiro.getVidaAtual() > 0) {
            IO.println("Turno do Rival:");
            guerreiro.getHabilidades()[0].fazer(guerreiro, jogador);
        }

        Turno++;
    }

    IO.println("FIM DO COMBATE ");
    if (jogador.getVidaAtual() > 0) {
        IO.println("Parabéns! " + jogador.getNome() + " venceu a batalha!");

        IO.println("Recompensa de vitória: ");

        if (opcaoClasse == 1) {
            jogador.setRankMagicoglobal(RankPoder.INTERMEDIARIO);
            IO.println("Progresso: " + jogador.getNome() + " evoluiu para o Rank Mágico: " + jogador.getRankMagicoglobal() + "!");
            jogador.aprenderHabilidade(new Magia("Explosão de Fogo", RankPoder.INTERMEDIARIO, ElementosMagicos.Fogo, 45, 30));
        } else {
            jogador.setRankEspadachin(RankPoder.INTERMEDIARIO);
            IO.println("Progresso: " + jogador.getNome() + " evoluiu para o Rank Espadachim: " + jogador.getRankEspadachin() + "!");
            jogador.aprenderHabilidade(new TecnicaEspada("Dança das Lâminas", RankPoder.INTERMEDIARIO, EstiloEspada.DEUS_DA_ESPADA, 25, 40));
        }
    } else {
        IO.println("Derrota! O rival resistiu aos seus ataques.");
    }
}