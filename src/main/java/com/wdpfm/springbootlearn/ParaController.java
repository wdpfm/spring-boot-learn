package com.wdpfm.springbootlearn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:ParaController
 * Description:
 * Date:2021/1/18 13:58
 * Author:wdpfm
 */
@RestController
public class ParaController {
    @GetMapping({"/firstrequest"})
    public String firstRequest(){
        return "第一个Spring Boot接口";
    }
}
