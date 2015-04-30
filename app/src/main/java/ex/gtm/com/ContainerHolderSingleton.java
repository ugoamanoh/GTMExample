package ex.gtm.com;

import com.google.android.gms.tagmanager.ContainerHolder;

/**
 * Created by Ugo on 4/30/2015.
 */
public class ContainerHolderSingleton {
    private static ContainerHolder containerHolder;

    private ContainerHolderSingleton() {
    }

    public static ContainerHolder getContainerHolder() {
        return containerHolder;
    }

    public static void setContainerHolder(ContainerHolder c) {
        containerHolder = c;
    }
}