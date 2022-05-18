package th.co.mfec.car.model.customer;

import javax.validation.constraints.NotEmpty;

public class CustomerRegisterRequest {

    @NotEmpty(message = "The email is required.")
    private String email;

    @NotEmpty(message = "The password is required.")
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
