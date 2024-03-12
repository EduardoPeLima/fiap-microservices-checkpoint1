# fiap-microservices-checkpoint1

## Executar aplicação a partir da imagem no Docker Hub com profile "dev"

```
docker pull eduardopereira369/fiap-checkpoint1:latest

docker run -p 8080:8080 -e "PROFILE=dev" eduardopereira369/fiap-checkpoint1
```

## Executar aplicação a partir da imagem no Docker Hub com profile "stg"

```s
docker pull eduardopereira369/fiap-checkpoint1:latest

docker run -p 8080:8080 -e "PROFILE=stg" eduardopereira369/fiap-checkpoint1
```

## Executar aplicação a partir da imagem no Docker Hub com profile "prd"

```
docker pull eduardopereira369/fiap-checkpoint1:latest

docker run -p 8080:8080 -e "PROFILE=prd" eduardopereira369/fiap-checkpoint1
```