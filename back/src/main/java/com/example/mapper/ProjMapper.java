package com.example.mapper;

import com.example.pojo.Proj;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProjMapper {
    List<Proj> list(String diaId, String diaName);

    @Delete("delete from t_medical_insititution where dia_id =#{diaId}")
    void delete(String diaId);

    @Insert(("insert into t_medical_insititution (dia_id, dia_name, dia_exp_type, dia_exp_level, dia_max_prize, dia_starttime, dia_endtime, dia_valid, dia_hos_level, dia_approvalmark) " +
            "values (#{diaId},#{diaName},#{diaExpType},#{diaExpLevel},#{diaMaxPrize},#{diaStarttime},#{diaEndtime},#{diaValid},#{diaHosLevel},#{diaApprovalmark})"))
    void insert(Proj proj);

    @Select("select * from t_medical_insititution where dia_id = #{diaId}")
    Proj getById(String diaId);

    void update(Proj proj);

    @Select("select * from t_medical_insititution")
    List<Proj> getAll();
}
