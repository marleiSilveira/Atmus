-- Database: teste

-- DROP DATABASE teste;

CREATE DATABASE FotoFlowDB
  WITH OWNER = postgres 
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Portuguese_Brazil.1252'
       LC_CTYPE = 'Portuguese_Brazil.1252'
       CONNECTION LIMIT = -1;

SELECT current_database();

-- Create All Sequences 

-- Sequence Tab Pais
CREATE SEQUENCE seq_pai START 1;

-- Sequence Tab Estado
CREATE SEQUENCE seq_est START 1;

-- Sequence Tab Cidade
CREATE SEQUENCE seq_cid START 1;

-- Sequence Tab Endereço
CREATE SEQUENCE seq_end START 1;  

-- Sequence Tab Pessoa
CREATE SEQUENCE seq_pes START 1;  

-- Sequence Tab Tipo_Fornecedor
CREATE SEQUENCE seq_tfo START 1;  

-- Sequence Tab Fornecedor
CREATE SEQUENCE seq_for START 1;  

-- Sequence Tab Cliente
CREATE SEQUENCE seq_cli START 1;  

-- Sequence Tab Tipo Contato 
CREATE SEQUENCE seq_tco START 1;

-- Sequence Tab Contato 
CREATE SEQUENCE seq_con START 1; 

-- Sequence Tab Relacionamento_cliente 
CREATE SEQUENCE seq_tre START 1;  

-- Sequence Tab Relacionamento_cliente 
CREATE SEQUENCE seq_rel START 1;  

-- Sequence Tab Evento_Servico
CREATE SEQUENCE seq_eve START 1;

-- Sequence Tab Backup
CREATE SEQUENCE seq_bak START 1;

-- Sequence Tab Pacote_Servicos
CREATE SEQUENCE seq_pac START 1;

-- Sequence Tab Itens_Prod_Serv
CREATE SEQUENCE seq_ite START 1;

-- Sequence Tab Agendamento_tarefa
CREATE SEQUENCE seq_age START 1;

-- Sequence Tab Tipo_Agendamento
CREATE SEQUENCE seq_tip START 1;

-- Sequence Tab Grupo 
CREATE SEQUENCE seq_gru START 1;

-- Sequence Tab Status_Tarefa
CREATE SEQUENCE seq_sta START 1;

-- Sequence Tab Historico_Agendamento
CREATE SEQUENCE seq_his START 1;

-- Sequence Tab Historico_Eventos
CREATE SEQUENCE seq_hie START 1;

--SELECT nextval 'seq_his');

-- Create All Tables

-- Tabela de usuario 

CREATE TABLE usuario(
   user_id          char(8) PRIMARY KEY,
   nome             varchar(35),
   senha            varchar(15),
   data_atualizacao date,
   tipo             varchar(15),
   data_ult_acesso  date,
   usuario_revogado boolean,
   senha_expirada   boolean
);


-- Tabela País 
CREATE TABLE Pais(
   cod              integer PRIMARY KEY DEFAULT nextval('seq_pai'), 
   pais             varchar(35) UNIQUE
);

-- Tabela Estado 
CREATE TABLE Estado(
   cod              integer PRIMARY KEY DEFAULT nextval('seq_est'), 
   estado           varchar(35),
   UF               varchar(5),
   cod_pais         integer REFERENCES pais (cod),
   UNIQUE (estado, cod_pais)
);

-- Tabela Cidade
CREATE TABLE cidade(
   cod              integer PRIMARY KEY DEFAULT nextval('seq_cid'), 
   cidade           varchar(35),
   CEP              char(9),
   cod_estado       integer REFERENCES estado (cod),
   UNIQUE (cidade, cod_estado)
);


-- Tabela Endereço
CREATE TABLE endereco(
   cod              integer PRIMARY KEY DEFAULT nextval('seq_end'), 
   CEP              char(9),
   logradouro       varchar(30),
   numero_resid     integer,
   bairro           varchar(30),
   cod_cidade       integer REFERENCES cidade (cod),
   complemento      varchar(30)
);

-- Tabela Pessoa Genérica 
CREATE TABLE pessoa(
   cod              integer PRIMARY KEY DEFAULT nextval('seq_pes'),
   nome             varchar(50),
   natureza_jur     char(1),
   cnpj             varchar(30),
   cpf              varchar(30),
   rg               varchar(30),
   cod_endereco     integer REFERENCES endereco (cod),
   CHECK (natureza_jur in ('J', 'F')),
);


CREATE OR REPLACE VIEW vpessoa_fisica as 
   select cod, 
          nome,
          cpf,
          rg,
          cod_endereco
     from pessoa
   where natureza_jur = 'F';

select * from vpessoa_fisica;

-- Tabela Tipo Contato
CREATE TABLE tipo_contato (
   cod              integer PRIMARY KEY DEFAULT nextval('seq_tco'),
   tipo             varchar(20),
   mascara          varchar(50)
);


-- Tabela Contatos do Cliente
CREATE TABLE contato (
   cod               integer PRIMARY KEY DEFAULT nextval('seq_con'),
   cod_pessoa        integer REFERENCES pessoa (cod),
   tipo              integer REFERENCES tipo_contato (cod),
   id                varchar(35),
   forma_pref        boolean DEFAULT FALSE
);

-- Tabela Tipo de fornecedor
CREATE TABLE tipo_fornecedor(
   cod               integer PRIMARY KEY DEFAULT nextval('seq_tfo'),
   tipo              varchar(50)
);

-- Tabela Fornecedor
CREATE TABLE fornecedor(
   cod               integer PRIMARY KEY DEFAULT nextval('seq_for'),
   cod_pessoa        integer REFERENCES pessoa (cod),
   tipo              integer REFERENCES tipo_fornecedor (cod), 
   comentarios       varchar (500)
);

--Alter table fornecedor drop column tipo;
--Alter table fornecedor add column cod_tipo_fornecedor integer references tipo_fornecedor (cod);



-- Tabela Cliente 
CREATE TABLE cliente (
   cod               integer PRIMARY KEY DEFAULT nextval('seq_cli'),
   cod_pessoa        integer REFERENCES pessoa (cod),
   data_nasc         date,
   sexo             char(1) DEFAULT '-',   
   comentarios       varchar(1000),
   CHECK (sexo in ('M', 'F', '-'))   
);

--Alter table cliente add column sexo char(1) DEFAULT '-';
--Alter table cliente add CHECK (sexo in ('M', 'F', '-'));

-- Tabela Tipo de Relacionamento
CREATE TABLE tipo_relacionamento (
   cod              integer PRIMARY KEY DEFAULT nextval('seq_tre'),
   tipo             varchar(15)
);

-- Tabela Relacionamentos do Cliente
CREATE TABLE relacionamentos_cliente (
   cod                            integer PRIMARY KEY DEFAULT nextval('seq_rel'),
   cod_cliente_A                  integer REFERENCES cliente (cod),
   cod_cliente_B                  integer REFERENCES cliente (cod),
   cod_tipo_relacionamento_AB     integer REFERENCES tipo_relacionamento (cod),
   cod_tipo_relacionamento_BA     integer REFERENCES tipo_relacionamento (cod)
);


-- Tabela de Eventos contratados pelo Cliente
CREATE TABLE evento_servico (
   cod               integer PRIMARY KEY DEFAULT nextval('seq_eve'),
   cod_fornecedor    integer REFERENCES fornecedor (cod),
   data              date, 
   hora              time,
   tipo              varchar(20),
   diretorio_serv    varchar(100),
   valor_contratado  double precision,
   status            varchar(20) 
);

-- Tabela de normalizacao Cliente vs. Eventos
CREATE TABLE evento_cliente (
   cod_evento        integer REFERENCES evento_servico (cod),
   cod_cliente       integer REFERENCES cliente (cod),
   PRIMARY KEY (cod_evento, cod_cliente)
);

-- Tabela de Backup dos documentos do Evento
CREATE TABLE backup (
   cod              integer PRIMARY KEY DEFAULT nextval('seq_bak'),
   cod_evento       integer REFERENCES evento_servico (cod),
   tipo_midia       varchar(25),
   endereco         varchar(150),
   usuario          varchar(35),
   senha            varchar(35),
   comentarios      varchar(500)
);



-- Tabela Pacote de Serviços 
CREATE TABLE pacote_servicos (
   cod               integer PRIMARY KEY DEFAULT nextval('seq_pac'),
   nome              varchar(35),
   descricao         varchar(200),
   observacoes       varchar(200),
   valor_pacote      double precision
);

-- Tabela de normalizacao Pacote vs. Evento
CREATE TABLE evento_pacote (
   cod_evento       integer REFERENCES evento_servico (cod),
   cod_pacote       integer REFERENCES pacote_servicos (cod),
   PRIMARY KEY (cod_evento, cod_pacote)
);

-- Tabela de itens (produtos ou servicos) que compoe os pacotes
CREATE TABLE prod_serv (
   cod              integer PRIMARY KEY DEFAULT nextval('seq_ite'),
   cod_fornecedor   integer REFERENCES fornecedor (cod),
   descricao        varchar(50),
   observacoes      varchar(200),
   preco_custo      double precision,
   preco_venda      double precision
);

-- Tabela Itens do pacote 
CREATE TABLE itens_pacote (
   cod_item         integer REFERENCES prod_serv (cod),
   cod_pacote       integer REFERENCES pacote_servicos (cod),
   PRIMARY KEY (cod_item, cod_pacote)
);

-- Tabela itens Extras 
CREATE TABLE extras_evento (
   cod_item         integer REFERENCES prod_serv (cod),
   cod_evento       integer REFERENCES evento_servico (cod),
   PRIMARY KEY (cod_item, cod_evento),
   anotacao         varchar(250)
   
);


-- Tabela Grupo de Tarefas 
CREATE TABLE grupo (
   cod              integer PRIMARY KEY DEFAULT nextval('seq_gru'),
   descricao        varchar(50),
   corR             smallserial,
   corG             smallserial,
   corB             smallserial               
);


-- Tabela Grupo-Usuário
CREATE TABLE grupo_usuario (
   cod_grupo        integer REFERENCES grupo (cod),
   cod_usuario      char(8) REFERENCES usuario (user_id),
   PRIMARY KEY (cod_grupo, cod_usuario)
);


-- Tabela tipo de agendamento
CREATE TABLE tipo_agendamento (
   cod              integer PRIMARY KEY DEFAULT nextval('seq_tip'),
   descricao        varchar(25),
   tempo_medio      time,
   margem_seguranca real,
   hora_ini_suger   time,
   hora_fim_suger   time,
   justific_period  varchar(150),
   cod_grupo        integer REFERENCES grupo (cod)  
);

-- Tabela Status_Tarefa
CREATE TABLE status_tarefa (
   cod		    integer PRIMARY KEY DEFAULT nextval('seq_sta'),
   status           varchar(35)
);

-- Tabela de itens agendados para o evento 
CREATE TABLE agendamento_tarefa (
   cod              integer PRIMARY KEY DEFAULT nextval('seq_age'),
   cod_evento       integer REFERENCES evento_servico (cod),
   cod_tipo         integer REFERENCES tipo_agendamento (cod),
   data             date,
   usuario          char(8) REFERENCES usuario (user_id),
   status           integer REFERENCES status_tarefa (cod),
   hora_ini_plan    time,
   hora_fim_plan    time,
   hora_ini_real    time,
   hora_fim_real    time
);

-- Tabela historico Agendamento
CREATE TABLE historico_agendamento (
   cod              integer PRIMARY KEY DEFAULT nextval('seq_his'),
   tipo_alteracao   varchar(15), 
   data_alteracao   date,
   hora_alteracao   time,
   cod_agendamento  integer,
   cod_evento       integer,
   cod_tipo         integer,
   data             date,
   usuario          char(8),
   status           integer,
   hora_ini_plan    time,
   hora_fim_plan    time,
   hora_ini_real    time,
   hora_fim_real    time
);


-- Tabela historico de Eventos
CREATE TABLE historico_evento (
   cod              integer PRIMARY KEY DEFAULT nextval('seq_hie'),
   tipo_alteracao   varchar(15), 
   data_alteracao   date,
   hora_alteracao   time,
   cod_evento       integer,
   cod_fornecedor   integer,
   data             date, 
   hora             time,
   tipo             varchar(20),
   diretorio_serv   varchar(100),
   valor_contratado double precision,
   status           varchar(20) 
);

-- Function historico de agendamento
CREATE OR REPLACE FUNCTION historico_agendamento_function()
RETURNS trigger AS $BODY$
BEGIN
	-- Bloco IF que confirmará o tipo de operação INSERT.
	IF (TG_OP = 'INSERT') THEN
	    INSERT INTO historico_agendamento (tipo_alteracao, 
	                                       data_alteracao, 
	                                       hora_alteracao,
					       cod_agendamento,
					       cod_evento,
					       cod_tipo,
					       data,
					       usuario,
					       status,
					       hora_ini_plan,
					       hora_fim_plan,
					       hora_ini_real,
					       hora_fim_real) 
				       VALUES ('INSERT', 
				               current_date,
				               current_time,
				               new.cod,
				               new.cod_evento,
					       new.cod_tipo,
					       new.data,
					       new.usuario,
					       new.status,
					       new.hora_ini_plan,
					       new.hora_fim_plan,
					       new.hora_ini_real,
					       new.hora_fim_real);
					       
	    RETURN NEW;
	    
	-- Aqui temos um bloco IF que confirmará o tipo de operação UPDATE.
	ELSIF (TG_OP = 'UPDATE') THEN
	    INSERT INTO historico_agendamento (tipo_alteracao, 
	                                       data_alteracao, 
	                                       hora_alteracao,
					       cod_agendamento,
					       cod_evento,
					       cod_tipo,
					       data,
					       usuario,
					       status,
					       hora_ini_plan,
					       hora_fim_plan,
					       hora_ini_real,
					       hora_fim_real) 
				       VALUES ('UPDATE', 
				               current_date,
				               current_time,
				               old.cod,
				               old.cod_evento,
					       old.cod_tipo,
					       old.data,
					       old.usuario,
					       old.status,
					       old.hora_ini_plan,
					       old.hora_fim_plan,
					       old.hora_ini_real,
					       old.hora_fim_real);
	    RETURN old;

	-- Aqui temos um bloco IF que confirmará o tipo de operação DELETE
	ELSIF (TG_OP = 'DELETE') THEN
	    INSERT INTO historico_agendamento (tipo_alteracao, 
	                                       data_alteracao, 
	                                       hora_alteracao,
					       cod_agendamento,
					       cod_evento,
					       cod_tipo,
					       data,
					       usuario,
					       status,
					       hora_ini_plan,
					       hora_fim_plan,
					       hora_ini_real,
					       hora_fim_real) 
				       VALUES ('DELETE', 
				               current_date,
				               current_time,
				               old.cod,
				               old.cod_evento,
					       old.cod_tipo,
					       old.data,
					       old.usuario,
					       old.status,
					       old.hora_ini_plan,
					       old.hora_fim_plan,
					       old.hora_ini_real,
					       old.hora_fim_real);
	    RETURN OLD;
	END IF;
	RETURN NULL;
END;
$BODY$ LANGUAGE plpgsql;


--Trigger trigger_historico_agendamento

CREATE TRIGGER trigger_historico_agendamento
AFTER INSERT OR UPDATE OR DELETE ON agendamento_tarefa
FOR EACH ROW
EXECUTE PROCEDURE historico_agendamento_function();

-- Function historico de eventos
CREATE OR REPLACE FUNCTION historico_eventos_function()
RETURNS trigger AS $BODY$
BEGIN
	-- Bloco IF que confirmará o tipo de operação INSERT.
	IF (TG_OP = 'INSERT') THEN
	    INSERT INTO historico_evento      (tipo_alteracao, 
                                               data_alteracao,  
                                               hora_alteracao,  
                                               cod_evento,      
                                               cod_fornecedor,  
                                               data,            
                                               hora,             
                                               tipo,            
                                               diretorio_serv,  
                                               valor_contratado,
                                               status) 
				       VALUES ('INSERT', 
				               current_date,
				               current_time,
				               new.cod,      
                                               new.cod_fornecedor,  
                                               new.data,            
                                               new.hora,            
                                               new.tipo,            
                                               new.diretorio_serv,  
                                               new.valor_contratado,
                                               new.status);
					       
	    RETURN NEW;
	    
	-- Aqui temos um bloco IF que confirmará o tipo de operação UPDATE.
	ELSIF (TG_OP = 'UPDATE') THEN
	    INSERT INTO historico_evento      (tipo_alteracao, 
                                               data_alteracao,  
                                               hora_alteracao,  
                                               cod_evento,      
                                               cod_fornecedor,  
                                               data,            
                                               hora,             
                                               tipo,            
                                               diretorio_serv,  
                                               valor_contratado,
                                               status) 
				       VALUES ('UPDATE', 
				               current_date,
				               current_time,
				               old.cod,      
                                               old.cod_fornecedor,  
                                               old.data,            
                                               old.hora,            
                                               old.tipo,            
                                               old.diretorio_serv,  
                                               old.valor_contratado,
                                               old.status);
	    RETURN old;

	-- Aqui temos um bloco IF que confirmará o tipo de operação DELETE
	ELSIF (TG_OP = 'DELETE') THEN
	    INSERT INTO historico_evento      (tipo_alteracao, 
                                               data_alteracao,  
                                               hora_alteracao,  
                                               cod_evento,      
                                               cod_fornecedor,  
                                               data,            
                                               hora,             
                                               tipo,            
                                               diretorio_serv,  
                                               valor_contratado,
                                               status) 
				       VALUES ('DELETE', 
				               current_date,
				               current_time,
				               old.cod,      
                                               old.cod_fornecedor,  
                                               old.data,            
                                               old.hora,            
                                               old.tipo,            
                                               old.diretorio_serv,  
                                               old.valor_contratado,
                                               old.status);
	    RETURN old;	    RETURN OLD;
	END IF;
	RETURN NULL;
END;
$BODY$ LANGUAGE plpgsql;


--Trigger trigger_historico_evento

CREATE TRIGGER trigger_historico_evento
AFTER INSERT OR UPDATE OR DELETE ON evento_servico
FOR EACH ROW
EXECUTE PROCEDURE historico_eventos_function();


--------------------------------------------------
-- Valida CPF/CNPJ

--- Função para validar CPF/CNPJ - Esta função é chamada pela função valida_CPF();
-- https://eacshm.wordpress.com/2010/08/25/funcao-para-validar-cpfcnpj-postgresql/
CREATE OR REPLACE FUNCTION fn_cnpj_cpf(text)
  RETURNS boolean AS
$BODY$
DECLARE
 v_string text := $1;
 v_caldv1 int4;
 v_caldv2 int4;
 v_dv1 int4;
 v_dv2 int4;
 v_array1 text[] ;
 v_array2 text[] ;
 v_tst_string int4;
BEGIN
 v_string := translate(v_string, './-', '');
 IF (char_length(v_string)::int4) = 14 THEN

  SELECT INTO v_array1 '{5,4,3,2,9,8,7,6,5,4,3,2}';
  SELECT INTO v_array2 '{6,5,4,3,2,9,8,7,6,5,4,3,2}';
  v_dv1 := (substring(v_string, 13, 1))::int4;
  v_dv2 := (substring(v_string, 14, 1))::int4;
  /* COLETA DIG VER 1 CNPJ */
  v_caldv1 := 0;
  FOR va IN 1..12 LOOP
   v_caldv1 := v_caldv1 + ((SELECT substring(v_string, va, 1))::int4 * (v_array1[va]::int4));
  END LOOP;
  v_caldv1 := v_caldv1 % 11;
   IF (v_caldv1 = 0) OR (v_caldv1 = 1) THEN
    v_caldv1 := 0;
   ELSE
    v_caldv1 := 11 - v_caldv1;
   END IF;
  /* COLETA DIG VER 2 CNPJ */
  v_caldv2 := 0;
  FOR va IN 1..13 LOOP
   v_caldv2 := v_caldv2 + ((SELECT substring(v_string || v_caldv1::text, va, 1))::int4 * (v_array2[va]::int4));
  END LOOP;
  v_caldv2 := v_caldv2 % 11;
   IF (v_caldv2 = 0) OR (v_caldv2 = 1) THEN
    v_caldv2 := 0;
   ELSE
    v_caldv2 := 11 - v_caldv2;
   END IF;
  /* TESTA */
  IF (v_caldv1 = v_dv1) AND (v_caldv2 = v_dv2) THEN
   RETURN TRUE;
  ELSE
   RETURN FALSE;
  END IF;

 ELSIF (char_length(v_string)::int4) = 11 THEN

  v_dv1 := (substring(v_string, 10, 1))::int4;
  v_dv2 := (substring(v_string, 11, 1))::int4;
  v_string := substring(v_string, 1, 9);
  /* COLETA DIG VER 1 CPF */
  v_caldv1 := 0;
  FOR va IN 1..9 LOOP
   v_caldv1 := v_caldv1 + ((SELECT substring(v_string, va, 1))::int4 * (11 - va));
  END LOOP;
  v_caldv1 := v_caldv1 % 11;
  IF (v_caldv1 = 0) OR (v_caldv1 = 1) THEN
   v_caldv1 := 0;
  ELSE
   v_caldv1 := 11 - v_caldv1;
  END IF;
  /* COLETA DIG VER 2 CPF */
  v_caldv2 := 0;
  FOR va IN 1..10 LOOP
   v_caldv2 := v_caldv2 + ((SELECT substring((v_string || v_caldv1::text), va, 1))::int4 * (12 - va));
  END LOOP;
  v_caldv2 := v_caldv2 % 11;
  IF (v_caldv2 = 0) OR (v_caldv2 = 1) THEN
   v_caldv2 := 0;
  ELSE
   v_caldv2 := 11 - v_caldv2;
  END IF;
  /* TESTA */
  IF (v_caldv1 = v_dv1) AND (v_caldv2 = v_dv2) THEN
   RETURN TRUE;
  ELSE
   RETURN FALSE;
  END IF;

 END IF;

RETURN FALSE;
END;

$BODY$
  LANGUAGE 'plpgsql' IMMUTABLE
  COST 100; 

-- 

--Função validar o CPF/CNPJ - esta função é chamada pela Tigger!
CREATE OR REPLACE FUNCTION testa_natur_jur()
RETURNS trigger AS $BODY$
BEGIN
	
	IF  (new.natureza_jur = 'F') THEN
	        -- Testa CPF
		IF (select fn_cnpj_cpf(new.cpf)) IS FALSE THEN
		    RAISE EXCEPTION 'CPF inválido';

		ELSIF (select fn_cnpj_cpf(new.cpf)) IS TRUE THEN
		    RETURN NEW;
		END IF;
		
	ELSIF (new.natureza_jur = 'J') THEN
	        -- Testa CNPJ
		IF (select fn_cnpj_cpf(new.cnpj)) IS FALSE THEN
		    RAISE EXCEPTION 'CNPJ inválido';

		ELSIF (select fn_cnpj_cpf(new.cnpj)) IS TRUE THEN
		    RETURN NEW;
		END IF;
		
	END IF;
	RETURN NEW;
END;
$BODY$ LANGUAGE plpgsql;

--

-- Trigger Valida CPF/CNPJ da tabela Pessoa
CREATE TRIGGER trigger_valida_CPF_CNPJ
BEFORE INSERT OR UPDATE ON pessoa
FOR EACH ROW
EXECUTE PROCEDURE valida_cpf();

