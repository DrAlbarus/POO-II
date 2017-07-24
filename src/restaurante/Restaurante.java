/* ## ATIVIDADE 3 ##
 * Melhore o sistema do restaurante para incluir o salário do garçom e escreva um 
 * método calcularSalario que deverá incluir, além de um salário mínimo base, os 
 * 10% dos atendimentos realizados por ele no mês: será necessário incluir uma data 
 * no Atendimento, sugiro usar o LocalDate do Java8. Atualize a classe TestaRestaurante 
 * para testar as novas funcionalidades implementadas.
 */
package restaurante;

public class Restaurante 
{
    Garcom[] garcom = new Garcom[3];
    ItemCardapio[] cardapio = new ItemCardapio[5];
    
    Mesa[] mesas = new Mesa[12];
    Atendimento[] atendimento = new Atendimento[2];
}
