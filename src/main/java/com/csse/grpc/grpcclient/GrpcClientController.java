//package com.csse.grpc.grpcclient;
//
//import com.csse.grpc.generate.Response;
//import com.csse.grpc.generate.UserRequest;
//import com.csse.grpc.generate.UserServiceGrpc;
//import io.grpc.Metadata;
//import net.devh.boot.grpc.client.inject.GrpcClient;
//import org.springframework.stereotype.Service;
//
///**
// * @author yanggt
// * @company csse
// * @date 2020/4/22
// */
//@Service
//public class GrpcClientController {
//    @GrpcClient(value = "mygrpcclient")
//    private UserServiceGrpc.UserServiceBlockingStub stub;
//
//    public String sendMessage() {
//        Metadata metadata = new Metadata();
//        metadata.put(Metadata.Key.of("qweKey", Metadata.ASCII_STRING_MARSHALLER), "asdValue");
//
//        Response user = stub.getUser(UserRequest
//                .newBuilder()
//                .setUserId("00f1173c-7bce-49a3-aa61-12e5893eeec6")
//                .build()
//        );
//        return user.getMsg();
//    }
//}