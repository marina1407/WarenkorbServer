package ch.swisslife.warenkorb.server.dto;

import java.util.List;

import lombok.Data;

@Data
public class WarenkorbDto {

	private List<ProduktDto> produkte;

	public List<ProduktDto> getProdukte() {
		return produkte;
	}

	public void setProdukte(List<ProduktDto> produkte) {
		this.produkte = produkte;
	}
	
	
}
