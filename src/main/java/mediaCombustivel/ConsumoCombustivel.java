package mediaCombustivel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;

public class ConsumoCombustivel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigDecimal km;
        BigDecimal combustivelEmLitros;

        System.out.print("Informe a distância total percorrida (em Km): ");
        km = new BigDecimal(br.readLine());

        System.out.print("Informe o total de combustível consumido (em litros): ");
        combustivelEmLitros = new BigDecimal(br.readLine());

        BigDecimal consumoMedio = km.divide(combustivelEmLitros, MathContext.DECIMAL32)
                .setScale(3, BigDecimal.ROUND_HALF_EVEN);

        System.out.println("Consumo médio do combustível: " + consumoMedio + " km/l");
    }
}

