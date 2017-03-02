package com.myoa.service;

import com.TestSupport;
import com.myoa.entity.Post;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

/**
 * PostService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 */
public class PostServiceTest extends TestSupport{

    PostService postService;
    @Before

    public void before() throws Exception {
        postService = (PostService)context.getBean("postService");
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: save(Post post)
     */
    @Test
    public void testSavePost() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: save(List<Post> postList)
     */
    @Test
    public void testSavePostList() throws Exception {
        Post post1 = new Post();
        post1.setPname("开发部");
        post1.setDescription("我爱开发");
        Post post2 = new Post();
        post2.setPname("设计部");
        post2.setDescription("我爱设计");

        List<Post> postList = new ArrayList<>();
        postList.add(post1);
        postList.add(post2);

        postService.save(postList);

        for (Post post:postList){
            System.out.println("post编号:" + post.getPid() + ",被保存");
        }
//TODO: Test goes here... 
    }

    /**
     * Method: getAll()
     */
    @Test
    public void testGetAll() throws Exception {

        List<Post> postList = postService.getAll();

        for (Post post:postList){
            System.out.println(post);
        }
//TODO: Test goes here... 
    }

    /**
     * Method: getPost(long pid)
     */
    @Test
    public void testGetPost() throws Exception {
        System.out.println(postService.getPost(4));
//TODO: Test goes here... 
    }

    /**
     * Method: delete(long pid)
     */
    @Test
    public void testDeletePid() throws Exception {
        postService.delete(7);
//TODO: Test goes here... 
    }

    /**
     * Method: delete(Post post)
     */
    @Test
    public void testDeletePost() throws Exception {
        Post post = new Post();
        post.setPid(6L);
        postService.delete(post);
//TODO: Test goes here... 
    }

    /**
     * Method: update(Post post)
     */
    @Test
    public void testUpdatePost() throws Exception {
        Post post = postService.getPost(5);
        post.setDescription("设计第一");
        postService.update(post);
        System.out.println(post);
//TODO: Test goes here... 
    }

    /**
     * Method: update(List<Post> postList)
     */
    @Test
    public void testUpdatePostList() throws Exception {

        List<Post> postList = postService.getAll();
        for (Post post:postList){
            post.setDescription("我们只有一个职责,为公司服务");
        }

        postService.update(postList);
//TODO: Test goes here... 
    }


} 
