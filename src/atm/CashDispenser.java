/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Jibran
 */
public class CashDispenser 
{
    private final static int INITIAL_COUNT = 500;
    private int count;
    
    public CashDispenser()
    {
        count = INITIAL_COUNT;
        
    }
    
    public void dispenseCash( int amount )
    {
        int billsRequired = amount / 20;
        count -= billsRequired;
        
    }
    
    public boolean isSufficientCashAvailable( int amount )
    {
        int billsRequired = amount / 20;
        
        if ( count >= billsRequired )
            return true;
        else
            return false;
    }
}

    
            
          

