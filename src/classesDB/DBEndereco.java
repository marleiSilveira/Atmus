/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesDB;

/**
 *
 * @author Marlei M.S.B.
 */
public class DBEndereco {
    private int cod;
    private String cep;
    private String logradouro;
    private String numero_resid;
    private String bairro;
    private int cod_cidade;
    private String complemento;

    public DBEndereco(int cod, String cep, String logradouro, String numero_resid, String bairro, int cod_cidade, String complemento) {
        this.cod = cod;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero_resid = numero_resid;
        this.bairro = bairro;
        this.cod_cidade = cod_cidade;
        this.complemento = complemento;
    }    
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero_resid() {
        return numero_resid;
    }

    public void setNumero_resid(String numero_resid) {
        this.numero_resid = numero_resid;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCod_cidade() {
        return cod_cidade;
    }

    public void setCod_cidade(int cod_cidade) {
        this.cod_cidade = cod_cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    
    
}
