# Testes Unitários - First AI Micronaut Project

Este documento descreve os testes unitários criados para o projeto First AI Micronaut Project.

## Estrutura dos Testes

### 1. Testes do Modelo (PingPong)

**Arquivo:** `src/test/java/com/ai/model/PingPongTest.java`

**Testes criados:**
- `testPingPongRecord_ShouldCreateValidInstance()` - Verifica se o record é criado corretamente
- `testPingPongRecord_ShouldBeImmutable()` - Verifica a imutabilidade do record
- `testPingPongRecord_EqualsAndHashCode()` - Testa equals e hashCode do record
- `testPingPongRecord_ToString()` - Verifica o método toString

### 2. Testes do Service (PingPongService)

**Arquivo:** `src/test/java/com/ai/services/PingPongServiceTest.java`

**Testes criados:**
- `testCreate_ShouldReturnPingPongWithCorrectValues()` - Verifica se o service retorna um PingPong válido
- `testCreate_WithNullPing_ShouldCreatePingPongWithNullPing()` - Testa comportamento com ping null
- `testCreate_ShouldReturnNewPingPongInstance()` - Verifica se cada chamada retorna uma nova instância

**Mocks utilizados:**
- Não há mocks necessários para este service, pois ele não tem dependências externas

### 3. Testes do Controller (FirstAiMicronautProjectController)

**Arquivo:** `src/test/java/com/ai/controllers/FirstAiMicronautProjectControllerTest.java`

**Testes criados:**
- `testPing_ShouldReturnOkResponseWithPingPong()` - Verifica se o endpoint retorna resposta OK com PingPong
- `testPing_ShouldCallServiceWithCurrentTime()` - Verifica se o service é chamado com o tempo atual
- `testPing_WhenServiceThrowsException_ShouldPropagateException()` - Testa propagação de exceções
- `testPing_ShouldReturnResponseWithCorrectContentType()` - Verifica o status da resposta

**Mocks utilizados:**
- `PingPongService` - Mockado para controlar o comportamento do service

## Dependências de Teste

As seguintes dependências foram adicionadas ao `pom.xml`:

```xml
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>5.8.0</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-junit-jupiter</artifactId>
    <version>5.8.0</version>
    <scope>test</scope>
</dependency>
```

## Como Executar os Testes

### Executar todos os testes:
```bash
mvn test
```

### Executar testes específicos:
```bash
# Testes do modelo
mvn test -Dtest="PingPongTest"

# Testes do service
mvn test -Dtest="PingPongServiceTest"

# Testes do controller
mvn test -Dtest="FirstAiMicronautProjectControllerTest"
```

### Executar testes com relatório detalhado:
```bash
mvn surefire:test
```

## Cobertura dos Testes

Os testes cobrem:

1. **Modelo PingPong:**
   - Criação de instâncias
   - Imutabilidade
   - Métodos equals, hashCode e toString

2. **Service PingPongService:**
   - Criação de PingPong com valores válidos
   - Comportamento com valores null
   - Retorno de novas instâncias

3. **Controller FirstAiMicronautProjectController:**
   - Resposta HTTP correta
   - Integração com o service
   - Tratamento de exceções
   - Status da resposta

## Padrões Utilizados

- **Arrange-Act-Assert (AAA):** Todos os testes seguem este padrão
- **Mockito:** Para criar mocks das dependências
- **JUnit 5:** Framework de testes
- **Nomenclatura descritiva:** Nomes dos métodos de teste são descritivos
- **Testes isolados:** Cada teste é independente dos outros
- **Inferência de tipo (var):** Uso de `var` para variáveis de escopo local, seguindo as melhores práticas do Java moderno

## Resultados

Todos os 11 testes passam com sucesso:
- 4 testes do modelo PingPong
- 3 testes do service PingPongService  
- 4 testes do controller FirstAiMicronautProjectController 