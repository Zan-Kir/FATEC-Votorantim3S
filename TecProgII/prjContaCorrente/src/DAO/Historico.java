package DAO;

public class Historico {

    int idHis;
    String desHis;

    /*public historicos(int idHis, String desHis) {
        this.idHis = idHis;
        this.desHis = desHis;
    }*/
    public Historico() {

    }

    public int getIdHis() {
        return idHis;
    }

    public String getDesHis() {
        return desHis;
    }

    public void setIdHis(int idHis) {
        this.idHis = idHis;
    }

    public void setDesHis(String desHis) {
        this.desHis = desHis;
    }

    public String dadosSQLValues() {
        String dadosHistorico;
        dadosHistorico = "'"
                + this.getIdHis() + "','"
                + this.getDesHis() + "'";

        return dadosHistorico;
    }

    public String alteraDadosSQLValues() {
        String dadosHistorico;
        dadosHistorico = "ID_HIS='"
                + this.getIdHis() + "',DES_HIS='"
                + this.getDesHis() + "'";

        return dadosHistorico;
    }

    public String excluiSQLValues() {
        return "ID_HIS='" + this.getIdHis() + "'";
    }

}
