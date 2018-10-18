package neta.systems.cliente.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class CatalogoDTO implements Serializable{
	
	@NonNull
	private int idCatalogo;
	private Integer idTipoCatalogo;
	private String valCatalogo;
	private String descCatalogo;
	private int idEstatus;
	private String usrCrea;
	private Date fchCrea;
	private String usrModi;
	private Date fchModi;

}
