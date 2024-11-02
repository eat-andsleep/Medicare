package com.example.service;

import com.example.pojo.PageBean;
import com.example.pojo.Proj;

import java.util.List;

public interface ProjService {

    void delete(String diaId);

    void add(Proj proj);

    Proj getById(String diaId);

    void update(Proj proj);

    List<Proj> page(String diaName,String diaId);

    List<Proj> getAll();
}
