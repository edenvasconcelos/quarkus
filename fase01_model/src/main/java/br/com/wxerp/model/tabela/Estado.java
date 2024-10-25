package br.com.wxerp.model.tabela;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Estado extends PanacheEntityBase {

    @Id
    @Column(length = 2)
    public String sigla;

    @Column(length = 60)
    public String nome;
    
    @Column(length = 2,name = "codigo_ibge")
    public String codigoIBGE;

}
