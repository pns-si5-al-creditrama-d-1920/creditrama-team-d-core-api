package fr.unice.polytech.si5.al.creditrama.teamd.coreapi.commands;

import lombok.ToString;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@ToString
public class MakeTransferCommand {

    @TargetAggregateIdentifier
    private String bankUuid;
    private String uuid;
    private String sourceIban;
    private String destIban;
    private double amount;

    public MakeTransferCommand(String bankUuid, String uuid, String sourceIban, String destIban, double amount) {
        this.bankUuid = bankUuid;
        this.uuid = uuid;
        this.sourceIban = sourceIban;
        this.destIban = destIban;
        this.amount = amount;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getBankUuid() {
        return bankUuid;
    }

    public void setBankUuid(String bankUuid) {
        this.bankUuid = bankUuid;
    }

    public String getSourceIban() {
        return sourceIban;
    }

    public void setSourceIban(String sourceIban) {
        this.sourceIban = sourceIban;
    }

    public String getDestIban() {
        return destIban;
    }

    public void setDestIban(String destIban) {
        this.destIban = destIban;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
