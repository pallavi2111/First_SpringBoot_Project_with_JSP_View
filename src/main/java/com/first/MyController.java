package com.first;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class MyController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String handleReq()
	{
		return "Hello Students....";//this is not a view name...its just a response which we want to return to the user after firing /test url

	}
	
	@RequestMapping("/test1")
	@ResponseBody
	public String handleReqAbc()
	{
		return "Thank you students.....";//this is not a view name...its just a response which we want to return to the user after firing /test url

	}
	
	//Jsp view in springboot
	@RequestMapping("/test2")
	public String handleReq1()
	{
		return "home";//here, "home" is the view name....as this handler is returning view name directly..we dont need to use @ResponseBody annotation with view.
	}
	
	@RequestMapping("/test3")
	public String handleReq2()
	{
		return "contact";
	}

}
