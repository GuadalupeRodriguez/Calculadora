package itsco.edu.calculadora;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {
    boolean decimal=false;
    boolean sum=false;
    boolean res=false;
    boolean mul=false;
    boolean div=false;
    Double[] numero= new Double[10];
    Double resul;
    EditText txtNum;
    Button btnN1;
    Button btnN2;
    Button btnN3;
    Button btnN4;
    Button btnN5;
    Button btnN6;
    Button btnN7;
    Button btnN8;
    Button btnN9;
    Button btnSumar;
    Button btnRestar;
    Button btnDividir;
    Button btnMultiplicar;
    Button btnIgual;
    Button btnCero;
    Button btnPunto;
    Button btnEliminar;
    int x=0;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtNum = (EditText)
                findViewById(R.id.txt_num);
        btnN1 = (Button)
                findViewById(R.id.btn_n1);
        btnN2 = (Button)
                findViewById(R.id.btn_n2);
        btnN3 = (Button)
                findViewById(R.id.btn_n3);
        btnN4 = (Button)
                findViewById(R.id.btn_n4);
        btnN5 = (Button)
                findViewById(R.id.btn_n5);
        btnN6 = (Button)
                findViewById(R.id.btn_n6);
        btnN7 = (Button)
                findViewById(R.id.btn_n7);
        btnN8 = (Button)
                findViewById(R.id.btn_n8);
        btnN9 = (Button)
                findViewById(R.id.btn_n9);
        btnSumar = (Button)
                findViewById(R.id.btn_suma);
        btnRestar = (Button)
                findViewById(R.id.btn_resta);
        btnDividir = (Button)
                findViewById(R.id.btn_divide);
        btnMultiplicar = (Button)
                findViewById(R.id.btn_mul);
        btnPunto = (Button)
                findViewById(R.id.btn_punto);
        btnCero = (Button)
                findViewById(R.id.btn_cero);
        btnIgual = (Button)
                findViewById(R.id.btn_igual);
        btnEliminar = (Button)
                findViewById(R.id.btn_elimina);
        btnN1.setOnClickListener(this);
        btnN2.setOnClickListener(this);
        btnN3.setOnClickListener(this);
        btnN4.setOnClickListener(this);
        btnN5.setOnClickListener(this);
        btnN6.setOnClickListener(this);
        btnN7.setOnClickListener(this);
        btnN8.setOnClickListener(this);
        btnN9.setOnClickListener(this);
        btnSumar.setOnClickListener(this);
        btnRestar.setOnClickListener(this);
        btnMultiplicar.setOnClickListener(this);
        btnDividir.setOnClickListener(this);
        btnCero.setOnClickListener(this);
        btnIgual.setOnClickListener(this);
        btnPunto.setOnClickListener(this);
        btnEliminar.setOnClickListener(this);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onClick(View view) {
        EditText pan = (EditText) findViewById(R.id.txt_num);
        int num = view.getId();
        String n= pan.getText().toString();
        try {
        switch (num) {

                case R.id.btn_n1:
                    pan.setText(n+"7");
                    x=1;
                    break;
                case R.id.btn_n2:
                    pan.setText(n+"8");
                    x=1;
                    break;
                case R.id.btn_n3:
                    pan.setText(n+"9");
                    x=1;
                    break;
                case R.id.btn_n4:
                    pan.setText(n+"4");
                    x=1;
                    break;
                case R.id.btn_n5:
                    pan.setText(n+"5");
                    x=1;
                    break;
                case R.id.btn_n6:
                    pan.setText(n+"6");
                    x=1;
                    break;
                case R.id.btn_n7:
                    pan.setText(n+"1");
                    x=1;
                    break;
                case R.id.btn_n8:
                    pan.setText(n+"2");
                    x=1;
                    break;
                case R.id.btn_n9:
                    pan.setText(n+"3");
                    x=1;
                    break;
                case R.id.btn_cero:
                    pan.setText(n+"0");
                    x=1;
                    break;
                case R.id.btn_punto:
                    if (decimal==false){
                        if (x==0){
                            pan.setText(n+"0.");
                            decimal=true;}
                        else{
                            pan.setText(n+".");
                            decimal=true;
                        }
                    }else{
                        return;}
                    break;
                case R.id.btn_suma:
                    sum=true;
                    numero[0] = Double.parseDouble(n);
                    pan.setText("");
                    decimal=false;
                    x=0;
                    break;
                case R.id.btn_resta:
                    res=true;
                    numero[0] = Double.parseDouble(n);
                    pan.setText("");
                    decimal=false;
                    x=0;

                    break;
                case R.id.btn_mul:
                    mul=true;
                    numero[0] = Double.parseDouble(n);
                    pan.setText("");
                    decimal=false;
                    x=0;

                    break;
                case R.id.btn_divide:
                    div=true;
                    numero[0] = Double.parseDouble(n);
                    pan.setText("");
                    decimal=false;
                    x=0;
                    break;
                case R.id.btn_igual:
                    numero[1] = Double.parseDouble(n);

                    if (sum==true) {
                        resul= numero[0]+numero[1];
                        pan.setText(String.valueOf(resul));

                    }else if (res==true){
                        resul=numero[0]-numero[1];
                        pan.setText(String.valueOf(resul));

                    }else if (mul==true){
                        resul=numero[0]*numero[1];
                        pan.setText(String.valueOf(resul));

                    }else if (div==true) {
                        resul=numero[0]/numero[1];
                        pan.setText(String.valueOf(resul));

                    }
                    decimal=false;
                    sum=false;
                    res=false;
                    mul=false;
                    div=false;
                    break;
                case R.id.btn_elimina:
                    pan.setText("");
                    decimal=false;
                    x=0;
                    break;
            }
        }catch(Exception e){
            pan.setText("error");
        };
    }
}

