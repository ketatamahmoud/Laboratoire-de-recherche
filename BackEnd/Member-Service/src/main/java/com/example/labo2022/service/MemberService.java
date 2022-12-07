package com.example.labo2022.service;

import com.example.labo2022.entity.EnseignantChercheur;
import com.example.labo2022.entity.Etudiant;
import com.example.labo2022.entity.Member;

import java.util.List;

public interface MemberService {

        public Member addMember(Member m);
        public void deleteMember(Long id) ;
        public Member updateMember(Member p) ;
        public Member findMember(Long id) ;
        public List<Member> findAll();

        public Member findByCin(String cin);
        public Member findByEmail(String email);
        public List<Member> findByNom(String nom);
        //recherche spécifique des étudiants
        public List<Etudiant> findByDiplome(String diplome);
        //recherche spécifique des enseignants
        public List<EnseignantChercheur> findByGrade(String grade);
        public List<EnseignantChercheur> findByEtablissement(String etablissement);

    }

