# ToDo Tasks
- [X] Produto
- [ ] Cliente
- [ ] Aplicação

## Exercício de Spring Web e Spring Data

## Produto

### POST /produto
Cria um produto no sistema.

**Request Body**
```json
{
    "nome": "Poupança",
    "rendimento": 0.005
}
```

**Response 200**
```json
{
    "id": 1,
    "nome": "Poupança",
    "rendimento": 0.005
}
```

### GET /produtos
Exibe a lista de produtos no sistema.

**Response 200**
```json
[
    {
        "id": 1,
        "nome": "Poupança",
        "rendimento": 0.005
    },
    {
        "id": 2,
        "nome": "CDB",
        "rendimento": 0.007
    },
    {
        "id": 3,
        "nome": "Fundos",
        "rendimento": 0.008
    }
]
```

## Cliente

### GET /cliente/{id}
Exibe os dados de um cliente.

**Response 200**
```json
{
    "id": 1,
    "nome": "José da Silva",
    "cpf": "312.412.534-56",
}
```

**Response 403**

### POST /cliente
Cadastra um novo cliente no sistema.

**Request Body**
```json
{
    "nome": "José da Silva",
    "cpf": "312.412.534-56"
}
```

**Response 201**
```json
{
    "id": 1,
    "nome": "José da Silva",
    "cpf": "312.412.534-56",
}
```

### PUT /cliente/{id}
Atualiza os dados de um cliente. 

**Request Body**
```json
{
    "nome": "José da Silva",
    "cpf": "312.412.534-56"
}
```
**Response 200**
```json
{
    "nome": "José da Silva",
    "cpf": "312.412.534-56",
}
```


## Aplicacao

### POST /cliente/{id}/aplicar

**Request Body**
```json
{
    "produto": 1
    "valor": 10000.00,
    "meses": 24
}
```
**Response 200**
```json
{
    "id": 1,
    "produto": {
        "id": 2,
        "nome": "CDB",
        "rendimento": 0.007
    },
    "valor": 10000.00,
    "meses": 24
}
```

### GET /cliente/{id}/aplicacoes
```json
[
    {
        "id": 1,
        "produto": {
            "id": 2,
            "nome": "CDB",
            "rendimento": 0.007
        },
        "valor": 10000.00,
        "meses": 24
    },
    {
        "id": 1,
        "produto": {
            "id": 1,
            "nome": "Poupança",
            "rendimento": 0.005
        },
        "valor": 1000.00,
        "meses": 12
    }
]
```

