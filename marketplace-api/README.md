# ToDo Tasks

- [X] Produto
- [ ] Usuario

## Exercício de Spring Web e Spring Data

## Produto

### POST /produto
- [X]
Cria um produto no sistema.

**Request Body**

```json
{
    "nome": "Adesivo",
    "preco": 5.0,
    "proprietario": "null" 
}
```

**Response 201**

```json
{
    "id": 1,
    "nome": "Adesivo",
    "preco": 5.0,
    "proprietario": "null" 
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
        "nome": "Adesivo",
        "preco": 0.005,
        "proprietario": "null" 
    },
    {
        "id": 2,
        "nome": "Teclado",
        "preco": 300.00,
        "proprietario": "null" 
    },
    {
        "id": 3,
        "nome": "Relogio",
        "preco": 150.00,
        "proprietario": "null" 
    }
]
```

### DELETE /produtos/{id}
- [X]
Deleta um produto pelo ID.

**Response 200**


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
