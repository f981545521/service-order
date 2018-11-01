package cn.acyou.pandora.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author youfang
 * @version [1.0.0, 2018-11-01 下午 04:21]
 **/
@Controller
@RequestMapping("info")
public class OrderInfoController {

    private static final Logger logger = LoggerFactory.getLogger(OrderInfoController.class);

    @RequestMapping(value = "getOrder", method = {RequestMethod.POST})
    @ResponseBody
    public String getOrderInfo(){
        logger.info("ORDER模块收到请求");
        return "ORDER模块收到了您的请求";
    }

}
