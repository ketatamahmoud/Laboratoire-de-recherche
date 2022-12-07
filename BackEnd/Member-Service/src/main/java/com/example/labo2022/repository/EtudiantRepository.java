package com.example.labo2022.repository;

import com.example.labo2022.entity.Etudiant;
import com.example.labo2022.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EtudiantRepository  extends JpaRepository<Etudiant, Long> {
    List<Etudiant> findByDiplome(String diplome);
    List<Etudiant>findByDiplomeOrderByDateInscriptionDesc(String diplome);

}
