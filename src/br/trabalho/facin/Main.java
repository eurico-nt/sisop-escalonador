package br.trabalho.facin;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Processo> processos = new ArrayList<>();
        File arquivo = new File("processos/exemplo1.txt");
        BufferedReader reader = null;

        int quantum = 2;
        int linha_arquivo = 0;
        int tempoAcessoES = 0;

        try{
            reader = new BufferedReader(new FileReader(arquivo));
            String text = null;
            while((text = reader.readLine()) != null){
                if(linha_arquivo == 0){
                    processos = new ArrayList<>(Integer.parseInt(text));
                } else if(linha_arquivo == 1){
                    quantum = Integer.parseInt(text);
                }else{
                    String valores[] = text.split(" ");
                    if (valores.length == 3) {
                        processos.add(new Processo(String.valueOf(linha_arquivo - 2), Integer.parseInt(valores[0]),
                                Integer.parseInt(valores[1]), Integer.parseInt(valores[2]), tempoAcessoES));
                    }else {
                        processos.add(new Processo(valores[0], Integer.parseInt(valores[1]),
                                Integer.parseInt(valores[2]), Integer.parseInt(valores[3]), tempoAcessoES));
                    }
                }
                linha_arquivo++;
            }
        } catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                if (reader != null){
                    reader.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }

    }
}
