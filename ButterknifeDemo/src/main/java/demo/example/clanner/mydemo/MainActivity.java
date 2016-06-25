package demo.example.clanner.mydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_1) Button btn1;
    @BindView(R.id.btn_2) Button btn2;
    @BindView(R.id.btn_3) Button btn3;
    @BindView(R.id.btn_4) Button btn4;
    @BindView(R.id.btn_5) Button btn5;
    @BindView(R.id.btn_6) Button btn6;
    @BindView(R.id.btn_7) Button btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_1) void test1(){
        Toast.makeText(MainActivity.this, "btn1被点击啦", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.btn_2)void test2(){
        Toast.makeText(MainActivity.this, "btn2被点击啦", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.btn_3)void test3(){
        Toast.makeText(MainActivity.this, "btn3被点击啦", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.btn_4)void test4(){
        Toast.makeText(MainActivity.this, "btn4被点击啦", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.btn_5)void test5(){
        Toast.makeText(MainActivity.this, "btn5被点击啦", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.btn_6)void test6(){
        Toast.makeText(MainActivity.this, "btn6被点击啦", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.btn_7)void test7(){
        Toast.makeText(MainActivity.this, "btn7被点击啦", Toast.LENGTH_SHORT).show();
    }
}
