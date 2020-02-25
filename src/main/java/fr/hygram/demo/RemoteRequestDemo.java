package fr.hygram.demo;

import fr.hygram.HygramRemoteRequest;

public class RemoteRequestDemo implements HygramRemoteRequest<String> {

    @Override
    public String request(Object... args) {
        String result = "Hello World!";

        // Lot of computation here...

        return result;
    }

    @Override
    public String getRequestId() {
        return "test_helloworld";
    }
}
