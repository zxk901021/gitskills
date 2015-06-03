package com.zhy_9.notificationproject;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button changeTheme = (Button) findViewById(R.id.change_theme);
        changeTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTheme(R.style.DarkTheme);
                recreate();
            }
        });
//        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
//
//        builder.setContentTitle("通知栏标题")
//        .setContentText("我是通知内容")
//        .setContentIntent(getDefaultIntent(Notification.FLAG_AUTO_CANCEL))
//        .setTicker("测试通知来啦")
//        .setWhen(System.currentTimeMillis())
//        .setPriority(Notification.PRIORITY_DEFAULT)
//        .setOngoing(false)
//        .setDefaults(Notification.DEFAULT_VIBRATE)
//        .setSmallIcon(R.mipmap.ic_launcher);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public PendingIntent getDefaultIntent (int flags) {
        PendingIntent intent = PendingIntent.getActivity(this, 1, new Intent(), flags);
        return intent;
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
