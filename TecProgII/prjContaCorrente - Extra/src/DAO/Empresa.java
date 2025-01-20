package DAO;

public class Empresa {

    private int idEmpresa;
    private String nomeEmpresa;
    private String telefoneEmpresa;
    private String emailEmpresa;
    private String siteEmpresa;
    private String tipoEmpresa;
    private String CNPJ;
    private String userImg;
    private String servico;
    private String cidade;
    private String UF;
    private String CEP;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;

    // Construtor vazio
    public Empresa() {
    }

    // Getters e Setters
    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getTelefoneEmpresa() {
        return telefoneEmpresa;
    }

    public void setTelefoneEmpresa(String telefoneEmpresa) {
        this.telefoneEmpresa = telefoneEmpresa;
    }

    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    public String getSiteEmpresa() {
        return siteEmpresa;
    }

    public void setSiteEmpresa(String siteEmpresa) {
        this.siteEmpresa = siteEmpresa;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String dadosSQLValues() {
        String dadosEmpresa;
        
        dadosEmpresa = "'"
                + this.getIdEmpresa() + "','"
                + this.getNomeEmpresa() + "','"
                + this.getTelefoneEmpresa() + "','"
                + this.getEmailEmpresa() + "','"
                + this.getSiteEmpresa() + "','"
                + this.getTipoEmpresa() + "','"
                + this.getCNPJ() + "','"
                + this.getUserImg() + "','"
                + this.getServico() +"','"
                + this.getCidade() + "','"
                + this.getUF() + "','"
                + this.getCEP() + "','"
                + this.getLogradouro() + "','"
                + this.getNumero() + "','"
                + this.getComplemento() + "','"
                +this.getBairro() + "'";
        
        return dadosEmpresa;
    }

        public String alteraDadosSQLValues() {
        String dadosEmpresa;
        
        dadosEmpresa = "idEmpresa='"
                + this.getIdEmpresa() + "',nomeEmpresa='"
                + this.getNomeEmpresa() + "',telefoneEmpresa='"
                + this.getTelefoneEmpresa() + "',emailEmpresa='"
                + this.getEmailEmpresa() + "',siteEmpresa='"
                + this.getSiteEmpresa() + "',tipoEmpresa='"
                + this.getTipoEmpresa() + "',CNPJ='"
                + this.getCNPJ() + "',userImg='"
                + this.getUserImg() + "',servico='"
                + this.getServico() +"',cidade='"
                + this.getCidade() + "',UF='"
                + this.getUF() + "',CEP='"
                + this.getCEP() + "',logradouro='"
                + this.getLogradouro() + "',numero='"
                + this.getNumero() + "',complemento='"
                + this.getComplemento() + "',bairro='"
                +this.getBairro() + "'";
        
        return dadosEmpresa;
    }


    public String excluiSQLValues() {
        return "idEmpresa='" + this.getIdEmpresa() + "'";
    }
}
