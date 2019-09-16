package com.api.pelly.model.survey;

import com.api.pelly.model.common.CommonDto;

/**
 * 설문 마스터
 * @author hyr
 *
 */

public class SurveyMasterDto extends CommonDto {

	/* 설문 번호 */
	private int surveySeq;
	
	/* 설문 제목 */
	private String title;
	
	/* 설문 내용 */
	private String content;

	/* 회사 ID */
	private int tenantId;
	
}
