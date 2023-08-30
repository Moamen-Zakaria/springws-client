package com.kn.springwsdemo.integration;

import com.kn.springwsdemo.message.GetAllEmployeesRequest;
import com.kn.springwsdemo.message.GetEmployeeResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SoapClient extends WebServiceGatewaySupport {

    public GetEmployeeResponse getEmployeesByDepartmentName(String departmentName) {
        GetAllEmployeesRequest request = GetAllEmployeesRequest.builder().department(departmentName).build();
        GetEmployeeResponse response = (GetEmployeeResponse) getWebServiceTemplate().marshalSendAndReceive(request , new SoapActionCallback("http://localhost:8033/ws"));
        return response;
    }

}
