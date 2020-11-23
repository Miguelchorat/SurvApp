package com.example.survapp.util;

public enum TipoAvatar {
        DEFAULT(0,"/imagen/0.png"),
        CIENCIA(1,"/imagen/1.png"),
        DEPORTE(2,"/imagen/2.png"),
        TIEMPO(3,"/imagen/3.png");

        private final int numero;
        private final String url;

        TipoAvatar(int numero,String url){
            this.numero = numero;
            this.url = url;
        }

        public int getNumero() {
            return numero;
        }

        public String getUrl() {
            return url;
        }
}


