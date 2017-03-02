package com.myoa.service;

import com.myoa.dao.DaoSupport;
import com.myoa.dao.UserDao;
import com.myoa.entity.Department;
import com.myoa.entity.Post;
import com.myoa.entity.User;
import com.myoa.entity.UserPostLink;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserService {

    @Resource(name = "userDao")
    private UserDao userDao;

    public void save(User user) throws Exception {
        userDao.save(user);
    }

    public void save(List<User> userList) throws Exception {
        userDao.save(userList);
    }

    public List<User> getAll() throws Exception {
        return userDao.getAll();
    }

    public User getUser(long uid) throws Exception {
        return userDao.getUser(uid);
    }

    public void delete(long uid) throws Exception {
        userDao.delete(uid);
    }

    public void delete(User user) throws Exception {
        userDao.delete(user.getUid());
    }

    public void update(User user) throws Exception {
        userDao.update(user);
    }

    public void update(List<User> userList) throws Exception {
        userDao.update(userList);
    }

    public void setDepartment(User user, Department department){

    }

    public void setPosts(User user,List<Post> postList){

    }

    public User getUserWithDeptAndPost(){
        return null;
    }

    public List<User> getAllWithDeptAndPost(){
        return null;
    }



}
