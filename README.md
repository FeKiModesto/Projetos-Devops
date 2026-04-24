# CP2 - DevOps - API de Alunos

## Descrição
API REST para CRUD de alunos, desenvolvida em Spring Boot, com MySQL containerizado, rodando em VM na Azure.

**Repositório GitHub:**  
[FeKiModesto/Projetos-Devops](https://github.com/FeKiModesto/Projetos-Devops)

---

## Endereço da API (via IP público da VM)

http://172.209.217.223:8080/alunos

---

## Como testar (via terminal, Postman ou `curl`)

### 1. Listar todos os alunos (GET)

```bash
curl http://172.209.217.223:8080/alunos
```

### 2. Buscar aluno por ID (GET)

```bash
curl http://172.209.217.223:8080/alunos/1
```

### 3. Criar novo aluno (POST)

```bash
curl -X POST http://172.209.217.223:8080/alunos \
  -H "Content-Type: application/json" \
  -d '{"name":"João Silva","cpf":"12345678900","age":30,"birthDate":"1994-05-20"}'
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
### 6. Testar com detalhes da requisição (-v)

```bash
curl -v http://172.209.217.223:8080/alunos
```

## Execução manual na VM (sem Docker Compose)

Após enviar o JAR para a VM:

### 1. Rodar a aplicação em background

```bash
nohup java -jar cp2-alunos-0.0.1-SNAPSHOT.jar > log.txt 2>&1 &
```

### 2. Acompanhar os logs em tempo real

```bash
tail -f log.txt
```

### 3. Testar a API localmente (dentro da VM)

```bash
curl -v http://localhost:8080/alunos
```
### 4. Testar a API pelo IP público (de qualquer lugar)

```bash
curl -v http://172.209.217.223:8080/alunos
```

### 5. Parar a aplicação

```bash
pkill -f cp2-alunos-0.0.1-SNAPSHOT.jar
```
## Containerização (Docker)

### Tecnologias utilizadas

- MySQL 8.0 (container)
- Aplicação Java Spring Boot (containerizada via Dockerfile)

### Arquivos (na raiz do projeto)

- Dockerfile → define imagem da aplicação Java
- docker-compose.yml → sobe MySQL + API juntos

### Subir tudo com Docker Compose (na VM ou local)

```bash
docker-compose up -d
```

### Parar todos os containers

```bash
docker-compose down
```

## Infraestrutura em Nuvem

- VM Oracle Cloud – criada conforme requisito do professor (50% da nota)
- VM Azure Cloud – rodando a aplicação + MySQL (AlmaLinux 10)

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

- VM na Oracle criada
- VM na Azure com MySQL containerizado
- API Spring Boot conectando ao banco remoto
- CRUD funcionando via IP público
- Código versionado no GitHub
- README com instruções completas
- Dockerfile e docker-compose (prontos para uso/complementares)

# Autor

Felipe Kirschner Modesto – RM561810
