package DAO;

public class contaCorrente {

    int numAge;
    int numCc;
    int idCli;
    double Saldo;

    /*public contaCorrente(int numAge, int numCc, int idCli) {
        this.numAge = numAge;
        this.numCc = numCc;
        this.idCli = idCli;
    }*/
    public contaCorrente() {

    }

    public int getNumAge() {
        return numAge;
    }

    public int getNumCc() {
        return numCc;
    }

    public int getIdCli() {
        return idCli;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setNumAge(int numAge) {
        this.numAge = numAge;
    }

    public void setNumCc(int numCc) {
        this.numCc = numCc;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String dadosSQLValues() {
        String dadosContaCorrente;
        dadosContaCorrente = "'"
                + this.getNumAge() + "','"
                + this.getNumCc() + "','"
                + this.getIdCli() + "','"
                + this.getSaldo() + "'";

        return dadosContaCorrente;
    }

    public String alteraDadosSQLValues() {
        String dadosContaCorrente;
        dadosContaCorrente = "'NUM_AGE='"
                + this.getNumAge() + "',NUM_CC='"
                + this.getNumCc() + "',ID_CLI='"
                + this.getIdCli() + "',SALDO='"
                + this.getSaldo() + "'";

        return dadosContaCorrente;
    }

    public String excluiSQLValues() {
        return "NUM_AGE='" + this.getNumAge() + "'";
    }
}
