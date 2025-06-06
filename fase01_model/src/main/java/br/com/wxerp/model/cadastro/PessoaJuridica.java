package br.com.wxerp.model.cadastro;

import java.time.LocalDate;

import br.com.wxerp.model.embarcado.RegimeTributario;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "pessoa_juridica")
@DiscriminatorValue(value = Pessoa.Tipo.Values.JURIDICA)
public class PessoaJuridica extends Pessoa {

    @Basic(optional = false)
    @Column(name = "razao_social", length = 100)
    public String razaoSocial;

    @Basic(optional = false)
    @Column(name = "nome_fantasia", length = 100)
    public String nomeFantasia;

    @Basic(optional = false)
    @Column(name = "data_fundacao")
    @Temporal(TemporalType.DATE)
    public LocalDate dataFundacao;

    @Basic(optional = false)
    @Column(name = "cnpj", length = 14)
    public String cnpj;

    @Column(name = "inscricao_estadual", length = 18)
    public String inscricaoEstadual;

    @Column(name = "inscricao_suframa", length = 18)
    public String inscricaoSuframa;

    @Column(name = "inscricao_municipal", length = 18)
    public String inscricaoMunicipal;
    
    public RegimeTributario regimeTributario;
    
}
