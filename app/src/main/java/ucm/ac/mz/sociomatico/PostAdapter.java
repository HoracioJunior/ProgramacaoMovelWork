package ucm.ac.mz.sociomatico;

import android.content.ClipData;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends BaseAdapter {


    Context ctx;
    ArrayList<Post> itemList;
    int resource;
    LayoutInflater vi;

    public PostAdapter(Context ctx,int resource,ArrayList<Post> itemList) {


        this.ctx = ctx;
        this.itemList = itemList;
        this.resource = resource;

       vi = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return itemList == null ? 0 : itemList.size();
    }

    @Override
    public Object getItem(int pos) {
        return itemList == null ? null : itemList.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return itemList == null ? 0 : itemList.get(pos).hashCode();
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        ViewHolder holder;
        if(convertView==null) {


            convertView  = vi.inflate(resource,null);
            holder = new ViewHolder();

            holder.titulo_pub = (TextView) convertView.findViewById(R.id.titulo);
            holder.imagem = (ImageView) convertView.findViewById(R.id.foto);




            convertView.setTag(holder);


        }else {


            holder = (ViewHolder) convertView.getTag();

        }

        holder.titulo_pub.setText(itemList.get(position).getTitulo());
        new BaixarImagem(holder.imagem).execute(itemList.get(position).imagem);

        Log.println(Log.ERROR,"AtencaoBatata1",itemList.get(position).imagem);

        return convertView;

    }



    static class ViewHolder{


       public TextView titulo_pub;
       public ImageView imagem;




    }



    Bitmap foto = null;

    private  class BaixarImagem extends AsyncTask<String,Void,Bitmap>{

        ImageView imagem;


        public BaixarImagem(ImageView imageView){

            this.imagem = imageView;

        }


        @Override
        protected Bitmap doInBackground(String... strings) {

            String urlDisplay = strings[0];
            foto = null;

            try {
                InputStream in = new java.net.URL(urlDisplay).openStream();
                foto = BitmapFactory.decodeStream(in);

            } catch (IOException e){
                Log.e("Nao ta a fun",e.getMessage());
            }



            return foto;
        }


        protected  void  onPostExecute(Bitmap result){

            if(result != null) {

                super.onPostExecute(result);
                imagem.setImageBitmap(result);

            }
        }
    }




}
