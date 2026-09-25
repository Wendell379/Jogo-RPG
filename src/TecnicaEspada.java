public class TecnicaEspada extends Habilidade {

    private EstiloEspada estilo;
    private int custoStamina;
    private int dano;

    public TecnicaEspada(String nomeAb, RankPoder rank, EstiloEspada estilo, int custoStamina, int dano) {
        super(nomeAb, rank);
        this.estilo = estilo;
        this.custoStamina = custoStamina;
        this.dano = dano;
    }
    @Override
    public void fazer(Personagen usuario, Personagen alvo) {
        if (usuario.getStaminaAtual() >= this.custoStamina) {
            usuario.setStaminaAtual(usuario.getStaminaAtual() - this.custoStamina);
            alvo.setVidaAtual(alvo.getVidaAtual() - this.dano);
            IO.println(usuario.getNome() + "usou técnica " + getNomeAb() + " (" + estilo + "causando " + dano + "de dano");
        } else {
            IO.println(usuario.getNome() + "tentou usar " + getNomeAb() + "mas está exausto");

        }
    }
    public int getCustoStamina() {

        return custoStamina;
    }
}

