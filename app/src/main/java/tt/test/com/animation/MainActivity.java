package tt.test.com.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view)
    {
        ImageView bart = (ImageView) findViewById(R.id.bart);
        bart.animate()
                .translationXBy(1000f)
                .translationYBy(1000f)
                .rotationBy(3600f)
                .setDuration(2000);
       // bart.animate().scaleX(0.5f).scaleY(0.5f).rotation(1800f).alpha(0.2f).setDuration(2000);
        //bart.animate().rotation(1800f).setDuration(2000);
       // bart.animate().translationXBy(1000f).setDuration(2000);
       // bart.animate().translationY(1000f).setDuration(2000);
        //ImageView homer = (ImageView) findViewById(R.id.homer);
        //bart.animate().alpha(0).setDuration(2000);
        //homer.animate().alpha(1).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ImageView bart = (ImageView) findViewById(R.id.bart);
        bart.animate().translationX(-1000f);
        bart.animate().translationY(-1000f);
    }
}
