package com.myoa.controller;

import com.myoa.entity.Department;
import com.myoa.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class DepartmentController {

    @Resource(name = "departmentService")
    private DepartmentService departmentService;

    @RequestMapping(value = "/department")
    public String list(Model model) throws Exception {
        List<Department> departmentList =
                departmentService.getAll();
        model.addAttribute("departmentList",departmentList);
        return "/department/list";
    }
    @RequestMapping(value = "/deleteDepartment/{did}")
    public String delete(@PathVariable long did) throws Exception {
        departmentService.delete(did);
        return "redirect:/department";
    }
    @RequestMapping(value = "/saveDepartment")
    public String save(Model model)throws Exception{
        Department department = new Department();
        model.addAttribute("department",department);
        return "/department/add";
    }
}
