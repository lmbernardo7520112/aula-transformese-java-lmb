package model;

import java.io.Serializable;

public class Reclamacoes implements Serializable {

	private static final long serialVersionUID = 1L;
    private String endereco;
    private String descricaoDoProblema;;
    private TipoProblema tipoDoProblema;;
    
    public Reclamacoes(String endereco, String descricaoDoProblema, TipoProblema tipoDoProblema) {
        this.endereco = endereco;
        this.descricaoDoProblema = descricaoDoProblema;
        this.tipoDoProblema = tipoDoProblema;
    }
    
 // getters and setters
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDescricaoDoProblema() {
        return descricaoDoProblema;
    }

    public void setDescricaoDoProblema(String descricaoDoProblema) {
        this.descricaoDoProblema = descricaoDoProblema;
    }

    public TipoProblema getTipoDoProblema() {
        return tipoDoProblema;
    }

    public void setTipoDoProblema(TipoProblema tipoDoProblema) {
        this.tipoDoProblema = tipoDoProblema;
    }


}


