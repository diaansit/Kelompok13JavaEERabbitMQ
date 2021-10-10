package SpringMvcProjectKelompok13.SpringMvcProjectKelompok13.Pendaftaran;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PendaftaranRS {
	private String id, nama, noKtp, gender, penyakit, alamat, namaDokter;
	
	public PendaftaranRS() {}
	
	

	public PendaftaranRS(String id, String nama, String noKtp, String gender, String penyakit, String alamat,
			String namaDokter) {
		super();
		this.id = id;
		this.nama = nama;
		this.noKtp = noKtp;
		this.gender = gender;
		this.penyakit = penyakit;
		this.alamat = alamat;
		this.namaDokter = namaDokter;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNoKtp() {
		return noKtp;
	}

	public void setNoKtp(String noKtp) {
		this.noKtp = noKtp;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPenyakit() {
		return penyakit;
	}

	public void setPenyakit(String penyakit) {
		this.penyakit = penyakit;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getNamaDokter() {
		return namaDokter;
	}

	public void setNamaDokter(String namaDokter) {
		this.namaDokter = namaDokter;
	}
}
