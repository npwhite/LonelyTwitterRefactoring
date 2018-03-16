package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

/**
 * Created by Nick on 2018-03-13.
 */

class LonelyTweet {
    private static final long serialVersionUID = 1L;
    protected Date tweetDate;
    protected String tweetBody;

    public Date getTweetDate() {
        return tweetDate;
    }

    public void setTweetDate(Date tweetDate) {
        this.tweetDate = tweetDate;
    }

    public void setTweetBody(String tweetBody) {
        this.tweetBody = tweetBody;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeObject(tweetDate);
        out.writeObject(tweetBody);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        tweetDate = (Date) in.readObject();
        tweetBody = (String) in.readObject();
    }
}