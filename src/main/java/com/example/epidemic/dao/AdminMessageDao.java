package com.example.epidemic.dao;



import com.example.epidemic.dto.AdminMessageDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: gpt
 * @Date: 2022/04/02/15:44
 * @Description:
 */
@Mapper
public interface AdminMessageDao {
    /**
     删除方法
     */
    int del(int id);

    /**
     * 根据用户名模糊查询
     * 参数使用@param注解，是为了让mapper.xml文件里的if条件能够找到值
     */
    List<AdminMessageDto> selectByName(@Param("name") String name);

    /**
     * 批量删除
     */
    int delBatch(int[] ids);

    List<AdminMessageDto> selectAll();


}
