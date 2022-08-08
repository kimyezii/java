package study_0808;

public class CertificationItem {

	private String no; 			// 인증번호
	private String typeName; 	// 인증종류명
	private String farm; 		// 인증농가
	private String name; 		// 인증품목명
	private Integer cultivationArea; // 재배면적
	private Integer plan; 		// 생산 계획량
	private String startData; 	// 인증기간(시작일)
	private String endData; 	// 인증기간(종료일)
	private String rawMaterialCertificationClassification; // 원재료인증구분

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getFarm() {
		return farm;
	}

	public void setFarm(String farm) {
		this.farm = farm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCultivationArea() {
		return cultivationArea;
	}

	public void setCultivationArea(Integer cultivationArea) {
		this.cultivationArea = cultivationArea;
	}

	public Integer getPlan() {
		return plan;
	}

	public void setPlan(Integer plan) {
		this.plan = plan;
	}

	public String getStartData() {
		return startData;
	}

	public void setStartData(String startData) {
		this.startData = startData;
	}

	public String getEndData() {
		return endData;
	}

	public void setEndData(String endData) {
		this.endData = endData;
	}

	public String getRawMaterialCertificationClassification() {
		return rawMaterialCertificationClassification;
	}

	public void setRawMaterialCertificationClassification(String rawMaterialCertificationClassification) {
		this.rawMaterialCertificationClassification = rawMaterialCertificationClassification;
	}

	public String toString() {
		return no + ", " + typeName + ", " + farm + ", " + name + ", " + cultivationArea + ", " + plan + ", "
				+ startData + ", " + endData + ", " + rawMaterialCertificationClassification;
	}

}
