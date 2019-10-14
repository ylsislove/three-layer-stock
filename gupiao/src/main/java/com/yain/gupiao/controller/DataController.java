package com.yain.gupiao.controller;

import com.alibaba.fastjson.JSON;
import com.yain.gupiao.domain.Gupiao;
import com.yain.gupiao.service.GupiaoService;
import com.yain.gupiao.utils.LayuiTableResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author Apple_Coco
 * @version V1.0 2019/10/13 12:45
 */
@Controller
public class DataController {

    @Autowired
    private GupiaoService gupiaoService;

    @RequestMapping("/findDataPage")
    @ResponseBody()
    public LayuiTableResultUtil<List> findDataPage(int page, int limit) {
        List<Gupiao> list = gupiaoService.findDataPage((page-1)*limit, limit);
        LayuiTableResultUtil<List> data =new LayuiTableResultUtil<List>(0, "", gupiaoService.findDataCount(), list);
        return data;
    }

    @RequestMapping("/findAllData")
    public ModelAndView findAllData(Model model) {
        List<Gupiao> gupiaoList = gupiaoService.findAllData();

        List<String> dateList = new ArrayList<>();
        for (Gupiao gupiao : gupiaoList) {
            dateList.add(gupiao.getDate());
        }
        model.addAttribute("dateList", dateList);

        List<List<Double>> dataList = new ArrayList<>();
        for (Gupiao gupiao : gupiaoList) {
            List<Double> list = new ArrayList<>();
            list.add(gupiao.getO_price());
            list.add(gupiao.getC_price());
            list.add(gupiao.getFloor_price());
            list.add(gupiao.getTop_price());
            dataList.add(list);
        }
        model.addAttribute("dataList", dataList);

        return new ModelAndView("echarts4.html", "gupiaoModel", model);
    }

    @RequestMapping("/fun1")
    @ResponseBody()
    public String fun1() {
        Double fun1 = gupiaoService.calcFun1();
        return "开盘价平均值为：" + fun1.toString();
    }

    @RequestMapping("/fun2")
    @ResponseBody()
    public String fun2() {
        Long fun2 = gupiaoService.calcFun2();
        return "交易量最大值为：" + fun2.toString();
    }

    @RequestMapping("/fun3")
    @ResponseBody()
    public String fun3() {
        Long fun3 = gupiaoService.calcFun3();
        return "交易额最小值为：" + fun3.toString();
    }

}
