package ic3re.healthmetrics.bcclientinterface.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class TransactionDto implements Dto{

    private String hash;

    private long locktime;

    private int size;

    private String txid;

    private int version;

    private String blockhash;

    @JsonProperty("vin")
    private List<VinDto> inputs;

    @JsonProperty("vout")
    private List<VoutDto> outputs;

    private BigDecimal fees;


    public TransactionDto(){
        this.inputs = new ArrayList<>();
        this.outputs = new ArrayList<>();
    }

    public void addInput(VinDto vinDto){
        this.inputs.add(vinDto);
        vinDto.setTransaction(this);
    }

    public void addOutput(VoutDto voutDto){
        this.outputs.add(voutDto);
        voutDto.setTransaction(this);
    }

}
