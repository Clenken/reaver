package io.messaginglabs.reaver.com.msg;

public class RemoveNode extends Message {
    @Override
    public Operation op() {
        return Operation.REMOVE_NODE;
    }
}
