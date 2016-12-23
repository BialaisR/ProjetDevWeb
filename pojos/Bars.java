package hei.devweb.barquartier.pojos;

import java.sql.Time;

public class Bars {

	private Integer idB;
	private String nameB;
	private String descritpionB;
	private String jourOuvB;
	private Time heureOuvB;
	private Time heureFermB;
	private String nomQ;
	private String styleB;
	private String imgB;
	
	public String getStyleB() {
		return styleB;
	}

	public void setStyleB(String styleB) {
		this.styleB = styleB;
	}

	
	public String getImgB() {
		return imgB;
	}

	public void setImgB(String imgB) {
		this.imgB = imgB;
	}

	public String getJourOuvB() {
		return jourOuvB;
	}

	public void setJourOuvB(String jourOuvB) {
		this.jourOuvB = jourOuvB;
	}

	public Time getHeureOuvB() {
		return heureOuvB;
	}

	public void setHeureOuvB(Time heureOuvB) {
		this.heureOuvB = heureOuvB;
	}

	public Time getHeureFermB() {
		return heureFermB;
	}

	public void setHeureFermB(Time heureFermB) {
		this.heureFermB = heureFermB;
	}

	public String getNomQ() {
		return nomQ;
	}

	public void setNomQ(String nomQ) {
		this.nomQ = nomQ;
	}

	public Integer getIdB() {
		return idB;
	}

	public void setIdB(Integer idB) {
		this.idB = idB;
	}

	public String getNameB() {
		return nameB;
	}

	public void setNameB(String nameB) {
		this.nameB = nameB;
	}

	public String getDescritpionB() {
		return descritpionB;
	}

	public void setDescritpionB(String descritpionB) {
		this.descritpionB = descritpionB;
	}

	public Bars(Integer idB, String nameB, String descritpionB, String jourOuvB, Time heureOuvB, Time heureFermB,
			String nomQ, String imgB, String styleB) {
		super();
		this.idB = idB;
		this.nameB = nameB;
		this.descritpionB = descritpionB;
		this.jourOuvB = jourOuvB;
		this.heureOuvB = heureOuvB;
		this.heureFermB = heureFermB;
		this.nomQ = nomQ;
		this.imgB = imgB;
		this.styleB = styleB;
	}
	
	
	
	

	
}
