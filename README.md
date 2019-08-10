# REST API using Spring Boot + Solr + Docker

## Description:

This application exposes details of more than 13,800 Indian Towns via REST Endpoints

We used **Apache Solr** to persist the data about Indian towns. **Docker** is used for setting up Solr. We also used **Spring Boot** to develop simple REST application which access Solr & expose the data via endpoints

## Disclaimer: 

Indian town details are collected from Internet. Hence, I don't stand for authenticity of the information. I have kept the source file I used for indexing Solr (in CSV format) under resource directory. 

You can use find them here - [Indian Towns Details in CSV](https://github.com/iamvickyav/SpringBoot-Solr-Using-Docker/tree/master/src/main/resources/solr_index_source)

## Setup:

 - Pull or download code from this repo
 - [Install Docker](https://docs.docker.com/install/) 
 - Once installed, start the Docker application in your system
 - Once started, run the following commands
```
> cd src/Docker/
> docker-compose up
```

**Thats it !!!** 
### Setup verification:
You can verify the success of setup by visiting http://localhost:8983/solr in your browser & selecting the IndianTowns core

## How to use:

### REST Endpoints

```
http://localhost:8080/india/town/all

http://localhost:8080/india/town/paged/search?page=10&size=0&district=porbandar&state=gujarat

http://localhost:8080/india/town/paged/search?page=10&size=0&state=gujarat

http://localhost:8080/india/town/search?page=10&size=0&district=porbandar&state=gujarat

http://localhost:8080/india/town/search?page=10&size=0&state=gujarat

```
