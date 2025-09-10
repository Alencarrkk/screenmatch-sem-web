package com.alencar.screenmatch.principal;

import com.alencar.screenmatch.model.DadoSerie;
import com.alencar.screenmatch.model.DadosEpisodio;
import com.alencar.screenmatch.model.DadosTemporada;
import com.alencar.screenmatch.service.ConsumoAPI;
import com.alencar.screenmatch.service.ConverteDados;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private Scanner input = new Scanner(System.in);

    private ConsumoAPI consumo = new ConsumoAPI();
    private ConverteDados conversor = new ConverteDados();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=1baf3222";

    public void exibeMenu(){
        System.out.println("Digite o nome da série: ");
        var nomeSerie = input.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+")+ API_KEY);
        DadoSerie dados = conversor.obterDados(json, DadoSerie.class);
        System.out.println(dados);

        List<DadosTemporada> temporadas = new ArrayList<>();

        for (int i = 1; i <= dados.totalTemporadas(); i++){
            json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + "&season=" + i + API_KEY);
            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }
        temporadas.forEach(System.out::println);


//        for (int i = 0; i < dados.totalTemporadas(); i++){
//            List<DadosEpisodio> episodioTemporadas = temporadas.get(i).episodios();
//            for (int j = 0; j < episodioTemporadas.size(); j++){
//                System.out.println(episodioTemporadas.get(j).titulo());
//            }
//        }

        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));
    }
}
