package com.angda.util;

import com.angda.client.entity.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.Properties;



public class CommUtilTest {

    @Test
    public void loadProperties() {
        Properties pro=CommUtil.loadProperties("db.properties");
        Assert.assertNotNull(pro);
    }

    @Test
    public void object2Json() {
        User user=new User();
        user.setId(1);
        user.setUsername("test");
        user.setPassword("123");
        user.setBreif("帅");
        String str=CommUtil.object2Json(user);
        System.out.println(str);
    }

    @Test
    public void json2Object() {
        String str="{\"id\":1,\"username\":\"test\",\"password\":\"123\",\"breif\":\"帅\"}";
        User user= (User) CommUtil.json2Object(str,User.class);
        System.out.println(user);
    }
}