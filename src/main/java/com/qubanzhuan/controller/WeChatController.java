package com.qubanzhuan.controller;

import com.qubanzhuan.util.SignUtil;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ning on 2017/9/10.
 */
@Controller
public class WeChatController {
    private Logger logger = Logger.getLogger(WeChatController.class);

    @RequestMapping(value = "/weChat", method = RequestMethod.GET)
    @ResponseBody
    public String helloWeChat(String signature, String timestamp, String nonce, String echostr) {
        boolean result = SignUtil.checkSignature(signature, timestamp, nonce);
        logger.info("weChat Sign is " + result);
        return result ? echostr : "errInfo";
    }

}
