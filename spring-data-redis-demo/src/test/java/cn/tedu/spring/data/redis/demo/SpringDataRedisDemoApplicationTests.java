package cn.tedu.spring.data.redis.demo;

import cn.tedu.spring.data.redis.demo.pojo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Map;

@SpringBootTest
class SpringDataRedisDemoApplicationTests {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    void testString(){
        redisTemplate.opsForValue().set("Arcueid","爱尔奎特");
        System.out.println(redisTemplate.opsForValue().get("Arcueid"));

    }

    // Json序列化工具
    private static final ObjectMapper mapper = new ObjectMapper();
    @Test // 手动序列化和反序列化 节省掉自动序列化的 @class所占用的空间
    void testStringTemplate() throws JsonProcessingException{
        User user = new User("虎哥",19);
        String json = mapper.writeValueAsString(user);
        stringRedisTemplate.opsForValue().set("user:200",json);
        String val = stringRedisTemplate.opsForValue().get("user:200");
        User user1 = mapper.readValue(val,User.class);
        System.out.println("user1 = " + user1);
    }
//    @Test
//    void testSaveUser(){
//        redisTemplate.opsForValue().set("user:100",new User("虎哥",22));
//        User o = (User) redisTemplate.opsForValue().get("user:100");
//        System.out.println(o);
//    }

    @Test
    void testHash(){
        stringRedisTemplate.opsForHash().put("user:400","name","虎哥");
        stringRedisTemplate.opsForHash().put("user:400","age","21");
        Map<Object, Object> entries = stringRedisTemplate.opsForHash().entries("user:400");
        System.out.println("entries = " + entries);
    }
}
