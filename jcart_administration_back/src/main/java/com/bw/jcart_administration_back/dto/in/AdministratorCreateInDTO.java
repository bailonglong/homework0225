package com.bw.jcart_administration_back.dto.in;

public class AdministratorCreateInDTO {
    private String username;
    private String realName;
    private String password;
    private String email;
    private String avatarUrl;
    private Byte status;

    public AdministratorCreateInDTO(String username, String realName, String password, String email, String avatarUrl, Byte status) {
        this.username = username;
        this.realName = realName;
        this.password = password;
        this.email = email;
        this.avatarUrl = avatarUrl;
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
