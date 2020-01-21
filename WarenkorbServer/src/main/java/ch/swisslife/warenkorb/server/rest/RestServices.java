package ch.swisslife.warenkorb.server.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ch.swisslife.warenkorb.server.dto.BestellungDto;
import ch.swisslife.warenkorb.server.dto.ProduktDto;
import ch.swisslife.warenkorb.server.dto.ProduktListeDto;
import ch.swisslife.warenkorb.server.dto.WarenkorbDto;
import ch.swisslife.warenkorb.server.persistence.DataAccessObject;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Path("/warenkorb-api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestServices {

	private DataAccessObject dao = new DataAccessObject();

	/**
	 * Gibt alle gespeicherten Produkte, die sich in der Datenbank befinden zurück.
	 * 
	 * @return Liste aller gespreicherten Produkte
	 */
	@GET
	@Path("/getAllProducts")
	@ApiOperation(value = "Gibt alle verfuegbaren Produkte zurück. ", response = ProduktListeDto.class)
	public Response getProduktListe() {
		ProduktListeDto liste = new ProduktListeDto();
		liste.setProduktList(dao.getAllProdukte());
		return Response.ok(liste).build();
	}

	/**
	 * Fügt das übergebene Produkt zum Warenkorb hinzu.s
	 * 
	 * @param aProduct
	 */
	@POST
	@Path("/addToWarenkorb")
	@ApiOperation(value = "Fuegt ein Produkt zum Warenkorb hinzu. ", response = Void.class)
	public Response addToWarenkorb(@ApiParam(name = "product", value = "Produkt") ProduktDto aProduct) {
		dao.addToWarenkorb(aProduct);
		return Response.ok().build();
	}

	@GET
	@Path("/getWarenkorb")
	@ApiOperation(value = "Gibt den Warenkorb zurueck. ", response = WarenkorbDto.class)
	public Response getWarenkorb() {
		return Response.ok(dao.getWarenkorb()).build();
	}

	/**
	 * Fügt die aufgegebene Bestellung zur Liste der Bestellungen hinzu.
	 * 
	 * @param aBestellung
	 */
	@POST
	@Path("/addToBestellList")
	@ApiOperation(value = "Fuegt eine Bestellung zur Bestellliste hinzu. ", response = Void.class)
	public Response addToBestelltListe(@ApiParam(name = "bestellung", value = "Bestellung") BestellungDto aBestellung) {
		dao.addToBestelltListe(aBestellung);
		return Response.ok().build();
	}

}
