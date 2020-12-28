#language: pt
#encoding: utf-8

#Author: Leandro Lima

Funcionalidade: Checkout
  A funcionalidade Checkout permite
  ao usuário inserir itens em um carrinho e finalizar uma compra

  Esquema do Cenário: CT05 - Efetuar uma compra com sucesso
    Dado o usuário autenticado no sistema
    Quando adiciona o produto da posicao "<posicao>" ao carrinho
    Então valida o "<produto>" e "<preco>"
    E clica em Checkout
    Quando preenche "<primeiro_nome>", "<ultimo_nome>" e "<cep>" da tela de entrega
    E confirma as informações de "<produto>" e "<preco>"
    Então a compra é efetuada com sucesso

    Exemplos:
      | produto            | preco   | primeiro_nome | ultimo_nome | cep       | posicao |
      |Sauce Labs Backpack | 29.99  |  Leandro      | Lima        | 22640-100 | 1        |