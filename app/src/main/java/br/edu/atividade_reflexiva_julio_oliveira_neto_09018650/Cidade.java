package br.edu.atividade_reflexiva_julio_oliveira_neto_09018650;

public class Cidade {

    private String _nome_cidade;
    private String _qtd_habitantes;
    private int _photoId;

    public String get_nome_cidade() {
        return this._nome_cidade;
    }

    public String get_qtd_habitantes() {
        return this._qtd_habitantes;
    }

    public int get_photoId() {
        return this._photoId;
    }

    public Cidade(String _nome_cidade, String _qtd_habitantes, int _photoId) {
        this._nome_cidade = _nome_cidade;
        this._qtd_habitantes = _qtd_habitantes;
        this._photoId = _photoId;
    }
}
