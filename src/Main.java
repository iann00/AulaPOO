import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Carro carro = new Carro();

        System.out.println("Digite a placa");
        String placa = sc.next();

        System.out.println("Digite o modelo");
        String modelo = sc.next();

        carro.setPlaca(placa);
        carro.setModelo(modelo);

        System.out.println("Placa: "+carro.getPlaca());
        System.out.println("Modelo: "+carro.getModelo());



//        for (int i = 0; i < 16; i++) {
//            carro.setVelocidade(i * 10);
//            System.out.println("A velocidade de "+carro.getModelo());
//            System.out.println(carro.getVelocidade() + " km/h");
//        }
    }
}
