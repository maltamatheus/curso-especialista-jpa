package org.cursoespecialistajpa;

import org.cursoespecialistajpa.org.cursoespecialistajpa.model.Produto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class AppMain
{
    public static void main( String[] args )
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("cursojpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Produto produto = entityManager.find(Produto.class,1);

        System.out.println(produto.toString());

        entityManager.close();
        entityManagerFactory.close();
    }
}
