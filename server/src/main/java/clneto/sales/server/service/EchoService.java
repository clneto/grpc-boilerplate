package clneto.sales.server.service;


import clneto.sales.Common;
import clneto.sales.EchoServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class EchoService extends EchoServiceGrpc.EchoServiceImplBase {
    @Override
    public void echo(Common.EchoRequest request, StreamObserver<Common.EchoResponse> responseObserver) {

        var outputMessage = String.format("Echoing: %s.", request.getMessage());
        responseObserver.onNext(
                Common.EchoResponse.newBuilder().setMessage(
                        outputMessage
                ).build()
        );
        responseObserver.onCompleted();
        System.out.print("Output: ");
        System.out.println(outputMessage);
    }
}
