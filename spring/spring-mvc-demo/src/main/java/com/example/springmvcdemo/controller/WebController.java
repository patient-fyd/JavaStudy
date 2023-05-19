package com.example.springmvcdemo.controller;

import com.example.springmvcdemo.model.Student;
import com.example.springmvcdemo.model.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2023/5/4 9:10
 */
@Controller
@ResponseBody   // 当前类返回的是非静态页面
@RequestMapping("/web")
public class WebController {

    //@RequestMapping(value = "/hi",method = RequestMethod.GET)
    @GetMapping("/hi")
    //@PostMapping("/hi")
    public Object sayHi(@NotNull HttpServletRequest request, HttpServletResponse response) {
        return "hi," + request.getParameter("name");
    }

    /**
     * 获取单个参数
     *
     * @return
     */
    @GetMapping("/get1")
    public String getParam1(String name) {
        return "value:  " + name;
    }

    /**
     * 获取多个参数
     *
     * @param name
     * @param age
     * @return
     */
    @GetMapping("/get2")
    public String getParam2(String name, Integer age) {
        return "name:" + name + " age: " + age;
    }

    /**
     * 获取对象参数
     *
     * @param student
     * @return
     */
    @GetMapping("/get3")
    public String getParam3(@NotNull Student student) {
        return student.toString();
    }

    /**
     * 获取form表单中的参数
     *
     * @param username
     * @param password
     * @return
     */
    @PostMapping("/login")
    public String login(String username, String password) {
        return "<h1>用户名" + username + "密码" + password + "</h1>";
    }

    /**
     * 获取form表单中的参数
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/login2")
    public HashMap<String, Object> login2(String username, String password) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("username", username);
        map.put("password", password);
        return map;
    }

    /**
     * 得到用户传递的json数据
     *
     * @param user
     * @return
     */
    @RequestMapping("/login3")
    public HashMap<String, Object> login3(@RequestBody @NotNull User user) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("username", user.getUsername());
        map.put("password", user.getPassword());
        return map;
    }

    /**
     * 获取form表单（多个参数）
     *
     * @param user
     * @return
     */
    @RequestMapping("/reg")
    public String reg(@NotNull User user) {
        return user.toString();
    }

    /**
     * 获取上传文件
     *
     * @param username
     * @param file
     * @return
     * @throws IOException
     */
    @RequestMapping("/reg2")
    public String reg2(String username, @RequestPart("myfile") @NotNull MultipartFile file) throws IOException {
        // 保存文件
        file.transferTo(new File("C:\\Users\\33275\\Documents\\WK\\" + file.getOriginalFilename()));
        return username + "上传了" + file.getOriginalFilename();
    }

    /**
     * spring mvc 获取 cookie 值
     *
     * @param jsessionid
     * @return
     */
    @RequestMapping("/getck")
    public String getCookie(@CookieValue("JSESSIONID") String jsessionid) {
        return "JSESSIONID=" + jsessionid;
    }

    /**
     * 设置 session
     *
     * @param request
     * @return
     */
    @RequestMapping("/setsession")
    public String setsession(@NotNull HttpServletRequest request) {
        // 获取 HttpSession 对象，参数设置为true 表示如果没有session对象就创建一个session
        HttpSession session = request.getSession(true);
        if (session != null) {
            session.setAttribute("username", "java");
        }
        return "session 储存成功";
    }

    /**
     * 读取session
     *
     * @param username
     * @return
     */
    @RequestMapping("/getsession")
    public String getsession(@SessionAttribute(value = "username", required = false) String username) {
        return "username" + username;
    }

    /**
     * 获取header
     *
     * @param userAgent
     * @return
     */
    @RequestMapping("/getheader")
    public String getHeader(@RequestHeader("User-Agent") String userAgent) {
        return "User-Agent:" + userAgent;
    }

    /**
     * 前端参数重命名
     *
     * @param username
     * @return
     */
    @RequestMapping("/rename")
    public String rename(@RequestParam(value = "u", required = false) String username) {
        return "username:" + username;
    }

}


