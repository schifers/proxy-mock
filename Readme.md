# Proxy Mock

This repository is intended to show up some ways to build mocks for testing using the proxy pattern.

# Packages

- clientobject: Objects that depend on other objects to execute business rules.
- proxy: Proxies that can override real object's behavior with an expected one.
- realobject: Objects that posses the behavior that we want to mock.

# Stages

- Stage 1:

    In the first stage we are using the proxy pattern to build stubs.

- Stage 2:

    In the second stage, we will build stubs with the proxy class provided by Java language.

- Stage 3:

    In the third stage, we will build mocks, instead of stubs, with te proxy class from Java.