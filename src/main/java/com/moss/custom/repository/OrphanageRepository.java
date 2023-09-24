package com.moss.custom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moss.custom.model.orphanage.Orphanage;

@Repository
public interface OrphanageRepository extends JpaRepository<Orphanage, Long>{

}
