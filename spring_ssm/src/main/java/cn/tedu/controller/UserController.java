package cn.tedu.controller;

import cn.tedu.entity.User;
import cn.tedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public Result save(@RequestBody User user) {
        int rows = userService.save(user);
        return new Result(rows == 1?Code.SAVE_OK:Code.SAVE_ERR,rows);
    }

    @PatchMapping
    public Result update(@RequestBody User user) {
        int rows = userService.update(user);
        return new Result(rows == 1?Code.UPDATE_OK:Code.UPDATE_ERR,rows);
    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        int rows = userService.delete(id);
        return new Result(rows == 1?Code.DELETE_OK:Code.DELETE_ERR,rows);
    }
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        User user = userService.getById(id);
        return new Result(user == null ? Code.GET_OK:Code.GET_ERR,user);
    }
    @GetMapping
    public Result getAll() {
        List<User> userList = userService.getAll();
        return new Result(userList == null?Code.GET_OK:Code.GET_ERR,userList);
    }
}
