package com.app.TP_DESI2023.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.TP_DESI2023.Entitys.Avion;

@Repository
public interface AvionRepository extends JpaRepository<Avion, Long>{

}
