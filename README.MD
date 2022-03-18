# Place to learn

Uma iniciativa da Place TI. Uma vez por mês os funcionários da área de desenvolvimento e afins são reunidos
para compartilhar seus conhecimentos. Esse mês a aula foi sobre Spring.

# Requisitos:

- Apache Tomcat 9.0.x

# Rodando o projeto

Execute o comando `.\gradlew build` na raíz do projeto. Um arquivo `app.war` será gerado no caminho
`app/build/libs`. Basta copiar o arquivo para a pasta `webapps` do seu Tomcat. Depois basta iniciar o tomcat
usando o script `bin/startup.bat` e o servidor estará disponível em `localhost:8080`.

# API

## `GET /app/message`
retorna uma lista com mensagens salvas.

## `GET /app/message/{id}`
- id: id da mensagem

Busca uma mensagem pelo id.

## `POST /app/message`

### body:
```json
{
  "message": "..." 
}
```

Cria uma mensagem pelo id

## `PUT /app/message/{id}`
- id: id da mensagem

### body:
```json
{
  "message": "..." 
}
```

Atualiza uma mensagem pelo id.

## `DELETE /app/message/{id}`
- id: id da mensagem
Deleta uma mensagem pelo id.