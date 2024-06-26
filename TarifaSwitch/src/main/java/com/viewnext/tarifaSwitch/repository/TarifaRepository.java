package com.viewnext.tarifaSwitch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viewnext.tarifaSwitch.repository.model.Tarifa;

@Repository
public interface TarifaRepository extends JpaRepository<Tarifa, Long> {

}
