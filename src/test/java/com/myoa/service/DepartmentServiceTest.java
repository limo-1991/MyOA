package com.myoa.service;

import com.TestSupport;
import com.myoa.entity.Department;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

/**
 * DepartmentService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 */
public class DepartmentServiceTest extends TestSupport{

    DepartmentService service;
    @Before
    public void before() throws Exception {
        service = (DepartmentService)context.getBean("departmentService");
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: save(Department department)
     */
    @Test
    public void testSaveDepartment() throws Exception {
        Department department = new Department();
        department.setDname("市场部");
        department.setDescription("为了业绩");

        service.save(department);

//TODO: Test goes here... 
    }

    /**
     * Method: save(List<Department> departmentList)
     */
    @Test
    public void testSaveDepartmentList() throws Exception {
        Department department1 = new Department();
        department1.setDname("市场部");
        department1.setDescription("为了业绩");
        Department department2 = new Department();
        department2.setDname("研发部");
        department2.setDescription("高效生产");

        List<Department> departmentList = new ArrayList<>();
        departmentList.add(department1);
        departmentList.add(department2);

        service.save(departmentList);

        System.out.println(departmentList.get(0));
        System.out.println(departmentList.get(1));
//TODO: Test goes here... 
    }

    /**
     * Method: getDepartment(long did)
     */
    @Test
    public void testGetDepartment() throws Exception {
        System.out.println(service.getDepartment(1));
//TODO: Test goes here... 
    }

    /**
     * Method: getAll()
     */
    @Test
    public void testGetAll() throws Exception {
        System.out.println(service.getAll());
//TODO: Test goes here... 
    }

    /**
     * Method: update(Department department)
     */
    @Test
    public void testUpdateDepartment() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: update(List<Department> departmentList)
     */
    @Test
    public void testUpdateDepartmentList() throws Exception {

        List<Department> departmentList = service.getAll();

        for (Department department:departmentList){
            department.setDescription(department.getDescription() + "我们很牛逼");
        }
        service.update(departmentList);

//TODO: Test goes here... 
    }

    /**
     * Method: delete(long did)
     */
    @Test
    public void testDeleteDid() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: delete(Department department)
     */
    @Test
    public void testDeleteDepartment() throws Exception {

        Department department = new Department();
        department.setDid(1L);
        service.delete(department);
//TODO: Test goes here... 
    }


} 
