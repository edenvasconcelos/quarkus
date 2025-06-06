package br.com.wxerp.model.embarcado;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class RegimeTributario {

    @Column(name = "tipo_regime_tributario")
    Tipo tipoRegimeTriburario;

    @Column(name = "aliquota_simples_nacional")
    public Double aliquotaSimpleNacional;

    public static enum Tipo {
        MEI(Values.MEI),
        Simples(Values.SIMPLES),
        LucroPresumido(Values.LUCROPRESUMIDO),
        LucroReal(Values.LUCROREAL);

        private String value;
        private Tipo(String tipo){ this.value = tipo; }
        public String getValue(){ return value; }

        public static class Values{
            public static final String MEI = "M";
            public static final String SIMPLES = "S";
            public static final String LUCROPRESUMIDO = "P";
            public static final String LUCROREAL = "R";
        }
    }

}
