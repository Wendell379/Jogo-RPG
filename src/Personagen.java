public class Personagen {

    private String Nome;
    private int VidaMaxima;
    private int VidaAtual;
    private int ManaMaxima;
    private int ManaAtual;
    private int StaminaMax;
    private int StaminaAtual;
    private Habilidade habilidade1;
    private Habilidade habilidade2;
    private Habilidade habilidadeNova;


    private RankPoder rankMagicoglobal;
    private EstiloEspada estiloEspadaPrincipal;
    private RankPoder rankEspadachin;
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

        this.habilidade1 = null;
        this.habilidade2 = null;
        this.habilidadeNova = null;
    }
    public void aprenderHabilidade(Habilidade habilidade) {
        if (this.habilidade1 == null) {
            this.habilidade1 = habilidade;
            IO.println(" " + Nome + " aprendeu: " + habilidade.getNomeAb() + "!");
        } else if (this.habilidade2 == null) {
            this.habilidade2 = habilidade;
            IO.println(" " + Nome + " aprendeu: " + habilidade.getNomeAb() + "!");
        } else if (this.habilidadeNova == null) {
            this.habilidadeNova = habilidade;
            IO.println(" " + Nome + " aprendeu: " + habilidade.getNomeAb() + "!");
        } else {
            IO.println(" " + Nome + " não pode aprender mais habilidades!");
        }
    }

    public Habilidade getHabilidade1() {
        return habilidade1;
    }
    public Habilidade getHabilidade2() {
        return habilidade2;
    }
    public Habilidade getHabilidadeNova() {
        return habilidadeNova;
    }

    public String getNome() {
        return Nome;
    }
    public int getVidaAtual() {
        return VidaAtual;
    }
    public int getManaAtual() {
        return ManaAtual;
    }
    public int getStaminaAtual() {
        return StaminaAtual;
    }

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