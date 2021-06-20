package com.infinite.life.mybatisgenmvn.inteface;

import com.infinite.life.mybatisgenmvn.dto.PrePayProgress;

public interface PrePayProgressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PrePayProgress record);

    int insertSelective(PrePayProgress record);

    PrePayProgress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PrePayProgress record);

    int updateByPrimaryKey(PrePayProgress record);
}