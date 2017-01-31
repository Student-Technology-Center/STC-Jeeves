package edu.wwu.center.studenttechnology.jeeves;

import edu.wwu.center.studenttechnology.jeeves.intent.BeeMovieIntent;
import edu.wwu.center.studenttechnology.jeeves.intent.RealVillainIntent;
import edu.wwu.center.studenttechnology.jeeves.intent.YeahBoiIntent;
import edu.wwu.center.studenttechnology.stc.alexa.framework.speechlet.Speechlet;

public class STCJeevesSpeechlet extends Speechlet {

    public STCJeevesSpeechlet() {
	registerIntent(new BeeMovieIntent("BeeMovieIntent"));
	registerIntent(new RealVillainIntent("RealVillainIntent"));
	registerIntent(new YeahBoiIntent("YeahBoiIntent"));
    }
}
