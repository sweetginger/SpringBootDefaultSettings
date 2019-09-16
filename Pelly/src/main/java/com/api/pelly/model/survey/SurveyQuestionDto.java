package com.api.pelly.model.survey;

import com.api.pelly.model.common.CommonDto;

/**
 * 설문 문항
 * @author hyr
 *
 */

public class SurveyQuestionDto extends CommonDto {

	/* 문항 번호 */
	private int questionSeq;
	
	/* 설문 번호 */
	private int surveySeq;
	
	/* 문항 제목 */
	private String title;
	
	/* 문항 답변유형 */
	private String type;
	
	/* 회사 ID */
	private int tenantId;
	
}
