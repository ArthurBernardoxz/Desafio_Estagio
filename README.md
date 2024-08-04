# Documentação do Projeto de API REST com Spring Boot

## Introdução

Este projeto é uma API REST simples construída com Spring Boot, que calcula o imposto de renda com base no salário fornecido. A implementação inclui um serviço que contém a lógica de cálculo do imposto e um controlador que define o endpoint para realizar essa operação.

## Estrutura do Projeto

O projeto está organizado em pacotes com as seguintes responsabilidades:

- **service**: Contém a lógica de negócio.
- **controller**: Define os endpoints da API.

## Implementação

### Serviço: ImpostoService

A classe `ImpostoService` contém a lógica para calcular o imposto de renda com base no salário fornecido. A lógica é implementada usando uma sequência de condicionais (if-else) para determinar a faixa de imposto aplicável e calcular o valor correspondente.

```java
package estrutura.service;

import org.springframework.stereotype.Service;

@Service
public class ImpostoService {
    public double calcularImposto(double salario) {
        double imposto;
        if (salario < 22847.76) {
            imposto = 0;
        } else if (salario < 33919.80) {
            imposto = (salario * 0.075) - 1713.58;
        } else if (salario < 45012.60) {
            imposto = (salario * 0.15) - 4257.57;
        } else if (salario < 55976.16) {
            imposto = (salario * 0.225) - 7633.51;
        } else {
            imposto = (salario * 0.275) - 10432.32;
        }
        return imposto;
    }
}
```

### Controlador: ImpostoController

A classe `ImpostoController` define o endpoint `/api/imposto/calcular` que recebe um salário via requisição POST e retorna o valor do imposto calculado.

```java
package estrutura.controller;

import estrutura.service.ImpostoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/imposto")
public class ImpostoController {
    @Autowired
    private ImpostoService service;

    @PostMapping("/calcular")
    public ResponseEntity<Double> getImposto(@RequestBody Double salario) {
        double result = service.calcularImposto(salario);
        return ResponseEntity.ok(result);
    }
}
```

### Dificuldades e Soluções

1. **Entendimento do Spring Boot**: Inicialmente, tive dificuldade em entender como configurar e utilizar o Spring Boot, o que me levou a gastar mais tempo pesquisando do que implementando a prática.
2. **Lógica de Cálculo do Imposto**: Compreendi que a lógica de cálculo do imposto deveria ser implementada no serviço (`ImpostoService`). A lógica foi baseada em condicionais para determinar a faixa de imposto correta e calcular o valor a ser pago.
3. **Tipos de Dados**: Foi necessário alterar o tipo da variável imposto e do valor recebido para `Double`, pois estavam ocorrendo erros de tipo durante as operações de cálculo.
4. **Problemas de Acesso ao Servidor**: Ao tentar acessar o Swagger UI em `http://localhost:8080/swagger-ui/html`, encontrei um erro. A URL correta é `http://localhost:8080/swagger-ui/index.html`.
