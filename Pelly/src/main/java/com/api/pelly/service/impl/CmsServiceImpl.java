package com.api.pelly.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.pelly.mapper.CmsMapper;
import com.api.pelly.model.cms.CmsDto;
import com.api.pelly.model.cms.response.CmsResponse;
import com.api.pelly.model.common.CommonPageResponse;
import com.api.pelly.service.CmsService;

@Service
public class CmsServiceImpl implements CmsService {

	private CmsMapper cmsMapper;
	
	@Autowired
	public CmsServiceImpl(CmsMapper cmsMapper) {
		this.cmsMapper = cmsMapper;
	}

	@Override
	public List<CmsDto> getCmsList() {

		List<CmsDto> cmsList = cmsMapper.getCmsList();
		
		return cmsList;
	}

	@Override
	public List<CommonPageResponse> getCmsDetailList() {

//		List<CmsResponse> cmsDetailList = cmsMapper
		
		return null;
	}

	@Override
	public CmsResponse getCms(int cmsSeq) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
