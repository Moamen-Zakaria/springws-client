package com.kn.springwsdemo.controller;

import com.kn.springwsdemo.integration.SoapClient;
import com.kn.springwsdemo.message.GetEmployeeResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employees")
@AllArgsConstructor
public class EmployeesController {

    private final SoapClient soapClient;

    @GetMapping("/{departmentName}")
    public GetEmployeeResponse hello(@PathVariable(required = false) String departmentName) {/**/
        return soapClient.getEmployeesByDepartmentName(departmentName);
    }

}