package com.utils;


import java.util.List;

public class Role {

  private long roleId;
  private String roleName;
  private String roleDescription;
  private long isLock;
  private String creator;
  private java.sql.Timestamp creationDate;
  private List<String> permissionList;


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public String getRoleDescription() {
    return roleDescription;
  }

  public void setRoleDescription(String roleDescription) {
    this.roleDescription = roleDescription;
  }


  public long getIsLock() {
    return isLock;
  }

  public void setIsLock(long isLock) {
    this.isLock = isLock;
  }


  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }


  public java.sql.Timestamp getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(java.sql.Timestamp creationDate) {
    this.creationDate = creationDate;
  }

  public List<String> getPermissionList() {
    return permissionList;
  }

  public void setPermissionList(List<String> permissionList) {
    this.permissionList = permissionList;
  }

}
