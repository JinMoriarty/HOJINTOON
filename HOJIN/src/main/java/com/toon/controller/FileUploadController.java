package com.toon.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.toon.service.FileUploadService;

@Controller
public class FileUploadController {
	@Autowired
	FileUploadService fileUploadService;

	@RequestMapping("/form")
	public String form() {
		return "form";
	}

	@RequestMapping("/upload")
	public String upload(Model model, @RequestParam("email") String email, @RequestParam("file1") MultipartFile file) {

		String url = fileUploadService.restore(file);
		model.addAttribute("url", url);
		return "result";
	}
	
	@RequestMapping(value="/test", method= {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody int test(MultipartHttpServletRequest request) {
		MultipartFile file = request.getFile("file1");
		String name = request.getParameter("name");
		System.out.println(name);
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getContentType());
		
		String realPath = request.getSession().getServletContext().getRealPath("/resources/upload/");
		System.out.println(realPath);
		File dir = new File(realPath);
		if(!dir.exists()) dir.mkdirs();
		try {
			String line;
			BufferedReader br = new BufferedReader(new InputStreamReader(file.getInputStream(), "UTF-8"));
			while((line=br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			
			file.transferTo(new File(realPath, file.getOriginalFilename()));
		}catch (Exception e) {
			e.printStackTrace();
		}
		return 1;
	}

}




