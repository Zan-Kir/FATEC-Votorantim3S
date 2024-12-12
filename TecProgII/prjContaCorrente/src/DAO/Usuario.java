package DAO;

public class Usuario {

    String id;
    String senha;
    int numAge;
    int numCc;

    /*public usuarios(String id, String senha, int numAge, int numCc) {
        this.id = id;
        this.senha = senha;
        this.numAge = numAge;
        this.numCc = numCc;
    }*/
    public Usuario() {

    }

    public String getId() {
        return id;
    }

    public String getSenha() {
        return senha;
    }

    public int getNumAge() {
        return numAge;
    }

    public int getNumCc() {
        return numCc;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNumAge(int numAge) {
        this.numAge = numAge;
    }

    public void setNumCc(int numCc) {
        this.numCc = numCc;
    }

    public String dadosSQLValues() {
        String dadosClientes;
        dadosClientes = "'"
                + this.getId() + "','"
                + this.getSenha() + "','"
                + this.getNumAge() + "','"
                + this.getNumCc() + "'";

        return dadosClientes;
    }

    public String alteraDadosSQLValues() {
        String dadosClientes;
        dadosClientes = "ID='"
                + this.getId() + "',SENHA='"
                + this.getSenha() + "',NUM_AGE='"
                + this.getNumAge() + "',NUM_CC='"
                + this.getNumCc() + "'";
        return dadosClientes;
    }

    public String excluiSQLValues() {
        return "ID='" + this.getId() + "'";
    }
}
