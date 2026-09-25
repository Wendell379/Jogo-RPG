public class Personagen {

    private String Nome;
    private int VidaMaxima;
    private int VidaAtual;
    private int ManaMaxima;
    private int ManaAtual;
    private int StaminaMax;
    private int StaminaAtual;

    private RankPoder rankMagicoglobal;
    private EstiloEspada estiloEspadaPrincipal;
    private RankPoder rankEspadachin;

    private Habilidade[] habilidades;
    private int quantidadeHabilidades;

    public Personagen(String nome, int vida, int mana, int stamina) {
        this.Nome = nome;
        this.VidaMaxima = vida;
        this.VidaAtual = vida;
        this.ManaMaxima = mana;
        this.ManaAtual = mana;
        this.StaminaMax = stamina;
        this.StaminaAtual = stamina;
        this.rankMagicoglobal = RankPoder.INICIANTE;
        this.rankEspadachin = RankPoder.INICIANTE;
        this.rankMagicoglobal = RankPoder.INICIANTE;

        this.habilidades = new Habilidade[10];
        this.quantidadeHabilidades = 0;
    }
    public void aprenderHabilidade(Habilidade habilidade) {
        if (quantidadeHabilidades < habilidades.length) {
            this.habilidades[quantidadeHabilidades] = habilidade;
            this.quantidadeHabilidades++;
            IO.println(" " + Nome + " aprendeu: " + habilidade.getNomeAb() + "!");
        } else {
            IO.println(" " + Nome + " não pode aprender mais habilidades!");
        }
    }

    public Habilidade[] getHabilidades() {
        return habilidades;
    }

    public int getQuantidadeHabilidades() {
        return quantidadeHabilidades;
    }

    public String getNome() { return Nome; }
    public int getVidaAtual() { return VidaAtual; }
    public int getManaAtual() { return ManaAtual; }
    public int getStaminaAtual() { return StaminaAtual; }

    public void setVidaAtual(int vidaAtual) {
        if (vidaAtual < 0) {
            this.VidaAtual = 0;
        } else {
            this.VidaAtual = vidaAtual;
        }
    }

    public void setManaAtual(int manaAtual) {
        if (manaAtual < 0) {
            this.ManaAtual = 0;
        } else {
            this.ManaAtual = manaAtual;
        }
    }

    public void setStaminaAtual(int staminaAtual) {
        if (staminaAtual < 0) {
            this.StaminaAtual = 0;
        } else {
            this.StaminaAtual = staminaAtual;
        }
    }

    public RankPoder getRankMagicoglobal() {
        return rankMagicoglobal;
    }
    public void setRankMagicoglobal(RankPoder rank) {
        this.rankMagicoglobal = rank;
    }
    public RankPoder getRankEspadachin() {
        return rankEspadachin;
    }
    public void setRankEspadachin(RankPoder rank){
        this.rankEspadachin = rank;
    }

}