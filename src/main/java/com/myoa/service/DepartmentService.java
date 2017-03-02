package com.myoa.service;

import com.myoa.dao.DepartmentDao;
import com.myoa.entity.Department;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("departmentService")
public class DepartmentService {

    @Resource(name = "departmentDao")
    private DepartmentDao departmentDao;

    public void save(Department department) throws Exception {
        departmentDao.save(department);

    }

    public void save(List<Department> departmentList) throws Exception {
        departmentDao.save(departmentList);
    }

    public Department getDepartment(long did) throws Exception {
        return departmentDao.getDepartment(did);
    }

    public List<Department> getAll() throws Exception {
        return departmentDao.getAll();
    }

    public void update(Department department) throws Exception {
        departmentDao.update(department);
    }

    public void update(List<Department> departmentList) throws Exception {
        departmentDao.update(departmentList);
    }

    public void delete(long did) throws Exception {
        departmentDao.delete(did);
    }

    public void delete(Department department) throws Exception {
        departmentDao.delete(department.getDid());
    }

    public Department getDepartmentWithUser(){
        return null;
    }
    public List<Department> getAllWithUser(){
        return null;
    }
}
