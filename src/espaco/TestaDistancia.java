package espaco;

/**
 *
 * @author filipe
 */
public class TestaDistancia 
{
    public static void main(String[] args) {
        DistanciaEspacial ponto1 = new DistanciaEspacial();

        ponto1.setXB(-2.0);
        ponto1.setXA(8.0);
        ponto1.setYB(4.0);
        ponto1.setYA(0.0);
        ponto1.calculaDistancia();

        DistanciaEspacial ponto2 = new DistanciaEspacial();
        ponto2.setXB(4.0);
        ponto2.setXA(-2.0);
        ponto2.setYB(5.0);
        ponto2.setYA(-1.0);
        ponto2.calculaDistancia();
    }
}
