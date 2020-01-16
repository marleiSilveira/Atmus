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
public class DBBackup {
    private int cod; 
    private int cod_evento;
    private String tipo_midia;
    private String endereco;
    private String usuario;
    private String senha; 
    private String comentarios;

    public DBBackup(int cod, int cod_evento, String tipo_midia, String endereco, String usuario, String senha, String comentarios) {
        this.cod = cod;
        this.cod_evento = cod_evento;
        this.tipo_midia = tipo_midia;
        this.endereco = endereco;
        this.usuario = usuario;
        this.senha = senha;
        this.comentarios = comentarios;
    }
    
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCod_evento() {
        return cod_evento;
    }

    public void setCod_evento(int cod_evento) {
        this.cod_evento = cod_evento;
    }

    public String getTipo_midia() {
        return tipo_midia;
    }

    public void setTipo_midia(String tipo_midia) {
        this.tipo_midia = tipo_midia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    
    
}
