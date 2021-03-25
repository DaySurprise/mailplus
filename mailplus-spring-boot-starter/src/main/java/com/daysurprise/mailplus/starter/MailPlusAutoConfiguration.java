package com.daysurprise.mailplus.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Class: com.daysurprise.mailplus.starter.MailPlusAutoConfiguration
 * @Author: daysurprise
 * @Date: 2021/3/25
 * @Mote: 我于生命之中绽放, 犹如黎明中的花朵
 * @Desc:
 */
@Configuration
@ConditionalOnProperty(value = "mail.plus.name")
@EnableConfigurationProperties(MailPlusProperties.class)
public class MailPlusAutoConfiguration {

    @Autowired
    MailPlusProperties mailPlusProperties;

    @Bean
    public MailPlusController mailPlusController(){
        return new MailPlusController(mailPlusProperties);
    }
}
