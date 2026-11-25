public class Exercícios {

    public static void main(String[] args) {
        // Teste 1
        imprimirSaudacao();

        // Teste 2
        System.out.println("Ex 2 - Soma: " + somar(5, 7));

        // Teste 3
        System.out.println("Ex 3 - Dobro: " + dobrar(8));

        // Teste 4
        System.out.println("Ex 4 - Fahrenheit: " + converterCelsiusParaFahrenheit(25));

        // Teste 5
        System.out.println("Ex 5 - Média: " + calcularMedia(7.5, 8.0, 9.5));

        // Teste 6
        System.out.println("Ex 6 - É par? " + verificarPar(10));

        // Teste 7
        System.out.println("Ex 7 - Maior número: " + maiorNumero(10, 25, 15));

        // Teste 8
        System.out.println("Ex 8 - Fatorial de 5: " + calcularFatorial(5));

        // Teste 9
        System.out.println("Ex 9 - Potência (2^3): " + calcularPotencia(2, 3));

        // Teste 10
        System.out.println("Ex 10 - IMC: " + calcularIMC(70.0, 1.75));
    }

    // Exercício 1
    public static void imprimirSaudacao() {
        System.out.println("Bem-vindo ao sistema!");
    }

    // Exercício 2
    public static int somar(int a, int b) {
        return a + b;
    }

    // Exercício 3
    public static int dobrar(int numero) {
        return numero * 2;
    }

    // Exercício 4
    public static double converterCelsiusParaFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    // Exercício 5
    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }

    // Exercício 6
    public static boolean verificarPar(int numero) {
        return numero % 2 == 0;
    }

    // Exercício 7
    public static int maiorNumero(int a, int b, int c) {
        int maior = a;
        if (b > maior) maior = b;
        if (c > maior) maior = c;
        return maior;
    }

    // Exercício 8
    public static int calcularFatorial(int numero) {
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    // Exercício 9
    public static int calcularPotencia(int base, int expoente) {
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    // Exercício 10
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}