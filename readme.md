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

## Native Federation

This first approach consists in using Native Federation is a browser-native implementation that can be used independently of build tools and frameworks. Browser-native means that we rely on modern and future browser technologies such as EcmaScript Modules and Import Maps.

It works using the following mental model:

- **Remote**: The remote is a separately built and deployed application. It can expose ESM that can be loaded into other applications.
- **Host**: The host loads one or several remotes on demand. For your framework's perspective, this looks like traditional lazy loading. The big difference is that the host doesn't know the remotes at compilation time.
- **Shared Dependencies**: If a several remotes and the host use the same library, you might not want to download it several times. Instead, you might want to just download it once and share it at runtime. For this use case, the mental model allows for defining such shared dependencies.

In particular, this means that if two or more applications use a different version of the same shared library, Native Federation makes it possible to prevent a version mismatch. There are several strategies, like falling back to another version that fits the application, using a different compatible one (according to semantic versioning) or throwing an error, which are in place to mitigate this issue.

Since importmaps follow the "initialization is finalization" approach it is impossible to update them. This implies that micro frontends can - in general - not be updated on the fly.

### Implementation


### References 

1. [Micro Frontends with Modern Angular](read://https_www.angulararchitects.io/?url=https%3A%2F%2Fwww.angulararchitects.io%2Fblog%2Fmicro-frontends-with-modern-angular-part-1-standalone-and-esbuild%2F)
2. [Native Federation for Angular](https://www.npmjs.com/package/@angular-architects/native-federation)
3. [Angular 17 as MicroFrontend with native federation](https://medium.com/@lukas.caniga/angular-17-as-microfrontend-native-federation-supporting-pwa-and-ssr-1e9d43eb411d)
4. [Micro Frontends with Native Federation](read://https_dev.to/?url=https%3A%2F%2Fdev.to%2Fflorianrappl%2Fmicro-frontends-with-native-federation-56j4)
5. [Announcing Native Federation](https://www.angulararchitects.io/blog/announcing-native-federation-1-0/)

## References

1. [Micro Frontends](https://martinfowler.com/articles/micro-frontends.html)
2. [What are Micro Frontends?](https://micro-frontends.org/)


