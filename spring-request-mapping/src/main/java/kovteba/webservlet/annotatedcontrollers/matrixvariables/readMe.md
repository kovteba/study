# @MatrixVariable

`@MatrixVariable` annotation indicates that a method parameter should be bound to a name-value pair within a path 
segment. `@MatrixVariable` annotation is disabled by default in Spring MVC. In order to enable it you need to 
tweak the configuration and set the removeSemicolonContent property of RequestMappingHandlerMapping to false. 
By default it is set to true.

If you do not set it to false then you will see the following exception in your application:

```text
Missing matrix variable 'var_name' for method parameter of type String
```