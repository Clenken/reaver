package io.messaginglabs.reaver.core;

import io.messaginglabs.reaver.dsl.Commit;
import io.messaginglabs.reaver.dsl.CommitResult;
import java.nio.ByteBuffer;

public interface Proposer extends Voter {

    Commit commit(ByteBuffer value);
    CommitResult commit(ByteBuffer value, Object attachment);

}
