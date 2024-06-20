# Shell Project

The shell is a host service, it loads one or several remotes on demand. For your framework's perspective, this looks like traditional lazy loading. The big difference is that the host doesn't know the remotes at compilation time.

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 18.0.4.

## Step-by-Step

1. generate the workspace:

```sh
ng new shell --no-create-application
```

2. add native federation to the project

```sh
npm i @angular-architects/native-federation -D
```

3. generathe shell application

```sh
ng generate application shell --standalone false
```

4. init dynamic host configuration to the shell project

```sh
ng g @angular-architects/native-federation:init --project shell --port 4200 --type dynamic-host
```

5. start main module

```sh
ng generate module home-shell
```

6. generate new component in the home-shell module

```sh
ng generate component home-shell/home --module=home-shell
```

## Env variables needed

1. remoteName
2. remoteURI
3. nginxPort
4. hostName
5. host
