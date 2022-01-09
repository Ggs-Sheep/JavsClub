
# JavsClub



## Prerequisites
Node JS

npm js

hsqldb folder (https://sourceforge.net/projects/hsqldb/files/latest/download)

nodemon

## Installation

Clone project

```bash
  git clone https://github.com/Ggs-Sheep/JavsClub.git
```

## Configuration
Go to 'back/src/main/resources/startDB-soft.sh'
and change the path in the file by the path of your hsqldb folder.

## Run the BDD

Run the script bash back/src/main/resources/startDB-soft.sh'

## Run the spring boot API

Run the java class back/src/main/java/com/example/JavsClub/JavsClubApplication.java

Spring boot should listen on http://localhost:8080  

## Run the web server

Go to /front/

Intall the dependencies by running 
```
npm install

```

Run the server by running 

```
npm start
```

The web server should be listening on http://localhost:8081
