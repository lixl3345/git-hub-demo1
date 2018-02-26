package lixianglin.com.git_hub_demo1;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  
public class MyController {

	@RequestMapping("hello")
	@ResponseBody
	public String say() {
		return "hello world !";
	}
	
	@RequestMapping("h")
	@ResponseBody
	public Map h() {
		Map m =new HashMap();
		m.put("d", new Date());
		m.put("b", "ssd");
		return m;
	}
}
