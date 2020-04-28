package com.controller;

import com.service.DicdService;

import com.utils.dictionarydetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/testExample2")
public class DicdController {
    @Autowired
    private DicdService dicdService;
    @RequestMapping("/allDicd")
    public String list(Model model) {
        List<dictionarydetail> list = dicdService.queryAllDicd();
        model.addAttribute("list", list);
        return "test/allDicd";
    }


    @RequestMapping("toAddDicd")
    public String toAddDicd() {
        return "test/addDicd";
    }

    @RequestMapping("/addDicd")
    public String addDicd(dictionarydetail dicd) {
        dicdService.addDicd(dicd);
        return "redirect:/testExample2/allDicd";
    }

    @RequestMapping("/del/{id}")
    public String deleteDicd(@PathVariable("id") Integer id) {
        dicdService.deleteDicdById(id);
        return "redirect:/testExample2/allDicd";
    }

    @RequestMapping("toUpdateDicd")
    public String toUpdateDicd(Model model, Integer id) {
        model.addAttribute("dicd", dicdService.queryById(id));
        return "test/updateDicd";
    }

    @RequestMapping("/updateDicd")
    public String updateDicd(Model model, dictionarydetail dicd) {
        dicdService.updateDicd(dicd);
        dicd = dicdService.queryById(dicd.getId());
        model.addAttribute("dicd", dicd);
        return "redirect:/testExample2/allDicd";
    }

    @RequestMapping("/test2")
    public String test2(){
        return "test/test2";
    }
}
