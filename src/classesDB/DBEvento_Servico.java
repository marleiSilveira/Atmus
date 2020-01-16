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
public class DBEvento_Servico {
    private int cod;
    private String data;
    private String hora;
    private String tipo;
    private int cod_fornecedor;
    private String diretorio_serv;
    private double valor_contratado;
    private String status; 

    public DBEvento_Servico(int cod, String data, String hora, String tipo, int cod_fornecedor, String diretorio_serv, double valor_contratado, String status) {
        this.cod = cod;
        this.data = data;
        this.hora = hora;
        this.tipo = tipo;
        this.cod_fornecedor = cod_fornecedor;
        this.diretorio_serv = diretorio_serv;
        this.valor_contratado = valor_contratado;
        this.status = status;
    }
        
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCod_fornecedor() {
        return cod_fornecedor;
    }

    public void setCod_fornecedor(int cod_fornecedor) {
        this.cod_fornecedor = cod_fornecedor;
    }

    public String getDiretorio_serv() {
        return diretorio_serv;
    }

    public void setDiretorio_serv(String diretorio_serv) {
        this.diretorio_serv = diretorio_serv;
    }

    public double getValor_contratado() {
        return valor_contratado;
    }

    public void setValor_contratado(double valor_contratado) {
        this.valor_contratado = valor_contratado;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
