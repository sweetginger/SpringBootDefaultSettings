package com.api.pelly.service;

import java.util.List;

import com.api.pelly.model.cms.CmsDto;
import com.api.pelly.model.cms.response.CmsResponse;
import com.api.pelly.model.common.CommonPageResponse;

public interface CmsService {

	/**
	 * CMS 간략정보 리스트 반환
	 * @return
	 */
	List<CmsDto> getCmsList();
	
	/**
	 * CMS 상세정보 리스트 반환
	 * @return
	 */
	List<CommonPageResponse> getCmsDetailList();
	
	/**
	 * CMS 단일정보 반환
	 * @return
	 */
	CmsResponse getCms(int cmsSeq);
	
}
