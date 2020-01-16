/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesDB;


/**
 * @author Marlei M.S.B.
 */
public class DBUsuario {
    private String user_id;
    private String nome;          
    private String senha;
    private String data_atualizacao;
    private String tipo;  
    private String data_ult_acesso;
    private boolean usuario_revogado;
    private boolean senha_expirada;

    /**
     * 
     * @param user_id
     * @param nome
     * @param senha
     * @param data_atualizacao
     * @param tipo
     * @param data_ult_acesso
     * @param usuario_revogado
     * @param senha_expirada 
     */
    public DBUsuario(String user_id, String nome, String senha, String data_atualizacao, String tipo, String data_ult_acesso, boolean usuario_revogado, boolean senha_expirada) {
        setUser_id(user_id);
        setNome(nome);
        setSenha(senha);
        setData_atualizacao(data_atualizacao);
        setTipo(tipo);
        setData_ult_acesso(data_ult_acesso);
        setUsuario_revogado(usuario_revogado);
        setSenha_expirada(senha_expirada);
    }

    
    
    /**
     * @return String
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     * @param user_id 
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    /**
     * @return String
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha 
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return String 
     */
    public String getData_atualizacao() {
        return data_atualizacao;
    }

    /**
     * @param data 
     */
    public void setData_atualizacao(String data) {
        if (data.equals("")) {
            data = "01/01/1900";
        }
        if (data.substring(2, 3).equals("/")) {
            String ano = data.substring(6);
            String mes = data.substring(3, 5);
            String dia = data.substring(0, 2); 

            data = ano + "-" + mes + "-" + dia;            
        }

        this.data_atualizacao = data;
    }

    /**
     * @return String 
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * 
     * @return String
     */
    public String getData_ult_acesso() {
        return data_ult_acesso;
    }

    /**
     * 
     * @param data 
     */
    public void setData_ult_acesso(String data) {
        if (data.equals("")) {
            data = "01/01/1900";
        }
        if (data.substring(2, 3).equals("/")) {
            String ano = data.substring(6);
            String mes = data.substring(3, 5);
            String dia = data.substring(0, 2); 

            data = ano + "-" + mes + "-" + dia;            
        }       
        this.data_ult_acesso = data;
    }

    /**
     * 
     * @return boolean 
     */
    public boolean isUsuario_revogado() {
        return usuario_revogado;
    }

    /**
     * 
     * @param usuario_revogado 
     */
    public void setUsuario_revogado(boolean usuario_revogado) {
        this.usuario_revogado = usuario_revogado;
    }

    /**
     * 
     * @return boolean 
     */
    public boolean isSenha_expirada() {
        return senha_expirada;
    }

    /**
     * 
     * @param senha_expirada 
     */
    public void setSenha_expirada(boolean senha_expirada) {
        this.senha_expirada = senha_expirada;
    }
    
    
    
}
