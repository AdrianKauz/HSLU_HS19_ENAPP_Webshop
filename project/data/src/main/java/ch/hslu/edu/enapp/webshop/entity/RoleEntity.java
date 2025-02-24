package ch.hslu.edu.enapp.webshop.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@NamedQueries({
        @NamedQuery(name = "getRoles", query = "SELECT r FROM RoleEntity r"),
        @NamedQuery(name = "getRoleByName", query = "SELECT r FROM RoleEntity r WHERE r.name = :name")
})

@Table(name = "role", schema = "webshop", catalog = "")
public class RoleEntity {
    private String name;
    private Collection<UsertoroleEntity> usertorolesByName;

    @Id
    @Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleEntity that = (RoleEntity) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @OneToMany(mappedBy = "roleByRole")
    public Collection<UsertoroleEntity> getUsertorolesByName() {
        return usertorolesByName;
    }

    public void setUsertorolesByName(Collection<UsertoroleEntity> usertorolesByName) {
        this.usertorolesByName = usertorolesByName;
    }
}
