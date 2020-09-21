import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;


public class JavaRestTweet {
    static String consumerKeyStr = "UUB******794Kzq0LHFf7nE";
    static String consumerSecretStr = "ldLMPzq***********XxynyZRM9pw5aT3CeR";
    static String accessTokenStr = "126258560889708*********hehtS17ZlRfbeKmBoI";
    static String accessTokenSecretStr = "JMzoICndWtxX***4c6QVTuS06kDwEVaUlkawp9";


    public static void main(String[] args) {

        try {
            Twitter twitter = new TwitterFactory().getInstance();

            twitter.setOAuthConsumer(consumerKeyStr, consumerSecretStr);
            AccessToken accessToken = new AccessToken(accessTokenStr,
                    accessTokenSecretStr);

            twitter.setOAuthAccessToken(accessToken);

            twitter.updateStatus("Java test OK!");

            System.out.println("Successfully updated the status in Twitter.");
        } catch (TwitterException te) {
            te.printStackTrace();
        }
    }






//    public static void main(String[] args) throws Exception {
//        OAuthConsumer oAuthConsumer = new CommonsHttpOAuthConsumer(consumerKeyStr,
//                consumerSecretStr);
//        oAuthConsumer.setTokenWithSecret(accessTokenStr, accessTokenSecretStr);
//
//        HttpPost httpPost = new HttpPost(
//                "http://api.twitter.com/1.1/statuses/update.json?status=Hello%20Twitter%20World.");
//
//        oAuthConsumer.sign(httpPost);
//
//        HttpClient httpClient = new DefaultHttpClient();
//        HttpResponse httpResponse = httpClient.execute(httpPost);
//
//        int statusCode = httpResponse.getStatusLine().getStatusCode();
//        System.out.println(statusCode + ':'
//                + httpResponse.getStatusLine().getReasonPhrase());
//        System.out.println(IOUtils.toString(httpResponse.getEntity().getContent()));
//
//    }
}
