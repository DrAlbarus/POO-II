package restaurante;

public class TestaRestaurante 
{
    public static void main(String[] args) 
    {
        Mesa mesa1 = new Mesa();
        mesa1.setCod(1);
        mesa1.setCapacidade(2);
        
        Garcom garcom1 = new Garcom();
        
        garcom1.setNome("Alguém");
        
        ItemCardapio file = new ItemCardapio();
        
        file.setCodigo(1);
        file.setNome("Filé com fritas");
        file.setValor(14.90);
        
        Atendimento atd = new Atendimento();
        atd.setCod(1);
        atd.setGarcom(garcom1);
        atd.setMesa(mesa1);
        atd.setConsumo(
                new ItemCardapio[]
                {
                    file
                }
        );
        
        atd.fecharConta();
    }
}