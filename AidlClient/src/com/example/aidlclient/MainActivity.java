package com.example.aidlclient;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.example.aidlhelper.aidl.IPersonAidl;
import com.example.aidlhelper.aidl.Person;

public class MainActivity extends Activity {
    private Button btn_one;

    private IPersonAidl iPersonAidl;
    private ServiceConnection conn = new ServiceConnection() {

        @Override
        public void onServiceDisconnected(ComponentName arg0) {
            // TODO Auto-generated method stub
        }

        @Override
        public void onServiceConnected(ComponentName arg0, IBinder arg1) {
            iPersonAidl = IPersonAidl.Stub.asInterface(arg1);
        }
    };

    private void connectService() {
        Intent intent = new Intent();
        intent.setClassName("com.example.aidlserver", "com.example.aidlserver.AidlService");
        bindService(intent, conn, Context.BIND_AUTO_CREATE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectService();

        btn_one = (Button) findViewById(R.id.btn_one);
        btn_one.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                try {
                    Person person = new Person();
                    person.setName("scott");
                    person.setAge(18);
                    // 从服务端获取数据。但是如何写回调，把数据外抛给客户端呢？
                    String retVal = iPersonAidl.dealPersonFromServer(person);
                    Toast.makeText(MainActivity.this, retVal, Toast.LENGTH_SHORT).show();
                } catch (RemoteException e) {
                    Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
