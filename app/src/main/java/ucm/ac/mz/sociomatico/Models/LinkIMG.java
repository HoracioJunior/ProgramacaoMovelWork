package ucm.ac.mz.sociomatico.Models;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class LinkIMG {

    String link_media;

    public LinkIMG(String a){


        this.link_media = a;

    }

    String getlink(){

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://www.sociomatico.com/wp-json/wp/v2/media/2283")
                .build();




        try {
            Response response = client.newCall(request).execute();

           String a =  response.body().toString();

            JSONObject jsonObject = new JSONObject(a);
            JSONArray jsonArray = jsonObject.getJSONArray("guid");


            Log.e("batata", jsonArray.toString());
            Log.e("batata", jsonObject.toString());



        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }


        return link_media;
    }



}
