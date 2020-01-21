package ch.swisslife.warenkorb.server.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ProduktListeDto {

	private List<ProduktDto> produktList;

	public List<ProduktDto> getProduktList() {
		return produktList;
	}

	public void setProduktList(List<ProduktDto> produktList) {
		this.produktList = produktList;
	}
	
	
	
}
