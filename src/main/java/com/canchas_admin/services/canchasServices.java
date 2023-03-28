package com.canchas_admin.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canchas_admin.interfaceServices.Icanchas;
import com.canchas_admin.model.Canchas;
import com.canchas_admin.model.CanchasRepository;

@Service
public class canchasServices implements Icanchas{

    @Autowired
    private CanchasRepository canchasR;

    @Override
    public List<Canchas> listar() {
        return (List<Canchas>)canchasR.findAll();
    }

    @Override
    public Optional<Canchas> listarID(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarID'");
    }

    @Override
    public int save(Canchas c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    



}
