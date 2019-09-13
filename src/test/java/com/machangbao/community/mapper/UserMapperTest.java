package com.machangbao.community.mapper;

import com.machangbao.community.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * .
 * Created by mcbbugu
 * 2019-09-13 16:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findUrl() {
        List<User> url = userMapper.findUrl();
        System.out.println(url.toString());
    }

    @Test
    public void findById(){
        User byId = userMapper.findById(33);
        System.out.println(byId);

        List<User> url = userMapper.findUrl();
        System.out.println(url.toString());
    }
}