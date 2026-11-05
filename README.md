# 🎯 Jogo de Adivinhação em Java

Mini projeto de lógica de programação feito em Java. O programa sorteia um
número entre 1 e 100 e o jogador tenta acertá-lo. A cada palpite errado, o
programa dá uma dica indicando se o número sorteado é maior ou menor. Ao
acertar, exibe quantas tentativas foram necessárias.

## Conceitos praticados

- Entrada de dados com `Scanner`
- Geração de números aleatórios com `Random`
- Estrutura de repetição `do-while`
- Condicionais `if / else if`
- Contador de tentativas

## Como executar

1. Tenha o JDK instalado (versão 8 ou superior).
2. Compile o arquivo:
   ```bash
   javac NumeroAleatorio.java
   ```
3. Execute:
   ```bash
   java NumeroAleatorio
   ```

## Exemplo de execução
1 - Digite um número: 50
2 - Menor que o que você digitou!
3 - Digite um número: 25
4 - Maior que o que você digitou!
5 - Digite um número: 37
6 - Acertou em 3 tentativa(s)!


## Próximas melhorias

- [ ] Limitar o número de tentativas
- [ ] Tratar entradas inválidas com `try/catch`
- [ ] Permitir jogar novamente sem reiniciar o programa
