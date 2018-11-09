package br.metodista.ads5.test;

import br.metodista.ads5.ChassiUtil;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
/**
 *ANÁLISE E DESENVOLVIMENTO DE SISTEMAS - Polo Mauá
 * Modulo: Desenvolvimento Avançado V
 * Integração Continua (Git, Maven e Jenkins)
 * Prof: Rafael Guimarães Sakurai
 * @author Jandre Modesto da Silva Filho - matrícula 251532
 * 05/11/2018 - segunda-feira
 */
public class ChassiUtilTest {
    
    private ChassiUtil util = null;
    
    @Before
    public void inicializar(){
        util = new ChassiUtil();
    }
    
    @Test
    public void testarAnoAChassi() {
        assertEquals(util.obterAno("9BP17164GA0000001",10), 2010);
    }
     @Test
    public void testarAnoAMinusculoChassi() {
        assertEquals(util.obterAno("9bp17164ga0000001",10), 2010);
    }
     @Test
    public void testarAnoBChassi() {
        assertEquals(util.obterAno("9BP17164GB0000001",10), 2011);
    }
    @Test
    public void testarAnoCChassi() {
        assertEquals(util.obterAno("9BP17164GC0000001",10), 2012);
    }
    @Test
    public void testarAnoDChassi() {
        assertEquals(util.obterAno("9BP17164GD0000001",10), 2013);
    }
    @Test(expected=IllegalArgumentException.class)
    public void testarChassiInvalido(){
        assertEquals(util.obterAno("abc", 10), 0);
    }
    @Test(expected=IllegalArgumentException.class)
    public void testarPosicaoChassiInvalido(){
        assertEquals(util.obterAno("9BP17164GE0000001", -5), 2014);
    }
}
