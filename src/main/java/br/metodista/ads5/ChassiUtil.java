package br.metodista.ads5;
/**
 *ANÁLISE E DESENVOLVIMENTO DE SISTEMAS - Polo Mauá
 * Modulo: Desenvolvimento Avançado V
 * Integração Continua (Git, Maven e Jenkins)
 * Prof: Rafael Guimarães Sakurai
 * @author Jandre Modesto da Silva Filho - matrícula 251532
 * 05/11/2018 - segunda-feira
 */
public class ChassiUtil {
    public int obterAno(String chassi, int posicao){
        if(chassi == null || chassi.trim().length()!= 17){
            throw new IllegalArgumentException("Chassi é inválido");
        }
        if(posicao < 0 || posicao > 17 ){
           throw new IllegalArgumentException("Posição do ano do chassi é incorreta"); 
        }
        
       return (chassi.toUpperCase().charAt(posicao -1)-'A')
               + 2010;
    }
}
