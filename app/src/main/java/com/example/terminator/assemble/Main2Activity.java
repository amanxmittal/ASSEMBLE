package com.example.terminator.assemble;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    ListView contactList;

    String contacts[]={"HULK","IRON MAN","CAPTAIN AMERICA","SPIDER MAN","THOR","HAWKEYE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        contactList = (ListView) findViewById(R.id.contactList);

        ArrayAdapter<String> contactAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contacts);
        contactList.setAdapter(contactAdapter);
        registerForContextMenu(contactList);


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE},100);


        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle() == "call") {


            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                //ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE},100);
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.

            }

            Intent iCall = new Intent(Intent.ACTION_CALL);
            iCall.setData(Uri.parse("tel:9999999999"));
            startActivity(iCall);
        }
        else if (item.getTitle()=="sms"){
            Toast.makeText(Main2Activity.this, "sms page", Toast.LENGTH_SHORT).show();
            //Intent iSMS = new Intent(Main2Activity.this,sms.class);
            //startActivity(iSMS);
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Select the action");
        menu.add(0,v.getId(),0,"call");
        menu.add(0,v.getId(),0,"sms");//groupId,itemId,order, title
    }
}
