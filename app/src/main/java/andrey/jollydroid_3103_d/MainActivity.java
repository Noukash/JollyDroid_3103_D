package andrey.jollydroid_3103_d;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private Integer[] images={R.drawable.ras1,R.drawable.ras2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addimages();
    }
    public void addimages() {
        LinearLayout scrollview_linear = (LinearLayout) findViewById(R.id.linear_scroll);
        for (Integer image : images) {
            scrollview_linear.addView(getImageView(image));
        }
    }
        private View getImageView(Integer image) {
            ImageView imageView = new ImageView(getApplicationContext());
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            imageView.setLayoutParams(lp);
            imageView.setImageResource(image);
            return imageView;
        }

    }

