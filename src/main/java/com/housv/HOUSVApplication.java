package com.housv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
public class HOUSVApplication {
    public static void main(String[] args) {
        SpringApplication.run(HOUSVApplication.class, args);
    }
}

//    curl https://start.spring.io/starter.tgz \-d bootVersion=2.2.6.RELEASE \-d dependencies=web \-d baseDir=gae-standard-example | tar -xzvf -
//    gcloud sql instances create \smartosc-housv-db \--tier=db-f1-micro \--region=europe-west2
//    gcloud sql databases create \housv_db \--instance=smartosc-housv-db


//Created [https://sqladmin.googleapis.com/sql/v1beta4/projects/lexical-micron-290308/instances/smartosc-housv-db].
//NAME               DATABASE_VERSION  LOCATION        TIER         PRIMARY_ADDRESS  PRIVATE_ADDRESS  STATUS
//smartosc-housv-db  MYSQL_5_7         europe-west2-a  db-f1-micro  35.246.52.182    -                RUNNABLE

//Creating Cloud SQL database...done.
//Created database [housv_db].
//instance: smartosc-housv-db
//name: housv_db
//project: lexical-micron-290308