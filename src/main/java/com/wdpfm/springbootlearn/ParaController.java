package com.wdpfm.springbootlearn;

import org.springframework.web.bind.annotation.*;

/**
 * ClassName:ParaController
 * Description:各种传参形式
 * Date:2021/1/18 13:58
 * Author:wdpfm
 */
@RestController
@RequestMapping("/prefix")//公共前缀
public class ParaController {
    //http://127.0.0.1:8080/prefix/firstrequest
    @GetMapping({"/firstrequest"})
    public String firstRequest(){
        return "第一个Spring Boot接口";
    }

    //url后带参数
    //http://127.0.0.1:8080/prefix/requestpara?num=1
    @GetMapping({"/requestpara"})
    public String requestPara(@RequestParam Integer num){
        return "para from request : "+num;
    }

    //url中带参数
    //http://127.0.0.1:8080/prefix/para/1
    @GetMapping({"/para/{num}"})
    public String pathPara(@PathVariable Integer num){
        return "para from path : "+num;
    }

    //多url复用
    //http://127.0.0.1:8080/prefix/multiurl1?num=1
    //and
    //http://127.0.0.1:8080/prefix/multiurl2?num=1
    @GetMapping({"/multiurl1","/multiurl2"})
    public String multiUrl(@RequestParam Integer num){
        return "para from request : "+num;
    }

    //设默认值
    //http://127.0.0.1:8080/prefix/required
    //or
    //http://127.0.0.1:8080/prefix/required?num=1
    @GetMapping({"/required"})
    public String required(@RequestParam(required = false,defaultValue = "0") Integer num){
        return "para from request : "+num;
    }
}
