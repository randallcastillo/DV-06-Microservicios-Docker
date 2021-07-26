# FASTAPI with Docker container

Go to the Dockerfile directory:

``` 
cd <directory>
```

# Build the Dokcer image:
```
docker build -t fastapi .
```
# Run the Docker container:
```
docker run -d --name fastapicontainer -p 8000:80 fastapi
```
# Stop the Docker container:
```
docker stop <id> && docker container rm <id>
```
