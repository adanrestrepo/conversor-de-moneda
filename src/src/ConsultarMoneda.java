import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {
    public Moneda buscarMoneda(String from, String to){
        String url = "https://v6.exchangerate-api.com/v6/6205f84ab8064de305e866b2/pair/" + from + "/" + to;
        URI direccion = URI.create(url);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .GET()
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String responseBody = response.body();
            Gson gson = new Gson();
            JsonObject jsonResponse = gson.fromJson(responseBody, JsonObject.class);

            if (jsonResponse.has("result") && jsonResponse.get("result").getAsString().equals("error")){
                if (jsonResponse.has("error-type")){
                    String errorType = jsonResponse.get("error-type").getAsString();
                    switch (errorType){
                        case "unsupported-code":
                            throw new RuntimeException("Error -> Uno o ambos codigos de moneda no son soportados ❌");
                        case "invalid-key":
                            throw new RuntimeException("Error -> La clave de API proporcionada no es válida❌");
                        case "malformed-request":
                            throw new RuntimeException("Error -> La solicitud a la API está malformada❌");
                        case "InputMismatchException":
                            throw new RuntimeException("---Error: La cantidad ingresada no es un número válido---❌");
                        default:
                            throw new RuntimeException("Error al obtener la tasa de cambio: Servicio reportó un error: " + errorType + "❌");
                    }
                }else {
                    throw new RuntimeException("Error desconocido al obtener la tasa de cambio desde el servicio❌");
                }
            }

            //obtener la tasa de cambio
            if (jsonResponse.has("conversion_rate")){
                double conversionRate = jsonResponse.get("conversion_rate").getAsDouble();
               return new Moneda(from, to, conversionRate);
            }else {
                throw new RuntimeException("❌ Error: No se encontró 'conversion_rate' en la respuesta.");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
