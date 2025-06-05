package br.com.wxerp.model.cadastro;

import java.time.LocalDate;

import br.com.wxerp.model.embarcado.RG;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "pessoa_fisica")
@DiscriminatorValue(value = Pessoa.Tipo.Values.FISICA)
public class PessoaFisica  extends Pessoa {
    @Column(name = "nome", length = 60)
    public String nome;

    @Column(name = "data_nascimento")
    @Temporal(TemporalType.DATE)
    public LocalDate dataNascimento;

    @Column(name = "cpf", length = 11, nullable = true)
    public String cpf;

    @Column(name = "rg", length = 10)
    public RG rg;

    @ManyToOne(fetch = FetchType.LAZY)
    public PessoaFisica mae;

    @ManyToOne(fetch = FetchType.LAZY)
    public PessoaFisica pai;

}
