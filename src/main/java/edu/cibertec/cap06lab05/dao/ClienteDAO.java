
package edu.cibertec.cap06lab05.dao;
import edu.cibertec.cap06lab05.entity.ClienteEntity;
import java.util.List;

public interface ClienteDAO {
    public List<ClienteEntity> clienteQry();
    
    public String clientesIns(ClienteEntity clientes);
    
    public String clientesDel(String ids);
    
    public String clientesUpd(ClienteEntity clientes);
    
    public ClienteEntity clientesGet(Integer idcliente);
    
}
