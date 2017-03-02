package com.myoa.dao;

import com.myoa.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("departmentDao")
public class DepartmentDao extends DaoSupport{

    public void save(Department department) throws Exception {
        super.save("DepartmentMapper.save", department);

    }

    public void save(List<Department> departmentList) throws Exception {
        super.batchSave("DepartmentMapper.save",departmentList);
    }

    public Department getDepartment(long did) throws Exception {
        return (Department) super.findForObject("DepartmentMapper.getDepartment", did);
    }

    public List<Department> getAll() throws Exception {
        return (List<Department>) super.findForList("DepartmentMapper.getAll", null);
    }

    public void update(Department department) throws Exception {
        super.update("DepartmentMapper.update", department);
    }

    public void update(List<Department> departmentList) throws Exception {
        super.batchUpdate("DepartmentMapper.update",departmentList);
    }

    public void delete(long did) throws Exception {
        super.delete("DepartmentMapper.delete", did);
    }


}
