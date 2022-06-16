package cn.tedu.mybatis.vo;

import cn.tedu.mybatis.pojo.Permission;
import cn.tedu.mybatis.pojo.Role;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

// view object/ value object 用于封装查询的结果，在页面显示数据的类
public class AdminDetailsVO implements Serializable {
    private Long id;
    private String username;
    private String password;
    private String nickname;
    private String avatar;
    private String phone;
    private String email;
    private String description;
    private Integer isEnable;
    private String lastLoginIp;
    private Integer loginCount;
    private LocalDateTime gmtLastLogin;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private List<Role> roles;
    private List<Permission> permission;

    @Override
    public String toString() {
        return "AdminDetailsVO{" +
                "   id=" + id +
                " , username='" + username + '\'' +
                " , password='" + password + '\'' +
                " , nickname='" + nickname + '\'' +
                " , avatar='" + avatar + '\'' +
                " , phone='" + phone + '\'' +
                " , email='" + email + '\'' +
                " , description='" + description + '\'' +
                " , isEnable=" + isEnable +
                " , lastLoginIp='" + lastLoginIp + '\'' +
                " , loginCount=" + loginCount +
                " , gmtLastLogin=" + gmtLastLogin +
                " , gmtCreate=" + gmtCreate +
                " , gmtModified=" + gmtModified +
                " , roles=" + roles +
                " , permission=" + permission +
                '}';
    }

    public List<Permission> getPermission() {
        return permission;
    }

    public void setPermission(List<Permission> permission) {
        this.permission = permission;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, nickname, avatar, phone, email, description, isEnable, lastLoginIp, loginCount, gmtLastLogin, gmtCreate, gmtModified, roles);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public LocalDateTime getGmtLastLogin() {
        return gmtLastLogin;
    }

    public void setGmtLastLogin(LocalDateTime gmtLastLogin) {
        this.gmtLastLogin = gmtLastLogin;
    }

    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
