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
    public Integer save(@RequestBody User user) {
        return userService.save(user);
    }

    @PatchMapping
    public Integer update(@RequestBody User user) {
        return userService.update(user);
    }
    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id) {
        return userService.delete(id);
    }
    @GetMapping("/{id}")
    public User getById(@PathVariable Integer id) {
        return userService.getById(id);
    }
    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }
}
