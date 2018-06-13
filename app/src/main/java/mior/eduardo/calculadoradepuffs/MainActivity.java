package mior.eduardo.calculadoradepuffs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.AlertDialog;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static String voltarPara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instanciarValores();
    }

    public void verCreditos(View v) {
        AlertDialog alerta = new AlertDialog.Builder(this).create();
        alerta.setTitle("");
        alerta.setMessage("Made with ♥ by Mior and Roger!");
        alerta.show();
    }

    public void verResultado(View v) {
        double valor = Valores.calcularTotal();
        AlertDialog alerta = new AlertDialog.Builder(this).create();
        alerta.setTitle("RESULTADO FINAL");
        alerta.setMessage("O custo de produção aproximado de cada puff é de R$" + String.format("%.2f", valor));
        alerta.show();
    }

    public void verPrecoUnitario(View v) {
        double valor = Valores.calcularPrecoUnitario();
        AlertDialog alerta = new AlertDialog.Builder(this).create();
        alerta.setTitle("PREÇO UNITARIO");
        alerta.setMessage("O custo aproximado de cada item é de R$" + String.format("%.2f", valor));
        alerta.show();
    }

    public void verPrecoMetroQuadrado(View v) {
        double valor = Valores.calcularPrecoMetroQuadrado();
        AlertDialog alerta = new AlertDialog.Builder(this).create();
        alerta.setTitle("PREÇO DE UM METRO²");
        alerta.setMessage("O custo aproximado de cada metro² é de R$" + String.format("%.2f", valor));
        alerta.show();
    }

    public void irParaCalculo(View v) {
        setContentView(R.layout.activity_calculo);
        instanciarValores();
        voltarPara = "main";
    }

    public void irParaInstrucoes(View v) {
        setContentView(R.layout.activity_instrucoes);
        voltarPara = "main";
    }

    public void irParaInstrucaoPrecoUnitario(View v) {
        setContentView(R.layout.activity_preco_unitario);
        instanciarValores();
        voltarPara = "instrucoes";
    }

    public void irParaInstrucaoPrecoMetro(View v) {
        setContentView(R.layout.activity_preco_metro);
        instanciarValores();
        voltarPara = "instrucoes";
    }

    public void irParaInstrucaoMaisDicas(View v) {
        setContentView(R.layout.activity_mais_dicas);
        voltarPara = "instrucoes";
    }

    public void instanciarValores() {
        Valores.ParafusoFrancesQuantia = (EditText) findViewById(R.id.ParafusoFrancesQuantia);
        Valores.ParafusoFrancesValor = (EditText) findViewById(R.id.ParafusoFrancesValor);
        Valores.ParafusoCabecaChataQuantia = (EditText) findViewById(R.id.ParafusoCabecaChataQuantia);
        Valores.ParafusoCabecaChataValor = (EditText) findViewById(R.id.ParafusoCabecaChataValor);
        Valores.ParafusoSextavadoQuantia = (EditText) findViewById(R.id.ParafusoSextavadoQuantia);
        Valores.ParafusoSextavadoValor = (EditText) findViewById(R.id.ParafusoSextavadoValor);
        Valores.PneuQuantia = (EditText) findViewById(R.id.PneuQuantia);
        Valores.PneuValor = (EditText) findViewById(R.id.PneuValor);
        Valores.RuelasQuantia = (EditText) findViewById(R.id.RuelasQuantia);
        Valores.RuelasValor = (EditText) findViewById(R.id.RuelasValor);
        Valores.PorcasQuantia = (EditText) findViewById(R.id.PorcasQuantia);
        Valores.PorcasValor = (EditText) findViewById(R.id.PorcasValor);
        Valores.ChapaLargura = (EditText) findViewById(R.id.ChapaLargura);
        Valores.ChapaComprimento = (EditText) findViewById(R.id.ChapaComprimento);
        Valores.ChapaValorAoMetro = (EditText) findViewById(R.id.ChapaValor);
        Valores.TecidoForroLargura = (EditText) findViewById(R.id.TecidoForroLargura);
        Valores.TecidoForroComprimento = (EditText) findViewById(R.id.TecidoForroComprimento);
        Valores.TecidoForroValorAoMetro = (EditText) findViewById(R.id.TecidoForroValor);
        Valores.EspumaLargura = (EditText) findViewById(R.id.EspumaLargura);
        Valores.EspumaComprimento = (EditText) findViewById(R.id.EspumaComprimento);
        Valores.EspumaValorAoMetro = (EditText) findViewById(R.id.EspumaValor);
        Valores.FuradeiraTempo = (EditText) findViewById(R.id.FuradeiraTempo);
        Valores.FuradeiraPotencia = (EditText) findViewById(R.id.FuradeiraPotencia);
        Valores.ParafusadeiraTempo = (EditText) findViewById(R.id.ParafusadeiraTempo);
        Valores.ParafusadeiraPotencia = (EditText) findViewById(R.id.ParafusadeiraPotencia);
        Valores.SerraTempo = (EditText) findViewById(R.id.SerraTempo);
        Valores.SerraPotencia = (EditText) findViewById(R.id.SerraPotencia);
        Valores.outros = (EditText) findViewById(R.id.outros);

        Valores.valorPrecoUnitario = (EditText) findViewById(R.id.valorPrecoUnitario);
        Valores.quantiaPrecoUnitario = (EditText) findViewById(R.id.quantiaPrecoUnitario);

        Valores.larguraMetroQuadrado = (EditText) findViewById(R.id.larguraMetroQuadrado);
        Valores.comprimentoMetroQuadrado = (EditText) findViewById(R.id.comprimentoMetroQuadrado);
        Valores.valorTotalMetroQuadrado =  (EditText) findViewById(R.id.valorTotalMetroQuadrado);
    }

    @Override
    public void onBackPressed() {
        if (voltarPara.equals("instrucoes")) {
            setContentView(R.layout.activity_instrucoes);
            voltarPara = "main";
        }
        else if (voltarPara.equals("main")) {
            setContentView(R.layout.activity_main);
            voltarPara = "sair";
        }
        else {
            finish();
            System.exit(0);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        voltarPara = "sair";
    }

    @Override
    protected void onStop() {
        super.onStop();
        voltarPara = "sair";
    }

    @Override
    protected void onPause() {
        super.onPause();
        voltarPara = "sair";
    }
}