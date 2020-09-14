/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boundproperty;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Jetnipit Morakot
 */
public class MyPropertyBean implements Serializable {

    public static final String FootBallResultScore_PROPERTY = "FootballResultScore";

    private String FootBallResultScore;

    private PropertyChangeSupport propertySupport;

    public MyPropertyBean() {
        propertySupport = new PropertyChangeSupport(this);
    }

    public String getFootBallResultScore() {
        return FootBallResultScore;
    }

    public void setFootBallResultScore(String FootBallResultScore) {
        String oldValue = this.FootBallResultScore;
        this.FootBallResultScore = FootBallResultScore;
        propertySupport.firePropertyChange(FootBallResultScore_PROPERTY, oldValue, this.FootBallResultScore);
    }


    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }

}
