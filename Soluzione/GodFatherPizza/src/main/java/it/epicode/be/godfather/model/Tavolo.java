package it.epicode.be.godfather.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tavolo {

	private int id;
	private StatoTavoloEnum statoTavolo;
	private int coperti;

	public Tavolo(int id, StatoTavoloEnum statoTavolo, int coperti) {

		this.id = id;
		this.statoTavolo = statoTavolo;
		this.coperti = coperti;
	}

	@Override
	public String toString() {
		return "Tavolo [id=" + id + ", statoTavolo=" + statoTavolo + ", coperti=" + coperti + "]";
	}

}
