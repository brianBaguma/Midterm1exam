package com.example.demo.model;

public class HouseOwner {
    private String firstname;
    private String Lastname;
    private String mobileNumber;
    private String email;
    private int id;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTokens(privateList<Token> tokens) {
        this.tokens = tokens;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public privateList<Token> getTokens() {
        return tokens;
    }

    @Enumerated(EnumType.String)
    private Role role;

    @OneToMany(mappedBy= "User")
    privateList<Token>tokens;

  @oneToMany(mappedBy ="User")
    privateList<Token>tokens;

  @Override
    public String getFirstname(){
      return this.firstname;
  }





}
