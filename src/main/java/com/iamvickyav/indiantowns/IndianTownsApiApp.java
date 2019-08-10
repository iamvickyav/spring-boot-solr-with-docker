package com.iamvickyav.indiantowns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@SpringBootApplication
@EnableSolrRepositories
public class IndianTownsApiApp {

	public static void main(String[] args) {
		SpringApplication.run(IndianTownsApiApp.class, args);
	}

}
