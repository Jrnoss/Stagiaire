/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.util.List;

/**
 *
 * @author DELL
 * @param <S>
 */
public abstract class DAO <S> {
    public Connection connect = ConnectDB.getInstance();
    public abstract S find (long id);
    public abstract void add(S obj);
    public abstract void edit(S obj, long id);
    public abstract void delete(long id);
    public abstract List<S> liste();
}
