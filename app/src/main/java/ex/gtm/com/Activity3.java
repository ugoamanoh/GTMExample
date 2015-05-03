package ex.gtm.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Activity3 extends Activity {

    private static final long TIMEOUT_FOR_CONTAINER_OPEN_MILLISECONDS = 2000;
    private static final String CONTAINER_ID = "GTM-5ZTMWG";
    private boolean containerLoaded = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);


        Button btn = (Button)(findViewById(R.id.button3));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), Activity1.class));
                finish();
            }
        });

    }


    @Override
    protected void onStart() {
        super.onStart();
        GtmUtils.pushOpenScreenEvent(this, "Activity3");
    }
}
