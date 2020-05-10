package com.controller;


import com.service.DicService;
import com.utils.DicPage;
import com.utils.Dictionary;


import com.utils.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Dictionary")
public class DicController {
    @Autowired
    private DicService dicService;

    @ResponseBody
    @PostMapping("/getDicByPage")
    public Map<String, Object> getDicByPage(@RequestBody DicPage dicPage){
        Map<String, Object> map= dicService.getDicByPage(dicPage);
        map.put("code",0);
        map.put("msg","分页查询成功");
        return map;
    }

    @ResponseBody
    @PostMapping("/getDicCount")
    public ServerResponse getDicCount(@RequestBody DicPage dicPage){
        int dicCount= dicService.getDicCount(dicPage);
        return new ServerResponse(0, dicCount,"返回论文数量成功");
    }

    @ResponseBody
    @PostMapping("/updateDicJson")
    public ServerResponse updateDicJson(@RequestBody Dictionary dic) {
        dicService.updateDic(dic);
        return new ServerResponse(0,"修改成功");
    }

    @ResponseBody
    @PostMapping("/addDicJson")
    public ServerResponse addDicJson(@RequestBody Dictionary dic) {
        dicService.addDic(dic);
        return new ServerResponse(0,"新增成功");
    }

    @ResponseBody
    @RequestMapping("/deleteDicJson/{dicId}")
    public ServerResponse deletePaperJson(@PathVariable("dicId") Long id) {
        dicService.deleteDicById(id);
        return new ServerResponse(0,"删除成功");
    }

    @ResponseBody
    @RequestMapping("/deleteDicBatchJson")
    public ServerResponse deletePaperBatchJson(@RequestBody List<Long> dicIdList) {
        dicService.deleteDicBatchById(dicIdList);
        return new ServerResponse(0,"删除成功");
    }

    @RequestMapping("/allDic")
    public String list(Model model) {
        List<Dictionary> list = dicService.queryAllDic();
        model.addAttribute("list", list);
        return "test/allDic";
    }


    @RequestMapping("toAddDic")
    public String toAddDic() {
        return "test/addDic";
    }

    @RequestMapping("/addDic")
    public String addDic(Dictionary dic) {
        dicService.addDic(dic);
        return "redirect:/Dictionary/allDic";
    }

    @RequestMapping("/del/{dicId}")
    public String deleteDic(@PathVariable("dicId") long id) {
        dicService.deleteDicById(id);
        return "redirect:/Dictionary/allDic";
    }

    @RequestMapping("toUpdateDic")
    public String toUpdateDic(Model model, long id) {
        model.addAttribute("dic", dicService.queryById(id));
        return "test/updateDic";
    }

    @RequestMapping("/updateDic")
    public String updateDic(Model model, Dictionary dic) {
        dicService.updateDic(dic);
        dic = dicService.queryById(dic.getDicId());
        model.addAttribute("dic", dic);
        return "redirect:/Dictionary/allDic";
    }

    @RequestMapping("/test1")
    public String test1(){
        return "test/test1";
    }
}
