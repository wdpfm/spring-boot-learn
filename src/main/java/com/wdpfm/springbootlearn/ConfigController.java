package com.wdpfm.springbootlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:ConfigController
 * Description:读取配置类
 * Date:2021/1/18 16:13
 * Author:wdpfm
 */
@RestController
public class ConfigController {
    @Autowired
    SchoolConfig schoolConfig;
    @GetMapping("/gradefromconfig")
    public String gradeClass(){
        return "年级："+schoolConfig.grade+" 班级："+schoolConfig.classnum;
    }
}
