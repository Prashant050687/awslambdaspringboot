package com.prashant.lambdaservicerequestor;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.prashant.lambdaservicerequestor.domain.LoginRequest;
import com.prashant.lambdaservicerequestor.domain.Response;

public class MyRequestHandler extends SpringBootRequestHandler<LoginRequest, Response> {

}
