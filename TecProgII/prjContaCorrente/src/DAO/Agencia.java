
package DAO;

public class Agencia {
    int numAge;
    String nomeAge;
    String endeAge;
    String numeAge;
    String complAge;
    String BairAge;
    String CidaAge;
    String ufAge;
    String cepAge;
    String foneAge;

   /* public agencias(int numAge, String nomeAge, String endeAge, String CidaAge, String ufAge, String cepAge) {
        this.numAge = numAge;
        this.nomeAge = nomeAge;
        this.endeAge = endeAge;
        this.CidaAge = CidaAge;
        this.ufAge = ufAge;
        this.cepAge = cepAge;
    }*/
    
    public Agencia(){
        
    }
    

    public void setNumAge(int numAge) {
        this.numAge = numAge;
    }

    public void setNomeAge(String nomeAge) {
        this.nomeAge = nomeAge;
    }

    public void setEndeAge(String endeAge) {
        this.endeAge = endeAge;
    }

    public void setNumeAge(String numeAge) {
        this.numeAge = numeAge;
    }

    public void setComplAge(String complAge) {
        this.complAge = complAge;
    }

    public void setBairAge(String BairAre) {
        this.BairAge = BairAre;
    }

    public void setCidaAge(String CidaAge) {
        this.CidaAge = CidaAge;
    }

    public void setUfAge(String ufAge) {
        this.ufAge = ufAge;
    }

    public void setCepAge(String cepAge) {
        this.cepAge = cepAge;
    }

    public void setFoneAge(String foneAge) {
        this.foneAge = foneAge;
    }

    public int getNumAge() {
        return numAge;
    }

    public String getNomeAge() {
        return nomeAge;
    }

    public String getEndeAge() {
        return endeAge;
    }

    public String getNumeAge() {
        return numeAge;
    }

    public String getComplAge() {
        return complAge;
    }

    public String getBairAge() {
        return BairAge;
    }

    public String getCidaAge() {
        return CidaAge;
    }

    public String getUfAge() {
        return ufAge;
    }

    public String getCepAge() {
        return cepAge;
    }

    public String getFoneAge() {
        return foneAge;
    }
    
    public String dadosSQLValues(){
        String dadosAgencia;
        dadosAgencia = "'"
        + this.getNumAge()+ "','"
	+ this.getNomeAge()+ "','"
	+ this.getEndeAge()+ "','"
	+ this.getNumeAge()+ "','"
	+ this.getComplAge()+ "','"
	+ this.getBairAge()+ "','"
	+ this.getCidaAge()+ "','"
	+ this.getUfAge()+ "','"
	+ this.getCepAge()+ "','"
	+ this.getFoneAge()+ "'";
        
        return dadosAgencia;
    }
    
        public String alteraDadosSQLValues(){
        String dadosAgencia;
        dadosAgencia = "NUM_AGE='"
        + this.getNumAge()+ "',NOME_AGE='"
	+ this.getNomeAge()+ "',ENDE_AGE='"
	+ this.getEndeAge()+ "',NUME_AGE='"
	+ this.getNumeAge()+ "',COMPL_AGE='"
	+ this.getComplAge()+ "',BAIR_AGE='"
	+ this.getBairAge()+ "',CIDA_AGE='"
	+ this.getCidaAge()+ "',UF_AGE='"
	+ this.getUfAge()+ "',CEP_AGE='"
	+ this.getCepAge()+ "',FONE_AGE='"
	+ this.getFoneAge()+ "'";
        return dadosAgencia;
    }
    
        
    public String excluiSQLValues() {
        return "NUM_AGE='" + this.getNumAge() + "'";
    }
    
}
