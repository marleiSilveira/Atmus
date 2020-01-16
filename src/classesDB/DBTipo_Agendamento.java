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
public class DBTipo_Agendamento {
    private int cod;
    private String descricao;
    private String tempo_medio;
    private double margem_seguranca;
    private String hora_ini_suger;
    private String hora_fim_suger;
    private String justific_period;
    private int cod_grupo; 
    private String descricao_grupo;

    /**
     * @param cod
     * @param descricao
     * @param tempo_medio
     * @param margem_seguranca
     * @param hora_ini_suger
     * @param hora_fim_suger
     * @param justific_period
     * @param cod_grupo 
     */
    public DBTipo_Agendamento(int cod, String descricao, String tempo_medio, double margem_seguranca, String hora_ini_suger, String hora_fim_suger, String justific_period, int cod_grupo) {
        setCod(cod);
        setDescricao(descricao);
        setTempo_medio(tempo_medio);
        setMargem_seguranca(margem_seguranca);
        setHora_ini_suger(hora_ini_suger);
        setHora_fim_suger(hora_fim_suger);
        setJustific_period(justific_period);
        setCod_grupo(cod_grupo);
    }

    public DBTipo_Agendamento(int cod, String descricao, String tempo_medio, double margem_seguranca, String hora_ini_suger, String hora_fim_suger, String justific_period, int cod_grupo, String desc_grupo) {
        setCod(cod);
        setDescricao(descricao);
        setTempo_medio(tempo_medio);
        setMargem_seguranca(margem_seguranca);
        setHora_ini_suger(hora_ini_suger);
        setHora_fim_suger(hora_fim_suger);
        setJustific_period(justific_period);
        setCod_grupo(cod_grupo);
        setDescricao_grupo(desc_grupo);
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
    public String getTempo_medio() {
        return tempo_medio;
    }

    /**
     * 
     * @param tempo_medio 
     */
    public void setTempo_medio(String tempo_medio) {
        this.tempo_medio = tempo_medio;
    }

    /**
     * 
     * @return double
     */
    public double getMargem_seguranca() {
        return margem_seguranca;
    }

    /**
     * 
     * @param margem_seguranca 
     */
    public void setMargem_seguranca(double margem_seguranca) {
        this.margem_seguranca = margem_seguranca;
    }

    /**
     * 
     * @return String 
     */
    public String getHora_ini_suger() {
        return hora_ini_suger;
    }

    /**
     * 
     * @param hora_ini_suger 
     */
    public void setHora_ini_suger(String hora_ini_suger) {
        this.hora_ini_suger = hora_ini_suger;
    }

    /**
     * 
     * @return String
     */
    public String getHora_fim_suger() {
        return hora_fim_suger;
    }

    /**
     * 
     * @param hora_fim_suger 
     */
    public void setHora_fim_suger(String hora_fim_suger) {
        this.hora_fim_suger = hora_fim_suger;
    }

    /**
     * 
     * @return String
     */
    public String getJustific_period() {
        return justific_period;
    }

    /**
     * 
     * @param justific_period 
     */
    public void setJustific_period(String justific_period) {
        this.justific_period = justific_period;
    }

    /**
     * 
     * @return int
     */
    public int getCod_grupo() {
        return cod_grupo;
    }

    /**
     * 
     * @param cod_grupo 
     */
    public void setCod_grupo(int cod_grupo) {
        this.cod_grupo = cod_grupo;
    }

    public String getDescricao_grupo() {
        return descricao_grupo;
    }

    public void setDescricao_grupo(String descricao_grupo) {
        this.descricao_grupo = descricao_grupo;
    }
    
    
}
