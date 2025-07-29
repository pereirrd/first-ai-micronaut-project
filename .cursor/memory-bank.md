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