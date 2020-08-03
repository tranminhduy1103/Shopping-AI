package net.javaguides.springboot.springsecurity.web.dto;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


import com.sun.istack.NotNull;
import net.javaguides.springboot.springsecurity.constraint.FieldMatch;

/**This class is used as a form of registration( for register function)**/

@FieldMatch.List({
        @FieldMatch(first = "password", second = "confirmPassword", message = "The password fields must match"),
        @FieldMatch(first = "email", second = "confirmEmail", message = "The email fields must match")
})

public class UserRegistrationDto {
    @NotNull
    @NotEmpty
    @Size(min = 2, max = 32, message = "Name must be between 2 and 32 characters long")
    private String firstName;


    @NotNull
    @NotEmpty
    private String lastName;


    @NotNull
    @NotEmpty
    private String password;

    @NotNull
    @NotEmpty
    private String confirmPassword;

    @NotNull
    @Email
    @NotEmpty
    private String email;

    @NotNull
    @Email
    @NotEmpty
    private String confirmEmail;

    @AssertTrue
    private Boolean terms;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public @Email @NotEmpty(message = "must fill this field") String getConfirmEmail() {
        return confirmEmail;
    }

    public void setConfirmEmail(String confirmEmail) {
        this.confirmEmail = confirmEmail;
    }

    public Boolean getTerms() {
        return terms;
    }

    public void setTerms(Boolean terms) {
        this.terms = terms;
    }

    @Override
    public String toString() {
        return "UserRegistrationDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", email='" + email + '\'' +
                ", confirmEmail='" + confirmEmail + '\'' +
                ", terms=" + terms +
                '}';
    }
}
