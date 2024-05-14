import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class groq {
    public static void main(String[] args) throws Exception {
        // Define la URL del endpoint y tu API key de Groq
        String url = "https://api.groq.com/openai/v1/chat/completions";
        String apiKey = "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";

        // Define el cuerpo del mensaje en formato JSON
        String jsonBody = "{\"messages\": [{\"role\": \"user\", \"content\": \"Creame un juego de piedra papel y tijera en java\"}], \"model\": \"mixtral-8x7b-32768\"}";

        // Crea el cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // Crea la solicitud HTTP POST con los encabezados y el cuerpo
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Authorization", "Bearer " + apiKey)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();

        // Envía la solicitud y obtén la respuesta
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Imprime el código de estado
        System.out.println("Código de estado: " + response.statusCode());

        // Obtiene el valor del encabezado Content-Type
        String contentType = response.headers().firstValue("Content-Type").orElse("No Content-Type header present");
        System.out.println("Encabezado Content-Type: " + contentType);

        // Imprime el cuerpo de la respuesta
        System.out.println("Respuesta: " + response.body());
    }
}
