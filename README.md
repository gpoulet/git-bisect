# Git-bisect with Maven

## Init the project to get Maven dependencies
```mvn clean install```

## git bisect

### Init bisect
```git bisect start```

### Tell git last version that works
```git bisect good 1.5```

### Tell git last version that doesn't work
```git bisect bad 2.0```

### Run bisect script
```git bisect run mvn test -Dcom.serli.formation.gitbisect.domain.PersonTest```

### Reset bisect
```git bisect reset```