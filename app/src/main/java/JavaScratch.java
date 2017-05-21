import android.view.View;
import android.widget.TextView;

import timber.log.Timber;

/**
 * Created by conor on 21/05/2017.
 *
 * For converting java code to kotlin. Type here hten convert.
 */


public class JavaScratch {
    public void doWithView(View view) {
        Timber.d("View v: %s", ((TextView) view).getText());
    }


}
