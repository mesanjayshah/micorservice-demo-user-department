package com.iesmac.user.service;

import com.iesmac.user.entity.UserAdmin;
import com.iesmac.user.repository.UserRepository;
import com.iesmac.user.vo.Department;
import com.iesmac.user.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    public UserAdmin saveUser(UserAdmin userAdmin) {
        return userRepository.save(userAdmin);
    }

    public ResponseTemplateVO getUserWithDepartment(Long id) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        UserAdmin userAdmin = userRepository.findById(id).orElse(null);

        Department department =
                restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + userAdmin.getDepartmentId(),
                        Department.class);
        vo.setUserAdmin(userAdmin);
        vo.setDepartment(department);
        return vo;
    }
}
