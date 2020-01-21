package ch.swisslife.warenkorb.server.dto;

import lombok.Data;

@Data
public class KundeDto {

	private int id;
	private String geschlecht;
	private String vorname;
	private String nachname;
	private String adresse;
	private String ort;
	private String plz;
	private String email;

}
