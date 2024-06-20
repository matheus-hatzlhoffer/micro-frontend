# Micro Frontends

This project has been created to test various approaches to implement micro front-ends in a modern application

As this project is focused on the front-end implementation there is a very simple springboot server to mock-up the back-end layer with simple rest end-points

## Desired properties of new UI architecture

- Independent micro service
- External user management - UI relies on back-end for user login/logout
- UI built for modularity and reuse
- UI modules are called by REST URI
- UI modules are hand coded and configured by API
- Only metadata, dynamic rules and scripts required for a module loaded for speed and reduced browser memory requirements
- Accessibility support
- Support integrating various domain task flows with capability to use data and views from other systems to reduce swivel chair problems
- SDK should isolate code libraries to avoid dependencies conflicts

## Implementations

Check the other branches

## References

1. [Micro Frontends](https://martinfowler.com/articles/micro-frontends.html)
2. [What are Micro Frontends?](https://micro-frontends.org/)


