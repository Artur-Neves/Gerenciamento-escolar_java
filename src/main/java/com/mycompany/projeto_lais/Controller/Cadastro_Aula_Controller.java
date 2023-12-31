/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_lais.Controller;

import com.mycompany.projeto_lais.Enums.Formato_Enum;
import com.mycompany.projeto_lais.Enums.Unidade_Enum;
import com.mycompany.projeto_lais.Model.Aluno_Model;
import com.mycompany.projeto_lais.Model.Aula_Model;
import com.mycompany.projeto_lais.Model.Dao.Aluno_dao;
import com.mycompany.projeto_lais.Model.Dao.Aula_dao;
import com.mycompany.projeto_lais.Model.Dao.Aluno_Aula_dao;
import com.mycompany.projeto_lais.Model.Dao.Materia_dao;
import com.mycompany.projeto_lais.Model.Dao.Turma_Materia_dao;
import com.mycompany.projeto_lais.Model.Dao.Turma_dao;
import com.mycompany.projeto_lais.Model.Frequencia_Model;
import com.mycompany.projeto_lais.Model.Turma_Materia_Model;
import com.mycompany.projeto_lais.Model.Turma_Model;
import com.mycompany.projeto_lais.View.Cadastro_Aula;
import com.mycompany.projeto_lais.View.Menssagem_De_Confirmacao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Artur
 */
public class Cadastro_Aula_Controller {

    private final Cadastro_Aula view;
    private Aula_dao dao;
    private Aula_Model model;
    private Aluno_dao dao_aluno;
    private Turma_dao dao_turma;
    private Materia_dao dao_materia;
    private Aluno_Model aluno;
    private Turma_Model turma;
    private Turma_Materia_dao dao_tm;
    private Aluno_Aula_dao dao_f;
    private Turma_Materia_Model turmamateria;
    private boolean confirmacao;
    private List<Frequencia_Model> lista_f;
    private Menssagem_De_Confirmacao m;
    private int quantidade_inicial;
    private Validacao validacao;
    
    public Cadastro_Aula_Controller(Cadastro_Aula view, Turma_Materia_Model turmamateria) {
        this.view = view;
        dao = new Aula_dao();
        dao_aluno = new Aluno_dao();
        dao_turma = new Turma_dao();
        dao_materia = new Materia_dao();
        dao_tm = new Turma_Materia_dao();
        dao_f = new Aluno_Aula_dao();
        lista_f = new ArrayList<>();
        this.turmamateria = dao_tm.findbyturmamateria(turmamateria);

    }

    public Cadastro_Aula_Controller(Cadastro_Aula view, Turma_Materia_Model turmamateria, Aula_Model aula) {
        this.view = view;
        dao = new Aula_dao();
        dao_aluno = new Aluno_dao();
        dao_turma = new Turma_dao();
        dao_materia = new Materia_dao();
        dao_tm = new Turma_Materia_dao();
        dao_f = new Aluno_Aula_dao();
        this.model = aula;
        lista_f = new ArrayList<>();
        quantidade_inicial =model.getQuantidade();
        this.turmamateria = dao_tm.findbyturmamateria(turmamateria);

    }

    public void iniciar() {
               view.getjTextArea1().setDocument( new Validacao(30000));
        view.getjTextArea2().setDocument( new Validacao(30000));
        Date data = new Date();
        System.out.println(data);
        if (view.getjButton3().getText().equals("Salvar")) {
            view.getjDateChooser1().setDate(data);
        }
        for (Unidade_Enum value : Unidade_Enum.values()) {
            view.getjComboBox3().addItem(value.toString());
        }
        for (Formato_Enum value : Formato_Enum.values()) {
            view.getjComboBox4().addItem(value.toString());
        }
        if (!view.getjButton3().getText().equals("Salvar")) {
            view.getjComboBox3().setSelectedItem(model.getUnidade());
            view.getjComboBox4().setSelectedItem(model.getFormato());
            view.getjSpinner1().setValue(model.getQuantidade());
            view.getjDateChooser1().setDate(model.getData());
            view.getjTextArea1().setText(model.getObs());
            view.getjTextArea2().setText(model.getConteudo());
        }
 
  

    }

    public void inserir() {
        confirmacao = true;
        String unidade = "" + view.getjComboBox3().getSelectedItem();
        int quantidade = (int) view.getjSpinner1().getValue();
        Date data = view.getjDateChooser1().getDate();
        String formato = "" + view.getjComboBox4().getSelectedItem();
        String conteudo = view.getjTextArea2().getText();
        String obs = view.getjTextArea1().getText();
        if (Integer.parseInt(view.getjSpinner1().getValue().toString())>0){
        if (view.getjButton3().getText().equals("Salvar")) {
            model = new Aula_Model(unidade, data, quantidade, conteudo, obs, formato, turmamateria);
            if (dao_aluno.findByTurma(turmamateria.getTurma()) != null) {
                for (Aluno_Model aluno_model : dao_aluno.findByTurma(turmamateria.getTurma())) {
                    model.addAluno(aluno_model);

                }
            }
            Frequencia_Model f = new Frequencia_Model();

            if (dao.inserir(model)) {
                for (Aluno_Model aluno_model : dao_aluno.findByTurma(turmamateria.getTurma())) {
                    f = dao_f.findByAlunoAula(aluno_model, model);

                    if (dao_f.update(f)) {
                        System.out.println(f.getFaltas());
                    }
                }
                view.imprimir_Na_Tela("Aula inserida com sucesso!");
                view.hide();
            }
        } else if (view.getjButton3().getText().equals("Editar")) {
            lista_f = dao_f.findByAula(model);
            
            
            for (Frequencia_Model f : lista_f){
            if (f.getFaltas()>0 && quantidade_inicial != quantidade){
                m = new Menssagem_De_Confirmacao(null, true, "Ao editar a quantidade de horários em uma aula", "será apagado todos os registros das faltas dessa aula", "Atenção");
                m.setVisible(true);
                confirmacao=m.retornar();
                if (confirmacao)
                    dao_f.cancelFouls(model);
                break;
            }
            }
            model.setUnidade(unidade);
            model.setData(data);
            model.setFormato(formato);
            model.setQuantidade(quantidade);
            model.setConteudo(conteudo);
            model.setObs(obs);
            
                if (confirmacao){
            if (dao.editar(model)) {
                view.imprimir_Na_Tela("Aula editada com sucesso!");
                view.hide();
            }}
        } else {
            if (dao.excluir(model)) {
                view.imprimir_Na_Tela("Aula excluida com sucesso!");
                view.hide();
            }
        }}
        else{
                Menssagem_De_Confirmacao m = new Menssagem_De_Confirmacao(null, true , "Coloque uma quantidade válida de aulas", "", "Atenção", 0);
                m.setVisible(true);
                }
        
    }

}
