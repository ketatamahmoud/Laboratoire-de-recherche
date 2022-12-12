package com.example.labo2022;

import com.example.labo2022.entity.EnseignantChercheur;
import com.example.labo2022.entity.Etudiant;
import com.example.labo2022.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.text.SimpleDateFormat;
import java.util.Date;
@EnableDiscoveryClient
@SpringBootApplication
public class Labo2022Application  {
	@Autowired
	MemberRepository memberRepository;


	public static void main(String[] args) {
		SpringApplication.run(Labo2022Application.class, args);
	}


}
