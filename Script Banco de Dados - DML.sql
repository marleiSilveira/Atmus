-- País - 
insert into pais (pais) values('Brasil');

commit;

select * from pais;

-- Estado - todos os estados brasileiros
insert into estado (estado, UF, cod_pais) values ('Acre', 'AC', 1);
insert into estado (estado, UF, cod_pais) values ('Alagoas','AL', 1);
insert into estado (estado, UF, cod_pais) values ('Amazonas','AM', 1);
insert into estado (estado, UF, cod_pais) values ('Amapá','AP', 1);
insert into estado (estado, UF, cod_pais) values ('Bahia','BA', 1);
insert into estado (estado, UF, cod_pais) values ('Ceará','CE', 1);
insert into estado (estado, UF, cod_pais) values ('Distrito Federal','DF', 1);
insert into estado (estado, UF, cod_pais) values ('Espírito Santo','ES', 1);
insert into estado (estado, UF, cod_pais) values ('Goiás','GO', 1);
insert into estado (estado, UF, cod_pais) values ('Maranhão','MA', 1);
insert into estado (estado, UF, cod_pais) values ('Mato Grosso','MT', 1);
insert into estado (estado, UF, cod_pais) values ('Mato Grosso do Sul','MS', 1);
insert into estado (estado, UF, cod_pais) values ('Minas Gerais','MG', 1);
insert into estado (estado, UF, cod_pais) values ('Pará','PA', 1);
insert into estado (estado, UF, cod_pais) values ('Paraíba','PB', 1);
insert into estado (estado, UF, cod_pais) values ('Paraná','PR', 1);
insert into estado (estado, UF, cod_pais) values ('Pernambuco','PE', 1);
insert into estado (estado, UF, cod_pais) values ('Piauí','PI', 1);
insert into estado (estado, UF, cod_pais) values ('Rio de Janeiro','RJ', 1);
insert into estado (estado, UF, cod_pais) values ('Rio Grande do Norte','RN', 1);
insert into estado (estado, UF, cod_pais) values ('Rio Grande do Sul','RS', 1);
insert into estado (estado, UF, cod_pais) values ('Rondônia','RO', 1);
insert into estado (estado, UF, cod_pais) values ('Roraima','RR', 1);
insert into estado (estado, UF, cod_pais) values ('Santa Catarina','SC', 1);
insert into estado (estado, UF, cod_pais) values ('São Paulo','SP', 1);
insert into estado (estado, UF, cod_pais) values ('Sergipe','SE', 1);
insert into estado (estado, UF, cod_pais) values ('Tocantins','TO', 1);

commit;

select * from estado;

select E.cod, E.estado, E.UF, P.pais 
  from estado E, pais P 
 where E.cod_pais = P.cod; 

-- Cidade 
insert into cidade (cidade, CEP, cod_estado) values ('Witmarsum','89157-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Saudades','89868-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Schroeder','89275-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Serra Alta','89871-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Siderópolis','88860-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Sombrio','88960-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Sorocaba do Sul','88170-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Sul Brasil','89855-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Taquara Verde','89513-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Taquaras','88474-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Tigipió','88245-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Tigrinhos','89875-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Tijucas','88200-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Timbé do Sul','88940-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Timbó','89120-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Timbó Grande','89545-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('São João do Itaperiú','88395-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('São João do Oeste','89897-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('São João do Sul','88970-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('São Joaquim','88600-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('São Bento Baixo','88867-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('São Bernardino','89982-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('São Bonifácio','88485-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('São Carlos','89885-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('São Cristóvão','89495-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('São Cristóvão do Sul','89533-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('São Domingos','89835-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('São Francisco do Sul','89240-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('São Gabriel','88712-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Santa Lúcia','89664-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Rio do Oeste','89180-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Rio dos Bugres','88403-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Rio dos Cedros','89121-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Rio Fortuna','88760-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Riqueza','89895-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Rodeio','89136-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Romelândia','89908-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Sai','89243-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Salete','89196-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Saltinho','89981-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Salto Veloso','89595-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Sangão','88717-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Santa Cecília','89540-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Santa Cruz do Timbó','89410-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Santa Helena','89915-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Santa Izabel','88620-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Rio do Campo','89198-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Prata','89904-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Santa Terezinha','89199-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('São João Batista','88240-000', 24);
insert into cidade (cidade, CEP, cod_estado) values ('Pomerode','89107-000', 24);

commit;

select * from cidade;

select C.cidade, C.CEP, E.Estado, P.Pais 
  from cidade C, estado E, pais P
 where C.cod_estado = E.cod
  and  E.cod_pais = P.cod;


-- Endereço 
insert into endereco (CEP, logradouro, numero_resid, bairro, cod_cidade, complemento) values ('', 'Rua Paulo Zimmermann', 102, 'Centro', 51, 'apartamento 1');
insert into endereco (CEP, logradouro, numero_resid, bairro, cod_cidade, complemento) values ('', 'Rua Luiz Abry', 1521, 'Centro', 51,'Loja 1');
insert into endereco (CEP, logradouro, numero_resid, bairro, cod_cidade, complemento) values ('', 'Rua 15 de novembro', 3254, 'Centro', 51, 'Loja 1');


commit;

select * from endereco;

select L.cep, L.logradouro, L.numero_resid, L.bairro, L.cod_cidade, L.complemento, C.cidade, C.CEP, E.Estado, P.Pais 
  from endereco L, cidade C, estado E, pais P
 where L.cod_cidade = C.cod
  and C.cod_estado = E.cod
  and  E.cod_pais = P.cod;


-- Pessoa
insert into pessoa (nome, natureza_jur, cnpj, cpf, rg, cod_endereco) values ('Ivan J. Borchardt', 'F', '', '004.742.879-12', '4.047.616', 3);   
insert into pessoa (nome, natureza_jur, cnpj, cpf, rg, cod_endereco) values ('Buffet de casamentos', 'J', '10.945.519.0001-04', '', '', 3);   
insert into pessoa (nome, natureza_jur, cnpj, cpf, rg, cod_endereco) values ('Eletronica XLS', 'J', '10.945.519.0001-04', '', '', 4);
insert into pessoa (nome, natureza_jur, cnpj, cpf, rg, cod_endereco) values ('Testo Filmagens', 'J', '10.945.519.0001-04', '', '', 5);  
insert into pessoa (nome, natureza_jur, cnpj, cpf, rg, cod_endereco) values ('Angel Foto', 'J', '10.945.519.0001-04', '', '', 3);   
insert into pessoa (nome, natureza_jur, cnpj, cpf, rg, cod_endereco) values ('Kai Hendrick', 'F', '', '000.000.000.00', '', 3);
insert into pessoa (nome, natureza_jur, cnpj, cpf, rg, cod_endereco) values ('Marlei M.S.B.', 'F', '', '000.000.000.00', '', 3);


commit;

select * from pessoa;

select N.nome, N.natureza_jur, N.cnpj, N.cpf, N.rg,
       L.cep, L.logradouro, L.numero_resid, L.bairro, L.cod_cidade, L.complemento, C.cidade, C.CEP, E.Estado, P.Pais 
  from pessoa N, endereco L, cidade C, estado E, pais P
 where N.cod_endereco = L.cod 
  and L.cod_cidade = C.cod
  and C.cod_estado = E.cod
  and  E.cod_pais = P.cod;


-- Tipo de contato

insert into tipo_contato (tipo, mascara) values('E-mail', '*#@*#');
insert into tipo_contato (tipo, mascara) values('Telefone', '(##)####-####');
insert into tipo_contato (tipo, mascara) values('Celular', '(##)####-####');
insert into tipo_contato (tipo, mascara) values('Whatsapp', '(##)####-####');
insert into tipo_contato (tipo, mascara) values('Facebook', 'facebook\*#');
insert into tipo_contato (tipo, mascara) values('Skype', 'skype\*#');


select * from tipo_contato; 

-- Contato

insert into contato (cod_pessoa, tipo, id, forma_pref) values (4, 1, 'ivan.borchardt@fotoangel.com.br', true); 
insert into contato (cod_pessoa, tipo, id) values (4, 2, '(47)3387-6236');
insert into contato (cod_pessoa, tipo, id) values (4, 4, '(47)99121-5872');

select * from contato; 

select P.nome, T.tipo, C.id, C.forma_pref
  from contato C, tipo_contato T, pessoa P
 where C.cod_pessoa = P.cod
   and C.tipo = T.cod;    

-- Tipo Fornecedor 

insert into tipo_fornecedor(tipo) values ('Prestador de serviços – Fotografia');
insert into tipo_fornecedor(tipo) values ('Parceiro comercial – Filmagem');
insert into tipo_fornecedor(tipo) values ('Parceiro comercial – DJ');
insert into tipo_fornecedor(tipo) values ('Parceiro comercial – Decoração');
insert into tipo_fornecedor(tipo) values ('Fornecedor materiais fotográficos');
insert into tipo_fornecedor(tipo) values ('Fornecedor equipamentos fotográficos');
insert into tipo_fornecedor(tipo) values ('Prestador de serviços - Manutenção Equipamentos');
insert into tipo_fornecedor(tipo) values ('Local de eventos');

select * from tipo_fornecedor;

-- Fornecedor

insert into fornecedor (cod_pessoa, tipo, comentarios) values (4, 1, 'Fotógrafo de Casamentos, Newborn, Casais');
insert into fornecedor (cod_pessoa, tipo, comentarios) values (9, 8, 'Restaurante tipico alemão; Ambiente para 100 pessoas; Não é possivel usar iluminação cênica');
insert into fornecedor (cod_pessoa, tipo, comentarios) values (10, 7, 'Especialista Canon e Nikon');
insert into fornecedor (cod_pessoa, tipo, comentarios) values (7, 2, 'Fotógrafo de Casamentos, Newborn, Casais');

select * from fornecedor; 


-- Cliente
insert into cliente (cod_pessoa, data_nasc, sexo, comentarios) values (4, '02/02/1982', 'M', 'Gosta de fotos PeB'); 
insert into cliente (cod_pessoa, data_nasc, sexo, comentarios) values (12, '27/07/1983', 'F', ''); 
insert into cliente (cod_pessoa, data_nasc, sexo, comentarios) values (6, '15/10/2018', 'M', ''); 

select * from cliente;

-- Tipo de Relacionamento
insert into tipo_relacionamento (tipo) values('Cônjuge');
insert into tipo_relacionamento (tipo) values('Filho(a)');
insert into tipo_relacionamento (tipo) values('Pai/Mãe');
insert into tipo_relacionamento (tipo) values('Avô(ó)');
insert into tipo_relacionamento (tipo) values('Amigo(a)');
insert into tipo_relacionamento (tipo) values('None');


select * from tipo_relacionamento; 


-- Relacionamentos dos clientes
insert into relacionamentos_cliente (cod_cliente_A, cod_cliente_B, cod_tipo_relacionamento_AB, cod_tipo_relacionamento_BA) values (1, 2, 1, 1);
insert into relacionamentos_cliente (cod_cliente_A, cod_cliente_B, cod_tipo_relacionamento_AB, cod_tipo_relacionamento_BA) values (3, 2, 2, 3);
insert into relacionamentos_cliente (cod_cliente_A, cod_cliente_B, cod_tipo_relacionamento_AB, cod_tipo_relacionamento_BA) values (1, 3, 3, 2);

select * from relacionamentos_cliente;



select distinct PA.nome, ' é ', RAB.tipo, ' de ', PB.nome, ' é ',RBA.tipo, ' de ' ,PA.nome
  from relacionamentos_cliente A,
       relacionamentos_cliente B,
       tipo_relacionamento RAB,
       tipo_relacionamento RBA, 
       cliente CA,
       cliente CB, 
       pessoa PA,
       pessoa PB
 where CA.cod_pessoa = PA.cod
   and CB.cod_pessoa = PB.cod
   and A.cod_cliente_A = CA.cod
   and A.cod_cliente_B = CB.cod
   and A.cod_tipo_relacionamento_AB = RAB.cod
   and A.cod_tipo_relacionamento_BA = RBA.cod;


-- Evento ou Serviço Agendado

insert into evento_servico (cod_fornecedor, data, hora, tipo, diretorio_serv, valor_contratado, status) values (2, '15/12/2018', '12:00:00', 'Casamento', 'C:\backup\001', 3500.00, 'Reservado');
insert into evento_servico (cod_fornecedor, data, hora, tipo, diretorio_serv, valor_contratado, status) values (2, '25/12/2018', '17:00:00', 'Natal', 'C:\backup\001', 3500.00, 'Reservado');
update evento_servico set data = '13/06/2019' where cod = 3;
DELETE FROM  evento_servico WHERE COD =3;



select * from evento_servico; 
select * from historico_evento;

-- Evento-Cliente  

insert into evento_cliente (cod_evento, cod_cliente) values (1, 1); 



-- Pacote de Serviços 

insert into pacote_servicos (nome, descricao, observacoes, valor_pacote) values ('Standart Wedding', 'Pacote de entrada para casamentos', '', 850.00);
insert into pacote_servicos (nome, descricao, observacoes, valor_pacote) values ('Prime Wedding', 'Pacote mediano para casamento', '', 1500.00);
insert into pacote_servicos (nome, descricao, observacoes, valor_pacote) values ('Diamont Wedding', 'Pacote top para casamento', '', 3500.00);

select * From pacote_servicos;

-- Itens avulsos 

insert into prod_serv (cod_fornecedor, descricao, observacoes, preco_custo, preco_venda) values (1, 'Album encadernado', '', 350.00, 750.00);
insert into prod_serv (cod_fornecedor, descricao, observacoes, preco_custo, preco_venda) values (1, 'Cobertura 8h', '', 500.00, 750.00);
insert into prod_serv (cod_fornecedor, descricao, observacoes, preco_custo, preco_venda) values (1, 'Cobertura 4h', '', 260.00, 435.00);
 
-- Tipo Agendamento 

insert into tipo_agendamento (descricao, tempo_medio, margem_seguranca, hora_ini_suger, hora_fim_suger, justific_period ) values ('Reunião Briefing', '1:30:00', 10.0, '18:00:00', '21:00:00', 'Periodo de menor movimento e mais aderente a agenda do cliente');
insert into tipo_agendamento (descricao, tempo_medio, margem_seguranca, hora_ini_suger, hora_fim_suger, justific_period ) values ('Ensaio Externo', '2:30:00', 10.0, '15:00:00', '16:30:00', 'Hora de ouro para a fotografia externa');
insert into tipo_agendamento (descricao, tempo_medio, margem_seguranca, hora_ini_suger, hora_fim_suger, justific_period ) values ('Backup de arquivos', '00:30:00', 10.0, '18:00:00', '21:00:00', 'Periodo de menor movimento');

-- Status

insert into status_tarefa (status) values ('Em aberto');
insert into status_tarefa (status) values ('Em trabalho');
insert into status_tarefa (status) values ('Aguardando cliente');
insert into status_tarefa (status) values ('Aguardando fornecedor');
insert into status_tarefa (status) values ('Concluído');
insert into status_tarefa (status) values ('Suspenso'); 

select * from status_tarefa;

-- Agendamento de tarefa 

insert into agendamento_tarefa (cod_evento, cod_tipo, data, status, hora_ini_plan, hora_fim_plan) values (1, 1, '26/07/2018', 4, '19:00:00', '20:30:00');
update agendamento_tarefa set status = 6 where cod = 2;
DELETE FROM  agendamento_tarefa WHERE COD =2;


select * from agendamento_tarefa; 
select * from historico_agendamento; 



