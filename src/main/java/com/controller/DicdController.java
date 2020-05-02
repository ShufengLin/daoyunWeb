package com.controller;

import com.service.DicdService;

import com.utils.DicPage;
import com.utils.DictionaryDetail;
import com.utils.PaperDetail;
import com.utils.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/DictionaryDetail")
public class DicdController {
    @Autowired
    private DicdService dicdService;

    @ResponseBody
    @PostMapping("/getDicdByPage")
    public Map<String, Object> getDicdByPage(@RequestBody DicPage dicPage){
        Map<String, Object> map= dicdService.getDicdByPage(dicPage);
        map.put("code",0);
        map.put("msg","分页查询成功");
        return map;
    }

    @ResponseBody
    @PostMapping("/getDicdCount/{dicId}")
    public ServerResponse getDicdCount(@PathVariable("dicId") Long dicId){
        int DicdCount= dicdService.getDicdCount(dicId);
        return new ServerResponse(0, DicdCount,"返回字典数量成功");
    }

    @ResponseBody
    @PostMapping("/addDicdJson")
    public ServerResponse addDicdJson(@RequestBody DictionaryDetail dicd) {
        dicdService.addDicd(dicd);
        return new ServerResponse(0,"新增成功");
    }

    @ResponseBody
    @PostMapping("/updateDicdJson")
    public ServerResponse updateDicdJson(@RequestBody DictionaryDetail dicd) {
        dicdService.updateDicd(dicd);
        return new ServerResponse(0,"修改成功");
    }

    @ResponseBody
    @RequestMapping("/deleteDicdJson/{id}")
    public ServerResponse deleteDicdJson(@PathVariable("id") Long id) {
        dicdService.deleteDicdById(id);
        return new ServerResponse(0,"删除成功");
    }

    @RequestMapping("/allDicd")
    public String list(Model model) {
        List<DictionaryDetail> list = dicdService.queryAllDicd();
        model.addAttribute("list", list);
        return "test/allDicd";
    }


    @RequestMapping("toAddDicd")
    public String toAddDicd() {
        return "test/addDicd";
    }

    @RequestMapping("/addDicd")
    public String addDicd(DictionaryDetail dicd) {
        dicdService.addDicd(dicd);
        return "redirect:/DictionaryDetail/allDicd";
    }

    @RequestMapping("/del/{id}")
    public String deleteDicd(@PathVariable("id") long id) {
        dicdService.deleteDicdById(id);
        return "redirect:/DictionaryDetail/allDicd";
    }

    @RequestMapping("toUpdateDicd")
    public String toUpdateDicd(Model model, long id) {
        model.addAttribute("dicd", dicdService.queryById(id));
        return "test/updateDicd";
    }

    @RequestMapping("/updateDicd")
    public String updateDicd(Model model, DictionaryDetail dicd) {
        dicdService.updateDicd(dicd);
        dicd = dicdService.queryById(dicd.getId());
        model.addAttribute("dicd", dicd);
        return "redirect:/DictionaryDetail/allDicd";
    }

    @RequestMapping("/test2")
    public String test2(){
        return "test/test2";
    }
}
