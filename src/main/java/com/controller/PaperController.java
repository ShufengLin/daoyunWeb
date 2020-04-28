package com.controller;


import com.utils.Paper;
import com.service.PaperService;

import java.util.List;
import java.util.Map;

import com.utils.PaperPage;
import com.utils.ServerResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/testExample")
public class PaperController {
    @Autowired
    private PaperService paperService;

    //这里要注意一下@Controller,@RestController,@ResponseBody的用法
    //之前这个服务端的示例，因为是前后端统一，交互数据用的是model，现在前后端分离，不能像以前一样返回数据

    @ResponseBody
    @PostMapping("/getPaperByPage")
    public Map<String, Object> getPaperByPage(@RequestBody PaperPage paperPage){
        Map<String, Object> map= paperService.getPaperByPage(paperPage);
        map.put("code",0);
        map.put("msg","分页查询成功");
        return map;
    }

    @ResponseBody
    @PostMapping("/getPaperCount")
    public ServerResponse getPaperCount(@RequestBody PaperPage paperPage){
        int paperCount= paperService.getPaperCount(paperPage);
        return new ServerResponse(0, paperCount,"返回论文数量成功");
    }

    @ResponseBody
    @GetMapping("/getAllPaper")
    public ServerResponse getAllPaper(){
        List<Paper> paperList = paperService.queryAllPaper();
        return new ServerResponse(0, paperList,"返回论文列表成功");
    }

    @ResponseBody
    @PostMapping("/updatePaperJson")
    public ServerResponse updatePaperJson(@RequestBody Paper paper) {
        paperService.updatePaper(paper);
        return new ServerResponse(0,"修改成功");
    }

    @ResponseBody
    @PostMapping("/addPaperJson")
    public ServerResponse addPaperJson(@RequestBody Paper paper) {
        paperService.addPaper(paper);
        return new ServerResponse(0,"新增成功");
    }

    @ResponseBody
    @RequestMapping("/deletePaperJson/{paperId}")
    public ServerResponse deletePaperJson(@PathVariable("paperId") Long id) {
        paperService.deletePaperById(id);
        return new ServerResponse(0,"删除成功");
    }

    @ResponseBody
    @RequestMapping("/deletePaperBatchJson")
    public ServerResponse deletePaperBatchJson(@RequestBody List<Long> paperIdList) {
        paperService.deletePaperBatchById(paperIdList);
        return new ServerResponse(0,"删除成功");
    }

    @RequestMapping("/allPaper")
    public String list(Model model) {
        List<Paper> list = paperService.queryAllPaper();
        model.addAttribute("list", list);
        return "test/allPaper";
    }


    @RequestMapping("toAddPaper")
    public String toAddPaper() {
        return "test/addPaper";
    }

    @RequestMapping("/addPaper")
    public String addPaper(Paper paper) {
        paperService.addPaper(paper);
        return "redirect:/testExample/allPaper";
    }

    @RequestMapping("/del/{paperId}")
    public String deletePaper(@PathVariable("paperId") Long id) {
        paperService.deletePaperById(id);
        return "redirect:/testExample/allPaper";
    }

    @RequestMapping("toUpdatePaper")
    public String toUpdatePaper(Model model, Long id) {
        model.addAttribute("paper", paperService.queryById(id));
        return "test/updatePaper";
    }

    @RequestMapping("/updatePaper")
    public String updatePaper(Model model, Paper paper) {
        paperService.updatePaper(paper);
        paper = paperService.queryById(paper.getPaperId());
        model.addAttribute("paper", paper);
        return "redirect:/testExample/allPaper";
    }
    @RequestMapping("/test")
    public String test() {
        return "test/test";
    }
}



