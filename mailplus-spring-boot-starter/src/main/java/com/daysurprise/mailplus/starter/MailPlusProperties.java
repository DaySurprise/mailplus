package com.daysurprise.mailplus.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Class: com.daysurprise.mailplus.starter.mailPlusProperties
 * @Author: daysurprise
 * @Date: 2021/3/25
 * @Mote: 我于生命之中绽放, 犹如黎明中的花朵
 * @Desc:
 */
@ConfigurationProperties(prefix = "mail.plus")
public class MailPlusProperties {
    private String name;

    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
