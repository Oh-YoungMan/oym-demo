package com.cn.component.web.controller;

import com.cn.component.web.log.annotation.LogSign;
import com.cn.component.web.model.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zyd
 * @date 2020/5/27 22:31
 * @desc
 */
@Controller
public class TestController extends BaseController {

    @GetMapping("test")
    @ResponseBody
    @LogSign(logType = "操作",logAction = "写入日志")
    public Result<String> test() {
        return Result.ok("救命啊,我变成一条狗了");
    }
}
