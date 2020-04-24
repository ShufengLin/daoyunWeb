package com.controller;

import com.service.PaperService;
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
    public Map<String, Object> getPaperByPage(@RequestBody PaperPage paperPage){
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
}
