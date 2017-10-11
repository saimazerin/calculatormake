package com.example.saimazerinzeby.myapplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.saimazerinzeby.myapplication.R.id.textView3;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
  public Button ba,bs,bm,bd,s,c,t;


    public TextView t3 ;
    public EditText n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init()
    {

        ba=(Button)findViewById(R.id.badd);
        bs=(Button)findViewById(R.id.bsub);
        bm=(Button)findViewById(R.id.bmul);
        bd=(Button)findViewById(R.id.bdiv);
        n1=(EditText)findViewById(R.id.num1);
        n2=(EditText)findViewById(R.id.num2);
        t3=(TextView)findViewById(textView3);
        s=(Button)findViewById(R.id.sine);
        c=(Button)findViewById(R.id.cose);
        t=(Button)findViewById(R.id.tane);

        ba.setOnClickListener(this);
        bs.setOnClickListener(this);
        bm.setOnClickListener(this);
        bd.setOnClickListener(this);
        s.setOnClickListener(this);
        c.setOnClickListener(this);
        t.setOnClickListener(this);

    }
    public void onClick(View view)
    {
        String v1=n1.getText().toString();
        String v2=n2.getText().toString();
        switch (view.getId()){
            case R.id.badd:
        int addition= Integer.parseInt(v1)+Integer.parseInt(v2);
        t3.setText(String.valueOf(addition));
        break;
            case R.id.bsub:
        int substraction= Integer.parseInt(v1)-Integer.parseInt(v2);
        t3.setText(String.valueOf(substraction));
        break;
            case R.id.bdiv:
        try{
            int divtion= Integer.parseInt(v1)/Integer.parseInt(v2);
            t3.setText(String.valueOf(divtion));
        }catch (Exception e) {
            t3.setText(String.valueOf("can not find divition"));
            break;}

            case R.id.bmul:
                int multi= Integer.parseInt(v1)+Integer.parseInt(v2);
                t3.setText(String.valueOf(multi));
                break;
            case R.id.sine: {
                if (n2.getText().toString().equals("")) {
                    int so = Integer.parseInt(v1);
                    double yo = Math.sin(so);
                    t3.setText(String.valueOf(yo));
                    break;
                }
                if (n1.getText().toString().equals("")) {
                    int so = Integer.parseInt(v2);
                    double yo = Math.sin(so);
                    t3.setText(String.valueOf(yo));
                    break;
                }
            }
            case R.id.cose: {
                if (n2.getText().toString().equals("")) {
                    int so = Integer.parseInt(v1);
                    double yo = Math.cos(so);
                    t3.setText(String.valueOf(yo));
                    break;
                }
                if (n1.getText().toString().equals("")) {
                    int so = Integer.parseInt(v2);
                    double yo = Math.cos(so);
                    t3.setText(String.valueOf(yo));
                    break;
                }
            }
            case R.id.tane: {
                if (n2.getText().toString().equals("")) {
                    int so = Integer.parseInt(v1);
                    double yo = Math.tan(so);
                    t3.setText(String.valueOf(yo));
                    break;
                }
                if (n1.getText().toString().equals("")) {
                    int so = Integer.parseInt(v2);
                    double yo = Math.tan(so);
                    t3.setText(String.valueOf(yo));
                    break;
                }
            }


        }
    }
}
