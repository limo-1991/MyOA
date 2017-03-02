package com.myoa.service;

import com.TestSupport;
import com.myoa.entity.User;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * UserService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 */
public class UserServiceTest extends TestSupport{

    private UserService userService;
    @Before
    public void before() throws Exception {
        userService = (UserService) context.getBean("userService");
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: save(User user)
     */
    @Test
    public void testSaveUser() throws Exception {

        List<User> userList = userService.getAll();

        for (User user:userList){
            user.setPassword("999");
        }

        userService.update(userList);
        userService.save(userList);


//TODO: Test goes here... 
    }

    /**
     * Method: save(List<User> userList)
     */
    @Test
    public void testSaveUserList() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getAll()
     */
    @Test
    public void testGetAll() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getUser(long uid)
     */
    @Test
    public void testGetUser() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: delete(long uid)
     */
    @Test
    public void testDeleteUid() throws Exception {

//TODO: Test goes here... 
    }

    /**
     * Method: delete(User user)
     */
    @Test
    public void testDeleteUser() throws Exception {
        User user = new User();
        user.setUid(1L);
        userService.delete(user);
//TODO: Test goes here... 
    }

    /**
     * Method: update(User user)
     */
    @Test
    public void testUpdateUser() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: update(List<User> userList)
     */
    @Test
    public void testUpdateUserList() throws Exception {
//TODO: Test goes here... 
    }


} 
