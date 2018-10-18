package neta.systems.cliente.persistence.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import neta.systems.cliente.persistence.entities.CatalogoGeneral;
import neta.systems.cliente.persistence.entities.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Integer> {

	List<Cliente> findAllByCatalogoGeneralIdCatalogo(Integer idEstatus);
	
	List<Cliente> findAllByEmailCliente(String email);
	
	List<Cliente> findAllByCelCliente(String cel);
	
	Cliente findClienteByCelClienteAndEmailClienteAndCatalogoGeneralIdCatalogo(String cel, String email,String idEstatus);
	
}
