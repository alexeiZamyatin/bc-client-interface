package ic3re.healthmetrics.bcclientinterface.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * This class is only used for mapping in case the list of transactions is not available or returner corrupted from the blockchain
 * client (e.g. Huntercoin)
 */
@Data
public class BlockDtoTxFree {

    private String hash;

    private int confirmations;

    private int size;

    private int height;

    private int version;

    private String merkleroot;

    @JsonProperty("n_tx")
    private int numberOfTransactions;

    private Long time;

    private Long nonce;

    private String  bits;

    private BigDecimal difficulty;

    private String chainwork;

    private Long mediantime;

    @JsonProperty("previousblockhash")
    private String previousBlockHash;

    @JsonProperty("nextblockhash")
    private String nextBlockHash;

    private boolean merged_mined;

    @JsonProperty("tx")
    private List<String> txids;

    private AuxpowDto auxpow;

    private String pow_algo;

    private int pow_alog_id = -1;

    private String pow_hash;

}
