package com.criandoEndpoint.WatchDogs.model;



    public class Endereco {
        private int id;
        private String cidade;
        private String rua;
        private String numero;
        private String bairro;
        private String pais;

        public Endereco(int id, String cidade, String rua, String numero, String bairro, String pais) {
            this.id = id;
            this.cidade = cidade;
            this.rua = rua;
            this.numero = numero;
            this.bairro = bairro;
            this.pais = pais;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public String getBairro() {
            return bairro;
        }

        public void setBairro(String bairro) {
            this.bairro = bairro;
        }

        public String getPais() {
            return pais;
        }

        public void setPais(String pais) {
            this.pais = pais;
        }

        @Override
        public String toString() {
            return "Endereco [ID=" + id + ", Cidade=" + cidade + ", Rua=" + rua + ", Número=" + numero + ", Bairro=" + bairro + ", País=" + pais + "]";
        }
    }


