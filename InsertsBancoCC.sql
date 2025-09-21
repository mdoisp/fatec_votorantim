insert into Clientes
values(19001, 'João Silva', 'Avenida das Américas', '123', 'Sala 12', 'Barra da Tijuca', 'Rio de Janeiro', 'RJ', '22640100', '(21)987654321', '55566677788', '30-11-1982', ''),
(19002, 'Ana Silva', 'Rua das flores', '153', 'Apartamento 45', 'Centro', 'São Paulo', 'SP', '01010000', '(11)987651234', '12345678900', '15-03-1990', ''),
(19003, 'João Pereira', 'Avenida Brasil', '456', 'Casa 2', 'Jardim das Américas', 'Curitiba', 'PR', '80000000', '(41)912345678', '98765432100', '22-07-1985', ''),
(19004, 'Carlos Oliveira', 'Rua São Pedro', '321', 'Cobertura', 'Vila Mariana', 'São Paulo', 'SP', '04000000', '(11)934567890', '', '05-05-1975', '12345678000190'),
(19005, 'Juliana Costa', 'Alameda dos Jacarandás', '654', 'Andar 3', 'São Luiz', 'Belo Horizonte', 'MG', '30100000', '(31)987651234', '32165498711', '10-01-1995', '')

insert into Agencias
values(19006, 'Rio Nova Barra', 'Av. das Américas', '4453', '', 'Barra da Tijuca', 'Rio de Janeiro', 'RJ', '22631004', '(55)40044828'),
(19007, 'Bela Paulista', 'Av. Paulista', '436', '', 'Bela Vista', 'São Paulo', 'SP', '01503000', '(11)32913000'),
(19008, 'Pari li', 'Praça Eduardo Rudge', '14', '', 'Pari', 'São Paulo', 'SP', '03028010', '(11)60990600'),
(19009, 'Curitiba JD das Americas', 'Av. Nossa Sra Lourdes', '63', '', 'Jardim das Américas', 'Curitiba', 'PR', '81530020', '(55)40044828'),
(19010, 'BH Alameda das Princesas', 'Alameda das Princesas', '31', '', 'São Luiz', 'Belo Horizonte', 'MG', '31270672', '(55)40044828')

insert into ContaCorrente
values(19007, 190123456, 19002, 22337.53),
(19006, 190987652, 19001, 5892.95),
(19008, 191234567, 19004, 40569.22),
(19009, 191234568, 19003, 33067.63),
(19010, 190123456, 19005, 27521.77)

insert into Usuarios
values('JoaoSilva@19', 'Senha_123', 19006, 190987652),
('AnaSilva@19', 'Senha_234', 19007, 190123456),
('JoaoPereira@19', 'Senha_345', 19009, 191234568),
('CarlosOliveira@19', 'Senha_456', 19008, 191234567),
('JulianaCosta@19', 'Senha_567', 19010, 190123456)

insert into Historicos
values(1901, 'Conta de água'),
(1902, 'Conta de energia'),
(1903, 'IPTU'),
(1904, 'Claro móvel'),
(1905, 'Internet banda larga')

insert into Movimentacao
values(19006, 190987652, GETDATE(), '190001', 'D', 1901, 'Pagamento efetuado', 90.22, 5802.73),
(19006, 190987652, GETDATE(), '190002', 'D', 1902, 'Pagamento efetuado', 205.30, 5597.43),
(19006, 190987652, GETDATE(), '190003', 'D', 1903, 'Pagamento efetuado', 180.52, 5416.91),
(19006, 190987652, GETDATE(), '190004', 'D', 1904, 'Pagamento efetuado', 30.90, 5386.01),
(19006, 190987652, GETDATE(), '190005', 'D', 1905, 'Pagamento efetuado', 130.90, 5255.11)