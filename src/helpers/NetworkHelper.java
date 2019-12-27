/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
/**
 *
 * @author Thinh
 */
public class NetworkHelper {
    
    /**
     * Send and get content from url
     * @param url
     * @return HTTP response StringBuffer
     * @throws IOException
     */
    public static StringBuffer getContentViaHttp(String url) throws IOException {
        HttpConnection http = (HttpConnection) Connector.open(url);
        http.setRequestMethod(HttpConnection.GET);
        //http.setRequestProperty("IF-Mofified-Since", "10 Nov 2006 17:29:12 GMT");
        //http.setRequestProperty("User-Agent", "Profile/MIDP-2.0 Configuration/CLDC-1.1");
        //http.setRequestProperty("Content-Language", "en-US");

        InputStream in = http.openDataInputStream();
        OutputStream out = http.openDataOutputStream();

        int rc = http.getResponseCode();
        if (rc != HttpConnection.HTTP_OK) {
            throw new IOException("HTTP response code: " + rc);
        }

        int ch;
        StringBuffer buff = new StringBuffer();
        while ((ch = in.read()) != -1) {
            buff.append((char) ch);
        }

        if (in != null) {
            in.close();
        }
        if (out != null) {
            out.close();
        }
        if (http != null) {
            http.close();
        }
        
        return buff;
    }
}
