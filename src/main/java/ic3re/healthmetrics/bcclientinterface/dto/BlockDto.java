package ic3re.healthmetrics.bcclientinterface.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockDto implements Dto{

    private String hash;

    private int confirmations;

    private int size;

    private int height;

    private int version;

    private String merkleroot;

    @JsonProperty("tx")
    private List<TransactionDto> transactions;

    private Long time;

    private Long mediantime;

    private Long nonce;

    private String  bits;

    private BigDecimal difficulty;

    private String chainwork;

    @JsonProperty("previousblockhash")
    private String previousBlockHash;

    @JsonProperty("nextblockhash")
    private String nextBlockHash;

    private AuxpowDto auxpow;

    public BlockDto(String hash) {
        this.hash = hash;
    }

    @JsonProperty("tx")
    public void setTransactions(List<TransactionDto> transactions) {
        this.transactions = Collections.singletonList(transactions.get(0));
    }


}
