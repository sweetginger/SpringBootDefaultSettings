package com.api.pelly.model.survey;

/**
 * 설문 응답결과
 * @author hyr
 *
 */

public class SurveyResultDto {

	/* 답변 번호 */
	private String resultSeq;
	
	/* 설문 키 */
	private String surveyKey;
	
	/* 설문 번호 */
	private String surveySeq;
	
	/* 문항 번호 */
	private String questionSeq;
	
	/* 답변 번호 */
	private String answerSeq;
	
	/* 답변 값 */
	private String value;
	
	/* 응답 일시 */
	private String resultDt;
	
}
