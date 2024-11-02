package com.example.controller;

import com.example.pojo.PageBean;
import com.example.pojo.Proj;
import com.example.pojo.Result;
import com.example.service.ProjService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/projs")
public class ProjController {
    @Autowired
    private ProjService projService;

    @GetMapping("/getall")
    public Result getAll(){
        log.info("查询全部数据");
        List<Proj> projList = projService.getAll();
        return Result.success(projList);
    }


    @GetMapping
    public Result page(String diaName, String diaId) {
        // 调用service分页查询
        List<Proj> projList = projService.page(diaName,diaId);
        return Result.success(projList);
    }



    @DeleteMapping("/{diaId}")
    public Result delete(@PathVariable String diaId) {
        log.info("批量删除项目，id：{}", diaId);
        // 调用service删除项目
        projService.delete(diaId);
        return Result.success();
    }



    @PostMapping
    public Result add(@RequestBody Proj proj) {
        log.info("新增项目：{}", proj);
        // 调用service新增项目
        projService.add(proj);
        return Result.success();
    }


    @GetMapping("/{diaId}")
    public Result getById(@PathVariable String diaId) {
        log.info("根据id查询项目数据：{}", diaId);
        // 调用service查询部门
        Proj proj= projService.getById(diaId);
        return Result.success(proj);
    }



    @PutMapping
    public Result update(@RequestBody Proj proj) {
        log.info("修改部门：{}",proj);
        // 调用service修改部门
        projService.update(proj);
        return Result.success();
    }
}