package com.atguigu.atcrowdfunding.bean;

public class AdministrableRoleAuthorizations {
    private String user;

    private String host;

    private String grantee;

    private String granteeHost;

    private String roleName;

    private String roleHost;

    private String isGrantable;

    private String isDefault;

    private String isMandatory;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public String getGrantee() {
        return grantee;
    }

    public void setGrantee(String grantee) {
        this.grantee = grantee == null ? null : grantee.trim();
    }

    public String getGranteeHost() {
        return granteeHost;
    }

    public void setGranteeHost(String granteeHost) {
        this.granteeHost = granteeHost == null ? null : granteeHost.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleHost() {
        return roleHost;
    }

    public void setRoleHost(String roleHost) {
        this.roleHost = roleHost == null ? null : roleHost.trim();
    }

    public String getIsGrantable() {
        return isGrantable;
    }

    public void setIsGrantable(String isGrantable) {
        this.isGrantable = isGrantable == null ? null : isGrantable.trim();
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    public String getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(String isMandatory) {
        this.isMandatory = isMandatory == null ? null : isMandatory.trim();
    }
}