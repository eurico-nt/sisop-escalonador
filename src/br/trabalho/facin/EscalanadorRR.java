package br.trabalho.facin;

import java.util.List;

public class EscalanadorRR {
    private int quantum;
    private List<Processo> processos;

    public EscalanadorRR(int quantum, List<Processo> processos){
        this.quantum = quantum;
        this.processos = processos;
    }

}
