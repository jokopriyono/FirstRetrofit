package id.web.jokopriyono.firstretrofit;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private EditText edtInput;
    private TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtInput = (EditText)findViewById(R.id.edt_input);
        txtHasil = (TextView)findViewById(R.id.txt_hasil);

        Button btnCek = (Button)findViewById(R.id.btn_cek);
        btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ambilData();
            }
        });
    }

    private void ambilData() {
        final ProgressDialog dialog = new ProgressDialog(this);
        dialog.setCancelable(false);
        dialog.setMessage("Mengambil data..");
        dialog.show();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jikan.me/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiStore service = retrofit.create(ApiStore.class);
        Call<Response> result = service.ambilDataKarakter(
                edtInput.getText().toString());
        result.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                dialog.dismiss();
                txtHasil.setText(response.body().toString());
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                dialog.dismiss();
                Toast.makeText(MainActivity.this, "error : "+t.toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
