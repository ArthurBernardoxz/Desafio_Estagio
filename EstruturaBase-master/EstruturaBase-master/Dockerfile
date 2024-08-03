# Usar a imagem base do Maven para compilar o projeto
FROM maven:3.8.5-openjdk-11 AS build

# Definir o diretório de trabalho no container
WORKDIR /app

# Copiar o arquivo pom.xml e os arquivos de dependências para a imagem
COPY pom.xml .

# Baixar as dependências do projeto
RUN mvn dependency:go-offline

# Copiar o restante dos arquivos do projeto para a imagem
COPY src ./src

# Compilar o projeto e construir o JAR
RUN mvn package -DskipTests

# Usar uma imagem menor para a execução da aplicação
FROM openjdk:11-jre-slim

# Definir o diretório de trabalho no container
WORKDIR /app

# Copiar o JAR construído na etapa anterior para a imagem
COPY --from=build /app/target/EstruturaRestApi-0.0.1-SNAPSHOT.jar app.jar

# Expor a porta 8080 (ou a porta que sua aplicação usa)
EXPOSE 8080

# Definir o comando de inicialização do container
ENTRYPOINT ["java", "-jar", "app.jar"]