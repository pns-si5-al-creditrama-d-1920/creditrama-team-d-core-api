package fr.unice.polytech.si5.al.creditrama.teamd.coreapi.events;

import lombok.ToString;

@ToString
public class TransferDoneEvent {
    private String bankUuid;
    private String transactionUuid;

    public TransferDoneEvent(String bankUuid, String transactionUuid) {
        this.bankUuid = bankUuid;
        this.transactionUuid = transactionUuid;
    }

    public String getBankUuid() {
        return bankUuid;
    }

    public void setBankUuid(String bankUuid) {
        this.bankUuid = bankUuid;
    }

    public String getTransactionUuid() {
        return transactionUuid;
    }

    public void setTransactionUuid(String transactionUuid) {
        this.transactionUuid = transactionUuid;
    }
}
