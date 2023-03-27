import java.util.Optional;

import com.canchas_admin.model.Canchas;

public interface icanchas {
    public List<Canchas> listar();
    public Optional<Canchas> listarID(int id);
    public int save (Canchas c);
    public void delete(int id);
    
}
