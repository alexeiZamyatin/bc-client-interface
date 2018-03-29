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

    public BlockDto() {

    }

    public BlockDto(BlockDtoTxFree blockDtoTxFree) {
        this.hash = blockDtoTxFree.getHash();
        this.confirmations = blockDtoTxFree.getConfirmations();
        this.size = blockDtoTxFree.getSize();
        this.height = blockDtoTxFree.getHeight();
        this.version = blockDtoTxFree.getVersion();
        this.merkleroot = blockDtoTxFree.getMerkleroot();
        this.time = blockDtoTxFree.getTime();
        this.nonce = blockDtoTxFree.getNonce();
        this.bits = blockDtoTxFree.getBits();
        this.difficulty = blockDtoTxFree.getDifficulty();
        this.chainwork = blockDtoTxFree.getChainwork();
        this.mediantime = blockDtoTxFree.getMediantime();
        this.previousBlockHash = blockDtoTxFree.getPreviousBlockHash();
        this.nextBlockHash = blockDtoTxFree.getNextBlockHash();
        this.auxpow = blockDtoTxFree.getAuxpow();
        this.transactions = new ArrayList<>();
    }

    @JsonProperty("tx")
    public void setTransactions(List<TransactionDto> transactions) {
        this.transactions = Collections.singletonList(transactions.get(0));
    }


}
