package clneto.sales;

import io.grpc.ManagedChannelBuilder;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.client.inject.GrpcClientBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@GrpcClientBean(
        clazz = EchoServiceGrpc.EchoServiceBlockingStub.class,
        beanName = "serverStub",
        client = @GrpcClient("server")
)
public class GrpcModule {
    @Bean
    EchoClient grpcEchoClient(@Autowired EchoServiceGrpc.EchoServiceBlockingStub serverStub) {
        return new EchoClient(serverStub);
    }
}
