package com.springcloud.sluth.demo.service;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import freemarker.template.Template;
import freemarker.template.TemplateException;

@Service
public class MailService {
	
	@Autowired
	private FreeMarkerConfigurer configurer;
	
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendSimpleMail() throws MessagingException, TemplateException {
		MimeMessage message = mailSender.createMimeMessage();
		
		MimeMessageHelper helper = new MimeMessageHelper(message,true);
		
		helper.setFrom("xiemeng2519@163.com");
		
		helper.setTo("1251729631@qq.com");
		
		helper.setSubject("欢迎 进入英雄联盟");
		
		helper.setText("吃鸡");
		
		String filePath="e:\\Downloads.rar";
		
		Map model = new HashMap();
		
		model.put("workID", "100239411");
		
		model.put("contractTerm","2018-2019");
		
		model.put("beginContract",new Date());
		
		model.put("endContract",new Date());
		
		model.put("departmentName","服务部门");
		
		model.put("posName", "项目经理");
		
		model.put("name","无名");
		
		FileSystemResource file=new FileSystemResource(new File(filePath));
		//获取文件的名称
		String fileName=filePath.substring(filePath.lastIndexOf(File.separator));
        //添加附件
		helper.addAttachment(fileName, file);
        try {
        	//获取模板
			configurer.getConfiguration().setClassLoaderForTemplateLoading(ClassLoader.getSystemClassLoader(),"ftl");
			
			Template template = configurer.getConfiguration().getTemplate("mailTemplate.ftl");
			//根据模板解析发送邮件
			String content=FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
			
			helper.setText(content,true);
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        mailSender.send(message);
	}
}
