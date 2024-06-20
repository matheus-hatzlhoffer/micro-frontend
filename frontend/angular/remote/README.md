# Remote Project

The remote is a separately built and deployed application. It can expose ESM that can be loaded into other applications.

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 18.0.4.

## Step-by-Step

1. generate the workspace:

```sh
ng new remote --no-create-application
```

2. add native federation to the project

```sh
npm i @angular-architects/native-federation -D
```

3. generathe shell application

```sh
ng generate application remote --standalone false
```

4. add a new main module to the project

```sh
ng generate module remote-main
```

5. add a new component to the main module

```sh
ng generate component /remote-main/home --module=remote-main
```

6. add remote configuration to the project

```sh
ng add @angular-architects/native-federation --project remote --port 4201 --type remote
```

7. start the application

```sh
ng serve
```

## Env variables needed

1. remoteName
2. remoteURI
3. nginxPort
4. hostName
5. host
