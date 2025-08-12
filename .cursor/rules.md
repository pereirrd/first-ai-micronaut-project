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