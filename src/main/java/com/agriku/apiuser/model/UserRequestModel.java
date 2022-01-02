package com.agriku.apiuser.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserRequestModel {

    @NotNull(message = "First Name can't be null")
    @Size(min = 2, message = "First name can not less be 2 character")
    private String firstName;

    @NotNull(message = "Last Name can't be null")
    @Size(min = 2, message = "Last name can not less be 2 character")
    private String lastName;

    @NotNull(message = "Email can't be null")
    @Email
    private String email;

    @NotNull(message = "Password can't be null")
    @Size(min = 8, max = 16)
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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
