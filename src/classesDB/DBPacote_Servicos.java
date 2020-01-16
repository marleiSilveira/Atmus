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
public class DBPacote_Servicos {
    private int cod;
    private String nome;
    private String descricao;
    private String observacoes;
    private double valor_pacote;

    /**
     * @param cod
     * @param nome
     * @param descricao
     * @param observacoes
     * @param valor_pacote 
     */
    public DBPacote_Servicos(int cod, String nome, String descricao, String observacoes, double valor_pacote) {
        setCod(cod);
        setNome(nome);
        setDescricao(descricao);
        setObservacoes(observacoes);
        setValor_pacote(valor_pacote);
    }
    
    /**
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
    public String getDescricao() {
        return descricao;
    }

    /**
     * 
     * @param descricao 
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * 
     * @return String 
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * 
     * @param observacoes 
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    /**
     * 
     * @return double 
     */
    public double getValor_pacote() {
        return valor_pacote;
    }

    /**
     * 
     * @param valor_pacote 
     */
    public void setValor_pacote(double valor_pacote) {
        this.valor_pacote = valor_pacote;
    }
    
    
}
