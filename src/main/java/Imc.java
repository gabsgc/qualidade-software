public class Imc {
    private float peso;
    private float altura;
    private String sexo;

    public Imc(float peso, float altura, String sexo) {
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    public String calcularImc() {
        float imc;
        imc = this.peso / (this.altura * this.altura);
        if (this.sexo.equals("F")) {
            if (imc < 19.1f) {
                return "Abaixo do peso";
            }
            if (imc < 25.8f) {
                return "Peso normal";
            }
            if (imc < 27.3f) {
                return "Marginalmente acima do peso";
            }
            if (imc < 32.3f) {
                return "Acima do peso ideal";
            }
            else {
                return "Obeso";
            }
        } else if (this.sexo.equals("M")) {
            if (imc < 20.7f) {
                return "Abaixo do peso";
            }
            if (imc < 26.4f) {
                return "Peso normal";
            }
            if (imc < 27.8f) {
                return "Marginalmente acima do peso";
            }
            if (imc < 31.1f) {
                return "Acima do peso ideal";
            }
            else {
                return "Obeso";
            }
        } else {
            return "Não foi possível calcular.";
        }
    }
}
