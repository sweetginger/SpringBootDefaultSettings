package com.api.pelly.model.cms;

import com.api.pelly.model.common.CommonDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * CMS 마스터
 * @author hyr
 *
 */

@Getter @Setter
@Builder
@AllArgsConstructor @NoArgsConstructor
public class CmsDto extends CommonDto {

	/* CMS 번호 */
	private int cmsSeq;
	
	/* CMS 이름 */
	private String cmsName;
	
	/* 답변 사용여부 */
	private String replyYn;
	
	/* 회사 ID */
	private int tenantId;
	
	/* 댓글 사용여부 */
	private String commentYn;
	
	/* 게시글유형 사용여부 */
	private String articleTypeYn;
	
	/* 공지 사용여부 */
	private String noticeYn;
	
	/* 에디터 사용여부 */
	private String editorYn;
	
	/* 첨부파일 사용여부 */
	private String attachFileYn;
	
}
