package com.example.labo2022.repository;

import com.example.labo2022.entity.EnseignantChercheur;
import com.example.labo2022.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EnseignantRepository extends JpaRepository<EnseignantChercheur, Long> {
    List<EnseignantChercheur>findByGrade(String grade);
    List<EnseignantChercheur> findByEtablissement(String etablissement);
}
