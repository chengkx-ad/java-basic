public class user {
    private String username;
    private String password;
    private String IdCard;
    private String PhoneNumber;

    public user() {
    }

    public user(String username, String password, String idCard, String phoneNumber) {
        this.username = username;
        this.password = password;
        IdCard = idCard;
        PhoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdCard() {
        return IdCard;
    }

    public void setIdCard(String idCard) {
        IdCard = idCard;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
