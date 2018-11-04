package ucm.ac.mz.sociomatico;

import android.content.ClipData;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import ucm.ac.mz.sociomatico.internacional;


public class Fetchdata extends AsyncTask<Void,Void,Void> {


    String data="";
    String data1="";
    String link_imagem="http://www.sociomatico.com/wp-json/wp/v2/media/";
    String singleParsed="";
    Post post ;
    ArrayList<Post> items = new ArrayList<>();




    @Override
    protected Void doInBackground(Void... voids) {


        try {


            URL url =new URL("http://www.sociomatico.com/wp-json/wp/v2/posts");
            HttpURLConnection httpconnection = (HttpURLConnection) url.openConnection();

            InputStream inputStream = httpconnection.getInputStream();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";


            while (line != null){


                line = bufferedReader.readLine();
                data = data+line;

            }

            JSONArray ja = new JSONArray(data);


            for(int i=0;i<ja.length();i++){

                post = new Post();
                JSONObject obj  = (JSONObject) ja.get(i);

                link_imagem = "http://www.sociomatico.com/wp-json/wp/v2/media/"+obj.get("featured_media");

                JSONObject nobj = (JSONObject) obj.get("title");



                post.setTitulo(nobj.get("rendered")+"");

               // singleParsed = nobj.get("rendered")+"";

               // dataParsed = dataParsed+singleParsed+"";



                URL url1 =new URL(link_imagem);
                HttpURLConnection httpconnection1 = (HttpURLConnection) url1.openConnection();

                InputStream inputStream1 = httpconnection1.getInputStream();

                BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(inputStream1));
                String line1 = "";


                while (line1 != null){


                    line1 = bufferedReader1.readLine();
                    data1 = data1 +line1;

                }

                JSONObject ja1 = new JSONObject(data1);


                for(int j=0;j<1;j++){



               post.imagem = "http://www.sociomatico.com/wp-content/uploads/2018/03/Vitimas-lixeira-de-Hulene.jpg";
                 Log.println(Log.ERROR,"Atencao",(""+link_imagem));
                    Log.println(Log.ERROR,"batata",(""+ja1.toString()));


                }





                Log.println(Log.ERROR,"batata",(""+items.toString()));
                items.add(post);
            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }


        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);


        PostAdapter pst = new PostAdapter(internacional.cnt,R.layout.post_layout,items);
        internacional.lv.setAdapter(pst);


    }
}
