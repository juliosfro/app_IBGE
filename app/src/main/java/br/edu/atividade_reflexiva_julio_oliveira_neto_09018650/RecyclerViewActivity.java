package br.edu.atividade_reflexiva_julio_oliveira_neto_09018650;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private List<Cidade> _cidades;
    private RecyclerView _rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#32CD32")));
        bar.setTitle("Julio de Oliveira Neto - 09018650");

        setContentView(R.layout.recyclerview_activity);

        _rv = (RecyclerView) findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        _rv.setLayoutManager(llm);
        _rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }

    private void initializeData() {
        _cidades = new ArrayList<>();
        _cidades.add(new Cidade("Cianorte", "82.620 habitantes", R.drawable.cianorte));
        _cidades.add(new Cidade("Maringá", "342.310 habitantes", R.drawable.maringa));
        _cidades.add(new Cidade("Umuarama", "90.105 habitantes", R.drawable.umuarama));
        _cidades.add(new Cidade("Londrina", "485.822 habitantes", R.drawable.londrina));
        _cidades.add(new Cidade("Toledo", "142.645 habitantes", R.drawable.toledo));
        _cidades.add(new Cidade("Cascavel", "332.333 habitantes", R.drawable.cascavel));
        _cidades.add(new Cidade("Pato Branco", "83.843 habitantes", R.drawable.pato_branco_pr));
        _cidades.add(new Cidade("Marialva", "35.804 habitantes", R.drawable.marialva));
    }

    private void initializeAdapter() {
        RVAdapter adapter = new RVAdapter(_cidades);
        _rv.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_informacoes:
                // Toast.makeText(RecyclerViewActivity.this, "Info Clicado", Toast.LENGTH_SHORT).show();
                mostrarInformacoesPessoais();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void mostrarInformacoesPessoais(){
        setContentView(R.layout.info_pessoais_activity);
    }
}