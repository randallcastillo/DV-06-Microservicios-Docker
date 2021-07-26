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

# Check it
Open your browser at http://127.0.0.1:8000/multiplicacion/5/3

# Interactive API docs
Now go to http://127.0.0.1:8000/docs

![image](https://user-images.githubusercontent.com/22780220/127061684-19ce98ae-4e14-42ca-9c03-2812328adc38.png)

# Stop and delete the Docker container:
```
docker stop <id> && docker container rm <id>
```
