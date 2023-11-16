/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_lais.Model.Dao;

import com.mycompany.projeto_lais.Model.Materia_Model;
import com.mycompany.projeto_lais.Model.Turma_Model;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;

/**
 *
 * @author Artur
 */
public class Materia_dao {
    EntityManager em = new Entity_Manager().ent();
    Turma_dao dao = new Turma_dao();
    
    public List<Materia_Model> selectAll(){
        List<Materia_Model> lista= null;
        String query="select a from Materia_Model a";
        em.getTransaction().begin();
         lista= em.createQuery(query).getResultList();
        em.getTransaction().commit();
        return lista;
    }
    public boolean insert(Materia_Model materia){
        try {
             em.getTransaction().begin();
        em.persist(materia);
        em.getTransaction().commit();
        return true;
        } catch (Exception e) {
            System.err.println("insert "+e);
            return false;
        }
        
    }
    
    public Materia_Model findbyId(int id){
       
        Materia_Model mm=null;
        try {
            em.getTransaction().begin();
            mm = em.find(Materia_Model.class, id);
            em.getTransaction().commit();
            
       } catch (Exception e) {
        if (em.getTransaction().isActive()) {
            em.getTransaction().rollback(); // Faça rollback se ocorrer uma exceção
        }
        System.err.println("findByid" + e);
    } finally {
        return mm;
    }
    
    }
    
    public Materia_Model findByName(String nome){
        Materia_Model mm = null;
        String query="select m from Materia_Model m where m.nome= :nome";
        try {
            em.getTransaction().begin();
        mm=  (Materia_Model) em.createQuery(query).setParameter("nome", nome).getSingleResult();
        
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("findByname "+e);
        } finally {
        return mm;
        }
}

    public boolean editar(Materia_Model materia) {
         try {
             em.getTransaction().begin();
        em.merge(materia);
        em.getTransaction().commit();
        return true;
        } catch (Exception e) {
            System.err.println("insert "+e);
            em.getTransaction().rollback();
           return false;
        }
        
    }

    public boolean delete(Materia_Model materia) {
       try {
             em.getTransaction().begin();
             
        em.remove(materia);
        em.getTransaction().commit();
        return true;
        } catch (Exception e) {
            System.err.println("insert "+e);
            em.getTransaction().rollback();
           return false;
        }
    }
    public List<Materia_Model> findByTurma(int id) {
      List<Materia_Model> list= null;
       System.out.println("------------------"+id+"----------");
       String query = "select t from Materia_Model m join m.turma t where t.idTurma = :id";
        try {
            em.getTransaction().begin();
           list = em.createQuery(query).setParameter("id", id).getResultList();
            em.getTransaction().commit();
            System.out.println("Size"+list.size()+"----------");
        } catch (Exception e) {
            System.out.println("selectByMateria "+ e);
            em.getTransaction().rollback();
        } finally {
            return list;
        }
    }
}