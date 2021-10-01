# Desafio Técnico - NTConsult

_Projeto alvo de constante evolução_

# Objetivo
<details><summary>{+ Objetivo +}</summary>

No cooperativismo, cada associado possui um voto e as decisões são tomadas em assembleias, por votação. A partir disso, você precisa criar uma solução back-end para gerenciar essas sessões de votação.
Essa solução deve ser executada na nuvem e promover as seguintes funcionalidades através de uma APT REST:

- [x] Cadastrar uma nova pauta;

- [x] Abrir uma sessão de votação em uma pauta (a sessão de votação deve ficar aberta por um tempo determinado na chamada de abertura ou 1 minuto por default);

- [x] Receber os votos dos associados em pautas (os votos são apenas ‘Sim’/’Não’. Cada associado é identificado por um id único e pode votar apenas uma vez por pauta);

- [ ] Contabilizar os votos e dar o resultado da votação na pauta.

Para fins de exercício, a segurança das interfaces pode ser abstraída e qualquer chamada para as interfaces podem ser consideradas como autorizadas. A escolha da linguagem, framework e bibliotecas é livre (desde que não infrinja os direitos de uso).
É importante que as pautas e os votos sejam persistidos e que não sejam perdidos com o restart da aplicação.
</details>

# Tarefa Bônus

<details><summary>{- Tarefa Bônus 1 – Integração com sistemas externos -}</summary>

- [ ] Integrar com um sistema que verifique, a partir do CPF do associado, se ele pode votar
    
    - GET https://user-info.herokuapp.com/users/{cpf}
    
    - Caso o CPF não seja válido, a API retornará HTTP Status 404 (Not found). Você pode usar os geradores de CPF para gerar CPFs válidos;
    
    - Caso o CPF seja válido, a API retornará se o usuário pode (ABLE_TO_VOTE) ou não pode (UNABLE_TO_VOTE) executar a operação

```
    // GET /users/19839091069
    // 200 OK
    { 
        "status": "ABLE_TO_VOTE"
    }

    // GET/users/6228960806`
    // 200 OK`
    { 
        "status": "UNABLE_TO_VOTE"
    }
```

</details>

<details><summary>{- Tarefa Bônus 2 – Mensageria e filas -}</summary>

- [ ] O resultado da votação precisa ser informado para o restante da plataforma, isso deve ser feito preferencialmente através de mensageria. Quando a sessão de votação fechar, poste uma mensagem com o resultado da votação.
</details>

<details><summary>{- Tarefa Bônus 3 – Performance -}</summary>

- [ ] Imagine que sua aplicação possa ser usada em cenários que existam centenas de milhares de votos. Ela deve se comportar de maneira performática nesses cenários;

- [ ] Testes de performance são uma boa maneira de garantir e observar como sua aplicação se comporta
</details>

<details><summary>{+ Tarefa Bônus 4 – Versionamento de API +}</summary>


- [x] Como você versionaria a API da sua aplicação? Que estratégia usar?

**Resposta:** Versionaria em forma de monorepo. Projeto no formato de microserviço com integração contínua.

</details>
