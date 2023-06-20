package com.provajava.provajava2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.provajava.provajava2.Entities.Empresa;

public interface EmpresaRepository  extends JpaRepository <Empresa, Integer>{
   
}
