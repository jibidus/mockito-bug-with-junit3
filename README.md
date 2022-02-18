This repository was created to demonstrate a bug with `Mockito` and `JUnit3`.

# Bug description

- Mockito 4.3.1
- JUnit 3.8.2

Test in [AppTest](lib/src/test/java/org/mockito/AppTest.java) should fail with wrong argument exception:

```java
App app = mock(App.class);
app.buildGreeting("bill");
verify(app).buildGreeting("bob");
```

But, we get `ClassCastException` instead.

# How to reproduce?

`./gradlew test` fail because of `java.lang.ClassCastException`, instead of `ArgumentsAreDifferent`.