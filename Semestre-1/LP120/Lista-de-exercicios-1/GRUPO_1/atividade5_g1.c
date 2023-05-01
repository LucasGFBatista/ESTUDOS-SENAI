#include <stdio.h>
#include <math.h>

int main()
{
   float n1, n2, a, b, c, d, e, f;

   printf("Insira o primeiro número:");
   scanf("%f", &n1);
   printf("Insira o segundo número:");
   scanf("%f", &n2);
   a = n1 + n2;
   b = n1 * n2 * n2;
   c = n1 * n1;
   d = sqrt(n1 * n1 + n2 * n2);
   e = sin(n1 - n2);
   f = fabsf(n1);

   printf("a)Soma dos numeros: %0.2f\n", a);
   printf("b)Produto do primeiro número pelo quadrado do segundo: %0.2f\n", b);
   printf("c)O quadrado do primeiro número: %0.2f\n", c);
   printf("d)A raiz quadrada da soma dos quadrados: %0.2f\n", d);
   printf("e)O seno da diferença do primeiro número pelo segundo: %0.2f", e);
   printf("f) O módulo do primeiro número: %0.2f", f);

   return 0;
}