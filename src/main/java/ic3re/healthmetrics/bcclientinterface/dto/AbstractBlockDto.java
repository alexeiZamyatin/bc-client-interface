package ic3re.healthmetrics.bcclientinterface.dto;

/**
 * This represents the base blockchain block model
 */
public abstract class AbstractBlockDto {

    // hash of block header
    protected String blockHash;

    // hash of block header of previous block
    protected String previousBlockHash;

    // height / number of block
    protected long blocknumber;

    // block creation timestamp
    protected long timestamp;

    // PoW difficulty
    protected float difficulty;

    // Nonce used for PoW
    protected long nonce;

}
