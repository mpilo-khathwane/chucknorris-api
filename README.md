## HOW TO get up and running:
### with docker:
```bash
docker build -t springio/chucknorris-api .
docker run -p 8080:8080 springio/chucknorris-api
```

 ### without docker:
 ```bash
java -jar ./build/libs/chucknorris-api-0.1.0.jar
```
