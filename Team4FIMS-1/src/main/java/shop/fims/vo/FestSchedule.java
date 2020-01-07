package shop.fims.vo;

/**
 * @file shop.fims.vo.FestSchedule.java
 * @name FestSchedule
 * @brief 부서별 축제 실행 일정관리
 * @author ksmart33 김동석
 */
public class FestSchedule {

	private String FestSchCd ; //축제계획실행일정관리코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCd ; //전국지역코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String FestCd ; //축제코드 
	private String ManComCd ; //위원회코드 
	private String AccMemCd ; //하나의 거래처별 소속 회원코드 
	private String FesconManCd ; //모든축제계약관리코드 
	private String FestTitle ; //축제명 
	private String FestSchNo ; //확인차수 
	private String FestSchDt ; //날짜 
	private String FestScheNm ; //일정명 
	private String FestScheTask ; //내용 
	private String FestSchComment ; //담당자피드백 
	private String FestSchEtc ; //비고 
	private String FestSchAttach ; //첨부파일 
	private String InsertDt ; //작성일 
	
	public String getFestSchCd() {
		return FestSchCd;
	}
	public void setFestSchCd(String festSchCd) {
		FestSchCd = festSchCd;
	}
	public String getAreacityAdminCd() {
		return AreacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		AreacityAdminCd = areacityAdminCd;
	}
	public String getAreaCd() {
		return AreaCd;
	}
	public void setAreaCd(String areaCd) {
		AreaCd = areaCd;
	}
	public String getAreaCityCd() {
		return AreaCityCd;
	}
	public void setAreaCityCd(String areaCityCd) {
		AreaCityCd = areaCityCd;
	}
	public String getFestCd() {
		return FestCd;
	}
	public void setFestCd(String festCd) {
		FestCd = festCd;
	}
	public String getManComCd() {
		return ManComCd;
	}
	public void setManComCd(String manComCd) {
		ManComCd = manComCd;
	}
	public String getAccMemCd() {
		return AccMemCd;
	}
	public void setAccMemCd(String accMemCd) {
		AccMemCd = accMemCd;
	}
	public String getFesconManCd() {
		return FesconManCd;
	}
	public void setFesconManCd(String fesconManCd) {
		FesconManCd = fesconManCd;
	}
	public String getFestTitle() {
		return FestTitle;
	}
	public void setFestTitle(String festTitle) {
		FestTitle = festTitle;
	}
	public String getFestSchNo() {
		return FestSchNo;
	}
	public void setFestSchNo(String festSchNo) {
		FestSchNo = festSchNo;
	}
	public String getFestSchDt() {
		return FestSchDt;
	}
	public void setFestSchDt(String festSchDt) {
		FestSchDt = festSchDt;
	}
	public String getFestScheNm() {
		return FestScheNm;
	}
	public void setFestScheNm(String festScheNm) {
		FestScheNm = festScheNm;
	}
	public String getFestScheTask() {
		return FestScheTask;
	}
	public void setFestScheTask(String festScheTask) {
		FestScheTask = festScheTask;
	}
	public String getFestSchComment() {
		return FestSchComment;
	}
	public void setFestSchComment(String festSchComment) {
		FestSchComment = festSchComment;
	}
	public String getFestSchEtc() {
		return FestSchEtc;
	}
	public void setFestSchEtc(String festSchEtc) {
		FestSchEtc = festSchEtc;
	}
	public String getFestSchAttach() {
		return FestSchAttach;
	}
	public void setFestSchAttach(String festSchAttach) {
		FestSchAttach = festSchAttach;
	}
	public String getInsertDt() {
		return InsertDt;
	}
	public void setInsertDt(String insertDt) {
		InsertDt = insertDt;
	}
	
	@Override
	public String toString() {
		return "FestSchedule [FestSchCd=" + FestSchCd + ", AreacityAdminCd=" + AreacityAdminCd + ", AreaCd=" + AreaCd
				+ ", AreaCityCd=" + AreaCityCd + ", FestCd=" + FestCd + ", ManComCd=" + ManComCd + ", AccMemCd="
				+ AccMemCd + ", FesconManCd=" + FesconManCd + ", FestTitle=" + FestTitle + ", FestSchNo=" + FestSchNo
				+ ", FestSchDt=" + FestSchDt + ", FestScheNm=" + FestScheNm + ", FestScheTask=" + FestScheTask
				+ ", FestSchComment=" + FestSchComment + ", FestSchEtc=" + FestSchEtc + ", FestSchAttach="
				+ FestSchAttach + ", InsertDt=" + InsertDt + "]";
	}

}
