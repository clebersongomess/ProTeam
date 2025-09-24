# 🗂️ Sistema de Gestão de Projetos e Equipes

Projeto acadêmico em **Java** que implementa um sistema simples de gestão de usuários, projetos e equipes.  
O sistema funciona via **linha de comando** (console) e permite realizar cadastros e consultas em memória.  

---

## 📌 Funcionalidades

- 👤 **Usuários**
  - Cadastro de usuário com nome, CPF, email, cargo, login, senha e perfil.
  - Perfis disponíveis: **ADMIN**, **GERENTE**, **COLABORADOR**.
  - Listagem de todos os usuários cadastrados.

- 📂 **Projetos**
  - Cadastro de projeto com nome, descrição, datas e status.
  - Associação de um **gerente responsável**.
  - Listagem de projetos existentes.

- 👥 **Equipes**
  - Cadastro de equipes com nome, descrição e membros.
  - Uma equipe pode atuar em vários projetos.
  - Listagem de equipes cadastradas.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17** (compatível com versões acima de 11).
- **VS Code** (recomendado) ou qualquer IDE Java.
- Execução no terminal (linha de comando).

---

## 📂 Estrutura do Projeto

```
GestaoProjetos/
 ├── Usuario.java
 ├── Perfil.java
 ├── Projeto.java
 ├── StatusProjeto.java
 ├── Equipe.java
 └── SistemaGestao.java
```

- `SistemaGestao.java` → Classe principal com o menu interativo.
- `Usuario.java` → Representa os usuários do sistema.
- `Perfil.java` → Enum com os tipos de perfil (ADMIN, GERENTE, COLABORADOR).
- `Projeto.java` → Representa os projetos.
- `StatusProjeto.java` → Enum com status possíveis do projeto.
- `Equipe.java` → Representa as equipes.

---

## ▶️ Como Executar

### 1. Clonar o repositório
```bash
git clone [https://github.com/seu-usuario/GestaoProjetos.git](https://github.com/clebersongomess/ProTeam)
```

### 2. Compilar os arquivos
No Windows (PowerShell/Prompt):
```powershell
javac -encoding UTF-8 *.java
```

No Linux/Mac:
```bash
javac *.java
```

### 3. Executar o sistema
```bash
java SistemaGestao
```

---

## 💻 Exemplo de Uso

```
=== Sistema de Gestão ===
1 - Cadastrar Usuário
2 - Listar Usuários
3 - Cadastrar Projeto
4 - Listar Projetos
5 - Cadastrar Equipe
6 - Listar Equipes
0 - Sair
Escolha: 1
Nome: João Silva
CPF: 12345678900
Email: joao@email.com
Cargo: Analista
Login: joao
Senha: 123
Perfil (1-ADMIN, 2-GERENTE, 3-COLABORADOR): 2
Usuário cadastrado!

=== Sistema de Gestão ===
Escolha: 2
Usuário{nome='João Silva', cpf='12345678900', email='joao@email.com',
cargo='Analista', perfil=GERENTE}
```
