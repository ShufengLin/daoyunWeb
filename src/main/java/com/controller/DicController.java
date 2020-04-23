package com.controller;


import com.service.DicService;
import com.utils.Dic;
import com.utils.Paper;
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
    public String list(Model model, dictionary dic) {
        List<dictionary> list = dicService.querydictionary(dic);
        model.addAttribute("list", list);
        return "test/allDic";
    }


    @RequestMapping("toAddDic")
    public String toAddDic() {
        return "test/addDic";
    }

    @RequestMapping("/addDic")
    public String addDic(dictionary dic) {
        dicService.insertdictionary(dic);
        return "redirect:/testExample1/allDic";
    }

//    @RequestMapping("/del/{dicId}")
//    public String deleteDic(@PathVariable("dicId") Long id) {
//        dicService.deleteDicById(id);
//        return "redirect:/testExample1/allDic";
//    }

    @RequestMapping("toUpdateDic")
    public String toUpdateDic(Model model, dictionary dic) {
        model.addAttribute("dic", dicService.querydictionaryLimit1(dic));
        return "test/updateDic";
    }

    @RequestMapping("/updateDic")
    public String updateDic(Model model, dictionary dic) {
        dicService.updatedictionary(dic);
        dic = dicService.querydictionaryLimit1(dic);
        model.addAttribute("dic", dic);
        return "redirect:/testExample1/allDic";
    }

    @RequestMapping("/test1")
    public String test1(){
        return "test/test1";
    }
}
