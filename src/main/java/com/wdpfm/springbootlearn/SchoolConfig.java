package com.wdpfm.springbootlearn;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ClassName:SchoolConfig
 * Description:School配置类
 * Date:2021/1/18 16:10
 * Author:wdpfm
 */
@Component
@ConfigurationProperties(prefix = "school")
public class SchoolConfig {
    Integer grade;
    Integer classnum;

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getClassnum() {
        return classnum;
    }

    public void setClassnum(Integer classnum) {
        this.classnum = classnum;
    }
}
