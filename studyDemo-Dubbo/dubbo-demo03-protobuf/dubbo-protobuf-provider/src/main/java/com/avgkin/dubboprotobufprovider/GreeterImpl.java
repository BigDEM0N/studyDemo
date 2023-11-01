package com.avgkin.dubboprotobufprovider;

import com.avgkin.proto.DubboGreeterTriple;
import com.avgkin.proto.GreeterReply;
import com.avgkin.proto.GreeterRequest;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class GreeterImpl extends DubboGreeterTriple.GreeterImplBase {
    @Override
    public GreeterReply greet(GreeterRequest request) {
        System.out.println("request = " + request);
        GreeterReply greet = GreeterReply.newBuilder().setMessage("resp to " + request.getName()).build();
        System.out.println("greet = " + greet);
        return greet;
    }
}
