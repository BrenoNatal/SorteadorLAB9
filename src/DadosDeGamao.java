import java.util.Random;

public class DadosDeGamao implements Sorteador{

    @Override
    public int sortear() {
        Random NSorteado = new Random();
        int VDado1 = NSorteado.nextInt(7);
        int VDado2 = NSorteado.nextInt(7);
        if (VDado1 == VDado2) {
            return 4 * VDado1;
        }else {
            return VDado1 + VDado2;
        }
    }


}
