package ic3re.healthmetrics.bcclientinterface.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VoutDto implements Dto{

    @JsonIgnore
    private TransactionDto transaction;

    private BigDecimal value;

    private int n;

    private ScriptPubKeyDto scriptPubKey;

    private int blockheight;

    public TransactionDto getTransaction() {
        return transaction;
    }

    public void setTransaction(TransactionDto transaction) {
        this.transaction = transaction;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public ScriptPubKeyDto getScriptPubKey() {
        return scriptPubKey;
    }

    public void setScriptPubKey(ScriptPubKeyDto scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }

    public int getBlockheight() {
        return blockheight;
    }

    public void setBlockheight(int blockheight) {
        this.blockheight = blockheight;
    }
}
