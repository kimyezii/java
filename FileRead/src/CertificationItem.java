public class CertificationItem {
    private String certificationNo;// 인증번호
    private String certificationTypeName;// 인증종류명
    private String certificationFarm;// 인증농가
    private String certificationItemName;// 인증품목명
    private String cultivationArea;// 재배면적
    private String productionPlannedAmount;// 생산 계획량
    private String certificationStartDate;// 인증기간(시작일)
    private String certificationEndDate;    // 인증기간(종료일)
    private String rawMaterialCertificationClassification; // 원재료인증구분

    public String getCertificationNo() {
        return certificationNo;
    }

    public void setCertificationNo(String certificationNo) {
        this.certificationNo = certificationNo;
    }

    public String getCertificationTypeName() {
        return certificationTypeName;
    }

    public void setCertificationTypeName(String certificationTypeName) {
        this.certificationTypeName = certificationTypeName;
    }

    public String getCertificationFarm() {
        return certificationFarm;
    }

    public void setCertificationFarm(String certificationFarm) {
        this.certificationFarm = certificationFarm;
    }


    public String getCertificationItemName() {
        return certificationItemName;
    }

    public void setCertificationItemName(String certificationItemName) {
        this.certificationItemName = certificationItemName;
    }

    public String getCultivationArea() {
        return cultivationArea;
    }

    public void setCultivationArea(String cultivationArea) {
        this.cultivationArea = cultivationArea;
    }

    public String getProductionPlannedAmount() {
        return productionPlannedAmount;
    }

    public void setProductionPlannedAmount(String productionPlannedAmount) {
        this.productionPlannedAmount = productionPlannedAmount;
    }

    public String getCertificationStartDate() {
        return certificationStartDate;
    }

    public void setCertificationStartDate(String certificationStartDate) {
        this.certificationStartDate = certificationStartDate;
    }

    public String getCertificationEndDate() {
        return certificationEndDate;
    }

    public void setCertificationEndDate(String certificationEndDate) {
        this.certificationEndDate = certificationEndDate;
    }

    public String getRawMaterialCertificationClassification() {
        return rawMaterialCertificationClassification;
    }

    public void setRawMaterialCertificationClassification(String rawMaterialCertificationClassification) {
        this.rawMaterialCertificationClassification = rawMaterialCertificationClassification;
    }

    public static void certification() {
        System.out.println("순번" + "\t" + "인증번호" + "\t" + "인증종류명" + "\t" + "인증농가" + "\t" + "인증품목명" + "\t" + "재배면적" + "\t"
                + "생산계획량" + "\t" + "인증기간(시작일)" + "\t" + "인증기간(종료일)" + "\t" + "원재료인증구분");
    }

    public void certificationInfo() {
        System.out.println(certificationNo + "\t" + certificationTypeName + "\t" + certificationFarm + "\t"
                + certificationItemName + "\t" + cultivationArea + "\t" + productionPlannedAmount + "\t"
                + certificationStartDate + "\t" + certificationEndDate + "\t" + rawMaterialCertificationClassification);
    }
}
