
Spring Boot Sample Project with MySQL (JPA)

### Setup

1. Run Mysql
```
docker compose up -d
```

2. Run Application
```
http://localhost:8080/demo/all
```

3. Add User
```
curl http://localhost:8080/demo/add -d name=First -d email=someemail@someemailprovider.com
```

4. Close Project
```
docker compose down -v
```