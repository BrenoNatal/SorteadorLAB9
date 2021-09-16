import java.util.Random;

public class Dado implements Sorteador {

    @Override
    public int sortear() {
        Random NSorteado = new Random();
        return NSorteado.nextInt(7);
    }
}
