package br.com.wxerp.model.enums;

public class Tipo {

    public static enum Pessoa {
        Fisica(Values.FISICA),
        Juridica(Values.JURIDICA),
        Estrangeira(Values.ESTRANGEIRA);

        private String value;
        private Pessoa(String tipo) { this.value = tipo; }
        public String getValue() { return value; }    

        public static class Values {
            public static final String FISICA = "F";
            public static final String JURIDICA = "J";
            public static final String ESTRANGEIRA = "E";
        }   

    }
   
}