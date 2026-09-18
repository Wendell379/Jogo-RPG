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

    public Personagen(String nome, int vidaMaxima, int vidaAtual, int manaMaxima, int manaAtual, int staminaMax, int staminaAtual, RankPoder rankMagicoglobal, EstiloEspada estiloEspadaPrincipal, RankPoder rankEspadachin) {
        Nome = nome;
        VidaMaxima = vidaMaxima;
        VidaAtual = vidaAtual;
        ManaMaxima = manaMaxima;
        ManaAtual = manaAtual;
        StaminaMax = staminaMax;
        StaminaAtual = staminaAtual;
        this.rankMagicoglobal = RankPoder.INICIANTE;
        this.estiloEspadaPrincipal = null;
        this.rankEspadachin = RankPoder.INICIANTE;
    }


    public String getNome() {
        return Nome;
    }

    public int getVidaAtual() {
        return VidaAtual;
    }

    public void setVidaAtual(int vidaAtual) {
        if (vidaAtual < 0) {
            this.VidaAtual = vidaAtual;
        } else {
            this.VidaAtual = vidaAtual;
        }
    }

    public int getManaAtual() {
        return ManaAtual;
    }

    public void setManaAtual(int manaAtual) {
        if (manaAtual < 0) {
            this.ManaAtual = manaAtual;
        } else {
            this.ManaAtual = manaAtual;
        }
    }

    public int getStaminaAtual() {
        return StaminaAtual;
    }

    public void setStaminaAtual(int staminaAtual) {
        if (staminaAtual < 0) {
            this.StaminaAtual = staminaAtual;
        } else {
            this.StaminaAtual = staminaAtual;
        }
    }

    public RankPoder getRankMagicoglobal() {
        return rankMagicoglobal;
    }

    public void setRankMagicoglobal(RankPoder rankMagicoglobal) {
        this.rankMagicoglobal = rankMagicoglobal;
    }

    public EstiloEspada getEstiloEspadaPrincipal() {
        return estiloEspadaPrincipal;
    }

    public void setEstiloEspadaPrincipal(EstiloEspada estiloEspadaPrincipal) {
        this.estiloEspadaPrincipal = estiloEspadaPrincipal;
    }

    public RankPoder getRankEspadachin() {
        return rankEspadachin;
    }

    public void setRankEspadachin(RankPoder rankEspadachin) {
        this.rankEspadachin = rankEspadachin;
    }
}
