#language: pt
#encoding: utf-8
#Author: Leandro Lima

@login
Funcionalidade: Login
   A funcionalidade Login permite acesso ao Swaglabs

  Contexto:
    Dado o usuário não autenticado acessa a tela de Login


  Esquema do Cenário: CT01 - Logar no sistema Swaglabs com sucesso
    Quando preenche "<username>" e "<password>" e clica em Login
    Então o usuário é autenticado no sistema com sucesso
    Exemplos:
      |username       | password     |
      |standard_user  |secret_sauce  |

  Esquema do Cenário: CT02 - Validar login de usuário bloqueado
    Quando preenche "<username>" e "<password>" e clica em Login
    Então o usuário não é autenticado no sistema
    Exemplos:
      |username       | password     |
      |locked_out_user|secret_sauce|

  Cenário: CT03 - Deslogar do sistema com sucesso
    Dado o usuário autenticado no sistema
    E clica em Menu >> Logout
    Então o usuário é deslogado do sistema

