package com.example.labo2022.service;

import com.example.labo2022.entity.EnseignantChercheur;
import com.example.labo2022.entity.Etudiant;
import com.example.labo2022.entity.Member;
import com.example.labo2022.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Memberimpl implements MemberService{
    @Autowired
    MemberRepository memberRepository;


    @Override
    public Member addMember(Member m) {
        return memberRepository.save(m);
    }

    @Override
    public void deleteMember(Long id) {
        memberRepository.deleteById(id);

    }

    @Override
    public Member updateMember(Member p) {
         return memberRepository.saveAndFlush(p);

    }

    @Override
    public Member findMember(Long id) {
        return memberRepository.findById(id).get();
    }

    @Override
    public List<Member> findAll() {
        return null;
    }

    @Override
    public Member findByCin(String cin) {
        return null;
    }

    @Override
    public Member findByEmail(String email) {
        return null;
    }

    @Override
    public List<Member> findByNom(String nom) {
        return null;
    }

    @Override
    public List<Etudiant> findByDiplome(String diplome) {
        return null;
    }

    @Override
    public List<EnseignantChercheur> findByGrade(String grade) {
        return null;
    }

    @Override
    public List<EnseignantChercheur> findByEtablissement(String etablissement) {
        return null;
    }
}
