import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VeiculoTest {

    @Test
    public void deveRetornarClasse1(){
        Veiculo veiculo = new Veiculo(1970, 1199);
        assertEquals(1, veiculo.obterClasse());
    }

    @Test
    public void deveRetornarClasse2(){
        Veiculo veiculo = new Veiculo(1970, 1699);
        assertEquals(2, veiculo.obterClasse());
    }

    @Test
    public void deveRetornarClasse3() {
        Veiculo veiculo = new Veiculo(1970, 1701);
        assertEquals(3, veiculo.obterClasse());
    }

    @Test
    public void deveRetornarClasse4() {
        Veiculo veiculo = new Veiculo(1978, 1199);
        assertEquals(4, veiculo.obterClasse());
    }

    @Test
    public void deveRetornarClasse5() {
        Veiculo veiculo = new Veiculo(1979, 1699);
        assertEquals(5, veiculo.obterClasse());
    }

    @Test
    public void deveRetornarClasse6() {
        Veiculo veiculo = new Veiculo(1979, 1701);
        assertEquals(6, veiculo.obterClasse());
    }

    @Test
    public void deveRetornarClasse7() {
        Veiculo veiculo = new Veiculo(1980, 1599);
        assertEquals(7, veiculo.obterClasse());
    }

    @Test
    public void deveRetornarClasse8() {
        Veiculo veiculo = new Veiculo(1980, 1601);
        assertEquals(8, veiculo.obterClasse());
    }

    @Test
    public void deveRetornarTaxaDezesseisECinquenta() {
        Veiculo veiculo = new Veiculo(1970, 1199);
        assertEquals(16.5f, veiculo.obterTaxaRegistro());
    }

    @Test
    public void deveRetornarTaxaVinteCincoECinquenta() {
        Veiculo veiculo = new Veiculo(1970, 1699);
        assertEquals(25.5f, veiculo.obterTaxaRegistro());
    }

    @Test
    public void deveRetornarTaxaQuarentaSeisECinquenta() {
        Veiculo veiculo = new Veiculo(1970, 1701);
        assertEquals(46.5f, veiculo.obterTaxaRegistro());
    }

    @Test
    public void deveRetornarTaxaVinteSete() {
        Veiculo veiculo = new Veiculo(1979, 1199);
        assertEquals(27f, veiculo.obterTaxaRegistro());
    }

    @Test
    public void deveRetornarTaxaTrintaECinquenta() {
        Veiculo veiculo = new Veiculo(1979, 1699);
        assertEquals(30.5f, veiculo.obterTaxaRegistro());
    }

    @Test
    public void deveRetornarTaxaCinquentaEDoisECinquenta() {
        Veiculo veiculo = new Veiculo(1979, 1701);
        assertEquals(52.5f, veiculo.obterTaxaRegistro());
    }

    @Test
    public void deveRetornarTaxaDezenoveECinquenta() {
        Veiculo veiculo = new Veiculo(1980, 1599);
        assertEquals(19.5f, veiculo.obterTaxaRegistro());
    }

    @Test
    public void deveRetornarTaxaCinquentaECincoECinquenta() {
        Veiculo veiculo = new Veiculo(1980, 1601);
        assertEquals(55.5f, veiculo.obterTaxaRegistro());
    }
}