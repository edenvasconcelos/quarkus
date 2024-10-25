package br.com.wxerp.model.tabela;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pais")
public class Pais extends PanacheEntityBase {
    
    @Id
    @Column(length=3)
    public String id;
    
    @Column(length = 100)
    @Basic(optional = false)
    public String nome;
    
    @Column(length=4)
    public String codigo;

}
