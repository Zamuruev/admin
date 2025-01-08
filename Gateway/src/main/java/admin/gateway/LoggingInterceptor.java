package admin.gateway;

import io.grpc.*;

public class LoggingInterceptor implements ClientInterceptor {
    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(
            MethodDescriptor<ReqT, RespT> method, CallOptions callOptions, Channel next) {
        System.out.println("Вызван gRPC метод: " + method.getFullMethodName());
        return next.newCall(method, callOptions);
    }
}
