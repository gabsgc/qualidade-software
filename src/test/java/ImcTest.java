import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImcTest {

    @Test
    public void deveTestarMulherAbaixoDoPeso() {
        Imc imc = new Imc(19.0f, 1.0f, "F");
        assertEquals("Abaixo do peso", imc.calcularImc());
    }

    @Test
    public void deveTestarMulherPesoNormal() {
        Imc imc = new Imc(25.7f, 1.0f, "F");
        assertEquals("Peso normal", imc.calcularImc());
    }

    @Test
    public void deveTestarMulherMarginalmenteAcimaPeso() {
        Imc imc = new Imc(27.2f, 1.0f, "F");
        assertEquals("Marginalmente acima do peso", imc.calcularImc());
    }

    @Test
    public void deveTestarMulherAcimaPesoIdeal() {
        Imc imc = new Imc(32.2f, 1.0f, "F");
        assertEquals("Acima do peso ideal", imc.calcularImc());
    }

    @Test
    public void deveTestarMulherObeso() {
        Imc imc = new Imc(32.3f, 1.0f, "F");
        assertEquals("Obeso", imc.calcularImc());
    }

    @Test
    public void deveTestarHomemAbaixoDoPeso() {
        Imc imc = new Imc(20.6f, 1.0f, "M");
        assertEquals("Abaixo do peso", imc.calcularImc());
    }

    @Test
    public void deveTestarHomemPesoNormal() {
        Imc imc = new Imc(26.3f, 1.0f, "M");
        assertEquals("Peso normal", imc.calcularImc());
    }

    @Test
    public void deveTestarHomemMarginalmenteAcimaPeso() {
        Imc imc = new Imc(27.7f, 1.0f, "M");
        assertEquals("Marginalmente acima do peso", imc.calcularImc());
    }

    @Test
    public void deveTestarHomemAcimaPesoIdeal() {
        Imc imc = new Imc(31.0f, 1.0f, "M");
        assertEquals("Acima do peso ideal", imc.calcularImc());
    }

    @Test
    public void deveTestarHomemObeso() {
        Imc imc = new Imc(31.1f, 1.0f, "M");
        assertEquals("Obeso", imc.calcularImc());
    }

    @Test
    public void deveRetornarMensagemQuandoNaoForPossivelCalcular() {
        Imc imc = new Imc(19.0f, 1.0f, "A");
        assertEquals("Não foi possível calcular.", imc.calcularImc());
    }
}