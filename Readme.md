# Proxy Mock

This repository is intended to show up some ways to build stubs and mocks for testing using the proxy pattern, using the proxy class and, in the end, using mocks instead of stubs.

# Packages

- clientobject: Objects that depend on other objects to execute business rules.
- proxy: Proxies that can override real object's behavior with an expected one.
- realobject: Objects that posses the behavior that we want to mock.
- stub: Stubs for the real objects

# Stubs vs. Mocks

- https://martinfowler.com/articles/mocksArentStubs.html

# Stages

- Stage 1:

    In the first stage we are using the proxy pattern to build stubs.

- Stage 2:

    In the second stage, we will build stubs with the proxy class provided by Java language.

- Stage 3:

    In the third stage, we will build mocks, instead of stubs, with te proxy class from Java.