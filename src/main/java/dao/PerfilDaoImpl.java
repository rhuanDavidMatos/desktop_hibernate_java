/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Perfil;
import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author rhuan
 */
public class PerfilDaoImpl implements PerfilDao, Serializable {

    @Override
    public List<Perfil> pesquisarTodo(Session sessao) throws HibernateException {
        Query consulta = sessao.createQuery("from Perfil");
        return consulta.list();
    }

}
