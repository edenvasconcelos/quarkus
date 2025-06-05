package br.com.wxerp.model.embarcado;

import java.time.LocalDate;

import br.com.wxerp.model.tabela.Estado;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Embeddable
public class RG {

    @Column(name = "rg", length = 10)
    public String numero;

    @ManyToOne
    @JoinColumn(name = "uf_expedicao")
    public Estado ufExpedicao;

    @Column(name = "rg_data_expedicao")
    @Temporal(TemporalType.DATE)
    public LocalDate rgDataExpedicao;
    
    @Column(name = "rg_orgao_expedicao", length = 10)
    public String rgOrgaoExpedicao;

}
