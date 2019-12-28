# Build Helper Maven Plugin

This demo shows you how to configure `src/it/java` and `src/it/resources` to
store your integration tests (IT) and ensure they are part of the Maven build
thanks to Build Helper Maven Plugin. This is interesting for complex project
structure, where integration tests / benchmarks / code generation / ... get
involved.

Run the demo using command:

```
mvn clean install
```

## Additional Resources

- Code quality tool [Checkstyle](https://github.com/checkstyle/checkstyle) uses Build Helper Maven Plugin.
- The [source code](https://github.com/mojohaus/build-helper-maven-plugin) of
  Build Helper Maven Plugin contains more demonstrations in its tests.
