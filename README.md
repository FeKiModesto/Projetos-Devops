# CP2 - DevOps - API de Alunos

## Descrição
API REST para CRUD de alunos, desenvolvida em Spring Boot, com MySQL containerizado, rodando em VM na Azure.

---

## Endereço da API (via IP público da VM)

http://172.209.217.223:8080/alunos

---

## Como testar (via terminal, Postman ou `curl`):

### 1. Listar todos os alunos (GET)

```bash
curl http://172.209.217.223:8080/alunos
```

### 2. Criar novo aluno (POST)

```bash
curl -X POST http://172.209.217.223:8080/alunos \
  -H "Content-Type: application/json" \
  -d '{"name":"João Silva","cpf":"12345678900","age":30,"birthDate":"1994-05-20"}'
```

### 3. Buscar aluno por ID (GET)

```bash
curl http://172.209.217.223:8080/alunos/1
```

### 4. Atualizar aluno (PUT)

```bash
curl -X PUT http://172.209.217.223:8080/alunos/1 \
  -H "Content-Type: application/json" \
  -d '{"name":"João Atualizado","cpf":"12345678900","age":31,"birthDate":"1994-05-20"}'
```

### 5. Deletar aluno (DELETE)

```bash
curl -X DELETE http://172.209.217.223:8080/alunos/1
```

## Rodando com Docker Compose (na VM)

Se quiser executar o projeto dentro da VM ou localmente, use:

```bash
docker-compose up -d --build
```

Parar os containers:

```bash
docker-compose down
```

Ver logs da API:
```bash
docker logs -f cp2-api
```
## Tecnologias utilizadas

<table style="width: 100%; border-collapse: collapse;">
  <thead>
    <tr style="border-bottom: 2px solid #30363d; text-align: left;">
      <th style="padding: 10px; width: 30%;">Camada</th>
      <th style="padding: 10px;">Tecnologia</th>
    </tr>
  </thead>
  <tbody>
    <tr style="border-bottom: 1px solid #30363d;">
      <td style="padding: 10px;"><b>Backend</b></td>
      <td style="padding: 10px;">Java 21, Spring Boot 3.2.4</td>
    </tr>
    <tr style="border-bottom: 1px solid #30363d;">
      <td style="padding: 10px;"><b>Banco de dados</b></td>
      <td style="padding: 10px;">MySQL 8.0</td>
    </tr>
    <tr style="border-bottom: 1px solid #30363d;">
      <td style="padding: 10px;"><b>Containerização</b></td>
      <td style="padding: 10px;">Docker, Docker Compose</td>
    </tr>
    <tr style="border-bottom: 1px solid #30363d;">
      <td style="padding: 10px;"><b>Cloud</b></td>
      <td style="padding: 10px;">Azure VM (AlmaLinux 10), Oracle VM</td>
    </tr>
  </tbody>
</table>

## Status do Projeto

- [x] VM na Oracle criada
- [x] VM na Azure com MySQL containerizado
- [x] API Spring Boot conectando ao banco remoto
- [x] CRUD funcionando via IP público
- [x] Código versionado no GitHub
- [x] README com instruções completas
- [x] Dockerfile e docker-compose prontos para uso

# Autor

Felipe Kirschner Modesto – RM561810
