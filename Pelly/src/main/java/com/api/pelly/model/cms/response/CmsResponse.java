package com.api.pelly.model.cms.response;

import com.api.pelly.model.cms.CmsDto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CmsResponse {

	@ApiModelProperty(value="회사 이름", dataType="int")
	private int tenantName;
	
	@ApiModelProperty(value="CMS 정보", dataType="Object")
	private CmsDto cmsDto;
	
}
