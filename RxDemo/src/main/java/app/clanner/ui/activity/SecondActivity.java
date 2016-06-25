package app.clanner.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import app.clanner.bus.RxBus;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Clanner on 2016/6/25.
 */
public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_send)
    public void onClick() {
        RxBus.getInstance().post("Something change");
    }
}
