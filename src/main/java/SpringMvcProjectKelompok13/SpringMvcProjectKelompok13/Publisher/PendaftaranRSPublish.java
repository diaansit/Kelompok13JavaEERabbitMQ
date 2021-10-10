package SpringMvcProjectKelompok13.SpringMvcProjectKelompok13.Publisher;


import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringMvcProjectKelompok13.SpringMvcProjectKelompok13.Pendaftaran.PendaftaranRS;
import SpringMvcProjectKelompok13.SpringMvcProjectKelompok13.Pendaftaran.StatusPendaftaran;
import SpringMvcProjectKelompok13.SpringMvcProjectKelompok13.config.PendaftaranConfiguration;



@RestController
@RequestMapping("/daftar")
public class PendaftaranRSPublish {
	@Autowired
	private RabbitTemplate template;
	
	@PostMapping("/{namapasienMendaftar}")
	public String Order(@RequestBody PendaftaranRS daftar, @PathVariable String namapasienMendaftar) {
		daftar.setId(UUID.randomUUID().toString());
		
		StatusPendaftaran statusDaftar = new StatusPendaftaran(daftar, "Proses", "Berhasil menambahkan data anda menjadi pasien " + namapasienMendaftar);
		template.convertAndSend(PendaftaranConfiguration.EXCHANGE, PendaftaranConfiguration.ROUTING_KEY, statusDaftar);
		return "Data anda berhasil dikirim sebagai pasien";
	}
}
