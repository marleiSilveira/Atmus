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
public class DBPessoa {
    private int cod; 
    private String nome;
    private String natureza_juridica;
    private String cnpj; 
    private String cpf;
    private String rg;
    private int cod_endereco;

    
    /**
     * 
     * @param cod
     * @param nome
     * @param natureza_juridica
     * @param cnpj
     * @param cpf
     * @param rg
     * @param cod_endereco 
     */
    public DBPessoa(int cod, String nome, String natureza_juridica, String cnpj, String cpf, String rg, int cod_endereco) {
        setCod(cod);
        setNome(nome);
        setNatureza_juridica(natureza_juridica);
        setCnpj(cnpj);
        setCpf(cpf);
        setRg(rg);
        setCod_endereco(cod_endereco);
    }

    /**
     * 
     * @return int 
     */    
    public int getCod() {
        return cod;
    }

    /**
     * 
     * @param cod 
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * 
     * @return String 
     */
    public String getNome() {
        return nome;
    }

    /**
     * 
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * 
     * @return String 
     */
    public String getNatureza_juridica() {
        return natureza_juridica;
    }

    /**
     * 
     * @param natureza_juridica 
     */
    public void setNatureza_juridica(String natureza_juridica) {
        this.natureza_juridica = natureza_juridica;
    }

    /**
     * 
     * @return String
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * 
     * @param cnpj 
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * 
     * @return String 
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * 
     * @param cpf 
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * 
     * @return String
     */
    public String getRg() {
        return rg;
    }

    /**
     * 
     * @param rg 
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * 
     * @return int
     */
    public int getCod_endereco() {
        return cod_endereco;
    }

    /**
     * 
     * @param cod_endereco 
     */
    public void setCod_endereco(int cod_endereco) {
        this.cod_endereco = cod_endereco;
    }
    
    
}
