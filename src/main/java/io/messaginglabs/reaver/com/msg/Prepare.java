package io.messaginglabs.reaver.com.msg;

import io.netty.buffer.ByteBuf;

public class Prepare extends Message {

    private long instanceId;

    private int sequence;
    private long nodeId;
    private ByteBuf value;

    public long getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(long instanceId) {
        this.instanceId = instanceId;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public long getNodeId() {
        return nodeId;
    }

    public void setNodeId(long nodeId) {
        this.nodeId = nodeId;
    }

    public ByteBuf getValue() {
        return value;
    }

    public void setValue(ByteBuf value) {
        this.value = value;
    }

    @Override
    public Operation op() {
        return Operation.PREPARE;
    }
}
