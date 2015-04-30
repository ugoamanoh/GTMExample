package ex.gtm.com;

import android.content.Context;

import com.google.android.gms.tagmanager.DataLayer;
import com.google.android.gms.tagmanager.TagManager;

/**
 * Created by Ugo on 4/30/2015.
 */
public class GtmUtils {

    private GtmUtils() {
    }

    public static void pushOpenScreenEvent(Context context, String screenName) {
        DataLayer dataLayer = TagManager.getInstance(context).getDataLayer();
        dataLayer.pushEvent("OpenScreen", DataLayer.mapOf("screenName", screenName));
    }
}
