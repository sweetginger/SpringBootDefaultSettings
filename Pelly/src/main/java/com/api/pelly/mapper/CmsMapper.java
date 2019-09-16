package com.api.pelly.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.api.pelly.model.cms.CmsDto;

@Mapper
public interface CmsMapper {

	@Select("   SELECT cmsSeq"
			+ "			,CAST(AES_DECRYPT(FROM_BASE64(cmsName), 'pE##yCrM^') AS CHAR) cmsName"
			+ " FROM cms ")
	List<CmsDto> getCmsList();
	
}
