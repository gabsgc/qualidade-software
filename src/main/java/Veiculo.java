public class Veiculo {
    private int anoModelo;
    private int peso;

    public Veiculo(int anoModelo, int peso) {
        this.anoModelo = anoModelo;
        this.peso = peso;
    }

    public Float obterTaxaRegistro() {
        if (this.anoModelo <= 1970) {
            if (this.peso < 1200) {
                return 16.5f;
            } else if (this.peso < 1700) {
                return 25.5f;
            } else {
                return 46.5f;
            }
        } else if (this.anoModelo <= 1979) {
            if (this.peso < 1200) {
                return 27.0f;
            } else if (this.peso < 1700) {
                return 30.5f;
            } else {
                return 52.5f;
            }
        } else {
            if (this.peso < 1600) {
                return 19.5f;
            } else {
                return 55.5f;
            }
        }
    }

    public int obterClasse() {
        if (anoModelo <= 1970) {
            if (this.peso < 1200) {
                return 1;
            } else if (this.peso < 1700) {
                return 2;
            } else {
                return 3;
            }
        } else if (this.anoModelo <= 1979) {
            if (this.peso < 1200) {
                return 4;
            } else if (this.peso < 1700) {
                return 5;
            } else {
                return 6;
            }
        } else {
            if (this.peso < 1600) {
                return 7;
            } else {
                return 8;
            }
        }
    }
}