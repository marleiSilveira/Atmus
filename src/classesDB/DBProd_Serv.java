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
public class DBProd_Serv {
    private int cod;
    private String descricao;
    private String observacoes;
    private double preco_custo;
    private double preco_venda;
    private int cod_fornecedor; 

    /**
     * @param cod
     * @param descricao
     * @param observacoes
     * @param preco_custo
     * @param preco_venda 
     * @param cod_fornecedor
     */
    public DBProd_Serv(int cod, String descricao, String observacoes, double preco_custo, double preco_venda, int cod_fornecedor) {
        setCod(cod);
        setDescricao(descricao);
        setObservacoes(observacoes);
        setPreco_custo(preco_custo);
        setPreco_venda(preco_venda);
        setCod_fornecedor(cod_fornecedor);
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
    public double getPreco_custo() {
        return preco_custo;
    }

    /**
     * 
     * @param preco_custo 
     */
    public void setPreco_custo(double preco_custo) {
        this.preco_custo = preco_custo;
    }

    /**
     * 
     * @return double 
     */
    public double getPreco_venda() {
        return preco_venda;
    }

    /**
     * 
     * @param preco_venda 
     */
    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }

    /**
     * 
     * @return int 
     */
    public int getCod_fornecedor() {
        return cod_fornecedor;
    }

    /**
     * 
     * @param cod_fornecedor 
     */
    public void setCod_fornecedor(int cod_fornecedor) {
        this.cod_fornecedor = cod_fornecedor;
    }
    
    
    
}
