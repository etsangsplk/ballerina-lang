package client;
import ballerina.io;
import ballerina.net.grpc;

public struct helloWorldBlockingClient {
    grpc:Client client;
    helloWorldBlockingStub stub;
}


public function <helloWorldBlockingClient ep> init(grpc:ClientEndpointConfiguration config) {
    // initialize client endpoint.
    grpc:Client client = {};
    client.init(config);
    ep.client = client;
    // initialize service stub.
    helloWorldBlockingStub stub = {};
    stub.initStub(client);
    ep.stub = stub;
}

public function <helloWorldBlockingClient ep> getClient() returns (helloWorldBlockingStub) {
    return ep.stub;
}

function main (string[] args) {
    endpoint helloWorldBlockingClient ep { host:"localhost", port:9090};

    var res, err = ep -> hello("WSO2");
    if (err != null) {
        io:println("Error from Connector: " + err.message);
    } else {
        io:println("Client Got Responce : ");
        io:println(res);
    }
}
