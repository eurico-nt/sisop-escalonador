package br.trabalho.facin;

public class Processo {
    private String nomeProcesso;
    private int tempoDeChegada;
    private int tempoExecucao;
    private int prioridade;
    private int tempoAcessoES;

    public Processo(String nomeProcesso, int tempoDeChegada, int tempoExecucao, int prioridade, int tempoAcessoES) {
        this.setNomeProcesso(nomeProcesso);
        this.setTempoDeChegada(tempoDeChegada);
        this.setTempoExecucao(tempoExecucao);
        this.setPrioridade(prioridade);
        this.setTempoAcessoES(tempoAcessoES);
    }

    public String getNomeProcesso() {
        return nomeProcesso;
    }

    public void setNomeProcesso(String nomeProcesso) {
        this.nomeProcesso = nomeProcesso;
    }

    public int getTempoDeChegada() {
        return tempoDeChegada;
    }

    public void setTempoDeChegada(int tempoDeChegada) {
        this.tempoDeChegada = tempoDeChegada;
    }

    public int getTempoExecucao() {
        return tempoExecucao;
    }

    public void setTempoExecucao(int tempoExecucao) {
        this.tempoExecucao = tempoExecucao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public int getTempoAcessoES() {
        return tempoAcessoES;
    }

    public void setTempoAcessoES(int tempoAcessoES) {
        this.tempoAcessoES = tempoAcessoES;
    }

    @Override
    public String toString() {
        return "Processo " + this.nomeProcesso + " - Tempo Chegada: " + this.tempoDeChegada + " - Tempo Execução: " +
                this.tempoExecucao + " - Prioridade: " + this.prioridade + " - Tempo de Acesso ES: " +
                this.tempoAcessoES;
    }
}
