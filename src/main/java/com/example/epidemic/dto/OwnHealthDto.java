package com.example.epidemic.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: gpt
 * @Date: 2022/04/04/23:25
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnHealthDto {
    private Integer id ;
    /** 用户id */
    private Integer uid ;

    /** 居民姓名*/
    private String name;
    /** 体温 */
    private Double temp ;
    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ctime ;
    /**状态   1表示正常   2表示异常 */
    private String flag ;
}
