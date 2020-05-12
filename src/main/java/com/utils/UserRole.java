package com.utils;


public class UserRole {

  private long id;
  private long userId;
  private String userName;
  private long roleId;
  private String RoleName;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getRoleName() {
    return RoleName;
  }

  public void setRoleName(String roleName) {
    RoleName = roleName;
  }

}
