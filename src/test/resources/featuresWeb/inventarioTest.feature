#language: pt
#encoding: utf-8

Funcionalidade: Inventário
  A funcionalidade Inventário lista todos os produtos ativos à venda na loja

  Esquema do Cenário: CT04 - Verificar todos os produtos da loja
    Dado o usuário autenticado no sistema
    E clica em Menu Inventário
    Então verifica o "<nome>" , "<preco>" e "<posicao>" dos produtos
    Exemplos:
      | nome                    | preco | posicao |
      |Sauce Labs Backpack      | $29.99| 1       |
      |Sauce Labs Bike Light    | $9.99 | 2       |
      |Sauce Labs Bolt T-Shirt  | $15.99| 3       |
      |Sauce Labs Fleece Jacket | $49.99| 4       |
      |Sauce Labs Onesie        | $7.99 | 5       |
      |T-Shirt (Red)            | $15.99| 6       |
