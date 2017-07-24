/* ## ATIVIDADE 1 ##
 * Escreva uma classe chamada DistanciaEspacial que deverá ter um método para 
 * calcular a distancia entre dois pontos no espaço (e dimensões). e uma classe 
 * TestaDistancia que testa o método a classe.
*/

package espaco;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;
import java.math.*;

/**
 *
 * @author filipe
 */
public class DistanciaEspacial 
{

    /*
     * Podemos observar que os pontos possuem coordenadas, sendo o ponto A (xa,ya) 
     * e B (xb,yb), note a formação do triângulo retângulo ABC, onde os lados BC: cateto, 
     * AC: cateto e AB: hipotenusa.
    */
    private Double XA;
    private Double YA;

    private Double XB;
    private Double YB;
    
    private Double catetoBC;
    private Double catetoAC;

    private Double hipotenusaAB;
        
    private Scanner scan = new Scanner(System.in);


    /**
     * @return the XA
     */
    public Double getXA()
    {
        return XA;
    }

    /**
     * @param XA the XA to set
     */
    public void setXA(Double XA)
    {
        this.XA = XA;
    }

    /**
     * @return the YA
     */
    public Double getYA()
    {
        return YA;
    }

    /**
     * @param YA the YA to set
     */
    public void setYA(Double YA)
    {
        this.YA = YA;
    }

    /**
     * @return the catetoBC
     */
    public Double getCatetoBC()
    {
        return catetoBC;
    }

    /**
     * @param catetoBC the catetoBC to set
     */
    public void setCatetoBC(Double catetoBC)
    {
        this.catetoBC = catetoBC;
    }

    /**
     * @return the XB
     */
    public Double getXB()
    {
        return XB;
    }

    /**
     * @param XB the XB to set
     */
    public void setXB(Double XB)
    {
        this.XB = XB;
    }

    /**
     * @return the YB
     */
    public Double getYB()
    {
        return YB;
    }

    /**
     * @param YB the YB to set
     */
    public void setYB(Double YB)
    {
        this.YB = YB;
    }

    /**
     * @return the catetoAC
     */
    public Double getCatetoAC()
    {
        return catetoAC;
    }

    /**
     * @param catetoAC the catetoAC to set
     */
    public void setCatetoAC(Double catetoAC)
    {
        this.catetoAC = catetoAC;
    }
    
    /**
     * @return the hipotenusaAB
     */
    public Double getHipotenusaAB() {
        return hipotenusaAB;
    }

    /**
     * @param hipotenusaAB the hipotenusaAB to set
     */
    public void setHipotenusaAB(Double hipotenusaAB) {
        this.hipotenusaAB = hipotenusaAB;
    }
    
    void calculaDistancia()
    {
        //Cateto BC:
        this.catetoBC = this.YB - this.YA;

        //Cateto AC:
        this.catetoAC = this.XB - this.XA;

        /* Pelo Teorema de Pitágoras temos: “o quadrado da hipotenusa é igual à soma dos 
         * quadrados dos catetos”
        */



        this.hipotenusaAB = Math.sqrt(Math.pow(getXB() - getXA(), 2) + Math.pow(getYB() - getYA(), 2));

        System.out.println("Cateto BC: " + getCatetoBC());
        System.out.println("Cateto AC: " + getCatetoAC());
        System.out.println("Distância dos pontos (hipotenusa de AB): " + getHipotenusaAB());
        System.out.println();

    }
}
