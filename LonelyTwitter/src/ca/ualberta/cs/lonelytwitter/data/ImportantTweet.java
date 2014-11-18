package ca.ualberta.cs.lonelytwitter.data;

import java.util.Date;

import android.util.Log;


public class ImportantTweet extends LonelyTweet {

	private static final long serialVersionUID = 1L;
	
	public ImportantTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}
	
	// Important Tweets can have 20 characters
	@Override
	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		String importantString = "IMPORTANT "+ getTweetDate() + " | " + getTweetBody();
		Log.i("TAG", importantString);
		return importantString;
	}

	@Override
	public String getTweetBody() {
		return "IMPORTANT " + tweetBody;
	}

}
