package com.api.pelly.model.survey;

import com.api.pelly.model.common.CommonDto;

/**
 * 설문 답변항목
 * @author hyr
 *
 */

public class SurveyAnswerDto extends CommonDto {

	/* 답변 번호 */
	private int answerSeq;
	
	/* 문항 번호 */
	private int questionSeq;
	
	/* 답변 제목 */
	private String title;
	
	/* 답변 값 */
	private String value;
	
	/* 회사 ID */
	private int tenantId;
	
}
