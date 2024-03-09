# Desafio técnico Target - 2024
### [ExecutarTodas](/src/main/java/com/jeff/ExecutarTodasAsQuestoes.java)
### Questão 2 - [ir para .java](/src/main/java/com/jeff/Questao2.java)
````java
public class Questao2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = entrada.nextInt();

        if (pertenceFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean pertenceFibonacci(int num) {
        int anterior = 0, atual = 1, proximo = 0;

        while (proximo < num) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        return proximo == num;
    }
}
````

### Questão 5 - [ir para .java](/src/main/java/com/jeff/Questao5.java)
````java
public class Questao5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String textoNormal = scanner.nextLine();

        String textoInvertido = inverterString(textoNormal);
        System.out.println("String invertida: " + textoInvertido);
    }

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int esquerda = 0, direita = caracteres.length - 1;

        while (esquerda < direita) {
            char temp = caracteres[esquerda];
            caracteres[esquerda] = caracteres[direita];
            caracteres[direita] = temp;
            esquerda++;
            direita--;
        }

        return new String(caracteres);
    }
}
````
