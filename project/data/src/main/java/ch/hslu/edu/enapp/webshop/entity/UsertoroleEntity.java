package ch.hslu.edu.enapp.webshop.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "usertorole", schema = "webshop", catalog = "")
@IdClass(UsertoroleEntityPK.class)
public class UsertoroleEntity {
    private String name;
    private String role;
    private UserEntity userByName;
    private RoleEntity roleByRole;

    @Id
    @Column(name = "name", nullable = false, length = 255, insertable = false, updatable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "role", nullable = false, length = 255, insertable = false, updatable = false)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsertoroleEntity that = (UsertoroleEntity) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, role);
    }

    @ManyToOne
    @JoinColumn(name = "name", referencedColumnName = "name", nullable = false)
    public UserEntity getUserByName() {
        return userByName;
    }

    public void setUserByName(UserEntity userByName) {
        this.userByName = userByName;
    }

    @ManyToOne
    @JoinColumn(name = "role", referencedColumnName = "name", nullable = false)
    public RoleEntity getRoleByRole() {
        return roleByRole;
    }

    public void setRoleByRole(RoleEntity roleByRole) {
        this.roleByRole = roleByRole;
    }
}
