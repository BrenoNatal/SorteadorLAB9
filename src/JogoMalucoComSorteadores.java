public class JogoMalucoComSorteadores extends JogoDeDoisJogadores {

    Sorteador sorteador1;
    Sorteador sorteador2;

    public JogoMalucoComSorteadores(String nomeDoJogo, String nomeDoJogador1, String nomeDoJogador2, int numeroRodadas, Sorteador sorteadorDo1, Sorteador sorteadorDo2) {
        super(nomeDoJogo, nomeDoJogador1, nomeDoJogador2, numeroRodadas);
        sorteador1 = sorteadorDo1;
        sorteador2 = sorteadorDo2;
    }

    @Override
    protected int executarRodadaDoJogo() {
        int Jogador1 = sorteador1.sortear();
        int Jogador2 = sorteador2.sortear();

        if (Jogador1 > Jogador2 ) {
            return 1;
        }
        if (Jogador1 < Jogador2 ) {
            return 2;
        } else {
            return 0;
        }
    }
}
