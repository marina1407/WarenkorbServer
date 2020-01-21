package ch.swisslife.warenkorb.server.dto;

import lombok.Data;

@Data
public class BestellungDto {

	private int id;
	private WarenkorbDto warenkorb;
	private KundeDto kunde;
	
}
