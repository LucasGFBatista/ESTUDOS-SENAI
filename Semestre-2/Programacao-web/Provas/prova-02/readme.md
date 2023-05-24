# Atividade de Pesquisa e Gráficos

Neste repositório, você encontrará uma atividade que consiste em utilizar a ferramenta Google Charts para criar gráficos a partir de pesquisas de dados, como PIB, salário mínimo e valor do dólar em comparação ao real. 

## Desafio Proposto

O desafio proposto pelo professor foi explorar a ferramenta Google Charts, mesmo não tendo sido abordada em sala de aula. A atividade envolveu pesquisar dados, como salário mínimo, preço da gasolina, valor do dólar, carros mais baratos e cesta básica, no intervalo de 5 em 5 anos, desde 1997 até 2022. Em seguida, foi solicitado criar uma aplicação web em PHP, na qual pudéssemos cadastrar, editar e excluir os dados pesquisados. Com base nas informações adquiridas, deveríamos apresentar gráficos utilizando a ferramenta Google Charts.

## Informações Solicitadas

As informações solicitadas para cada gráfico são as seguintes:

- [x] 1. Salário mínimo / Preço da gasolina (Gráfico Linha)

- [x] 2. Salário mínimo / Dólar (Gráfico Linha)

- [x] 3. Salário mínimo / Carro Mais Baratos (Gráfico Linha)

- [x] 4. Salário mínimo / Cesta Básica (Gráfico Linha)

- [x] 5. PIB Brasil (Gráfico Linha)

- [ ] 6. Processador Xeon no Aliexpress (qualquer um), com o valor do dólar em 2014 x valor dele sem taxa x valor dele com taxa de 60% no valor hoje (Gráfico Coluna)

- [x] 7. Fontes de Pesquisa

## Painel Administrativo

A atividade requer a criação de um painel administrativo para cadastrar os anos e os respectivos valores para cada gráfico. Além disso, deve ser implementado um menu lateral para facilitar a navegação no painel, direcionando para cada item da pesquisa.

## Observações

A seguir, estão algumas observações e requisitos obrigatórios para o desenvolvimento da atividade:

- Banco de dados: O banco de dados deve ser nomeado como "dataseunome" (por exemplo, "datastido").
- Tabela: A tabela deve ser nomeada como "graphicseunome" (por exemplo, "graphictido").
- Colunas da tabela, names dos inputs dos formulários e variáveis do PHP: Devem seguir o padrão a seguir: "idseunome", "yearseunome", "valueseunome", etc.

Fique à vontade para explorar o repositório e verificar a implementação da atividade. Em caso de dúvidas, entre em contato.

<br>
<hr>
<br>

### DADOS SOLICITADOS
| ANO | PIB (TRILÃO) 	| SALARIO MINIMO | GASOLINA | DOLAR 	| CARRO MAIS BARATO (GOL) | CESTA BÁSICA|
| --- | --- 	| -------------- | -------- | ----- 	| ----------------------- | ----------- |
| 1997| 0,862438| R$ 120,00  	 | R$ 0,58  | R$ 1,07 	| R$ 7802,00 		  | R$ 109,86 	|
| 2002| 1,48	| R$ 200,00  	 | R$ 1,57  | R$ 2,52 	| R$ 11780,00   	  | R$ 202,22 	|
| 2007| 2,72	| R$ 380,00   	 | R$ 2,52  | R$ 1,93 	| R$ 18990,00   	  | R$ 214,63 	| 
| 2012| 4,81	| R$ 622,00  	 | R$ 2,74  | R$ 2,02 	| R$ 27990,00   	  | R$ 304,90 	|
| 2017| 6,28	| R$ 937,00  	 | R$ 3,69  | R$ 3,24 	| R$ 34890,00   	  | R$ 424,36 	|
| 2022| 9,9	    | R$ 1212,00 	 | R$ 7,39  | R$ 4,73 	| R$ 66590,00   	  | R$ 791,29 	|

### REFERENCIAS
| SOBRE | LINK |
| ---   | ---  |
| CARRO|	https://autoesporte.globo.com/carros/noticia/2016/02/volkswagen-gol-2017-chega-com-retoques-e-preco-de-r-34890.ghtml |
| CARRO|	https://autopapo.uol.com.br/noticia/10-carros-mais-baratos-do-brasil-2022/ |
| CARRO|	https://quatrorodas.abril.com.br/noticias/novo-gol-2022-ja-esta-nas-lojas |
| CARRO|	https://www.uol.com.br/carros/noticias/redacao/2012/07/25/volkswagen-gol-power-16-cara-nova-na-alma-de-sempre.htm |
| CARRO|	https://www.encontracarros.com.br/vw-gol-gol-g4-2005-a-2008-confira-detalhes-e-precos-atuais/ |
| CESTA BASICA |	https://www1.folha.uol.com.br/fsp/dinheiro/fi3012200103.htm#:~:text=O%20custo%20m%C3%A9dio%20da%20cesta,86%20em%20dezembro%20de%201997. |
| CESTA BASICA |	https://www1.folha.uol.com.br/fsp/dinheiro/fi3011200211.htm#:~:text=A%20cesta%20subiu%200%2C19,o%20valor%20do%20sal%C3%A1rio%20m%C3%ADnimo. |
| CESTA BASICA |	https://www.dgabc.com.br/2017/Noticia/887931/dieese-cesta-basica-em-2007-sobe-mais-que-salario-minimo |
| CESTA BASICA |	https://spbancarios.com.br/01/2013/cesta-basica-ficou-mais-cara-em-2012 |
| CESTA BASICA |	https://g1.globo.com/economia/educacao-financeira/noticia/ |cesta-basica-fica-mais-barata-em-21-capitais-em-2017-diz-dieese.ghtml |
| CESTA BASICA |	https://www.dieese.org.br/analisecestabasica/2022/202212cestabasica.pdf |
| DOLAR	| http://www.yahii.com.br/dolardiario02.html |
| GASOLINA | 	https://autoesporte.globo.com/seu-bolso/noticia/2022/12/ |2022-o-ano-em-que-o-preco-da-gasolina-e-do-diesel-enlouqueceu-quem-tem-carro-ou-caminhao.ghtml |
| GASOLINA | 	https://investnews.com.br/economia/em-20-anos-quantidade-de-gasolina-que-salario-minimo-pode-comprar-aumenta-57/ |
| GASOLINA | 	http://www.resan.com.br/noticias-integra/958-gasolina-dispara-302-desde-1996#:~:text=No%20ano%20de%201996%2C%20o,%2C%20de%2093%2C44%25. |
| PIB |	https://www.preparaenem.com/geografia/pib-brasil.htm |
| PIB |	https://www1.folha.uol.com.br/fol/eco/ex053811.htm |
| SALARIO MINIMO |	https://www.contabeis.com.br/tabelas/salario-minimo/ |


<!--
Atividade proposta pelo professor Tido Ferraz [TIDOFERRAZ](https://github.com/TIDOFERRAZ).
Realizada por Lucas Gonçalves [LucasGFBatista](https://github.com/LucasGFBatista).
-->
