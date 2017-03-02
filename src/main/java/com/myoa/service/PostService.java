package com.myoa.service;

import com.myoa.dao.PostDao;
import com.myoa.entity.Post;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("postService")
public class PostService {

    @Resource(name = "postDao")
    private PostDao postDao;

    public void save(Post post) throws Exception {
        postDao.save(post);
    }

    public void save(List<Post> postList) throws Exception {
        postDao.save(postList);
    }

    public List<Post> getAll() throws Exception {
        return postDao.getAll();
    }

    public Post getPost(long pid) throws Exception {
        return postDao.getPost(pid);
    }

    public void delete(long pid) throws Exception {
        postDao.delete(pid);
    }

    public void delete(Post post) throws Exception {
        postDao.delete(post.getPid());
    }

    public void update(Post post) throws Exception {
        postDao.update(post);
    }

    public void update(List<Post> postList) throws Exception {
        postDao.update(postList);
    }
}
