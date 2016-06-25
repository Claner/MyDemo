package app.clanner.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.jakewharton.rxbinding.view.RxView;

import java.util.concurrent.TimeUnit;

import app.clanner.bus.RxBus;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;

/**
 * RxJava
 * 概述:
 * 要知道RxJava是什么，那么你应该先去了解一下Rx。Rx的全称是Reactive Extensions，直译过来就是响应式扩展。
 * Rx基于观察者模式，他是一种编程模型，目标是提供一致的编程接口，帮助开发者更方便的处理异步数据流。
 * ReactiveX.io给的定义是，Rx是一个使用可观察数据流进行异步编程的编程接口，ReactiveX结合了观察者模式、迭代器模式和函数式编程的精华。
 * Rx已经渗透到了各个语言中，有了Rx所以才有了 RxJava，Rx.NET、RxJS、RxSwift、Rx.rb、RxPHP等等，更详细的可以去这里看看languages
 * 那么RxJava到底是什么，我对于他的理解就针对于Java语言的一个异步的响应式编程库。
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_test)
    Button btnTest;
    @BindView(R.id.tv)
    TextView tv;

    private Subscription mSubscription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //过滤掉了在300ms内的重复点击
        RxView.clicks(btnTest).debounce(300, TimeUnit.MILLISECONDS).subscribe(new Action1<Void>() {
            @Override
            public void call(Void aVoid) {
                Log.e("Hello", "clicked");
            }
        });

        //每隔两秒执行一次
//        Observable.interval(2, 2, TimeUnit.SECONDS).subscribe(new Action1<Long>() {
//            @Override
//            public void call(Long aLong) {
//                Log.e("Hello","clicked");
//            }
//        });

        Observable.timer(2, TimeUnit.SECONDS).subscribe(new Action1<Long>() {
            @Override
            public void call(Long aLong) {
                Log.e("Hello", "clicked");
            }
        });

        mSubscription = RxBus.getInstance().toObserverable(String.class).subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                tv.setText(s);
            }
        });
    }

    @OnClick(R.id.btn_sec)
    public void onClick() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //取消订阅
        mSubscription.unsubscribe();
    }
}
