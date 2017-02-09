package com.ktds.jjh.hr.vo;

public class CountriesVO {
	
	private String countryId;
	private String conuntyName;
	private int regionId;
	
	private RegionsVO regionsVO;
	
	public RegionsVO getRegionsVO() {
		
		if(	regionsVO == null) {
			regionsVO = new RegionsVO();
			
		}
		return regionsVO;
	}
	public void setRegionsVO(RegionsVO regionsVO) {
		this.regionsVO = regionsVO;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getConuntyName() {
		return conuntyName;
	}
	public void setConuntyName(String conuntyName) {
		this.conuntyName = conuntyName;
	}
	public int getRegionId() {
		return regionId;
	}
	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

}
