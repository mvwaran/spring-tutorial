# Spring

#### What is Spring Bean ?

- A "Spring Bean" is simply a Java object. When Java objects are created by the Spring Container, then Spring refers to them as "Spring Beans".

#### Bean Scopes
1. singleton - Create single shared instance. Default scope.
2. prototype - Create new instance for each request
3. request - Scoped to an HTTP web request
4. session - Scoped to an HTTP web session
5. global-session - Scoped to an HTTP web global session