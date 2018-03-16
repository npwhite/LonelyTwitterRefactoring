package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

import java.io.Serializable;
import java.util.Date;

public class ImportantTweet extends LonelyTweet implements Serializable {

	// Removed unused constructor

	public ImportantTweet(String text) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		//Log.i("Important lonely tweet", getTweetDate() + " | " + getTweetBody()); // bad practice --> why/
		String string = getTweetDate() + " | " + getTweetBody();
		Log.i("ImportantLonelyTweet", string); // refactor --> extrace --> variable
		return string;
	}

	public String getTweetBody() {
        return tweetBody.toUpperCase();
    }
}