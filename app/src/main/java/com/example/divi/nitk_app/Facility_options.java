package com.example.divi.nitk_app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Facility_options extends ActionBarActivity {

    private static Button beach_but,pool,sports,sja,sac,hcc,shop,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facility_options);
        ListenForButton();
    }


    public void ListenForButton()
    {

            beach_but=(Button)findViewById(R.id.button);


            beach_but.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent("com.example.divi.nitk_app.beach");
                            startActivity(intent);

                        }
                    }
            );

        pool=(Button)findViewById(R.id.button2);
        pool.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                public void onClick(View v)
                    {
                        Intent intent=new Intent("com.example.divi.nitk_app.Pool");
                        startActivity(intent);
                    }


                       }
        );


        sports=(Button)findViewById(R.id.button3);
        sports.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.divi.nitk_app.Sports");
                        startActivity(intent);
                    }


                }
        );


        sac=(Button)findViewById(R.id.button6);
        sac.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.divi.nitk_app.Sac");
                        startActivity(intent);
                    }


                }
        );

        sja=(Button)findViewById(R.id.button5);
        sja.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.divi.nitk_app.Sja");
                        startActivity(intent);
                    }


                }
        );

        hcc=(Button)findViewById(R.id.button4);
        hcc.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.divi.nitk_app.HCC");
                        startActivity(intent);
                    }


                }
        );



        shop=(Button)findViewById(R.id.button7);
        shop.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.divi.nitk_app.ShoppingComplex");
                        startActivity(intent);
                    }


                }
        );

        /*home=(Button)findViewById(R.id.button8);
        home.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("");
                        startActivity(intent);
                    }


                }
        );*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_facility_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
