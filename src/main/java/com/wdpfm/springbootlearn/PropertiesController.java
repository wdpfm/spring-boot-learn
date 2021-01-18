package com.wdpfm.springbootlearn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:PropertiesController
 * Description:读取配置的Controller
 * Date:2021/1/18 16:01
 * Author:wdpfm
 */
@RestController
public class PropertiesController {
    @Value("${school.grade}")
    Integer grade;
    @Value("${school.classnum}")
    Integer classnum;
    @GetMapping("/gradeclass")
    public String gradeClass(){
        return "年级："+grade+" 班级："+classnum;
    }
}
