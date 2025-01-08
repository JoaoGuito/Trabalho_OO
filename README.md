Trabalho de Orientação a Objetos (OO)

Este projeto é uma aplicação baseada em orientação a objetos para simular um sistema de caixa de supermercado. Ele utiliza Spring Boot para backend e retorna dados no formato JSON.

Funcionalidades

Cadastro de clientes e vendedores.

Registro de pedidos com itens, valores e formas de pagamento.

Listagem de produtos disponíveis para compra.

Serialização de objetos no formato JSON.

Pré-requisitos

Java 21+

Maven 3.6+

Postman ou outra ferramenta para testes de API (cURL, Insomnia, etc.)

Instalação

Clone o repositório:

git clone https://github.com/JoaoGuito/Trabalho_OO.git

Navegue até o diretório do projeto:

cd Trabalho_OO

Execute o Maven para instalar as dependências:

mvn clean install

Postman

Executando a Aplicação

mvn spring-boot:run

A aplicação estará disponível em http://localhost:8080.

Endpoints da API

POST /pedidos

Descrição: Cria um novo pedido.

Exemplo de requisição:

curl --location 'http://localhost:8080/pedidos' \
--header 'Content-Type: application/json' \
--data-raw '{
"cliente": {
"nome": "João Silva",
"cpf": "123.456.789-00",
"email": "teste@email.com"
},
"vendedor": {
"nome": "Carlos Pereira",
"cpf": "123.456.789-11",
"email": "testevendedor@email.com",
"comissao": 10.0
},
"pagamento": {
"formapagamento": "Cartão de Crédito",
"valor" : 30.00
},
"itens": [
{
"produto": {
"nome": "Teclado Mecânico",
"preco": 300.00
},
"quantidade": 2
},
{
"produto": {
"nome": "Mouse Gamer",
"preco": 150.00
},
"quantidade": 1
}
]
}'

Exemplo de retorno:

{
"id": 1,
"data": "2025-01-06",
"cliente": "João Silva",
"vendedor": "Carlos Pereira",
"total": 750.00
}

Como Testar no Postman

Abra o Postman.

Crie uma nova requisição do tipo POST para o endpoint http://localhost:8080/pedidos.

Adicione o payload JSON como no exemplo acima.

Envie a requisição e veja a resposta.

Estrutura do Projeto

src/main/java: Contém as classes do projeto (Pedido, Cliente, Produto, etc.).

src/main/resources: Arquivos de configuração do Spring Boot.

Conclusão

Este projeto demonstra os principais conceitos de orientação a objetos, como herança, polimorfismo e encapsulamento, integrados em uma aplicação prática usando Spring Boot. A aplicação é extensível e pode ser adaptada para outros contextos de negócios.

