package ch.swisslife.warenkorb.server.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProduktDto implements Serializable {

	private int id;
	private String bezeichnung;
	private int preis;

	public ProduktDto(int anId, String aBezeichnung, int aPreis) {
		id = anId;
		bezeichnung = aBezeichnung;
		preis = aPreis;
	}
}
