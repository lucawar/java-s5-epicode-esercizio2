package it.epicode.be.godfather.model;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Ordini {

	private Long id;
	private Tavolo tavolo;
	private StatoOrdineEnum statoOrdine;
	private String nota;
	private Double importoTotale;
	private LocalDate oraAcquisizione;
	private List<FoodItem> elementiOrdine;
	private int coperti;

	@Override
	public String toString() {
		return "Ordini [id=" + id + ", tavolo=" + tavolo + ", statoOrdine=" + statoOrdine + ", nota=" + nota
				+ ", importoTotale=" + importoTotale + ", oraAcquisizione=" + oraAcquisizione + ", elementiOrdine="
				+ elementiOrdine + ", coperti=" + coperti + "]";
	}

}
