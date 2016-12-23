package hei.devweb.barquartier.pojos;

public class Quartiers {

	private Integer idQ;
	private String nameQ;
	private String descritpionQ;
	private String imgQuartier;
	
	public String getImgQuartier() {
		return imgQuartier;
	}

	public void setImgQuartier(String imgQuartier) {
		this.imgQuartier = imgQuartier;
	}

	public Integer getIdQ() {
		return idQ;
	}

	public void setIdQ(Integer idQ) {
		this.idQ = idQ;
	}

	public String getNameQ() {
		return nameQ;
	}

	public void setNameQ(String nameQ) {
		this.nameQ = nameQ;
	}

	public String getDescritpionQ() {
		return descritpionQ;
	}

	public void setDescritpionQ(String descritpionQ) {
		this.descritpionQ = descritpionQ;
	}

	public Quartiers(Integer idQ, String nameQ, String descritpionQ, String imgQuartier) {
		super();
		this.idQ = idQ;
		this.nameQ = nameQ;
		this.descritpionQ = descritpionQ;
		this.imgQuartier = imgQuartier;
	}

}
