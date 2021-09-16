import java.util.ArrayList;

public abstract class JogoDeDoisJogadores {

    String nomeJogo;
    String nomeJogador1;
    String nomeJogador2;
    int numeroDeRodadas;
    ArrayList<Integer> historicoResultados;

    public JogoDeDoisJogadores(String nomeDoJogo, String nomeDoJogador1, String nomeDoJogador2, int numeroRodadas) {
        nomeJogo = nomeDoJogo;
        nomeJogador1 = nomeDoJogador1;
        nomeJogador2 = nomeDoJogador2;
        numeroDeRodadas = numeroRodadas;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public String getNomeJogador1() {
        return nomeJogador1;
    }

    public String getNomeJogador2() {
        return nomeJogador2;
    }

    public int getNumeroDeRodadas() {
        return numeroDeRodadas;
    }

    protected abstract int executarRodadaDoJogo();

    String jogar() {
        int TotalVitoriasJ1 = 0;
        int TotalVitoriasJ2 = 0;

        for (int i = 0; i < numeroDeRodadas; i++) {
            if (executarRodadaDoJogo() == 1) {
                TotalVitoriasJ1 ++;
            }
            if (executarRodadaDoJogo() == 2) {
                TotalVitoriasJ2 ++;
            }
        }
        if (TotalVitoriasJ1 > TotalVitoriasJ2) {
            return "O jogador " + getNomeJogador1() + " venceu o jogo por " + TotalVitoriasJ1 + " a " + TotalVitoriasJ2 + ".";
        }
        if (TotalVitoriasJ1 < TotalVitoriasJ2) {
            return "O jogador " + getNomeJogador2() + " venceu o jogo por " + TotalVitoriasJ2 + " a " + TotalVitoriasJ1 + ".";
        } else {
            return "O jogo terminou em empate após " + getNumeroDeRodadas() + " rodadas.";
        }

    }
}

