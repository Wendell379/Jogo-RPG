public abstract class Habilidade {

    private String nomeAb;
    private RankPoder rank;

    public Habilidade(String nomeAb, RankPoder rank){
        this.nomeAb = nomeAb;
        this.rank = rank;
    }
    public abstract void fazer(Personagen usuario, Personagen alvo);

    public String getNomeAb() {
        return nomeAb;
    }

    public RankPoder getRank() {
        return rank;
    }
}
