package com.controller;

import com.service.PaperService;
import com.utils.Paper;
import com.utils.PaperDetail;
import com.service.PaperDetailService;

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
@RequestMapping("/testDetailExample")
public class PaperDetailController {
    @Autowired
    private PaperDetailService paperDetailService;

    @ResponseBody
    @PostMapping("/getPaperDetailByPage")
    public Map<String, Object> getPaperDetailByPage(@RequestBody PaperPage paperPage){
        Map<String, Object> map= paperDetailService.getPaperDetailByPage(paperPage);
        map.put("code",0);
        map.put("msg","分页查询成功");
        return map;
    }

    @ResponseBody
    @PostMapping("/getPaperDetailCount/{paperId}")
    public ServerResponse getPaperDetailCount(@PathVariable("paperId") Long paperId){
        int paperDetailCount= paperDetailService.getPaperDetailCount(paperId);
        return new ServerResponse(0, paperDetailCount,"返回字典数量成功");
    }

    @ResponseBody
    @PostMapping("/addPaperDetailJson")
    public ServerResponse addPaperDetailJson(@RequestBody PaperDetail paperDetail) {
        paperDetailService.addPaperDetail(paperDetail);
        return new ServerResponse(0,"新增成功");
    }

    @ResponseBody
    @PostMapping("/updatePaperDetailJson")
    public ServerResponse updatePaperDetailJson(@RequestBody PaperDetail paperDetail) {
        paperDetailService.updateDetailPaper(paperDetail);
        return new ServerResponse(0,"修改成功");
    }

    @ResponseBody
    @RequestMapping("/deletePaperDetailJson/{id}")
    public ServerResponse deletePaperDetailJson(@PathVariable("id") Long id) {
        paperDetailService.deletePaperDetailById(id);
        return new ServerResponse(0,"删除成功");
    }

    @ResponseBody
    @PostMapping("/getChildrenPaperDetail/{id}")
    public Map<String, Object> getChildrenPaperDetail(@PathVariable("id") Long id){
        Map<String, Object> map= paperDetailService.getChildrenPaperDetail(id);
        map.put("code",0);
        map.put("msg","查询子节点成功");
        return map;
    }

    @ResponseBody
    @PostMapping("/getAllPaperDetailRoot/{paperId}")
    public Map<String, Object> getAllPaperDetailRoot(@PathVariable("paperId") Long paperId) {
        Map<String, Object> map= paperDetailService.getAllPaperDetailRoot(paperId);
        map.put("code",0);
        map.put("msg","查询所有根节点成功");
        return map;
    }

}
