/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boundproperty;

import java.util.Scanner;

/**
 *
 * @author Jetnipit Morakot
 */
public class BoundProperty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        MyPropertyBean mySource = new MyPropertyBean();
        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();
        mySource.addPropertyChangeListener(listener1); 
        mySource.addPropertyChangeListener(listener2); 
        Scanner sc = new Scanner(System.in);
        while (true) 
        {
            System.out.print("Enter Score : ");
            String FootBallResultScore = sc.nextLine();
            if (FootBallResultScore.equals("")) {
                break;
            }
            mySource.setFootBallResultScore(FootBallResultScore);
        }

    }

}
