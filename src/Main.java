//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    IO.println("BEM-VINDO AO MUSHOKU TENSEI");


    Personagen Murilo = new Personagen("Murilo", 100, 30, 200, 50, 90, 30, RankPoder.INICIANTE, null, RankPoder.INICIANTE);
    Personagen Guerreiro = new Personagen("Lucas", 100, 40, 100, 0, 80, 40, RankPoder.INICIANTE, null, RankPoder.INICIANTE);

    Habilidade bolaDeFogo = new Magia("Bola de Fogo", RankPoder.INICIANTE, ElementosMagicos.Fogo, 20, 35);
    Habilidade corteRapido = new TecnicaEspada("Corte Relâmpago", RankPoder.INICIANTE, EstiloEspada.DEUS_DA_ESPADA, 15, 25);

    IO.println("              Status             ");
    IO.println("Nome: " + Murilo.getNome() + " | Rank Magico: " + Murilo.getRankMagicoglobal());
    IO.println("Vida do Guerreiro: " + Guerreiro.getVidaAtual());

    IO.println("        TURNO 1     ");
    bolaDeFogo.fazer(Murilo, Guerreiro);
    IO.println("Vida Restante do Guerreiro: " + Guerreiro.getVidaAtual());

    IO.println("        TURNO 2     ");
    corteRapido.fazer(Murilo, Guerreiro);
    IO.println("Vida Restante do Guerreiro: " + Guerreiro.getVidaAtual());

    IO.println("     FIM DO COMBATE    ");

    if (Guerreiro.getVidaAtual() <= 20) {
        IO.println("Parabéns! " + Murilo.getNome() + " venceu a batalha!");
        Murilo.setRankMagicoglobal(RankPoder.INTERMEDIARIO);
        IO.println("Progresso: Murilo evoluiu para o Rank Mágico: " + Murilo.getRankMagicoglobal() + "!");
    } else {
        IO.println("Derrota! O rival resistiu aos seus ataques.");
    }
}