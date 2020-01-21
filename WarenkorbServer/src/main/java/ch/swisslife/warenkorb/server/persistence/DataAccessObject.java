package ch.swisslife.warenkorb.server.persistence;

import java.util.List;

import ch.swisslife.warenkorb.server.dto.BestellungDto;
import ch.swisslife.warenkorb.server.dto.ProduktDto;
import ch.swisslife.warenkorb.server.dto.WarenkorbDto;

/**
 * Dieses DAO regelt alle Zugriffe auf die Datenbank.
 * 
 * @author Marina
 *
 */
public class DataAccessObject {

	private DataBase db = new DataBase();

	/**
	 * Liest alle gespreicherten Produkte aus der Datenbank aus.
	 * 
	 * @return Liste aller Produkte
	 */
	public List<ProduktDto> getAllProdukte() {
		return db.getAlleProdukte();
	}

	/**
	 * F�gt ein Produkt zum Warenkorb hinzu.
	 * 
	 * @param aProduktDto
	 */
	public void addToWarenkorb(ProduktDto aProduktDto) {
		db.getAktuellerWarenkorb().getProdukte().add(aProduktDto);
	}

	/**
	 * Gibt den Warenkorb zur�ck.
	 * 
	 * @return Warenkorb
	 */
	public WarenkorbDto getWarenkorb() {
		return db.getAktuellerWarenkorb();
	}

	/**
	 * F�gt die Bestellung zu der Liste der bereits aufgegebenen bestellungen hinzu.
	 * 
	 * @param aBestellung
	 */
	public void addToBestelltListe(BestellungDto aBestellung) {
		db.getAlleBestellungen().add(aBestellung);
	}

}
