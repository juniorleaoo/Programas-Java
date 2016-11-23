/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Junior
 */
@Entity
@Table(name = "imc", catalog = "imc", schema = "")
@NamedQueries({
    @NamedQuery(name = "Imc.findAll", query = "SELECT i FROM Imc i"),
    @NamedQuery(name = "Imc.findByPeso", query = "SELECT i FROM Imc i WHERE i.peso = :peso"),
    @NamedQuery(name = "Imc.findByNome", query = "SELECT i FROM Imc i WHERE i.nome = :nome"),
    @NamedQuery(name = "Imc.findByAltura", query = "SELECT i FROM Imc i WHERE i.altura = :altura"),
    @NamedQuery(name = "Imc.findByCalculoIMC", query = "SELECT i FROM Imc i WHERE i.calculoIMC = :calculoIMC")})
public class Imc implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "peso")
    private int peso;
    @Id
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "altura")
    private float altura;
    @Basic(optional = false)
    @Column(name = "calculoIMC")
    private float calculoIMC;

    public Imc() {
    }

    public Imc(String nome) {
        this.nome = nome;
    }

    public Imc(String nome, int peso, float altura, float calculoIMC) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.calculoIMC = calculoIMC;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        int oldPeso = this.peso;
        this.peso = peso;
        changeSupport.firePropertyChange("peso", oldPeso, peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        float oldAltura = this.altura;
        this.altura = altura;
        changeSupport.firePropertyChange("altura", oldAltura, altura);
    }

    public float getCalculoIMC() {
        return calculoIMC;
    }

    public void setCalculoIMC(float calculoIMC) {
        float oldCalculoIMC = this.calculoIMC;
        this.calculoIMC = calculoIMC;
        changeSupport.firePropertyChange("calculoIMC", oldCalculoIMC, calculoIMC);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nome != null ? nome.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Imc)) {
            return false;
        }
        Imc other = (Imc) object;
        if ((this.nome == null && other.nome != null) || (this.nome != null && !this.nome.equals(other.nome))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "imc.Imc[ nome=" + nome + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
