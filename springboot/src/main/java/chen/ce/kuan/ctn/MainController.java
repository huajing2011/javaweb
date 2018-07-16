package chen.ce.kuan.ctn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title chen.ce.kuan.ctn
 * @Copyright: Copyright 2018
 * @Description: java <br/>
 * @Created on 2018/7/16 chenck
 */
@RestController
@RequestMapping("/")
public class MainController {
    @RequestMapping("home")
    public String homePage(){
        return "This  is home page---from spring boot";
    }
    @RequestMapping("login")
    public String indexPage(){
        return "login";
    }

}