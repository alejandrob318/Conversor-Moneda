package com.monedas.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Busqueda {
    int opcion;
    String valor1;
    String valor2;
    int totalAcovertir ;
    String url;
    Scanner sc = new Scanner(System.in);

    public void monedaElegida(String moneda1, String moneda2){
        valor1 = moneda1;
        valor2 = moneda2;
        System.out.println("ingrese el valor en "+ moneda1);
        totalAcovertir = sc.nextInt();
        url = "https://v6.exchangerate-api.com/v6/4517a2df4e3c502bf61c180c/pair/"+valor1+"/"+valor2+"/"+totalAcovertir;

    }

    public int menu(){
        System.out.println("sea bienvenido al conversor de monedas");
        System.out.println("1. Convertir USD ==> ARS");
        System.out.println("2. Convertir ARG ==> USD");
        System.out.println("3. Convertir USD ==> BRL");
        System.out.println("4. Convertir BRL ==> USD");
        System.out.println("5. Salir");
        System.out.println("Elija su opcion:");
        System.out.println("*************************");
        opcion = sc.nextInt();

        return opcion;


    }

    public void mostrarConversion(Moneda moneda){
        System.out.println("el valor de "+(moneda.getConversion_result()/ moneda.getConversion_rate())+ "["+ moneda.getBase_code()+ "]" + " Corresponde al valor final de: ".concat(String.valueOf(moneda.getConversion_result()) + "[" + moneda.getTarget_code() + "]") );
    }
    public void convertirMoneda(int operacion) throws IOException, InterruptedException {


        switch (operacion){
            case 1:
                monedaElegida("USD","ARS");
                break;
            case 2:
                monedaElegida("ARS","USD");
                break;
            case 3:
                monedaElegida("USD","BRL");
                break;
            case 4:
                monedaElegida("BRL","USD");
                break;

        }

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Moneda moneda = gson.fromJson(response.body(), Moneda.class);
        mostrarConversion(moneda);
        System.out.println();

    }






}
