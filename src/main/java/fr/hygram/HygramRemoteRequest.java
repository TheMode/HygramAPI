package fr.hygram;

public interface HygramRemoteRequest<T> {

    T request(Object... args);

    String getRequestId();

}
