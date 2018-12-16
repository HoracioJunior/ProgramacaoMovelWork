package ucm.ac.mz.sociomatico.Models;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Jaink on 14-09-2017.
 */

public interface RetrofitArrayApi {

    @GET("wp-json/wp/v2/posts?per_page=5")
    Call<List<WPPost>> getPostInfo();
    /// to make call to dynamic URL
    //  @GET
    //  Call<List<WPPost>> getPostInfo(@Url String url);
    //

}
