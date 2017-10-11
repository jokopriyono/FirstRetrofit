package id.web.jokopriyono.firstretrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiStore {
    @GET("character/{id}")
    Call<Response> ambilDataKarakter(@Path("id") String idKarakter);

    @GET("anime/{id_anime}")
    Call<Response> ambilDataAnime(@Path("id_anime") String idAnime);
}
