/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Ankesat;
import java.util.List;

/**
 *
 * @author Gramos
 */
public interface AnkesatInterface {
    
         public void create(Ankesat klienti)throws PerdoruesiException;
    public void edit(Ankesat klienti) throws PerdoruesiException;
    public void delete(Ankesat klienti) throws PerdoruesiException;
    public List<Ankesat> findAll() throws PerdoruesiException;
}
