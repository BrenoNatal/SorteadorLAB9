public class Principal {
    public static void main(String[] args) {
        DadosTriplos DadoT = new DadosTriplos();
        DadosDeGamao DadoG = new DadosDeGamao();

        JogoMalucoComSorteadores Jogo  = new JogoMalucoComSorteadores("Jogo1","Pedro", "Ana", 10, DadoT, DadoG);

        System.out.printf(Jogo.jogar());
    }
}
