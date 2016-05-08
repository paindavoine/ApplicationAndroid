package com.example.quentin.fraiskilometrique;

        import android.util.Log;
        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStream;
        import java.io.InputStreamReader;
        import java.io.OutputStreamWriter;
        import java.net.HttpURLConnection;
        import java.net.URL;
        import java.net.URLConnection;
        import java.net.URLEncoder;

        //service_connexion.php?username=popo&password=123
public class connexionBDD {

    private final static String link = "http://192.168.68.37/PPE-Application/WebServices/";   //remplir l'adresse IP

    public static int request(String page,String infos) {


        StringBuffer chaine = new StringBuffer("");
        try {
            String data = URLEncoder.encode("infos", "UTF-8") + "=" + URLEncoder.encode(infos, "UTF-8");
            String surl =link+page;
            Log.d("url",surl);
            URL url = new URL(surl);
            URLConnection conn = url.openConnection();
            conn.setDoInput(true);
            conn.setDoOutput(true);


            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();

            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                Log.d("retour : ", line);
            }
            wr.close();
            rd.close();
            return 1;


        } catch (IOException e) {
            e.printStackTrace();
            String d = "conn failed";
            Log.println(0,"conn failed", d);
            return 0;
        }


    }
}
