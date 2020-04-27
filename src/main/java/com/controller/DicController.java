package com.controller;


import com.service.DicService;
import com.utils.dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/testExample1")
public class DicController {
    @Autowired
    private DicService dicService;
    @RequestMapping("/allDic")
    public String list(Model model) {
        List<dictionary> list = dicService.queryAllDic();
        model.addAttribute("list", list);
        return "test/allDic";
    }


    @RequestMapping("toAddDic")
    public String toAddDic() {
        return "test/addDic";
    }

    @RequestMapping("/addDic")
    public String addDic(dictionary dic) {
        dicService.addDic(dic);
        return "redirect:/testExample1/allDic";
    }

    @RequestMapping("/del/{dicId}")
    public String deleteDic(@PathVariable("dicId") Integer id) {
        dicService.deleteDicById(id);
        return "redirect:/testExample1/allDic";
    }

    @RequestMapping("toUpdateDic")
    public String toUpdateDic(Model model, Integer id) {
        model.addAttribute("dic", dicService.queryById(id));
        return "test/updateDic";
    }

    @RequestMapping("/updateDic")
    public String updateDic(Model model, dictionary dic) {
        dicService.updateDic(dic);
        dic = dicService.queryById(dic.getDicId());
        model.addAttribute("dic", dic);
        return "redirect:/testExample1/allDic";
    }

    @RequestMapping("/test1")
    public String test1(){
        return "test/test1";
    }
}
