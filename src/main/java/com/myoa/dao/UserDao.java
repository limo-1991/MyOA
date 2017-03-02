package com.myoa.dao;

import com.myoa.entity.Post;
import com.myoa.entity.User;
import com.myoa.entity.UserPostLink;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDao extends DaoSupport {

    public void save(User user) throws Exception {
        super.save("UserMapper.save", user);
    }

    public void save(List<User> userList) throws Exception {
        super.batchSave("UserMapper.save",userList);
    }

    public List<User> getAll() throws Exception {
        return (List<User>) super.findForList("UserMapper.getAll", null);
    }

    public User getUser(long uid) throws Exception {
        return (User) super.findForObject("UserMapper.getUser", uid);
    }


    public void delete(long uid) throws Exception {
        super.delete("UserMapper.delete", uid);
    }


    public void update(User user) throws Exception {
        super.update("UserMapper.update", user);
    }

    public void update(List<User> userList) throws Exception {
        super.batchUpdate("UserMapper.update", userList);
    }



    public void saveUserPostLink() throws Exception {

    }
}
