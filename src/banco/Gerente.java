package banco;

/**
 *
 * @author filipe
 */
public class Gerente 
{
    private int cod;
    private String nome;
    private Double salario;
    private Double variavel;

    /**
     * @return the cod
     */
    public int getCod() 
    {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) 
    {
        this.cod = cod;
    }

    /**
     * @return the nome
     */
    public String getNome() 
    {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    /**
     * @return the salario
     */
    public Double getSalario() 
    {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(Double salario) 
    {
        this.salario = salario;
    }
    
    /*
     * @return the variavel
    */    
    public Double getVariavel()
    {
    	return variavel;
   	}
   	
   	/*
   	 * @param variavel the variavel set
   	*/
   	public void setVariavel(Double variavel)
   	{
   		this.variavel = variavel;
	}
   	
    void aumentaSalario()
    {
    	double salarioAumentadoFixa;
    	double salarioAumentadoVariavel;
    	
        System.out.printf("\nDados do gerente %s \n", this.getNome());
        
    	salarioAumentadoFixa = this.salario + (this.salario*10/100);
    	System.out.println("O salário aumentado com taxa de 10% é: " + salarioAumentadoFixa);
		
        salarioAumentadoVariavel = this.salario + (this.salario*this.variavel/100);
        System.out.printf("O salário aumentado com taxa variável é: %.2f\n", salarioAumentadoVariavel);
 		
 		   	
    }
}
