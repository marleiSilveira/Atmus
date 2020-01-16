/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesDB;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Provê métodos de acesso às tabelas do banco de dados
 * @author Marlei M.S.B
 */
public class DAOPhotoFlow {
     
    //---------------------- Connection -----------------------------------------
    
    /**
     * 
     * @param driver
     * @param url
     * @param user
     * @param senha
     * @return Connection 
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public static Connection getConnection(String driver, String url, String user, String senha) 
           throws ClassNotFoundException, SQLException{
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, senha);         
        return con; 
    }

    /**
     * 
     * @return Connection
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/fotoflowdb", "postgres", "adm");         
        return con;         
    }
    
    //---------------------- Status_Tarefa --------------------------------------
    /**
     * 
     * @param con
     * @param statusTarefa
     * @throws SQLException 
     */
     public static void insertStatusTarefa(Connection con, DBStatus_Tarefa statusTarefa) throws SQLException{
        String stmt = "insert into Status_Tarefa(status) values (?);";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setString(1, statusTarefa.getStatus());
    
        ps.executeUpdate();        
    }   
     
    /**
     * 
     * @param con
     * @param statusTarefa
     * @throws SQLException 
     */
     public static void updateStatusTarefa(Connection con, DBStatus_Tarefa statusTarefa) throws SQLException{
        String stmt = "update Status_Tarefa set status = ? where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setString(1, statusTarefa.getStatus());
        ps.setInt(2, statusTarefa.getCod());
    
        ps.executeUpdate();        
    }     
 
    /**
     * 
     * @param con
     * @param statusTarefa
     * @throws SQLException 
     */
     public static void deleteStatusTarefa(Connection con, DBStatus_Tarefa statusTarefa) throws SQLException{
        String stmt = "delete from Status_Tarefa where status = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setString(1, statusTarefa.getStatus());
        
        ps.executeUpdate(); 
           
    }
     
    /**
     * 
     * @param con
     * @return Lista de todos os Status cadastrados na tabela Status_Tarefa 
     * (retorna um objeto java.util.List) 
     * @throws SQLException 
     */ 
    public static List selectAllStatusTarefa(Connection con) throws SQLException{
        
        List<Object> lista_status = new ArrayList<>();
        String stmt = "select cod, status from Status_Tarefa;";
        
        Statement ps = con.createStatement();
        ResultSet rs = ps.executeQuery(stmt);
        
        while(rs.next()){
            DBStatus_Tarefa status = new DBStatus_Tarefa(rs.getInt(1), rs.getString(2));
            lista_status.add(status); 
        }
        
        return lista_status; 
        
    } 
     
    //---------------------- Tipo_Relacionamento -------------------------------
    /**
     * 
     * @param con
     * @param tipoRelacionamento
     * @throws SQLException 
     */
     public static void insertTipoRelacionamento(Connection con, DBTipo_Relacionamento tipoRelacionamento) throws SQLException{
        String stmt = "insert into Tipo_Relacionamento(tipo) values (?);";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setString(1, tipoRelacionamento.getTipo());
    
        ps.executeUpdate();        
    }   
     
    /**
     * 
     * @param con
     * @param tipoRelacionamento
     * @throws SQLException 
     */
     public static void updateTipoRelacionamento(Connection con, DBTipo_Relacionamento tipoRelacionamento) throws SQLException{
        String stmt = "update Tipo_Relacionamento set tipo = ? where cod = ?";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setString(1, tipoRelacionamento.getTipo());
        ps.setInt(2, tipoRelacionamento.getCod());
    
        ps.executeUpdate();        
    }     
 
    /**
     * 
     * @param con
     * @param tipoRelacionamento
     * @throws SQLException 
     */
     public static void deleteTipoRelacionamento(Connection con, DBTipo_Relacionamento tipoRelacionamento) throws SQLException{
        String stmt = "delete from Tipo_Relacionamento where tipo = ?";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setString(1, tipoRelacionamento.getTipo());
    
        ps.executeUpdate();        
    }       
     
    /**
     * 
     * @param con
     * @return Lista de tipos de relacionamentos
     * @throws SQLException 
     */ 
    public static List selectTipoRelacionamento(Connection con) throws SQLException{
        List<Object> lista_rel = new ArrayList<>();
        String stmt = "select cod, tipo from tipo_relacionamento;";
        
        Statement ps = con.createStatement();
        ResultSet rs = ps.executeQuery(stmt);
        
        while(rs.next()){
            DBTipo_Relacionamento relacionamento = new DBTipo_Relacionamento(rs.getInt(1), rs.getString(2));
            lista_rel.add(relacionamento); 
        }
        
        return lista_rel;        
    } 
     
    //---------------------- Tipo_Contato --------------------------------------
    
    /**
     * 
     * @param con
     * @param tipoContato
     * @throws SQLException 
     */
     public static void insertTipoContato(Connection con, DBTipo_Contato tipoContato) throws SQLException{
        String stmt = "insert into Tipo_Contato(tipo, mascara) values (?,?);";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setString(1, tipoContato.getTipo());
        ps.setString(2, tipoContato.getMascara());
    
        ps.executeUpdate();        
    }      

    /**
     * 
     * @param con
     * @param tipoContato
     * @throws SQLException 
     */
     public static void updateTipoContato(Connection con, DBTipo_Contato tipoContato) throws SQLException{
        String stmt = "update Tipo_Contato set tipo = ?, mascara = ? where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setString(1, tipoContato.getTipo());
        ps.setString(2, tipoContato.getMascara());
        
        ps.setInt(3, tipoContato.getCod());
    
        ps.executeUpdate();        
    }           
 
    /**
     * 
     * @param con
     * @param tipoContato
     * @throws SQLException 
     */
     public static void deleteTipoContato(Connection con, DBTipo_Contato tipoContato) throws SQLException{
        String stmt = "delete from Tipo_Contato where tipo = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt);
        
        ps.setString(1, tipoContato.getTipo());
    
        ps.executeUpdate();        
    }      

    /**
     * 
     * @param con
     * @return lista completa de tipos de contatos (Tabela tipo_contato)
     * @throws SQLException 
     */
    public static List selectTipoContato(Connection con) throws SQLException{
        List<Object> lista_tpContatos = new ArrayList<>();
        String stmt = "select cod, tipo, mascara from tipo_contato;";
        
        Statement ps = con.createStatement();
        ResultSet rs = ps.executeQuery(stmt);
        
        while(rs.next()){
            DBTipo_Contato tpContato = new DBTipo_Contato(rs.getInt(1), rs.getString(2), rs.getString(3));
            lista_tpContatos.add(tpContato); 
        }
        
        return lista_tpContatos;        
    }      
     
    //---------------------- Pessoa --------------------------------------------
 
    /**
     * 
     * @param con
     * @param pessoa
     * @throws SQLException 
     */
    public static void insertPessoa(Connection con, DBPessoa pessoa) throws SQLException{
        String stmt = "insert into Pessoa(nome, natureza_juridica, cnpj, cpf, rg, cod_endereco) values (?,?,?,?,?,?);";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setString(1, pessoa.getNome());
        ps.setString(2, pessoa.getNatureza_juridica());
        ps.setString(3, pessoa.getCnpj());
        ps.setString(4, pessoa.getCpf());
        ps.setString(5, pessoa.getRg());
        ps.setInt(6, pessoa.getCod_endereco());

        
        ps.executeUpdate();        
    }    
    
    /**
     * 
     * @param con
     * @param pessoa
     * @throws SQLException 
     */
    public static void updatePessoa(Connection con, DBPessoa pessoa) throws SQLException{
        String stmt = "update Pessoa set nome = ?, natureza_juridica = ?, cnpj = ?, cpf = ?, rg = ?, cod_endereco = ? where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setString(1, pessoa.getNome());
        ps.setString(2, pessoa.getNatureza_juridica());
        ps.setString(3, pessoa.getCnpj());
        ps.setString(4, pessoa.getCpf());
        ps.setString(5, pessoa.getRg());
        ps.setInt(6, pessoa.getCod_endereco());
        ps.setInt(7, pessoa.getCod());
        
        ps.executeUpdate();        
    } 
    
    /**
     * 
     * @param con
     * @param pessoa
     * @throws SQLException 
     */
    public static void deletePessoa(Connection con, DBPessoa pessoa) throws SQLException{
        String stmt = "delete from Pessoa where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setInt(1, pessoa.getCod());
        
        ps.executeUpdate();        
    }     
   
    //---------------------- Endereço ------------------------------------------

    /**
     * 
     * @param con
     * @param endereco
     * @throws SQLException 
     */
    public static void insertEndereco(Connection con, DBEndereco endereco) throws SQLException{
        String stmt = "insert into Endereco(CEP, logradouro, numero_resid, bairro, cod_cidade, complemento) values (?,?,?,?,?,?);";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setString(1, endereco.getCep());
        ps.setString(2, endereco.getLogradouro());
        ps.setString(3, endereco.getNumero_resid());
        ps.setString(4, endereco.getBairro());
        ps.setInt(5, endereco.getCod_cidade());        
        ps.setString(6, endereco.getComplemento());
        
        ps.executeUpdate();        
    }   

    /**
     * 
     * @param con
     * @param endereco
     * @throws SQLException 
     */
    public static void updateEndereco(Connection con, DBEndereco endereco) throws SQLException{
        String stmt = "update Endereco set CEP = ?, logradouro = ?, numero_resid = ?, bairro = ?, cod_cidade = ?, complemento = ? where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setString(1, endereco.getCep());
        ps.setString(2, endereco.getLogradouro());
        ps.setString(3, endereco.getNumero_resid());
        ps.setString(4, endereco.getBairro());
        ps.setInt(5, endereco.getCod_cidade());
        ps.setString(6, endereco.getComplemento());
        ps.setInt(7, endereco.getCod());
               
        ps.executeUpdate();        
    }   

    /**
     * 
     * @param con
     * @param endereco
     * @throws SQLException 
     */
    public static void deleteEndereco(Connection con, DBEndereco endereco) throws SQLException{
        String stmt = "delete from Endereco where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setInt(1, endereco.getCod());
               
        ps.executeUpdate();        
    }     
    
    
    //---------------------- Fornecedor ----------------------------------------

    /**
     * 
     * @param con
     * @param fornecedor
     * @throws SQLException 
     */
    public static void insertFornecedor(Connection con, DBFornecedor fornecedor) throws SQLException{
        String stmt = "insert into Fornecedor(cod_pessoa, tipo, comentarios) values (?,?,?);";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setInt(1, fornecedor.getCod_pessoa());
        ps.setInt(2, fornecedor.getTipo());
        ps.setString(3, fornecedor.getComentarios());
        
        ps.executeUpdate();        
    }

    /**
     * 
     * @param con
     * @param fornecedor
     * @throws SQLException 
     */
    public static void updateFornecedor(Connection con, DBFornecedor fornecedor) throws SQLException{
        String stmt = "update Fornecedor set cod_pessoa = ?, tipo = ?, comentarios = ? where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setInt(1, fornecedor.getCod_pessoa());
        ps.setInt(2, fornecedor.getTipo());
        ps.setString(3, fornecedor.getComentarios());
        ps.setInt(4, fornecedor.getCod());
        
        ps.executeUpdate();        
    }    
    
    /**
     * 
     * @param con
     * @param fornecedor
     * @throws SQLException 
     */
    public static void deleteFornecedor(Connection con, DBFornecedor fornecedor) throws SQLException{
        String stmt = "delete from Fornecedor where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setInt(1, fornecedor.getCod());
        
        ps.executeUpdate();        
    } 
    
    //---------------------- Agendamento_Tarefa --------------------------------
    
    /**
     * 
     * @param con
     * @param agendamentoTarefa
     * @throws SQLException 
     */
    public static void insertAgendamentoTarefa(Connection con, DBAgendamento_Tarefa agendamentoTarefa) throws SQLException{
        String stmt = "insert into Agendamento_Tarefa(cod_evento, cod_tipo, data, usuario, status, hora_ini_plan, hora_fim_plan) values (?,?,?,?,?,?,?);";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setInt(1, agendamentoTarefa.getCod_evento());
        ps.setInt(2, agendamentoTarefa.getCod_tipo());
        ps.setDate(3, Date.valueOf(agendamentoTarefa.getData()));
        ps.setString(4, agendamentoTarefa.getUsuario());
        ps.setString(5, agendamentoTarefa.getStatus());
        ps.setTime(6, Time.valueOf(agendamentoTarefa.getHora_ini_plan()));
        ps.setTime(7, Time.valueOf(agendamentoTarefa.getHora_fim_plan()));
        
        ps.executeUpdate();
    }

    /**
     * 
     * @param con
     * @param agendamentoTarefa
     * @throws SQLException 
     */
    public static void updateAgendamentoTarefa(Connection con, DBAgendamento_Tarefa agendamentoTarefa) throws SQLException{
        String stmt = "update Agendamento_Tarefa set cod_evento = ?, cod_tipo = ?, data = ?, usuario = ?, status = ?, hora_ini_plan = ?, hora_fim_plan = ?, hora_ini_real = ?, hora_fim_real = ? where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setInt(1, agendamentoTarefa.getCod_evento());
        ps.setInt(2, agendamentoTarefa.getCod_tipo());
        ps.setDate(3, Date.valueOf(agendamentoTarefa.getData()));
        ps.setString(4, agendamentoTarefa.getUsuario());
        ps.setString(5, agendamentoTarefa.getStatus());
        ps.setTime(6, Time.valueOf(agendamentoTarefa.getHora_ini_plan()));
        ps.setTime(7, Time.valueOf(agendamentoTarefa.getHora_fim_plan()));
        ps.setTime(8, Time.valueOf(agendamentoTarefa.getHora_ini_real()));
        ps.setTime(9, Time.valueOf(agendamentoTarefa.getHora_fim_real()));
        ps.setInt(10, agendamentoTarefa.getCod());
        
        ps.executeUpdate();
    }
    
    /**
     * 
     * @param con
     * @param agendamentoTarefa
     * @throws SQLException 
     */
    public static void deleteAgendamentoTarefa(Connection con, DBAgendamento_Tarefa agendamentoTarefa) throws SQLException{
        String stmt = "delete from Agendamento_Tarefa  where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setInt(1, agendamentoTarefa.getCod());
        
        ps.executeUpdate();
    }    
    
    //---------------------- cliente -------------------------------------------
    
    /**
     * 
     * @param con
     * @param cliente
     * @throws SQLException 
     */
    public static void insertCliente(Connection con, DBCliente cliente) throws SQLException{
        String stmt = "insert into Cliente(cod_pessoa, data_nasc, comentarios) values (?,?,?);";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setInt(1, cliente.getCod_pessoa());
        ps.setDate(2, Date.valueOf(cliente.getData_nasc())); //aaaa-mm-dd
        ps.setString(3, cliente.getComentarios());
        
        ps.executeUpdate();
    }

    /**
     * 
     * @param con
     * @param cliente
     * @throws SQLException 
     */
    public static void updateCliente(Connection con, DBCliente cliente) throws SQLException{
        String stmt = "update Cliente set cod_pessoa = ?, data_nasc = ?, comentarios = ? where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setInt(1, cliente.getCod_pessoa());
        ps.setDate(2, Date.valueOf(cliente.getData_nasc())); //aaaa-mm-dd
        ps.setString(3, cliente.getComentarios());
        ps.setInt(4, cliente.getCod());
        
        ps.executeUpdate();
    }    
 
    /**
     * 
     * @param con
     * @param cliente
     * @throws SQLException 
     */
    public static void deleteCliente(Connection con, DBCliente cliente) throws SQLException{
        String stmt = "delete from Cliente where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
               
        ps.setInt(1, cliente.getCod());
        
        ps.executeUpdate();
    }    
    
    
    //---------------------- contato -------------------------------------------
    
    /**
     * 
     * @param con
     * @param contato
     * @throws SQLException 
     */
    public static void insertContato(Connection con, DBContato contato) throws SQLException{
        String stmt = "insert into Contato(cod_pessoa, tipo, id, forma_pref) values (?,?,?,?);";
        
        PreparedStatement ps = con.prepareStatement(stmt);  
        
        ps.setInt(1, contato.getCod_pessoa());
        ps.setString(2, contato.getTipo());
        ps.setString(3, contato.getId());
        ps.setBoolean(4, contato.isForma_pref());
        
        ps.executeUpdate();
    }
  
    /**
     * 
     * @param con
     * @param contato
     * @throws SQLException 
     */
    public static void updateContato(Connection con, DBContato contato) throws SQLException{
        String stmt = "udate Contato set cod_pessoa = ?, tipo = ?, id = ?, forma_pref = ? where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt);  
        
        ps.setInt(1, contato.getCod_pessoa());
        ps.setString(2, contato.getTipo());
        ps.setString(3, contato.getId());
        ps.setBoolean(4, contato.isForma_pref());
        ps.setInt(5, contato.getCod());
        
        ps.executeUpdate();
    }    
    
    /**
     * 
     * @param con
     * @param contato
     * @throws SQLException 
     */
    public static void deleteContato(Connection con, DBContato contato) throws SQLException{
        String stmt = "delete from Contato where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt);  
        
        ps.setInt(1, contato.getCod());
        
        ps.executeUpdate();
    } 

    //---------------------- Evento_Cliente ------------------------------------
    
    /**
     * 
     * @param con
     * @param eventoCliente
     * @throws SQLException 
     */
    public static void insertEventoCliente(Connection con, DBEvento_Cliente eventoCliente) throws SQLException{
        String stmt = "insert into Evento_Cliente(cod_evento, cod_cliente) values (?,?);";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setInt(1, eventoCliente.getCod_evento());
        ps.setInt(2, eventoCliente.getCod_cliente());

        ps.executeUpdate();
    } 
  
    /**
     * 
     * @param con
     * @param eventoCliente
     * @throws SQLException 
     */
    public static void deleteEventoCliente(Connection con, DBEvento_Cliente eventoCliente) throws SQLException{
        String stmt = "delete from Evento_Cliente where cod_evento = ? and cod_cliente = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setInt(1, eventoCliente.getCod_evento());
        ps.setInt(2, eventoCliente.getCod_cliente());

        ps.executeUpdate();
    }    
    
    //---------------------- Evento_Pacote -------------------------------------
    
    /**
     * 
     * @param con
     * @param eventoPacote
     * @throws SQLException 
     */
    public static void insertEventoPacote(Connection con, DBEvento_Pacote eventoPacote) throws SQLException{
        String stmt = "insert into Evento_Pacote(cod_evento, cod_pacote) values (?,?);";
        
        PreparedStatement ps = con.prepareStatement(stmt); 

        ps.setInt(1, eventoPacote.getCod_evento());
        ps.setInt(2, eventoPacote.getCod_pacote());
        
        ps.executeUpdate();
    }
 
    /**
     * 
     * @param con
     * @param eventoPacote
     * @throws SQLException 
     */
    public static void deleteEventoPacote(Connection con, DBEvento_Pacote eventoPacote) throws SQLException{
        String stmt = "delete from Evento_Pacote where cod_evento = ? and cod_pacote = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt); 

        ps.setInt(1, eventoPacote.getCod_evento());
        ps.setInt(2, eventoPacote.getCod_pacote());
        
        ps.executeUpdate();
    }    
    
    //---------------------- Evento_Servico ------------------------------------
    
    /**
     * 
     * @param con
     * @param eventoServico
     * @throws SQLException 
     */
    public static void insertEventoServico(Connection con, DBEvento_Servico eventoServico) throws SQLException{
        String stmt = "insert into Evento_Servico(data, hora, tipo, cod_fornecedor, diretorio_serv, valor_contratado) values (?,?,?,?,?,?);";
        
        PreparedStatement ps = con.prepareStatement(stmt); 

        ps.setDate(1, Date.valueOf(eventoServico.getData()));
        ps.setTime(2, Time.valueOf(eventoServico.getHora()));
        ps.setString(3, eventoServico.getTipo());
        ps.setInt(4, eventoServico.getCod_fornecedor());
        ps.setString(5, eventoServico.getDiretorio_serv());
        ps.setDouble(6, eventoServico.getValor_contratado());
        
        ps.executeUpdate();        
    }

    /**
     * 
     * @param con
     * @param eventoServico
     * @throws SQLException 
     */
    public static void updateEventoServico(Connection con, DBEvento_Servico eventoServico) throws SQLException{
        String stmt = "update Evento_Servico set data = ?, hora = ?, tipo = ?, cod_fornecedor = ?, diretorio_serv = ?, valor_contratado = ? where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt); 

        ps.setDate(1, Date.valueOf(eventoServico.getData()));
        ps.setTime(2, Time.valueOf(eventoServico.getHora()));
        ps.setString(3, eventoServico.getTipo());
        ps.setInt(4, eventoServico.getCod_fornecedor());
        ps.setString(5, eventoServico.getDiretorio_serv());
        ps.setDouble(6, eventoServico.getValor_contratado());
        ps.setInt(7, eventoServico.getCod());
        
        ps.executeUpdate();        
    }    

    /**
     * 
     * @param con
     * @param eventoServico
     * @throws SQLException 
     */
    public static void deleteEventoServico(Connection con, DBEvento_Servico eventoServico) throws SQLException{
        String stmt = "delete from Evento_Servico  where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt); 

        ps.setInt(1, eventoServico.getCod());
        
        ps.executeUpdate();        
    }    
    
    //---------------------- Extras_Evento -------------------------------------
  
    /**
     * 
     * @param con
     * @param extrasEvento
     * @throws SQLException 
     */
    public static void insertExtrasEvento(Connection con, DBExtras_Evento extrasEvento) throws SQLException{
        String stmt = "insert into Extras_Evento(cod_item, cod_evento) values (?,?);";
        
        PreparedStatement ps = con.prepareStatement(stmt); 

        ps.setInt(1, extrasEvento.getCod_item());
        ps.setInt(2, extrasEvento.getCod_evento());
        
        ps.executeUpdate();
    }    

    /**
     * 
     * @param con
     * @param extrasEvento
     * @throws SQLException 
     */
    public static void deleteExtrasEvento(Connection con, DBExtras_Evento extrasEvento) throws SQLException{
        String stmt = "delete from Extras_Evento where cod_item = ? and cod_evento = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt); 

        ps.setInt(1, extrasEvento.getCod_item());
        ps.setInt(2, extrasEvento.getCod_evento());
        
        ps.executeUpdate();
    }     
    
    //---------------------- Grupo ---------------------------------------------
    
    /**
     * 
     * @param con
     * @param grupo
     * @throws SQLException 
     */
    public static void insertGrupo(Connection con, DBGrupo grupo) throws SQLException{
        String stmt = "insert into Grupo(descricao, corR, corG, corB) values (?,?,?,?);";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setString(1, grupo.getDescricao()); 
        ps.setInt(2, grupo.getCorR());
        ps.setInt(3, grupo.getCorG());
        ps.setInt(4, grupo.getCorB());
        
        ps.executeUpdate();       
    }
      
    /**
     * 
     * @param con
     * @param grupo
     * @throws SQLException 
     */
    public static void updateGrupo(Connection con, DBGrupo grupo) throws SQLException{
        String stmt = "update Grupo set descricao = ?, corR = ?, corG = ?, corB = ? where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setString(1, grupo.getDescricao()); 
        ps.setInt(2, grupo.getCorR());
        ps.setInt(3, grupo.getCorG());
        ps.setInt(4, grupo.getCorB());
        ps.setInt(5, grupo.getCod());
        
        ps.executeUpdate();       
    }    

    /**
     * 
     * @param con
     * @param grupo
     * @throws SQLException 
     */
    public static void deleteGrupo(Connection con, DBGrupo grupo) throws SQLException{
        String stmt = "delete from Grupo where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt); 

        ps.setInt(1, grupo.getCod());
        
        ps.executeUpdate();       
    }    
  
    public static List selectAllGrupo(Connection con) throws SQLException{
        
        List<Object> lista_grupos = new ArrayList<>();
        String stmt = "select cod, descricao, corR, corG, corB from grupo;";
        
        Statement ps = con.createStatement();
        ResultSet rs = ps.executeQuery(stmt);
        
        while(rs.next()){
            DBGrupo grupo = new DBGrupo(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
            lista_grupos.add(grupo); 
        }
        
        return lista_grupos; 
        
    }     
    
    //---------------------- Historico_Agendamento -----------------------------
    
    /**
     * 
     * @param con
     * @param historicoAgendamento
     * @throws SQLException 
     */
    public static void insertHistoricoAgendamento(Connection con, DBHistorico_Agendamento historicoAgendamento) throws SQLException{
        String stmt = "insert into Historico_Agendamento(cod_agendamento, comentario, data, hora) values (?,?,?,?);";
        
        PreparedStatement ps = con.prepareStatement(stmt);

        ps.setInt(1, historicoAgendamento.getCod_agendamento());
        ps.setString(2, historicoAgendamento.getComentario());
        ps.setDate(3, Date.valueOf(historicoAgendamento.getData()));
        ps.setTime(4, Time.valueOf(historicoAgendamento.getHora()));
        
        ps.executeUpdate();         
    }

    /**
     * 
     * @param con
     * @param historicoAgendamento
     * @throws SQLException 
     */
    public static void deleteHistoricoAgendamento(Connection con, DBHistorico_Agendamento historicoAgendamento) throws SQLException{
        String stmt = "delete from Historico_Agendamento where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt);

        ps.setInt(1, historicoAgendamento.getCod());
        
        ps.executeUpdate();         
    }

    //---------------------- Pacote --------------------------------------------
    /**
     * 
     * @param con
     * @param itensPacote
     * @throws SQLException 
     */
    public static void insertItensPacote(Connection con, DBItens_Pacote itensPacote) throws SQLException{
        String stmt = "insert into Itens_Pacote(cod_item, cod_pacote) values (?,?);";
        
        PreparedStatement ps = con.prepareStatement(stmt);

        ps.setInt(1, itensPacote.getCod_item());
        ps.setInt(2, itensPacote.getCod_pacote());
        
        ps.executeUpdate();         
    }

    /**
     * 
     * @param con
     * @param itensPacote
     * @throws SQLException 
     */
    public static void deleteItensPacote(Connection con, DBItens_Pacote itensPacote) throws SQLException{
        String stmt = "delete from Itens_Pacote where cod_item = ? and cod_pacote = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt);

        ps.setInt(1, itensPacote.getCod_item());
        ps.setInt(2, itensPacote.getCod_pacote());
        
        ps.executeUpdate();         
    }
    
    //---------------------- Prod_Serv -----------------------------------------
    
    /**
     * 
     * @param con
     * @param prodServ
     * @throws SQLException 
     */
    public static void insertProdServ(Connection con, DBProd_Serv prodServ) throws SQLException{
        String stmt = "insert into Prod_Serv(descricao, observacoes, preco_custo, preco_venda, cod_fornecedor) values (?,?,?,?,?);";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setString(1, prodServ.getDescricao());
        ps.setString(2, prodServ.getObservacoes());
        ps.setDouble(3, prodServ.getPreco_custo());
        ps.setDouble(4, prodServ.getPreco_venda());
        ps.setInt(5, prodServ.getCod_fornecedor());
        
        ps.executeUpdate();        
    }
 
    /**
     * 
     * @param con
     * @param ProdServ
     * @throws SQLException 
     */
    public static void updateProdServ(Connection con, DBProd_Serv prodServ) throws SQLException{
        String stmt = "update Prod_Serv set descricao = ?, observacoes = ?, preco_custo = ?, preco_venda = ?, cod_fornecedor = ? where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setString(1, prodServ.getDescricao());
        ps.setString(2, prodServ.getObservacoes());
        ps.setDouble(3, prodServ.getPreco_custo());
        ps.setDouble(4, prodServ.getPreco_venda());
        ps.setInt(5, prodServ.getCod_fornecedor());
        ps.setInt(6, prodServ.getCod());
        
        
        ps.executeUpdate();        
    }    

    
    /**
     * 
     * @param con
     * @param itensProdServ
     * @throws SQLException 
     */
    public static void deleteProdServ(Connection con, DBProd_Serv prodServ) throws SQLException{
        String stmt = "delete from Prod_Serv where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt); 
        
        ps.setInt(1, prodServ.getCod());
        
        ps.executeUpdate();        
    }    
    
    //---------------------- Pacote_Servicos -----------------------------------
    
    /**
     * 
     * @param con
     * @param pacoteServicos
     * @throws SQLException 
     */
    public static void insertPacoteServicos(Connection con, DBPacote_Servicos pacoteServicos) throws SQLException{
        String stmt = "insert into Pacote_Servicos(nome, descricao, observacoes, valor_pacote) values (?,?,?,?);";
        
        PreparedStatement ps = con.prepareStatement(stmt);  
        
        ps.setString(1, pacoteServicos.getNome());
        ps.setString(2, pacoteServicos.getDescricao());
        ps.setString(3, pacoteServicos.getObservacoes());
        ps.setDouble(4, pacoteServicos.getValor_pacote());
        
        ps.executeUpdate();        
    }

    /**
     * 
     * @param con
     * @param pacoteServicos
     * @throws SQLException 
     */
    public static void updatePacoteServicos(Connection con, DBPacote_Servicos pacoteServicos) throws SQLException{
        String stmt = "update Pacote_Servicos set nome = ?, descricao = ?, observacoes = ?, valor_pacote = ? where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt);  
        
        ps.setString(1, pacoteServicos.getNome());
        ps.setString(2, pacoteServicos.getDescricao());
        ps.setString(3, pacoteServicos.getObservacoes());
        ps.setDouble(4, pacoteServicos.getValor_pacote());
        ps.setInt(5, pacoteServicos.getCod());
        
        ps.executeUpdate();        
    }    
  
    /**
     * 
     * @param con
     * @param pacoteServicos
     * @throws SQLException 
     */
    public static void deletePacoteServicos(Connection con, DBPacote_Servicos pacoteServicos) throws SQLException{
        String stmt = "delete from Pacote_Servicos where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt);  
        
        ps.setInt(1, pacoteServicos.getCod());
        
        ps.executeUpdate();        
    }     
    
    //---------------------- Relacionamento_Cliente ----------------------------
    
    /**
     * 
     * @param con
     * @param relacionamentoCliente
     * @throws SQLException 
     */
    public static void insertRelacionamentoCliente(Connection con, DBRelacionamento_Cliente relacionamentoCliente) throws SQLException{
        String stmt = "insert into Relacionamento_Cliente(cod_cliente_A, cod_cliente_B, relacionamento_AB, relacionamento_BA) values (?,?,?,?);";
        
        PreparedStatement ps = con.prepareStatement(stmt);         
 
        ps.setInt(1, relacionamentoCliente.getCod_cliente_A());
        ps.setInt(2, relacionamentoCliente.getCod_cliente_B());
        ps.setString(3, relacionamentoCliente.getRelacionamento_AB());
        ps.setString(4, relacionamentoCliente.getRelacionamento_BA());
        
        ps.executeUpdate();           
    }
 
    /**
     * 
     * @param con
     * @param relacionamentoCliente
     * @throws SQLException 
     */
    public static void updateRelacionamentoCliente(Connection con, DBRelacionamento_Cliente relacionamentoCliente) throws SQLException{
        String stmt = "update Relacionamento_Cliente set cod_cliente_A = ?, cod_cliente_B = ?, relacionamento_AB = ?, relacionamento_BA = ? where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt);         
 
        ps.setInt(1, relacionamentoCliente.getCod_cliente_A());
        ps.setInt(2, relacionamentoCliente.getCod_cliente_B());
        ps.setString(3, relacionamentoCliente.getRelacionamento_AB());
        ps.setString(4, relacionamentoCliente.getRelacionamento_BA());
        ps.setInt(5, relacionamentoCliente.getCod());
        
        ps.executeUpdate();           
    }

    /**
     * 
     * @param con
     * @param relacionamentoCliente
     * @throws SQLException 
     */
    public static void deleteRelacionamentoCliente(Connection con, DBRelacionamento_Cliente relacionamentoCliente) throws SQLException{
        String stmt = "delete from Relacionamento_Cliente where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt);         

        ps.setInt(1, relacionamentoCliente.getCod());
        
        ps.executeUpdate();           
    }
    
    //---------------------- Tipo_Agendamento ----------------------------------
    
    /**
     * 
     * @param con
     * @param tipoAgendamento
     * @throws SQLException 
     */
    public static void insertTipoAgendamento(Connection con, DBTipo_Agendamento tipoAgendamento) throws SQLException{
        String stmt = "insert into Tipo_Agendamento(descricao, tempo_medio, margem_seguranca, hora_ini_suger, hora_fim_suger, justific_period, cod_grupo) values (?,?,?,?,?,?,?);";
        
        PreparedStatement ps = con.prepareStatement(stmt);

        ps.setString(1, tipoAgendamento.getDescricao());
        ps.setTime(2, Time.valueOf(tipoAgendamento.getTempo_medio()));
        ps.setDouble(3, tipoAgendamento.getMargem_seguranca());
        ps.setTime(4, Time.valueOf(tipoAgendamento.getHora_ini_suger()));
        ps.setTime(5, Time.valueOf(tipoAgendamento.getHora_fim_suger()));
        ps.setString(6, tipoAgendamento.getJustific_period());
        ps.setInt(7, tipoAgendamento.getCod_grupo());
        
        ps.executeUpdate();        
    } 

    /**
     * 
     * @param con
     * @param tipoAgendamento
     * @throws SQLException 
     */
    public static void updateTipoAgendamento(Connection con, DBTipo_Agendamento tipoAgendamento) throws SQLException{
        String stmt = "update Tipo_Agendamento set descricao = ?, tempo_medio = ?, margem_seguranca = ?, hora_ini_suger = ?, hora_fim_suger = ?, justific_period = ?, cod_grupo = ? where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt);

        ps.setString(1, tipoAgendamento.getDescricao());
        ps.setTime(2, Time.valueOf(tipoAgendamento.getTempo_medio()));
        ps.setDouble(3, tipoAgendamento.getMargem_seguranca());
        ps.setTime(4, Time.valueOf(tipoAgendamento.getHora_ini_suger()));
        ps.setTime(5, Time.valueOf(tipoAgendamento.getHora_fim_suger()));
        ps.setString(6, tipoAgendamento.getJustific_period());
        ps.setInt(7, tipoAgendamento.getCod_grupo());
        ps.setInt(8, tipoAgendamento.getCod());
        
        ps.executeUpdate();        
    }    
 
    /**
     * 
     * @param con
     * @param tipoAgendamento
     * @throws SQLException 
     */
    public static void deleteTipoAgendamento(Connection con, int codTipoAgendamento) throws SQLException{
        String stmt = "delete from Tipo_Agendamento where cod = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt);

        ps.setInt(1, codTipoAgendamento);
        
        ps.executeUpdate();        
    }    
 
    /**
     * 
     * @param con
     * @return Lista de tipos de agendamento
     * @throws SQLException 
     */
    public static List selectAllTipoAgendamento(Connection con) throws SQLException{
        List<Object> lista_tpAgendamentos = new ArrayList<>();
        String stmt = "select A.cod, A.descricao, A.tempo_medio, A.margem_seguranca, A.hora_ini_suger, A.hora_fim_suger, A.justific_period, A.cod_grupo, G.descricao "
                + "      from Tipo_Agendamento as A, grupo as G"
                + "      where A.cod_grupo = G.cod;";
        
        Statement ps = con.createStatement();   
        ResultSet rs = ps.executeQuery(stmt);

        while(rs.next()){
            DBTipo_Agendamento tpAgendamento = new DBTipo_Agendamento(rs.getInt(1), rs.getString(2), rs.getTime(3).toString(), rs.getDouble(4), rs.getTime(5).toString(), rs.getTime(6).toString(), rs.getString(7), rs.getInt(8), rs.getString(9));               
            lista_tpAgendamentos.add(tpAgendamento);
        }
        return (lista_tpAgendamentos);          
    }    
    
    /**
     * 
     * @param con
     * @param cod
     * @return Lista de tipos de agendamento
     * @throws SQLException 
     */
    public static DBTipo_Agendamento selectTipoAgendamento(Connection con, int cod) throws SQLException{
        DBTipo_Agendamento tpAgendamento = null; 
        String stmt = "select A.cod, A.descricao, A.tempo_medio, A.margem_seguranca, A.hora_ini_suger, A.hora_fim_suger, A.justific_period, A.cod_grupo, G.descricao "
                + "      from Tipo_Agendamento as A, grupo as G"
                + "      where A.cod = ?"
                + "        and A.cod_grupo = G.cod;";
        
        PreparedStatement ps = con.prepareStatement(stmt);

        ps.setInt(1, cod);   
        ResultSet rs = ps.executeQuery();

        if (rs.next()){
            tpAgendamento = new DBTipo_Agendamento(rs.getInt(1), rs.getString(2), rs.getTime(3).toString(), rs.getDouble(4), rs.getTime(5).toString(), rs.getTime(6).toString(), rs.getString(7), rs.getInt(8), rs.getString(9));               
        }
        return (tpAgendamento);          
    }      
    
    //---------------------- Usuario -------------------------------------------
    
    /**
     * 
     * @param con
     * @param usuario
     * @throws SQLException 
     */
    public static void insertUsuario(Connection con, DBUsuario usuario) throws SQLException{
        String stmt = "insert into Usuario(user_id, nome, senha, data_atualizacao, tipo, data_ult_acesso, usuario_revogado, senha_expirada) values (?,?,?,?,?,?,?,?);";
        
        PreparedStatement ps = con.prepareStatement(stmt);   

        ps.setString(1, usuario.getUser_id());
        ps.setString(2, usuario.getNome());
        ps.setString(3, usuario.getSenha());
        ps.setDate(4, Date.valueOf(usuario.getData_atualizacao()));
        ps.setString(5, usuario.getTipo());
        ps.setDate(6, Date.valueOf(usuario.getData_ult_acesso()));
        ps.setBoolean(7, usuario.isUsuario_revogado());
        ps.setBoolean(8, usuario.isSenha_expirada());
        
        ps.executeUpdate();        
    }
  
    /**
     * 
     * @param con
     * @param usuario
     * @throws SQLException 
     */
    public static void updateUsuario(Connection con, DBUsuario usuario) throws SQLException{
        String stmt = "update Usuario set  nome = ?, senha = ?, data_atualizacao = ?, tipo = ?, data_ult_acesso =?, usuario_revogado = ?, senha_expirada = ? where user_id = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt);   
        
        ps.setString(1, usuario.getNome());
        ps.setString(2, usuario.getSenha());
        ps.setDate(3,  Date.valueOf(usuario.getData_atualizacao()));
        ps.setString(4, usuario.getTipo());
        ps.setDate(5,  Date.valueOf(usuario.getData_ult_acesso()));
        ps.setBoolean(6, usuario.isUsuario_revogado());
        ps.setBoolean(7, usuario.isSenha_expirada());
        ps.setString(8, usuario.getUser_id());
        
        ps.executeUpdate();        
    }    
 
    /**
     * 
     * @param con
     * @param usuario
     * @throws SQLException 
     */
    public static void deleteUsuario(Connection con, DBUsuario usuario) throws SQLException{
        String stmt = "delete from Usuario where user_id = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt);   
 
        ps.setString(1, usuario.getUser_id());
        
        ps.executeUpdate();        
    }      
    
    /**
     * 
     * @param con
     * @return Lista de usuarios
     * @throws SQLException 
     */
    public static List selectAllUsuario(Connection con) throws SQLException{
        List<Object> lista_usuarios = new ArrayList<>();
        String stmt = "select user_id, nome, senha, data_atualizacao, tipo, data_ult_acesso, usuario_revogado, senha_expirada from Usuario;";
        
        Statement ps = con.createStatement();   
        ResultSet rs = ps.executeQuery(stmt);

        while(rs.next()){
            DBUsuario usuario = new DBUsuario(rs.getString(1), rs.getString(2), rs.getString(3), (rs.getDate(4)).toString(), rs.getString(5), (rs.getDate(6)).toString(), rs.getBoolean(7), rs.getBoolean(8));
            lista_usuarios.add(usuario);
        }
        return (lista_usuarios);          
    }
  
    /**
     * 
     * @param con
     * @return usuario
     * @throws SQLException 
     */
    public static DBUsuario selectUsuario(Connection con, String user_id) throws SQLException{
        String stmt = "select nome, senha, data_atualizacao, tipo, data_ult_acesso, usuario_revogado, senha_expirada from Usuario where user_id = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt);  
        ps.setString(1, user_id);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            DBUsuario usuario = new DBUsuario(user_id, rs.getString(1), rs.getString(2), (rs.getDate(3)).toString(), rs.getString(4), (rs.getDate(5)).toString(), rs.getBoolean(6), rs.getBoolean(7));
            return (usuario);
        }
        return (null);          
    }    
    
    /**
     * 
     * @param con
     * @param user_id
     * @param senha
     * @return retorna "true" se o usuario e senha estiverem corretos
     * @throws SQLException 
     */
    public static boolean autenticaUsuario(Connection con, String user_id, String senha) throws SQLException{
        String stmt = "select nome, senha, data_atualizacao, tipo from Usuario where user_id = ?;";
        
        PreparedStatement ps = con.prepareStatement(stmt);   
 
        ps.setString(1, user_id);
        
        ResultSet rs = ps.executeQuery();    
        
        if (rs.getString(2)== senha) {
            return true;
        }else{
            return false;
        }
    }
    
}
