package com.daysurprise.mailplus.starter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Class: com.daysurprise.mailplus.starter.MailPlusController
 * @Author: daysurprise
 * @Date: 2021/3/25
 * @Mote: 我于生命之中绽放, 犹如黎明中的花朵
 * @Desc:
 */
@RestController
public class MailPlusController {

    MailPlusProperties mailPlusProperties;

    public MailPlusController(MailPlusProperties mailPlusProperties) {
        this.mailPlusProperties = mailPlusProperties;
    }

    @RequestMapping("/")
    public String index(){
        return mailPlusProperties.getName()+"欢迎您：" + mailPlusProperties.getUrl();
    }

}
