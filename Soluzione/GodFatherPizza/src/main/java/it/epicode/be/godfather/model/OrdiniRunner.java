package it.epicode.be.godfather.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.epicode.be.godfather.GestioneMenu;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OrdiniRunner implements CommandLineRunner {

	private final GestioneMenu gestioneMenu;
	private final Ordini ordine1;

	public OrdiniRunner(GestioneMenu gestioneMenu, Ordini ordine1) {
		this.gestioneMenu = gestioneMenu;
		this.ordine1 = ordine1;
	}

	@Override
	public void run(String... args) throws Exception {
		gestioneMenu.stampaMenu();

		log.info("ordine1");
	}

}
