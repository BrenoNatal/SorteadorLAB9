import java.util.Random;

public class DadosTriplos implements Sorteador {

    @Override
    public int sortear() {
        Random NSorteado = new Random();
        int VDado1 = NSorteado.nextInt(7);
        int VDado2 = NSorteado.nextInt(7);
        int VDado3 = NSorteado.nextInt(7);

        return VDado1 + VDado2 + VDado3;
    }

}
