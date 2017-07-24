package restaurante;

public class Atendimento 
{
    private int cod;
    private Mesa mesa;
    private Garcom garcom;
    private ItemCardapio[] consumo;

    public int getCod() 
    {
        return cod;
    }

    public void setCod(int cod) 
    {
        this.cod = cod;
    }

    public Mesa getMesa() 
    {
        return mesa;
    }

    public void setMesa(Mesa mesa) 
    {
        this.mesa = mesa;
    }

    public Garcom getGarcom() 
    {
        return garcom;
    }

    public void setGarcom(Garcom garcom) 
    {
        this.garcom = garcom;
    }

    public ItemCardapio[] getConsumo() 
    {
        return consumo;
    }

    public void setConsumo(ItemCardapio[] consumo) 
    {
        this.consumo = consumo;
    }

    void fecharConta() 
    {
        double total = 0.0;
        double gorjeta = 0.0;
        
        for(ItemCardapio item : this.consumo)
        {
            total += item.getValor();
            gorjeta = (total * 1.1) - total;
            System.out.println("Total: " + total);
            System.out.println("Por pessoa: " + total/this.mesa.getCapacidade());
            System.out.printf("Gorjeta: %.2f\n", gorjeta);
        }
    }
}
