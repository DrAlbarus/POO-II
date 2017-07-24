package banco;

/**
 *
 * @author filipe
 */
public class TestaAumento 
{
	public static void main(String[] args) 
        {
            Gerente gerente1 = new Gerente();
            gerente1.setCod(1);
            gerente1.setNome("Filipe");
            gerente1.setSalario(5960.56);
            gerente1.setVariavel(5.6);

            gerente1.aumentaSalario();
                
            Gerente gerente2 = new Gerente();
            gerente2.setCod(2);
            gerente2.setNome("Andressa");
            gerente2.setSalario(5945.00);
            gerente2.setVariavel(6.1);
            
            gerente2.aumentaSalario();   
            
            Gerente gerente3 = new Gerente();
            gerente3.setCod(3);
            gerente3.setNome("Thais");
            gerente3.setSalario(4000.0);
            gerente3.setVariavel(20.0);
            
            gerente3.aumentaSalario();

            Gerente gerente4 = new Gerente();
            gerente4.setCod(4);
            gerente4.setNome("Lucas");
            gerente4.setSalario(6100.00);
            gerente4.setVariavel(3.2);

            gerente4.aumentaSalario();
	}
}
