package com.hyperwallet.clientsdk.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.hyperwallet.clientsdk.util.HyperwalletJsonConfiguration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

@JsonFilter(HyperwalletJsonConfiguration.INCLUSION_FILTER)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class HyperwalletTransfer extends HyperwalletBaseMonitor {

    public static enum Status {QUOTED, SCHEDULED, IN_PROGRESS, VERIFICATION_REQUIRED, COMPLETED, CANCELLED, RETURNED, FAILED, EXPIRED}

    private String token;
    private Status status;
    private Date createdOn;
    private String clientTransferId;
    private String sourceToken;
    private String sourceAmount;
    private String sourceFeeAmount;
    private String sourceCurrency;
    private String destinationToken;
    private String destinationAmount;
    private String destinationFeeAmount;
    private String destinationCurrency;
    private List<ForeignExchange> foreignExchanges;
    private String notes;
    private String memo;
    private Date expiresOn;
    private List<HyperwalletLink> links;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        addField("token", token);
        this.token = token;
    }

    public HyperwalletTransfer token(String token) {
        addField("token", token);
        this.token = token;
        return this;
    }

    public HyperwalletTransfer clearToken() {
        clearField("token");
        this.token = null;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        addField("status", status);
        this.status = status;
    }

    public HyperwalletTransfer status(Status status) {
        addField("status", status);
        this.status = status;
        return this;
    }

    public HyperwalletTransfer clearStatus() {
        clearField("status");
        status = null;
        return this;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        addField("createdOn", createdOn);
        this.createdOn = createdOn;
    }

    public HyperwalletTransfer createdOn(Date createdOn) {
        addField("createdOn", createdOn);
        this.createdOn = createdOn;
        return this;
    }

    public HyperwalletTransfer clearCreatedOn() {
        clearField("createdOn");
        this.createdOn = null;
        return this;
    }

    public String getClientTransferId() {
        return clientTransferId;
    }

    public void setClientTransferId(String clientTransferId) {
        addField("clientTransferId", clientTransferId);
        this.clientTransferId = clientTransferId;
    }

    public HyperwalletTransfer clientTransferId(String clientTransferId) {
        addField("clientTransferId", clientTransferId);
        this.clientTransferId = clientTransferId;
        return this;
    }

    public HyperwalletTransfer clearClientTransferId() {
        clearField("clientTransferId");
        this.clientTransferId = null;
        return this;
    }

    public String getSourceToken() {
        return sourceToken;
    }

    public void setSourceToken(String sourceToken) {
        addField("sourceToken", sourceToken);
        this.sourceToken = sourceToken;
    }

    public HyperwalletTransfer sourceToken(String sourceToken) {
        addField("sourceToken", sourceToken);
        this.sourceToken = sourceToken;
        return this;
    }

    public HyperwalletTransfer clearSourceToken() {
        clearField("sourceToken");
        this.sourceToken = null;
        return this;
    }

    public String getSourceAmount() {
        return sourceAmount;
    }

    public void setSourceAmount(String sourceAmount) {
        addField("sourceAmount", sourceAmount);
        this.sourceAmount = sourceAmount;
    }

    public HyperwalletTransfer sourceAmount(String sourceAmount) {
        addField("sourceAmount", sourceAmount);
        this.sourceAmount = sourceAmount;
        return this;
    }

    public HyperwalletTransfer clearSourceAmount() {
        clearField("sourceAmount");
        this.sourceAmount = null;
        return this;
    }

    public String getSourceFeeAmount() {
        return sourceFeeAmount;
    }

    public void setSourceFeeAmount(String sourceFeeAmount) {
        addField("sourceFeeAmount", sourceFeeAmount);
        this.sourceFeeAmount = sourceFeeAmount;
    }

    public HyperwalletTransfer sourceFeeAmount(String sourceFeeAmount) {
        addField("sourceFeeAmount", sourceFeeAmount);
        this.sourceFeeAmount = sourceFeeAmount;
        return this;
    }

    public HyperwalletTransfer clearSourceFeeAmount() {
        clearField("sourceFeeAmount");
        this.sourceFeeAmount = null;
        return this;
    }

    public String getSourceCurrency() {
        return sourceCurrency;
    }

    public void setSourceCurrency(String sourceCurrency) {
        addField("sourceCurrency", sourceCurrency);
        this.sourceCurrency = sourceCurrency;
    }

    public HyperwalletTransfer sourceCurrency(String sourceCurrency) {
        addField("sourceCurrency", sourceCurrency);
        this.sourceCurrency = sourceCurrency;
        return this;
    }

    public HyperwalletTransfer clearSourceCurrency() {
        clearField("sourceCurrency");
        this.sourceCurrency = null;
        return this;
    }

    public String getDestinationToken() {
        return destinationToken;
    }

    public void setDestinationToken(String destinationToken) {
        addField("destinationToken", destinationToken);
        this.destinationToken = destinationToken;
    }

    public HyperwalletTransfer destinationToken(String destinationToken) {
        addField("destinationToken", destinationToken);
        this.destinationToken = destinationToken;
        return this;
    }

    public HyperwalletTransfer clearDestinationToken() {
        clearField("destinationToken");
        this.destinationToken = null;
        return this;
    }

    public String getDestinationAmount() {
        return destinationAmount;
    }

    public void setDestinationAmount(String destinationAmount) {
        addField("destinationAmount", destinationAmount);
        this.destinationAmount = destinationAmount;
    }

    public HyperwalletTransfer destinationAmount(String destinationAmount) {
        addField("destinationAmount", destinationAmount);
        this.destinationAmount = destinationAmount;
        return this;
    }

    public HyperwalletTransfer clearDestinationAmount() {
        clearField("destinationAmount");
        this.destinationAmount = null;
        return this;
    }

    public String getDestinationFeeAmount() {
        return destinationFeeAmount;
    }

    public void setDestinationFeeAmount(String destinationFeeAmount) {
        addField("destinationFeeAmount", destinationFeeAmount);
        this.destinationFeeAmount = destinationFeeAmount;
    }

    public HyperwalletTransfer destinationFeeAmount(String destinationFeeAmount) {
        addField("destinationFeeAmount", destinationFeeAmount);
        this.destinationFeeAmount = destinationFeeAmount;
        return this;
    }

    public HyperwalletTransfer clearDestinationFeeAmount() {
        clearField("destinationFeeAmount");
        this.destinationFeeAmount = null;
        return this;
    }

    public String getDestinationCurrency() {
        return destinationCurrency;
    }

    public void setDestinationCurrency(String destinationCurrency) {
        addField("destinationCurrency", destinationCurrency);
        this.destinationCurrency = destinationCurrency;
    }

    public HyperwalletTransfer destinationCurrency(String destinationCurrency) {
        addField("destinationCurrency", destinationCurrency);
        this.destinationCurrency = destinationCurrency;
        return this;
    }

    public HyperwalletTransfer clearDestinationCurrency() {
        clearField("destinationCurrency");
        this.destinationCurrency = null;
        return this;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        addField("notes", notes);
        this.notes = notes;
    }

    public HyperwalletTransfer notes(String notes) {
        addField("notes", notes);
        this.notes = notes;
        return this;
    }

    public HyperwalletTransfer clearNotes() {
        clearField("notes");
        this.notes = null;
        return this;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        addField("memo", memo);
        this.memo = memo;
    }

    public HyperwalletTransfer memo(String memo) {
        addField("memo", memo);
        this.memo = memo;
        return this;
    }

    public HyperwalletTransfer clearMemo() {
        clearField("memo");
        this.memo = null;
        return this;
    }

    public Date getExpiresOn() {
        return expiresOn;
    }

    public void setExpiresOn(Date expiresOn) {
        addField("expiresOn", expiresOn);
        this.expiresOn = expiresOn;
    }

    public HyperwalletTransfer expiresOn(Date expiresOn) {
        addField("expiresOn", expiresOn);
        this.expiresOn = expiresOn;
        return this;
    }

    public HyperwalletTransfer clearExpiresOn() {
        clearField("expiresOn");
        this.expiresOn = null;
        return this;
    }

    public List<ForeignExchange> getForeignExchanges() {
        return foreignExchanges;
    }

    public void setForeignExchanges(List<ForeignExchange> foreignExchanges) {
        addField("foreignExchanges", foreignExchanges);
        this.foreignExchanges = foreignExchanges;
    }

    public HyperwalletTransfer foreignExchanges(List<ForeignExchange> foreignExchanges) {
        addField("foreignExchanges", foreignExchanges);
        this.foreignExchanges = foreignExchanges;
        return this;
    }

    public HyperwalletTransfer clearForeignExchanges() {
        clearField("foreignExchanges");
        this.foreignExchanges = null;
        return this;
    }

    public List<HyperwalletLink> getLinks() {
        return links;
    }

    public void setLinks(List<HyperwalletLink> links) {
        addField("links", links);
        this.links = links;
    }

    public HyperwalletTransfer links(List<HyperwalletLink> links) {
        addField("links", links);
        this.links = links;
        return this;
    }

    public HyperwalletTransfer clearLinks() {
        clearField("links");
        this.links = null;
        return this;
    }

    public static class ForeignExchange {

        private String sourceAmount;
        private String sourceCurrency;
        private String destinationAmount;
        private String destinationCurrency;
        private String rate;

        public String getSourceAmount() {
            return sourceAmount;
        }

        public void setSourceAmount(String sourceAmount) {
            this.sourceAmount = sourceAmount;
        }

        public String getSourceCurrency() {
            return sourceCurrency;
        }

        public void setSourceCurrency(String sourceCurrency) {
            this.sourceCurrency = sourceCurrency;
        }

        public String getDestinationAmount() {
            return destinationAmount;
        }

        public void setDestinationAmount(String destinationAmount) {
            this.destinationAmount = destinationAmount;
        }

        public String getDestinationCurrency() {
            return destinationCurrency;
        }

        public void setDestinationCurrency(String destinationCurrency) {
            this.destinationCurrency = destinationCurrency;
        }

        public String getRate() {
            return rate;
        }

        public void setRate(String rate) {
            this.rate = rate;
        }
    }
}
