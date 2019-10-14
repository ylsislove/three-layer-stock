package com.yain.gupiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO
 *
 * @author Apple_Coco
 * @version V1.0 2019/10/13 4:37
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String root() {
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index() {
        return "index.html";
    }

    @RequestMapping("/gupiao")
    public String gupiao() {
        return "gupiao.html";
    }

    @RequestMapping("/echarts4")
    public String echarts4() {
        return "echarts4.html";
    }


}
