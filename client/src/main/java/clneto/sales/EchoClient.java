package clneto.sales;

public class EchoClient {
    private final EchoServiceGrpc.EchoServiceBlockingStub stub;

    public EchoClient(EchoServiceGrpc.EchoServiceBlockingStub stub) {
        this.stub = stub;
    }

    public String greet(String yourName) {
        var request = Common.EchoRequest.newBuilder().setMessage(yourName).build();
        var output = stub.echo(request);
        System.out.println("Response: " + output.getMessage());
        return output.getMessage();
    }
}
