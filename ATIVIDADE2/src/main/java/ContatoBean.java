package br.com.seuprojeto.bean;

import java.io.Serializable;
import javax.faces.view.ViewScoped; // É um escopo comum para formulários
import javax.inject.Named; // Anotação para CDI

@Named // Define o nome do Bean que será usado no XHTML (ex: #{contatoBean.nome})
@ViewScoped // Define o escopo do Bean, ele vive enquanto o usuário estiver na mesma View/Página
public class ContatoBean implements Serializable {

    // 1. Atributos: Correspondem aos campos do formulário (formulario.xhtml)
    private String nome;
    private String sobrenome;
    private String email;
    private String fone;
    
    // Opcional para o exemplo anterior
    private String mensagem; 

    // 2. Método de Ação: Será chamado ao clicar no botão Enviar (h:commandButton)
    // O retorno (String) é a regra de navegação.
    public String enviarContato() {
        // **Aqui entra a lógica de negócios!**
        // Por exemplo:
        // 1. Validação de dados
        // 2. Persistência no banco de dados
        // 3. Envio de e-mail (que seria o caso de um formulário de contato)
        
        System.out.println("------------------------------------");
        System.out.println("Dados do Contato Recebidos:");
        System.out.println("Nome Completo: " + nome + " " + sobrenome);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + fone);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("------------------------------------");
        
        // Retorna a próxima página (confirma.xhtml)
        return "confirma"; 
    }

    // 3. Getters e Setters (Necessários para o JSF acessar/modificar os atributos)
    // (O Eclipse pode gerar isso automaticamente: Source -> Generate Getters and Setters...)

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    // ... (Repita para sobrenome, email, fone e mensagem)

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}