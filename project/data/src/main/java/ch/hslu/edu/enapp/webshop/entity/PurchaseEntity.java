package ch.hslu.edu.enapp.webshop.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@NamedQueries({
        @NamedQuery(name = "getPurchaseById", query = "SELECT x FROM PurchaseEntity x WHERE x.id = :id"),
        @NamedQuery(name = "getPurchasesByUser", query = "SELECT x FROM PurchaseEntity x WHERE x.user = :user"),
        @NamedQuery(name = "getPurchaseByCorrelationId", query = "SELECT x FROM PurchaseEntity x WHERE x.correlationId = :correlationId"),
        @NamedQuery(name = "getAllUnfinishedPurchases", query = "SELECT x FROM PurchaseEntity x WHERE x.stateOrder <> 4")
})
@Table(name = "purchase", schema = "webshop", catalog = "")
public class PurchaseEntity {
    private int id;
    private String user;
    private Timestamp datetime;
    private String correlationId;
    private int statePostfinance;
    private int stateOrder;
    private UserEntity userByUser;
    private Collection<PurchaseitemEntity> purchaseitemsById;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user", nullable = false, insertable = false, updatable = false)
    public String getUser() {return user;}

    public void setUser(String user) {this.user = user;}

    @Basic
    @Column(name = "datetime", nullable = false)
    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    @Basic
    @Column(name = "correlation_id")
    public String getCorrelationId() {return this.correlationId;}

    public void setCorrelationId(String correlationId) {this.correlationId = correlationId;}

    @Basic
    @Column(name = "state_postfinance", nullable = false)
    public int getStatePostfinance() {
        return statePostfinance;
    }

    public void setStatePostfinance(int statePostfinance) {
        this.statePostfinance = statePostfinance;
    }

    @Basic
    @Column(name = "state_order", nullable = false)
    public int getStateOrder() {
        return stateOrder;
    }

    public void setStateOrder(int stateOrder) {
        this.stateOrder = stateOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseEntity that = (PurchaseEntity) o;
        return id == that.id &&
                statePostfinance == that.statePostfinance &&
                stateOrder == that.stateOrder &&
                Objects.equals(datetime, that.datetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, datetime, statePostfinance, stateOrder);
    }

    @ManyToOne
    @JoinColumn(name = "user", referencedColumnName = "name", nullable = false)
    public UserEntity getUserByUser() {
        return userByUser;
    }

    public void setUserByUser(UserEntity userByUser) {
        this.userByUser = userByUser;
    }

    @OneToMany(mappedBy = "purchaseByPurchase", cascade = CascadeType.PERSIST)
    public Collection<PurchaseitemEntity> getPurchaseitemsById() {
        return purchaseitemsById;
    }

    public void setPurchaseitemsById(Collection<PurchaseitemEntity> purchaseitemsById) {
        this.purchaseitemsById = purchaseitemsById;
    }
}
