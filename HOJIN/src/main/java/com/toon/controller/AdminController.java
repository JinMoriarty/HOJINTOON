package com.toon.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;

import com.toon.domain.CategoryVO;
import com.toon.domain.IntoonVO;
import com.toon.domain.MemberVO;
import com.toon.domain.ToonVO;
//import com.toon.domain.OrderListVO;
//import com.toon.domain.OrderVO;
//import com.toon.domain.ReplyListVO;
//import com.toon.domain.ReplyVO;
//import com.toon.service.AdminService;
//import com.toon.utils.UploadFileUtils;
import com.toon.service.AdminService;
import com.toon.utils.UploadFileUtils;

import net.sf.json.JSONArray;

//import net.sf.json.JSONArray;

@Controller
@RequestMapping("/admin/*")
public class AdminController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Inject
	AdminService adminService;
	
	@Resource(name="uploadPath")
	private String uploadPath;
	
	// 관리자화면
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public void getIndex() throws Exception {
		logger.info("get index"); 
	}
	
	// 카테고리
	@RequestMapping(value = "/toons/register", method = RequestMethod.GET)
	public void getToonsRegister(Model model) throws Exception {
	 logger.info("get toons register");
	 
	 List<CategoryVO> category = null;
	 category = adminService.category();
	 model.addAttribute("category", JSONArray.fromObject(category));
	}
	
	// 작품 등록
	@RequestMapping(value = "/toons/register", method = RequestMethod.POST)
	public String postToonRegister(ToonVO vo, MultipartFile file) throws Exception {
		
		String imgUploadPath = uploadPath + File.separator + "imgUpload";
		String ymdPath = UploadFileUtils.calcPath(imgUploadPath);
		String fileName = null;

		if(file.getOriginalFilename() != null && file.getOriginalFilename() != "") {
		 fileName =  UploadFileUtils.fileUpload(imgUploadPath, file.getOriginalFilename(), file.getBytes(), ymdPath); 
		} else {
		 fileName = uploadPath + File.separator + "images" + File.separator + "none.png";
		}

		vo.setToonImg(File.separator + "imgUpload" + ymdPath + File.separator + fileName);
		vo.setToonThumbImg(File.separator + "imgUpload" + ymdPath + File.separator + "s" + File.separator + "s_" + fileName);
		
		logger.info("post toon register");
		
		adminService.register(vo);
		
		return "redirect:/admin/index";
	}
	
	// 작품 수정
	@RequestMapping(value = "/goods/modify", method = RequestMethod.GET)
	public void getToonsModify(@RequestParam("n") int toonNum, Model model) throws Exception {
		logger.info("post Toons modify");
		
		ToonVO Toon = adminService.ToonView(toonNum);
		
		model.addAttribute("Toon", Toon);
	}
	
	// 작품 수정
	@RequestMapping(value = "goods/modify", method = RequestMethod.POST)
	public String postToonModify(ToonVO vo, MultipartFile file, HttpServletRequest req) throws Exception {	
		logger.info("post Toons modify");
		
		// 새로운 파일이 등록되었는지 확인
		 if(file.getOriginalFilename() != null && file.getOriginalFilename() != "") {
		  // 기존 파일을 삭제
		  new File(uploadPath + req.getParameter("toonImg")).delete();
		  new File(uploadPath + req.getParameter("toonThumbImg")).delete();
		  
		  // 새로 첨부한 파일을 등록
		  String imgUploadPath = uploadPath + File.separator + "imgUpload";
		  String ymdPath = UploadFileUtils.calcPath(imgUploadPath);
		  String fileName = UploadFileUtils.fileUpload(imgUploadPath, file.getOriginalFilename(), file.getBytes(), ymdPath);
		  
		  vo.setToonImg(File.separator + "imgUpload" + ymdPath + File.separator + fileName);
		  vo.setToonThumbImg(File.separator + "imgUpload" + ymdPath + File.separator + "s" + File.separator + "s_" + fileName);
		  
		 } else {  // 새로운 파일이 등록되지 않았다면
		  // 기존 이미지를 그대로 사용
		  vo.setToonImg(req.getParameter("toonImg"));
		  vo.setToonThumbImg(req.getParameter("toonThumbImg"));
		  
		 }
		
		adminService.ToonModify(vo);
		
		return "redirect:/admin/index";
	}
	
	// 작품 삭제
	@RequestMapping(value = "/goods/delete", method = RequestMethod.POST)
	public String postToonDelete(@RequestParam("n") int toonNum) throws Exception {
		logger.info("post Toons delete");
		
		adminService.ToonDelete(toonNum);
		
		return "redirect:/admin/index";
	}
	
	// 작품 목록
		@RequestMapping(value = "/toons/list", method = RequestMethod.GET)
		public void getToonsList(Model model) throws Exception {
			logger.info("get toons list");
			
			List<ToonVO> list = adminService.toonslist();
			
			model.addAttribute("list",list);			
		}
		
	// 상세 작품 페이지
		@RequestMapping(value = "/goods/view", method = RequestMethod.GET)
		public void getToonsview(@RequestParam("n") int toonNum, Model model) throws Exception {
			logger.info("get toons view");
			
			ToonVO Toon = adminService.ToonView(toonNum);
			
			model.addAttribute("Toon", Toon);
		}
		

	// ck 에디터에서 파일 업로드
		@RequestMapping(value = "/goods/ckUpload", method = RequestMethod.POST)
		public void postCKEditorImgUpload(HttpServletRequest req, HttpServletResponse res,
		 @RequestParam MultipartFile upload) throws Exception {
		 logger.info("post CKEditor img upload");
		 
		 // 랜덤 문자 생성
		 UUID uid = UUID.randomUUID();
		 
		 OutputStream out = null;
		 PrintWriter printWriter = null;
		   
		 // 인코딩
		 res.setCharacterEncoding("utf-8");
		 res.setContentType("text/html;charset=utf-8");
		 
		 try {
		  
		  String fileName = upload.getOriginalFilename(); // 파일 이름 가져오기
		  byte[] bytes = upload.getBytes();
		  
		  // 업로드 경로
		  String ckUploadPath = uploadPath + File.separator + "ckUpload" + File.separator + uid + "_" + fileName;
		  
		  out = new FileOutputStream(new File(ckUploadPath));
		  out.write(bytes);
		  out.flush(); // out에 저장된 데이터를 전송하고 초기화
		  
		  String callback = req.getParameter("CKEditorFuncNum");
		  printWriter = res.getWriter();
		  String fileUrl = "/ckUpload/" + uid + "_" + fileName; // 작성화면
		  
		  // 업로드시 메시지 출력
		  printWriter.println("<script type='text/javascript'>"
		     + "window.parent.CKEDITOR.tools.callFunction("
		     + callback+",'"+ fileUrl+"','이미지를 업로드하였습니다.')"
		     +"</script>");
		  
		  printWriter.flush();
		  
		 } catch (IOException e) { e.printStackTrace();
		 } finally {
		  try {
		   if(out != null) { out.close(); }
		   if(printWriter != null) { printWriter.close(); }
		  } catch(IOException e) { e.printStackTrace(); }
		 }
		 
		 return; 
		}
	}