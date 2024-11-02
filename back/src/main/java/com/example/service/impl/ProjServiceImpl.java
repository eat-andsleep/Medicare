package com.example.service.impl;

import com.example.mapper.ProjMapper;
import com.example.pojo.PageBean;
import com.example.pojo.Proj;
import com.example.service.ProjService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ProjServiceImpl implements ProjService {
    @Autowired
    private ProjMapper projMapper;

    /**
     * 分页查询员工
     * @param page
     * @param pageSize
     * @return
     */
    /*@Override
    public PageBean page(Integer page, Integer pageSize) {
        // 1. 获取总记录数
        Long count = empMapper.count();

        // 2. 获取分页查询结果列表
        Integer start = (page - 1) * pageSize;
        List<Emp> empList = empMapper.page(start, pageSize);

        // 3. 封装PageBean对象
        return new PageBean(count, empList);
    }*/

    /**
     * 分页查询项目
     *
     */
    @Override
    public List<Proj> page(String diaName,String diaId) {
        // 1. 设置分页参数
        // 2. 执行查询
        List<Proj> projList = projMapper.list(diaId,diaName);  // PageHelper插进会自动修改SQL语句并执行，获取总记录数以及分页查询的结果列表

        return projList;
        // 3. 封装PageBean对象
    }

    /**
     * 批量删除员工
     * @param diaId
     */
    @Override
    public void delete(String diaId) {
        projMapper.delete(diaId);
    }

    /**
     * 新增员工
     * @param proj
     */
    @Override
    public void add(Proj proj) {
        projMapper.insert(proj);
    }

    /**
     * 根据ID查询员工信息
     * @param diaId
     * @return
     */
    @Override
    public Proj getById(String diaId) {
        return projMapper.getById(diaId);
    }

    /**
     * 更新员工
     * @param proj
     */
    @Override
    public void update(Proj proj) {

        projMapper.update(proj);
    }

    @Override
    public List<Proj> getAll() {
        List<Proj> projList = projMapper.getAll();
        return projList;
    }

}
