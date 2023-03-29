package com.fourteen.demo;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/1 22:50
 */
public class TestDemo {
  public static void main(String[] args) {
    SimpleEmail email = new SimpleEmail();
    // QQ邮件服务器的端口号
    email.setSslSmtpPort("465");

    email.setHostName("smtp.qq.com");

    // email.setAuthentication("你的QQ号@qq.com","服务端授权码");
    email.setAuthentication("3327555932@qq.com", "rxfxvhvvllidciii");
    email.setCharset("UTF-8");
    // 1、从文件把所有QQ邮箱读取出来
    // 2、存储到一个数据结构当中
    // 3、String Email = 数据结构当中取一个
    try {
      // 发给谁
      email.addTo("1652257262@qq.com");
      email.setFrom("3327555932@qq.com");
      email.setSubject("这是一个测试");
      email.setMsg("~!~~~这是邮件的内容");
      email.send();
    } catch (EmailException e) {
      e.printStackTrace();
    }
  }
}
