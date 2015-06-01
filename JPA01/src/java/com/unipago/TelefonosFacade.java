/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unipago;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Aint Betterwine
 */
@Stateless
public class TelefonosFacade extends AbstractFacade<Telefonos> {
    @PersistenceContext(unitName = "JPA01PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TelefonosFacade() {
        super(Telefonos.class);
    }
    
}
