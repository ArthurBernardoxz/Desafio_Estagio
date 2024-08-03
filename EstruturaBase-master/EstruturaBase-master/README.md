## Estrutura Base para API REST com Spring Boot

Este projeto fornece uma estrutura base para a criação de uma API REST utilizando Spring Boot. Ele inclui uma rota POST de exemplo que demonstra como configurar um endpoint simples.

## Configurando e Executando a API REST: Docker e IntelliJ IDEA

Este guia detalhado explica como configurar seu ambiente e executar a API REST de exemplo usando Docker ou diretamente no IntelliJ IDEA.

### Pré-requisitos

**Para ambas as opções (Docker e IntelliJ IDEA):**

* **Java Development Kit (JDK 11):** Certifique-se de ter o JDK 11 instalado em sua máquina. Você pode baixá-lo em [https://www.oracle.com/java/technologies/downloads/archive/](https://www.oracle.com/java/technologies/downloads/archive/).

**Para usar Docker:**

* **Docker:** Certifique-se de ter o Docker instalado em sua máquina. Você pode baixá-lo em [https://www.docker.com/products/docker-desktop](https://www.docker.com/products/docker-desktop).

**Para usar IntelliJ IDEA:**

* **IntelliJ IDEA:** Baixe e instale a versão Community ou Ultimate do IntelliJ IDEA em [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/).
* **Maven:** O Maven geralmente já vem integrado ao IntelliJ. Caso contrário, você pode baixá-lo em [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi) e configurá-lo no IntelliJ.

### Passo 1: Preparando o Código Fonte

1. **Copiar o Código:** Copie todos os arquivos de código fornecidos para um diretório em sua máquina.

### Passo 2: Escolhendo seu Método de Execução

Escolha o método que você prefere para executar a API REST:

**Opção 1: Usando Docker**

1. **Construindo a Imagem Docker:**
    * **Via Linha de Comando:** Navegue até o diretório raiz do projeto e execute `docker build -t nome-da-imagem .`.
    * **Via IntelliJ IDEA (opcional):**
        * Abra o projeto no IntelliJ.
        * Configure o plugin do Docker (se necessário).
        * Crie uma configuração de execução do tipo "Docker Image" e especifique o caminho para o `Dockerfile`.
        * Execute a configuração para construir a imagem.

2. **Executando a Aplicação em um Container:**
    * **Via Linha de Comando:** Execute `docker run -p 8080:8080 nome-da-imagem`.
    * **Via IntelliJ IDEA (opcional):**
        * Crie uma configuração de execução do tipo "Docker Run" e selecione a imagem construída.
        * Execute a configuração para iniciar o container.

3. **Parando o Container:**
    * **Via Linha de Comando:** Use `docker ps` para encontrar o ID do container e execute `docker stop <ID_DO_CONTAINER>`.
    * **Via IntelliJ IDEA (opcional):** Pare o container no painel "Services".

**Opção 2: Usando IntelliJ IDEA**

1. **Importando o Projeto:**
    * Abra o IntelliJ IDEA e importe o projeto usando o arquivo `pom.xml`.
    * Configure o Maven no IntelliJ, se necessário.

2. **Construindo o Projeto:**
    * Abra a janela do Maven (View > Tool Windows > Maven).
    * Expanda o projeto, clique em "Lifecycle" e dê um duplo clique em "package".

3. **Executando a Aplicação:**
    * Crie uma configuração de execução do tipo "Application".
    * Especifique a classe principal da sua aplicação.
    * Execute a configuração para iniciar a aplicação.

4. **Parando a Aplicação:**
    * Clique no botão vermelho "Stop" na barra de ferramentas inferior do IntelliJ IDEA.

### Acessando a Aplicação

Após iniciar a aplicação (usando Docker ou IntelliJ IDEA), você pode acessá-la através da interface do Swagger:

```
http://localhost:8080/swagger-ui/html
```

Lembre-se de ajustar a porta (8080) se necessário. A interface do Swagger permite visualizar e interagir com os endpoints da sua API REST.

### Conclusão

Parabéns! Você aprendeu a configurar e executar a API REST usando Docker ou IntelliJ IDEA, e a visualizar sua documentação com o Swagger. Escolha o método que melhor se adapta às suas necessidades e comece a desenvolver! 
