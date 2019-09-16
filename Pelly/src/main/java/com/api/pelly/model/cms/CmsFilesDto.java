package com.api.pelly.model.cms;

import com.api.pelly.model.common.CommonDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * CMS 파일
 * @author hyr
 *
 */

@Getter @Setter
@Builder
@AllArgsConstructor @NoArgsConstructor
public class CmsFilesDto extends CommonDto {

	/* 파일 번호 */
	private int fileSeq;
	
	/* 참조 유형 (게시글, 댓글) */
	private String refType;
	
	/* 참조 글번호 */
	private int refSeq;
	
	/* 파일 경로 */
	private String filePath;
	
	/* 파일명 */
	private String fileName;
	
	/* 저장 파일명 */
	private String savedFileName;
	
}
