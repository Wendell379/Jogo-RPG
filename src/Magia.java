public class Magia extends Habilidade {

    private ElementosMagicos elemento;
    private int Dano;
    private int CustoMana;

    public Magia(String nomeAb, RankPoder rank, ElementosMagicos elemento, int dano, int custoMana) {
        super(nomeAb, rank);
        this.elemento = elemento;
        Dano = dano;
        CustoMana = custoMana;
    }


    @Override
    public void fazer(Personagen usuario, Personagen alvo) {
        if (usuario.getManaAtual() >= this.CustoMana) {
            usuario.setManaAtual(usuario.getManaAtual() - this.CustoMana);
            alvo.setVidaAtual(alvo.getVidaAtual() - this.Dano);
            IO.println(usuario.getNome() + "Conjurou " + getNomeAb() + "de " + elemento + "causando " + Dano + "de dano");
        } else {
                IO.println(usuario.getNome() + "Tentou usar " + getNomeAb() + "mas não tem mana suficiente!");
            }
            }
            public int getCustoMana() {
        return CustoMana;
            }

        }