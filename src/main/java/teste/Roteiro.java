/*
 * MIT License
 *
 * Copyright (c) 2016 José Nascimento <joseaugustodearaujonascimento@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package teste;

import java.util.Date;

/**
 * @author José Nascimento <joseaugustodearaujonascimento@gmail.com>
 */
public class Roteiro {

    private Long id;

    private long categoriaId;

    private String descricao;
    private double classificacao;
    private long qteClassificacoes;

    private Date atualizadoEm;
    private Date criadoEm;

    public Roteiro() {
    }

    public Roteiro(long id, long categoriaId, String descricao,
            double classificacao, long qteClassificacoes, Date atualizadoEm,
            Date criadoEm) {

        this.id = id;

        this.categoriaId = categoriaId;

        this.descricao = descricao;
        this.classificacao = classificacao;
        this.qteClassificacoes = qteClassificacoes;

        this.atualizadoEm = atualizadoEm;
        this.criadoEm = criadoEm;
    }

    public Date getAtualizadoEm() {

        return this.atualizadoEm;
    }

    public long getCategoriaId() {

        return this.categoriaId;
    }

    public double getClassificacao() {

        return this.classificacao;
    }

    public Date getCriadoEm() {

        return this.criadoEm;
    }

    public String getDescricao() {

        return this.descricao;
    }

    public Long getId() {

        return this.id;
    }

    public long getQteClassificacoes() {

        return this.qteClassificacoes;
    }

    public void setAtualizadoEm(Date atualizadoEm) {

        this.atualizadoEm = atualizadoEm;
    }

    public void setCategoriaId(long categoriaId) {

        this.categoriaId = categoriaId;
    }

    public void setClassificacao(double classificacao) {

        this.classificacao = classificacao;
    }

    public void setCriadoEm(Date criadoEm) {

        this.criadoEm = criadoEm;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public void setQteClassificacoes(long qteClassificacoes) {

        this.qteClassificacoes = qteClassificacoes;
    }

}
