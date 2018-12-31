package com.springcloud.sluth.demo.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.sluth.demo.service.MailService;
import com.springcloud.sluth.demo.service.POIService;
import com.springcloud.sluth.demo.vo.MapVO;

import freemarker.template.TemplateException;

@RestController
public class MailController {
	
	@Autowired
	private MailService mailService;
	
	@Autowired
	private POIService poiService;
	
	@RequestMapping("/sendMail")
	public String sendMail() throws InterruptedException, MessagingException, TemplateException {
		mailService.sendSimpleMail();
		return "success";
	}
	@RequestMapping("createExcel")
	public String createExcel() {
		return poiService.createExcel();
	}
	@RequestMapping(value = "getMapVO",method=RequestMethod.POST)
	public MapVO getMapVO(MapVO mapVO) {
		return mapVO;
	}
	
}
