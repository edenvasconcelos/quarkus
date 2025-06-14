package br.com.wxerp.model.cadastro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.UpdateTimestamp;

import br.com.wxerp.model.embarcado.Endereco;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="pessoa")
public abstract class Pessoa extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public Situacao situacao;

    @Column(length = 500)
    public String observacao;
  
    @ElementCollection(fetch = FetchType.LAZY)
    @Fetch(FetchMode.SUBSELECT)
    @CollectionTable(name = "pessoa_endereco", joinColumns = @JoinColumn(name = "pessoa_id"))
    public List<Endereco> enderecos;

    @CreationTimestamp
    @Column(name="data_criacao")
    public Date dataCriacao;

    @UpdateTimestamp
    @Column(name="data_atualizacao")
    public Date dataAtualizacao;

    public Pessoa() {
        this.enderecos = new ArrayList<>();
    }

    public static enum Situacao {
        Ativo("A"),
        Inativo("I");

        private final String value;
        private Situacao(String tipo) { this.value = tipo; }
        public String getValue() { return value; }       
    }

    public static enum Tipo {
        Fisica(Values.FISICA),
        Juridica(Values.JURIDICA),
        Estrangeira(Values.ESTRANGEIRA);

        private String value;
        private Tipo(String tipo) { this.value = tipo; }
        public String getValue() { return value; }    

        public static class Values {
            public static final String FISICA = "F";
            public static final String JURIDICA = "J";
            public static final String ESTRANGEIRA = "E";
        }   

    }


}