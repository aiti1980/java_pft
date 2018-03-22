package ru.stqa.pft.addressbook.moduleContact;

public class ContactData {
  private final String name;
  private final String lastName;
  private final String mobile;
  private final String email;

  public ContactData(String name, String lastName, String mobile, String email) {
    this.name = name;
    this.lastName = lastName;
    this.mobile = mobile;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getLastName() {
    return lastName;
  }

  public String getMobile() {
    return mobile;
  }

  public String getEmail() {
    return email;
  }
}
