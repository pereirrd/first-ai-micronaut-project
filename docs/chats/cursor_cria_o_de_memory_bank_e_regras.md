# Criação de memory bank e regras
_Exported on 7/30/2025 at 19:52:55 GMT-3 from Cursor (1.3.5)_

---

**User**

crie um memorybank e rules a partir dessas regras

---

**Cursor**

I'll help you create a memory bank and rules based on the content in your prompt file. Let me first read the file to understand the rules you want to convert.


Now I'll create a memory bank and rules file based on these development guidelines. I'll create a structured format that can be easily referenced during development.


```markdown
# Memory Bank - Micronaut Development Rules

## Project Architecture & Design Patterns

### Domain Driven Design (DDD)
- Follow Domain Driven Design pattern for package and class organization
- Structure packages according to DDD principles

### API-First Approach
- Use API-First technique with Swagger documentation
- Define API documentation using OpenAPI model
- Maintain up-to-date API documentation

## Technology Stack

### Core Framework & Language
- **Framework**: Micronaut (latest version)
- **Language**: Java 21
- **Build Tool**: Maven
- **Testing**: JUnit + Mockito (latest versions)
- **Mutation Testing**: Pitest (latest version)
- **Code Quality**: Sonar

## Maven Configuration

### POM Structure
- Use variables for dependency versions
- Configure plugins for:
  - Pitest (mutation testing)
  - Sonar (code quality)
  - Micronaut framework

## Code Organization & Naming Conventions

### Constant Classes
- Must be `final` classes
- Use Lombok annotations with private constructor
- Attributes must be `public`, `static`, and `final`
- Create separate constant classes for:
  - General application constants
  - Request-related constants
  - Error constants
  - Trace constants

### Model Naming Conventions
- **HTTP Client Models**: Use suffixes "ClientRequest" and "ClientResponse"
- **Database Entities**: Use suffix "Entity"
- **Configuration Classes**: Group by context (e.g., HttpClientConfig, DataBaseConfig, MessagingConfig)

## Code Quality & Best Practices

### Lombok Usage
- Use Lombok annotations for constructors, getters, setters, builders
- Evaluate the best annotation for each use case
- Use parameterized constructors for dependency injection when needed

### Modern Java Features
- Prefer `record` classes when possible
- Use streams and lambdas over traditional loops
- Use MapStruct for model conversions

### Environment Configuration
- Create classes to read environment variables
- Group configurations by context (HttpClientConfig, DataBaseConfig, MessagingConfig, etc.)

## Testing Guidelines

### Unit Testing
- **DO NOT** place mocks in `@BeforeEach` methods
- Create mocks for each test scenario individually
- Use JUnit and Mockito for testing
- Implement mutation testing with Pitest

### Code Quality Assessment
- Use Sonar for code quality evaluation
- Maintain high test coverage
- Follow mutation testing best practices

## Documentation

### README Maintenance
- Create and maintain `README.md` for microservice documentation
- Update README.md when significant changes occur
- Include API documentation and setup instructions

## Development Workflow

### Code Review Checklist
1. Verify DDD package structure
2. Check constant class implementations
3. Validate naming conventions
4. Ensure proper Lombok usage
5. Confirm test structure (no mocks in @BeforeEach)
6. Verify environment configuration classes
7. Check API documentation updates
8. Validate Maven configuration

### Quality Gates
- All tests must pass
- Mutation testing coverage acceptable
- Sonar quality gates passed
- API documentation up-to-date
- README.md updated for significant changes
```

Now I'll create a separate rules file that can be used as a quick reference guide:


```markdown
# Development Rules - Quick Reference

## 🏗️ Architecture
- **DDD**: Follow Domain Driven Design patterns
- **API-First**: Use Swagger/OpenAPI for API documentation
- **Framework**: Micronaut (latest) + Java 21 + Maven

## 📝 Code Standards

### Constants
```java
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class AppConstants {
    public static final String EXAMPLE = "value";
}
```

### Naming Conventions
- HTTP Client Models: `*ClientRequest`, `*ClientResponse`
- Database Entities: `*Entity`
- Config Classes: `*Config` (grouped by context)

### Lombok Usage
- Use `@AllArgsConstructor`, `@NoArgsConstructor`, `@Builder`
- Prefer `record` classes when possible
- Use parameterized constructors for DI

## 🧪 Testing Rules
- ❌ **NEVER** put mocks in `@BeforeEach`
- ✅ Create mocks per test scenario
- Use JUnit + Mockito + Pitest (mutation testing)

## 🔧 Tools & Quality
- **Sonar**: Code quality assessment
- **Pitest**: Mutation testing
- **MapStruct**: Model conversions
- **Streams/Lambdas**: Over traditional loops

## 📚 Documentation
- Maintain `README.md` for microservice
- Update on significant changes
- Keep API docs current

## ⚡ Quick Checklist
- [ ] DDD package structure
- [ ] Constants classes (final, static, public)
- [ ] Proper naming conventions
- [ ] Lombok annotations
- [ ] Tests without @BeforeEach mocks
- [ ] Environment config classes
- [ ] Maven with version variables
- [ ] API documentation updated
```

Perfect! I've created two files based on your development rules:

## 📁 Files Created:

### 1. **Memory Bank** (`.cursor/memory-bank.md`)
A comprehensive reference document that includes:
- Detailed project architecture guidelines
- Technology stack specifications
- Code organization and naming conventions
- Testing guidelines and best practices
- Documentation requirements
- Development workflow and quality gates

### 2. **Rules** (`.cursor/rules.md`)
A concise quick-reference guide with:
- Key architectural principles
- Code standards with examples
- Testing rules (highlighting the important "no mocks in @BeforeEach" rule)
- Tools and quality requirements
- A quick checklist for code reviews

## 🎯 Key Highlights:

The most important rules that stand out from your original prompt:

1. **Testing Rule**: Never put mocks in `@BeforeEach` - create mocks for each test scenario
2. **Constants**: Must be `final` classes with Lombok annotations and `public static final` attributes
3. **Naming Conventions**: Use specific suffixes for different types of classes
4. **Modern Java**: Prefer `record` classes and streams/lambdas
5. **Quality Tools**: Sonar + Pitest for comprehensive quality assessment

These files will serve as your development memory bank and can be referenced during development to ensure consistency with your established rules and patterns.

---

**User**

salva esse chata na pasta ai

---

**Cursor**

Entendi! Você quer que eu salve esses arquivos na pasta do projeto. Vou verificar a estrutura atual e organizar os arquivos adequadamente.


Vou criar uma pasta específica para documentação e organizar os arquivos lá:


Agora vou copiar os arquivos para a nova pasta de documentação:


Agora vou criar um arquivo README na pasta de documentação para organizar tudo:


```markdown
# Development Rules Documentation

Esta pasta contém as regras e diretrizes de desenvolvimento para o projeto Micronaut.

## 📁 Arquivos Disponíveis

### 📋 [Memory Bank](./memory-bank.md)
Documentação completa com todas as regras de desenvolvimento, incluindo:
- Arquitetura e padrões de design
- Stack tecnológica
- Configuração do Maven
- Organização e convenções de código
- Diretrizes de teste
- Documentação
- Workflow de desenvolvimento

### ⚡ [Rules - Quick Reference](./rules.md)
Guia de referência rápida com:
- Principais regras de arquitetura
- Padrões de código com exemplos
- Regras de teste
- Ferramentas de qualidade
- Checklist rápido para code review

## 🎯 Como Usar

1. **Para novos desenvolvedores**: Comece lendo o [Memory Bank](./memory-bank.md) para entender todas as regras
2. **Para referência diária**: Use o [Rules - Quick Reference](./rules.md) durante o desenvolvimento
3. **Para code review**: Use o checklist do arquivo de regras

## 📝 Atualizações

- Mantenha estes arquivos atualizados conforme as regras evoluem
- Adicione novas regras conforme necessário
- Documente mudanças significativas no processo de desenvolvimento

## 🔗 Links Relacionados

- [Prompt Original](../.cursor/my-first-prompt.md) - Regras originais em português
- [README Principal](../../README.md) - Documentação geral do projeto
```

Vou verificar se os arquivos foram copiados corretamente:


Perfeito! ✅ Os arquivos foram salvos com sucesso na pasta `docs/development-rules/`. 

## 📁 Estrutura Criada:

```
docs/
└── development-rules/
    ├── README.md          # Organização e guia de uso
    ├── memory-bank.md     # Documentação completa das regras
    └── rules.md           # Guia de referência rápida
```

Agora você tem:
- **Documentação organizada** na pasta `docs/development-rules/`
- **Referência rápida** para uso diário
- **Documentação completa** para novos desenvolvedores
- **Checklist** para code reviews

Os arquivos estão prontos para serem usados pela equipe de desenvolvimento! 🚀

```plaintext
docs/
└── development-rules/
    ├── README.md          # Organização e guia de uso
    ├── memory-bank.md     # Documentação completa das regras
    └── rules.md           # Guia de referência rápida
```

