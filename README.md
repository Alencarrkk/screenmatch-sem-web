# ScreenMatch

O **ScreenMatch** é uma aplicação desenvolvida em **Java** utilizando **Spring Boot**, que permite consultar informações detalhadas sobre séries de TV. O projeto utiliza recursos modernos de Java, como **lambdas e streams**, e faz **serialização e deserialização de dados** com a biblioteca **Jackson**, garantindo manipulação eficiente de coleções e dados JSON.  

## 🛠️ Tecnologias Utilizadas

- **Java 24** – aproveitando funcionalidades do Java 8, como lambdas e streams, para maior eficiência e clareza no código.  
- **Spring Boot** – framework utilizado para simplificar o desenvolvimento e gerenciamento da aplicação.  
- **Jackson** – biblioteca responsável por serializar e desserializar os objetos Java em JSON e vice-versa.  
- **Maven** – para gerenciamento de dependências e build do projeto.  

## ⚙️ Funcionalidades

O programa realiza consultas completas sobre séries, seguindo o fluxo abaixo:

1. O usuário informa o **nome da série** desejada.  
2. O programa exibe informações gerais da série, incluindo a **quantidade de temporadas** e a **avaliação geral**.  
3. Todos os episódios são listados, mostrando:  
   - Nome do episódio  
   - Número do episódio  
   - Avaliação do episódio  
   - Data de lançamento  
4. Os **Top 10 episódios mais bem avaliados** são apresentados.  
5. O usuário pode informar um **trecho do nome de um episódio** para localizar o episódio específico e descobrir em qual **temporada** ele está.  
6. O usuário pode informar um **ano**, e o programa lista todos os episódios lançados a partir desse ano.  
7. O programa calcula e apresenta estatísticas gerais da série:  
   - Média de avaliação de todos os episódios  
   - Avaliação do **pior** episódio  
   - Avaliação do **melhor** episódio  
   - Quantidade total de episódios  
8. O programa finaliza após apresentar todas essas informações.  

Outras funcionalidades incluem:  

- Processamento eficiente de dados utilizando **streams** e **lambdas**, tornando o código mais limpo e performático.  
- Manipulação de dados em **JSON**, permitindo fácil integração com outras aplicações ou APIs.  

## 🌐 API Utilizada

O projeto consome dados da API pública [OMDb API](https://www.omdbapi.com/), que fornece informações detalhadas sobre séries, episódios, datas de lançamento e avaliações.  
