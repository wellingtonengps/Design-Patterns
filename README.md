# Design-Patterns

## Sistema de Gerenciamento de Biblioteca

Este projeto é um sistema de gerenciamento de biblioteca desenvolvido em Java, utilizando vários padrões de projeto para resolver problemas comuns de design e arquitetura de software.
### Padrões utilizados

- **Singleton**: Garante que haja apenas uma instância do serviço de notificação.  
- **Factory Method**: Cria diferentes tipos de usuários (comum e premium).  
- **Abstract Factory**: Cria famílias de objetos relacionados, como livros físicos e e-books.  
- **Decorator**: Adiciona funcionalidades dinâmicas, como descontos ou multas.  
- **State**: Gerencia o estado de um livro (disponível, emprestado, reservado).  
- **Observer**: Notifica usuários sobre prazos de devolução ou disponibilidade de livros.  
- **Strategy**: Define diferentes algoritmos de cálculo de multas (fixa, progressiva).  
- **Template Method**: Define o fluxo de empréstimo de um livro (passos comuns, mas com variações).  
- **Command**: Encapsula operações como emprestar e devolver livros em objetos.  
- **Visitor**: Gera relatórios de livros mais emprestados sem modificar as classes dos livros.  

### UML

![Home Page (1)](https://raw.githubusercontent.com/wellingtonengps/Design-Patterns/refs/heads/main/Design-Patterns.drawio.png)
