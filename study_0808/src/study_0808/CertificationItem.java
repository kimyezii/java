package study_0808;

public class CertificationItem {

	private String no; 			// ������ȣ
	private String typeName; 	// ����������
	private String farm; 		// ������
	private String name; 		// ����ǰ���
	private Integer cultivationArea; // ������
	private Integer plan; 		// ���� ��ȹ��
	private String startData; 	// �����Ⱓ(������)
	private String endData; 	// �����Ⱓ(������)
	private String rawMaterialCertificationClassification; // �������������

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
