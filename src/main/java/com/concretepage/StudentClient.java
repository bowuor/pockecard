package com.concretepage;

import com.concretepage.soap.GetStudentRequest;
import com.concretepage.soap.GetStudentResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

/**
 * Created by wladek on 9/9/16.
 */
public class StudentClient extends WebServiceGatewaySupport {

    public GetStudentResponse getStudentById(int studentId) {
        GetStudentRequest request = new GetStudentRequest();
        request.setStudentId(studentId);
        GetStudentResponse response = (GetStudentResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback("http://localhost:8080/soapws/getStudentResponse"));
        return response;
    }

}
