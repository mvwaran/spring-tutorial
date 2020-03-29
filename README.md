# Spring

## Highlights

#### part7-rewrite-part2part3part4-using-spring-autowired-annotation

- `EmployeeConstructorInjection.java` line number 7 (versus) `EmployeeFieldInjection.java` line number 7

## FAQ's

#### What is Spring Bean

- A "Spring Bean" is simply a Java object. When Java objects are created by the Spring Container, then Spring refers to them as "Spring Beans".

#### Bean Scopes List
1. singleton - Create single shared instance. Default scope.
2. prototype - Create new instance for each request
3. request - Scoped to an HTTP web request
4. session - Scoped to an HTTP web session
5. global-session - Scoped to an HTTP web global session