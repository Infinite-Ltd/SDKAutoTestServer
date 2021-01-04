package bean;

import lombok.Data;

@Data
public abstract class Message<T> {

    private MessageHeader header;
    private MessageBody body;


}
