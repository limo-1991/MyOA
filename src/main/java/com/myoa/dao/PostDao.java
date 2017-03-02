package com.myoa.dao;


import com.myoa.entity.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("postDao")
public class PostDao extends DaoSupport {

    public void save(Post post) throws Exception {
        super.save("PostMapper.save", post);
    }

    public void save(List<Post> postList) throws Exception {
        super.batchSave("PostMapper.save",postList);
    }

    public List<Post> getAll() throws Exception {
        return (List<Post>) super.findForList("PostMapper.getAll", null);
    }

    public Post getPost(long pid) throws Exception {
        return (Post) super.findForObject("PostMapper.getPost", pid);
    }

    public void delete(long pid) throws Exception {
        super.delete("PostMapper.delete", pid);
    }


    public void update(Post post)throws Exception{
        super.update("PostMapper.update",post);
    }
    public void update(List<Post> postList)throws Exception{
        super.batchUpdate("PostMapper.update",postList);
    }
}
