package ch.swisslife.warenkorb.server.persistence;

import java.util.List;

import ch.swisslife.warenkorb.server.dto.BestellungDto;
import ch.swisslife.warenkorb.server.dto.ProduktDto;
import ch.swisslife.warenkorb.server.dto.WarenkorbDto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class DataBase {

	private List<ProduktDto> alleProdukte;
	private List<BestellungDto> alleBestellungen;
	private WarenkorbDto aktuellerWarenkorb;

	public DataBase() {

		alleProdukte.add(new ProduktDto(1, "iPad 128 GB", 239));
		alleProdukte.add(new ProduktDto(2, "iPad Ladekabel", 39));
		alleProdukte.add(new ProduktDto(3, "Apple Kopfhoerer", 39));
		alleProdukte.add(new ProduktDto(4, "MacBook Pro 15 512 GB", 1500));
		alleProdukte.add(new ProduktDto(5, "iPhone 11 256 GB", 1299));
		alleProdukte.add(new ProduktDto(6, "iPhone 11 128 GB", 1099));
		alleProdukte.add(new ProduktDto(7, "Samsung Galaxy s10 256 GB", 799));
		alleProdukte.add(new ProduktDto(8, "Samsung Galaxy s10 128 GB", 699));

	}

	public List<ProduktDto> getAlleProdukte() {
		return alleProdukte;
	}

	public void setAlleProdukte(List<ProduktDto> alleProdukte) {
		this.alleProdukte = alleProdukte;
	}

	public List<BestellungDto> getAlleBestellungen() {
		return alleBestellungen;
	}

	public void setAlleBestellungen(List<BestellungDto> alleBestellungen) {
		this.alleBestellungen = alleBestellungen;
	}

	public WarenkorbDto getAktuellerWarenkorb() {
		return aktuellerWarenkorb;
	}

	public void setAktuellerWarenkorb(WarenkorbDto aktuellerWarenkorb) {
		this.aktuellerWarenkorb = aktuellerWarenkorb;
	}

}
