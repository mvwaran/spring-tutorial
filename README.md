# Spring

## 3 methods of configuring spring container
1. Full XML config (Part 2, Part 3 & Part 4)
2. XML Component Scan (Part 7 & Part 8)
3. Java Configuration class (Part 9)

## Highlights

#### What is Spring Bean

- A "Spring Bean" is simply a Java object. When Java objects are created by the Spring Container, then Spring refers to them as "Spring Beans".

#### Bean Scopes List
1. singleton - Create single shared instance. Default scope.
2. prototype - Create new instance for each request
3. request - Scoped to an HTTP web request
4. session - Scoped to an HTTP web session
5. global-session - Scoped to an HTTP web global session

#### part5-bean-scope

- If you are using Method 2 instead of Method 1 you can use `@Scope` annotation below `@Component`

#### part6-bean-lifecycle

- Use `@PostConstruct` and `@PreDestory` if you are using Method 2

#### part7-rewrite-part2part3part4-using-spring-autowired-annotation (Method 2 approach)

- Bean created using `componentscan` instead of `<bean></bean>` tag in `applicationContext.xml`
- `EmployeeConstructorInjection.java` line number 7 (versus) `EmployeeFieldInjection.java` line number 7

#### part9-no-xml-java-configuration (Method 3 approach)

- Java Configuration class method of configuring container with component scan