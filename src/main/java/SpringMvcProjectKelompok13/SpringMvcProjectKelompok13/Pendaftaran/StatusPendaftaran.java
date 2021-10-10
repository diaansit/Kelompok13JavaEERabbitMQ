package SpringMvcProjectKelompok13.SpringMvcProjectKelompok13.Pendaftaran;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor 
@ToString
public class StatusPendaftaran {
	private PendaftaranRS pendaftaranRS;
	private String status;
	private String message;
	
	
	public StatusPendaftaran(PendaftaranRS pendaftaranRS, String status, String message) {
		super();
		this.pendaftaranRS = pendaftaranRS;
		this.status = status;
		this.message = message;
	}
	public PendaftaranRS getPendaftaranRS() {
		return pendaftaranRS;
	}
	public void setPendaftaranRS(PendaftaranRS pendaftaranRS) {
		this.pendaftaranRS = pendaftaranRS;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

	

}
