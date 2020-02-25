package com.bw.jcart_administration_back.dto.out;

public class AddressListOutDTO {
    private Integer addressId;
    private String receiverName;
    private String receiverMobile;
    private String content;
    private String tag;

    public AddressListOutDTO(Integer addressId, String receiverName, String receiverMobile, String content, String tag) {
        this.addressId = addressId;
        this.receiverName = receiverName;
        this.receiverMobile = receiverMobile;
        this.content = content;
        this.tag = tag;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}