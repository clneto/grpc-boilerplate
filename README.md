# grpc-boilerplate
This is a simple Java gRPC with Spring Boot boilerplate for client-server communication.

## Submodules

- Interface
    - Contains the proto files.
    - Code gets autogenerated by using Maveng Lifecycle Install.
- Client (in terms of gRPC)
    - Contains a Spring Boot Web server that responds echo via http.
    - Calls the "Server" (in terms of gRPC).
- Server
    - A Spring Boot gRPC server that implements the service defined in proto.

## Usage

Run the both `GrpcClientApplication` and `GrpcServerApplication` simultaneously.

If the application properties remained unchanged, you should be able to test the communication between client and server by performing a simple HTTP request to:

`http://localhost:8088/echo/<insert your message here>`

### Some Notes
This was done in a Mac M1 which caused some gRPC code generator Maven Plugins to not work as expected. Also, had to adjust spring boot versions in order to get the GRPC server to run and register the grpc server properly.

## Copyright & Licensing Information
This project is licensed under the terms of the MIT license.
