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
public class Labo2022Application implements CommandLineRunner {
	@Autowired
	MemberRepository memberRepository;


	public static void main(String[] args) {
		SpringApplication.run(Labo2022Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		Date date1 = dateFormat.parse("2010-05-01");
		Date date2 = dateFormat.parse("2010-05-02");
		EnseignantChercheur ens1=new EnseignantChercheur("113562","ghassen","ghassen",date1, (byte) 11111111,"cv","email","aaa","grade","enis",null);
		memberRepository.save(ens1);
		Etudiant e1 =new Etudiant("11828966","khalfallah","ghassen",date1, (byte) 00000000,"cv","email","111",date2,"diplome",ens1);
		memberRepository.save(e1);


	}
}
