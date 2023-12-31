package com.provajava.provajava2.Services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.provajava.provajava2.Entities.Empresa;
import com.provajava.provajava2.Repositories.EmpresaRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EmpresaService {
    @Autowired
    private EmpresaRepository empresaRepository;

    public Empresa save(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public Empresa getEmpresaById(int id){
        return empresaRepository.findById(id).orElseThrow(
            () -> new EntityNotFoundException("Fornecedor não encontrado!")
        );
    }

    public List<Empresa> getEmpresas(){
        return empresaRepository.findAll();
    }

    public void deleteById(int id) {
        Empresa empresa = getEmpresaById(id);
        empresaRepository.delete(empresa);
    }

}
