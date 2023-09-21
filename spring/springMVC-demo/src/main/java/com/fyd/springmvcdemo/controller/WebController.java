package com.fyd.springmvcdemo.controller;

import com.fyd.springmvcdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/8/23 9:56
 */
@Controller			// 控制器，在spring启动的时候加载并注册
@ResponseBody		// 当前类返回的是非静态页面
@RequestMapping("/web")	// 使用/web 能访问到当前类
public class WebController {

    /**
     *使用/web/hello 能访问到当前方法
     */
    @RequestMapping("/hello")
    public Object sayHello() {
        return "Hello, Spring MVC!";
    }

    /**
     *使用/web/hello2 能访问到当前方法
     */
    @RequestMapping("/hello2")
    public Object sayHello2() {
        return "/index.html";
    }

    /**
     * 获取单个参数
     */
    @RequestMapping("/getOneParam")
    public Object getOneParam(HttpServletRequest request) {
        return "Hello, " + request.getParameter("name");
    }

    @RequestMapping("/getOneParam2")
    public Object getOneParam2(String name) {
        return "Hello, " + name;
    }

    /**
     * 传整形参数
     */
    @RequestMapping("/getIntParam")
    public Object getIntParam(Integer id) {
        return "你的id是：" + id;
    }

    /**
     * 获取多个参数
     * @param name
     * @param id
     */
    @RequestMapping("/getMultiParam")
    public Object getMultiParam(String name, Integer id) {
        return "Hello, " + name + "，你的id是：" + id;
    }

    /**
     * 获取对象
     * @param user
     */
    @RequestMapping("/getObject")
    public Object getObject(User user) {
        return user.toString();
    }

    /**
     * 获取登录信息
     */
    @RequestMapping("/login")
    public String login(String name,String password) {
        if (name.equals("fyd") && password.equals("123456")) {
            return "<h1>登录成功</h1>";
        } else {
            return "<h1>登录失败</h1>";
        }
    }

    /**
     * 获取注册信息（多个参数）
     */
    @RequestMapping("/register")
    public String register(User user) {
        return user.toString();
    }

    /**
     * ajax请求登录
     */
    @RequestMapping("/loginAjax")
    public HashMap<String, Object> loginAjax(String name, String password) {
        HashMap<String, Object> result = new HashMap<>();
        if (name.equals("fyd") && password.equals("123456")) {
            result.put("code", 200);
            result.put("msg", "登录成功");
        } else {
            result.put("code", 500);
            result.put("msg", "登录失败");
        }
        return result;
    }

    /**
     * 获取用户传的json数据
     */
    @RequestMapping("/getJson")
    public HashMap<String, Object> getJson(@RequestBody User user) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("msg", "获取成功");
        result.put("data", user);
        return result;
    }

    /**
     * 上传文件，返回上传的路径
     */
    @RequestMapping("/upload")
    public String upload(String name, @RequestPart("file") MultipartFile file) throws IOException {
        // 获取文件名
        String fileName = file.getOriginalFilename();
        // 获取文件后缀
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        // 重新生成文件名
        fileName = UUID.randomUUID() + suffixName;
        // 获取项目路径
        String filePath = ClassUtils.getDefaultClassLoader().getResource("").getPath() + "static/upload/";
        // 创建文件路径
        File dest = new File(filePath + fileName);
        // 判断文件是否已经存在
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        // 上传文件
        file.transferTo(dest);
        return filePath + " 上传成功";
    }

}