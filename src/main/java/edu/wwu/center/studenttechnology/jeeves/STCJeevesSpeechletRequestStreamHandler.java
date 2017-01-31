package edu.wwu.center.studenttechnology.jeeves;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

public class STCJeevesSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {
    private static final Set<String> supportedApplicationIds = new HashSet<String>();

    static {
	supportedApplicationIds.add("SKILL_ID_HERE");
    }

    public STCJeevesSpeechletRequestStreamHandler() {
	super(new STCJeevesSpeechlet(), supportedApplicationIds);
    }
}
