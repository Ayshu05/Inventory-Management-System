/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainFiles;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Harini Mohan
 */
@Entity
@Table(name = "PRODUCTS", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Products.findAll", query = "SELECT p FROM Products p")
    , @NamedQuery(name = "Products.findByPid", query = "SELECT p FROM Products p WHERE p.pid = :pid")
    , @NamedQuery(name = "Products.findByBrand", query = "SELECT p FROM Products p WHERE p.brand = :brand")
    , @NamedQuery(name = "Products.findByPname", query = "SELECT p FROM Products p WHERE p.pname = :pname")
    , @NamedQuery(name = "Products.findByMfgDate", query = "SELECT p FROM Products p WHERE p.mfgDate = :mfgDate")
    , @NamedQuery(name = "Products.findByExpDate", query = "SELECT p FROM Products p WHERE p.expDate = :expDate")
    , @NamedQuery(name = "Products.findByCategory", query = "SELECT p FROM Products p WHERE p.category = :category")
    , @NamedQuery(name = "Products.findByQuantity", query = "SELECT p FROM Products p WHERE p.quantity = :quantity")
    , @NamedQuery(name = "Products.findByUnitPrice", query = "SELECT p FROM Products p WHERE p.unitPrice = :unitPrice")})
public class Products implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PID")
    private String pid;
    @Basic(optional = false)
    @Column(name = "BRAND")
    private String brand;
    @Basic(optional = false)
    @Column(name = "PNAME")
    private String pname;
    @Basic(optional = false)
    @Column(name = "MFG_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mfgDate;
    @Basic(optional = false)
    @Column(name = "EXP_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expDate;
    @Basic(optional = false)
    @Column(name = "CATEGORY")
    private String category;
    @Basic(optional = false)
    @Column(name = "QUANTITY")
    private BigInteger quantity;
    @Basic(optional = false)
    @Column(name = "UNIT_PRICE")
    private BigInteger unitPrice;

    public Products() {
    }

    public Products(String pid) {
        this.pid = pid;
    }

    public Products(String pid, String brand, String pname, Date mfgDate, Date expDate, String category, BigInteger quantity, BigInteger unitPrice) {
        this.pid = pid;
        this.brand = brand;
        this.pname = pname;
        this.mfgDate = mfgDate;
        this.expDate = expDate;
        this.category = category;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        String oldPid = this.pid;
        this.pid = pid;
        changeSupport.firePropertyChange("pid", oldPid, pid);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        String oldBrand = this.brand;
        this.brand = brand;
        changeSupport.firePropertyChange("brand", oldBrand, brand);
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        String oldPname = this.pname;
        this.pname = pname;
        changeSupport.firePropertyChange("pname", oldPname, pname);
    }

    public Date getMfgDate() {
        return mfgDate;
    }

    public void setMfgDate(Date mfgDate) {
        Date oldMfgDate = this.mfgDate;
        this.mfgDate = mfgDate;
        changeSupport.firePropertyChange("mfgDate", oldMfgDate, mfgDate);
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        Date oldExpDate = this.expDate;
        this.expDate = expDate;
        changeSupport.firePropertyChange("expDate", oldExpDate, expDate);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        String oldCategory = this.category;
        this.category = category;
        changeSupport.firePropertyChange("category", oldCategory, category);
    }

    public BigInteger getQuantity() {
        return quantity;
    }

    public void setQuantity(BigInteger quantity) {
        BigInteger oldQuantity = this.quantity;
        this.quantity = quantity;
        changeSupport.firePropertyChange("quantity", oldQuantity, quantity);
    }

    public BigInteger getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigInteger unitPrice) {
        BigInteger oldUnitPrice = this.unitPrice;
        this.unitPrice = unitPrice;
        changeSupport.firePropertyChange("unitPrice", oldUnitPrice, unitPrice);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pid != null ? pid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Products)) {
            return false;
        }
        Products other = (Products) object;
        if ((this.pid == null && other.pid != null) || (this.pid != null && !this.pid.equals(other.pid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MainFiles.Products[ pid=" + pid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
