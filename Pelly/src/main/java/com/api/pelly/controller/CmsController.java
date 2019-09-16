package com.api.pelly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pelly.model.cms.CmsDto;
import com.api.pelly.service.CmsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(value="*")
@RestController
@RequestMapping("/cms")
@Api(tags="CMS 관련 API", value="CMS 관련 API")
public class CmsController {
	
	private CmsService cmsService;
	
	@Autowired
	public CmsController(CmsService cmsService) {
		this.cmsService = cmsService;
	}
	
	@ApiOperation(value="CMS 간략 목록")
	@GetMapping(value="/cmsList")
	public ResponseEntity<List<CmsDto>> getCmsList(){
		
		List<CmsDto> res = cmsService.getCmsList();
		
		return new ResponseEntity<>(res, HttpStatus.OK);
	}

}
