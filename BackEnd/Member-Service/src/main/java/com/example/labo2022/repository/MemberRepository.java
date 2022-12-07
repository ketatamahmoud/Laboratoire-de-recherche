package com.example.labo2022.repository;

import com.example.labo2022.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByCin(String cin);
    List<Member> findByNomStartingWith(String caractere);
    Member findByEmail(String email);
}
