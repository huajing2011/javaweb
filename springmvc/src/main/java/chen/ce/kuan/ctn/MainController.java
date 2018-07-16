package chen.ce.kuan.ctn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chris@heiyan.com
 * @Title chen.ce.kuan.ctn
 * @Copyright: Copyright 2018
 * @Description: java <br/>
 * @Company: 北京黑岩信息技术有限公司 www.heiyan.com
 * @Created on 2018/7/16 chenck
 */
@Controller
@RequestMapping("/")
public class MainController {
    @RequestMapping("home")
    public @ResponseBody
    String homePage(){
        return "This  is home page";
    }
    @RequestMapping("login")
    public String indexPage(){
        return "login";
    }

}
