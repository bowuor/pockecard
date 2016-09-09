package com.concretepage;

import com.concretepage.soap.GetStudentRequest;
import com.concretepage.soap.GetStudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by wladek on 9/9/16.
 */
@Endpoint
public class StudentEndpoint {
    private static final String NAMESPACE_URI = "http://concretepage.com/soap";
    @Autowired
    private StudentUtility studentUtility;
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getStudentRequest")
    @ResponsePayload
    public GetStudentResponse getCountry(@RequestPayload GetStudentRequest request) {
        GetStudentResponse response = new GetStudentResponse();
        response.setStudent(studentUtility.getStudent(request.getStudentId()));
        return response;
    }
}
