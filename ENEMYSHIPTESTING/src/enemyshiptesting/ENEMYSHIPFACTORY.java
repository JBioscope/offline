/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enemyshiptesting;

/**
 *
 * @author User
 */
public class ENEMYSHIPFACTORY {
    public ENEMYSHIP makeEnemyShip(String newShipType){
		
        ENEMYSHIP newShip = null;

        if (newShipType.equals("U")){

                return new UFOENEMYSHIP();

        } 

        else if (newShipType.equals("R")){

                return new ROCKETENEMYSHIP();

        } 

        else if (newShipType.equals("B")){

                return new BIGUFOENEMYSHIP();

        }
        else return null;

    }
}
