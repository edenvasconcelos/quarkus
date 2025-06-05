package br.com.wxerp.model.embarcado;

import br.com.wxerp.model.tabela.Estado;
import br.com.wxerp.model.tabela.Pais;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class Endereco {
    
    public int seq;
    
    @Column(name = "tipo_endereco")
    public Tipo tipoEndereco;
    
    @Column(length = 125)
    public String logradouro;
    
    @Column(length = 10)
    public String numero;
    
    @Column(length = 100)
    public String complemento;
    
    @Column(length = 72)
    public String bairro;
    
    @Column(length = 60)
    public String municipio;
    
    @ManyToOne
    @JoinColumn(name="estado_sigla")
    public Estado estado;
    
    @Column(length = 8)
    public String cep;
    
    @Column(length = 7)
    public String codigoIBGE;
    
    @ManyToOne
    public Pais pais;

/*
    public Endereco() {
        super();
        this.pais = new Pais();
        this.estado = new Estado();
    }
 */

    public enum Tipo {
        Residencial("R"),
        Comercial("C"),
        Outros("O");
    
        private final String value;
        private Tipo(String tipo) { this.value = tipo; }
        public String getValue() { return value; }    
    
    } 
}
