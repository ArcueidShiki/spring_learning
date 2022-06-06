package cn.tedu.controller;

import cn.tedu.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("user save ...");
        return "{'module':'springmvc'}"; //返回json数据
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(String username,String password){
        System.out.println("user login "+username+" ...");
        return "{'user':'login','username':'"+username+"','password':'"+password+"'}"; //返回json数据
    }

    @RequestMapping("/reg")
    @ResponseBody
    public String reg(@RequestParam("username") String userName, String password){
        System.out.println("user login "+userName+" ...");
        return "{'user':'reg','username':'"+userName+"','password':'"+password+"'}"; //返回json数据
    }
    //对象中的对象
    @RequestMapping("/pojoContainPojoParam")
    @ResponseBody
    public String arrayParam(User user){
        System.out.println("pojo嵌套pojo传递参数 likes "+ user+" ...");
        return "{'user':'pojoContainPojoParam'}";
    }
    //数组传参数
    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] likes){
        System.out.println("数组参数传递 likes "+ Arrays.toString(likes)+" ...");
        return "{'user':'array param'}";
    }
    //集合参数
    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes){
        System.out.println("集合参数传递 likes "+ likes+" ...");
        return "{'user':'list param'}";
    }

    //集合参数 json格式
    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes){
        System.out.println("集合Json参数传递 likes "+ likes+" ...");
        return "{'user':'list param'}";
    }


    //pojo参数 json格式
    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user){
        System.out.println("pojo Json参数传递 user: "+ user);
        return "{'user':'list param'}";
    }

    //集合对象参数 json格式
    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> list){
        System.out.println("集合pojo Json参数传递 list: "+ list+" ...");
        return "{'user':'list param'}";
    }

    // 日期参数
    @RequestMapping("/dateParam")
    @ResponseBody
    public String dateParam(Date date1, @DateTimeFormat(pattern = "yyyy-MM-dd") Date date2){
        System.out.println("日期参数传递(yyyy/MM/dd) date1: "+ date1+" ...");
        System.out.println("日期参数传递(yyyy-MM-dd) date2: "+ date2+" ...");
        return "{'user':'list param'}";
    }

    // 响应页面/跳转页面
    @RequestMapping("/toJumpPage")
    public String toJumpPage(){
        return "/pages/page.jsp";
    }

    //响应文本数据
    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        return "response text";
    }
    // 响应pojo对象
    @RequestMapping("/toJsonPOJO")
    @ResponseBody
    public User toJsonPOJO(){
        User user = new User();
        user.setUsername("arc");
        user.setPassword("1231");
        return user;
    }

    // 响应POJO集合对象
    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User> toJsonList(){
        User user1 = new User();
        user1.setUsername("arc1");
        user1.setPassword("1231");
        User user2 = new User();
        user2.setUsername("arc2");
        user2.setPassword("1232");
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        return users;
    }

    // restFul===============================================================================================


    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseBody
    public String save1(){
        return "{'module':'user save'}";
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id){
        System.out.println("id = " + id);
        return "{'module','user delete'}";
    }

    @GetMapping("/users/{id}")
    @ResponseBody
    public String getById(@PathVariable Integer id){
        System.out.println("id = " + id);
        return "{'module':'getById'}";
    }


     
}
