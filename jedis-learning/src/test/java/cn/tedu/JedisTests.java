package cn.tedu;

import cn.tedu.jedis.JedisConnectionFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

import java.util.Map;

public class JedisTests {

    private Jedis jedis;
    @BeforeEach//建立连接
    void setUp(){
        // 写虚拟机的ip
//        jedis = new Jedis("192.168.126.128",6379);
        //通过 工具类获取
        jedis = JedisConnectionFactory.getJedis();
        jedis.auth("root");
        jedis.select(0);//选库
    }

    @Test
    void testString(){
        String result = jedis.set("name5", "虎哥");
        System.out.println("result = " + result);
        System.out.println(jedis.get("name5"));
    }

    @Test
    void testHash(){
        jedis.hset("user:1","name","jack");
        jedis.hset("user:1","age","17");
        Map<String,String> map = jedis.hgetAll("user:1");
        System.out.println(map);
    }

    @AfterEach // 释放连接
    void tearDown(){
        if(jedis != null){
            jedis.close();
        }
    }


}
