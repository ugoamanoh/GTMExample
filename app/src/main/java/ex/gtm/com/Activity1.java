package ex.gtm.com;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.tagmanager.Container;
import com.google.android.gms.tagmanager.TagManager;
import com.google.android.gms.tagmanager.ContainerHolder;

import java.util.concurrent.TimeUnit;


public class Activity1 extends Activity {

    private static final long TIMEOUT_FOR_CONTAINER_OPEN_MILLISECONDS = 2000;
    private static final String CONTAINER_ID = "GTM-5ZTMWG";
    private boolean containerLoaded = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = (Button)(findViewById(R.id.button1));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), Activity2.class));
                finish();
            }
        });


    }


    @Override
    protected void onStart() {
        super.onStart();
        GtmUtils.pushOpenScreenEvent(this, "Activity1");
    }
}
