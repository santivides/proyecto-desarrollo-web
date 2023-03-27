package com.canchas_admin.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.canchas_admin.model.Canchas;

public interface Icanchas {
    public List<Canchas> listar();
    public Optional<Canchas> listarID(int id);
    public int save (Canchas c);
    public void delete(int id);
}
