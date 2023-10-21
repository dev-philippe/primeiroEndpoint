package com.criandoEndpoint.WatchDogs.model;

public class Permissao {


        private int id;
        private String nome;
        private String permissao;

        public Permissao(int id, String nome, String permissao) {
            this.id = id;
            this.nome = nome;
            this.permissao = permissao;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getPermissao() {
            return permissao;
        }

        public void setPermissao(String permissao) {
            this.permissao = permissao;
        }

        @Override
        public String toString() {
            return "Permissao [ID=" + id + ", NOME=" + nome + ", PERMISSAO=" + permissao + "]";
        }
    }


