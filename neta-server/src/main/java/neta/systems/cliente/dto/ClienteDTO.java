package neta.systems.cliente.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class ClienteDTO implements Serializable {

	private int idCliente;
	private String nombrecliente;
	private String apellidoPatCliente;
	private String apellidoMatCliente;
	private String emailCliente;
	private Date fnacCliente;
	private String celCliente;
	
}
