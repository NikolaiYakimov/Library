package com.myfirstapp.library.model;

public class Member {
    private String firstName;
    private String lastName;
    private String email;
    private String membershipType;

    public Member() {

    }

    public Member(String firstName, String lastName, String email, String membershipType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.membershipType = membershipType;
    }

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

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }
}
