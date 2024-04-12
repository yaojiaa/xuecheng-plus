package com.xuecheng.content.model.dto;

import lombok.Data;
import lombok.ToString;

/**
    * @author zyy
    * @description 课程查询参数Dto
    * @date 2024/4/12 15:49
*/

@Data
@ToString
public class QueryCourseParamsDto {
    //审核状态
    private String auditStatus;
    //课程名称
    private String courseName;
    //发布状态
    private String publishStatus;

}
