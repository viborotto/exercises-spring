# ToDo Tasks

- [ ] Produto
- [ ] Usuario

## Exercício de Spring Web e Spring Data

## Produto

### POST /produto
- [X]
Cria um produto no sistema.

**Request Body**

```json
{
    "nome": "Poupança",
    "preco": 0.005,
    "proprietario": "" 
}
```

**Response 200**

```json
{
    "id": 1,
    "nome": "Poupança",
    "preco": 0.005,
    "proprietario": "" 
}
```

### GET /produtos
- [X]
Exibe a lista de produtos no sistema.

**Response 200**

```json
[
    {
        "id": 1,
        "nome": "Poupança",
        "preco": 0.005,
        "proprietario": "" 
    },
    {
        "id": 2,
        "nome": "Poupança",
        "preco": 0.005,
        "proprietario": "" 
    },
    {
        "id": 3,
        "nome": "Poupança",
        "preco": 0.005,
        "proprietario": "" 
    }
]
```

## Usuario

### GET /usuario/ {id}

Exibe os dados de um cliente.

**Response 200**

```json
{
    "id": 1,
    "nome": "José da Silva",
    "email": "vittoria@gmail.com"
}
```

**Response 403**

### POST /cliente

Cadastra um novo cliente no sistema.

**Request Body**

```json
{
    "nome": "José da Silva",
    "email": "vittoria@gmail.com"
}
```

**Response 201**

```json
{
    "id": 1,
    "nome": "José da Silva",
    "email": "vittoria@gmail.com"
}
```

### PUT /cliente/ {id}

Atualiza os dados de um cliente.

**Request Body**

```json
{
    "nome": "José da Silva",
    "email": "vittoria@gmail.com"
}
```

**Response 200**

```json
{
    "nome": "José da Silva",
    "email": "vittoria@gmail.com"
}
```

```
