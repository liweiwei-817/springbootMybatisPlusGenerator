package fun.lww.springbootmybatisgenerator.controller;

import fun.lww.springbootmybatisgenerator.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    @Autowired
    UserController userController;

    @Test
    public void findAll() {
        List<User> list = userController.findAll();
        System.out.println(list);
    }
}