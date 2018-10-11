package com.sample.android_resources;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // getTextで文字列を取得
        String str1 = getString(R.string.sample1);
        String str2 = getString(R.string.sample2,"りんご",3);

        // ログ出力
        Log.d("sample","str1:"+str1);
        Log.d("sample","str2:"+str2);

        // ビューにも反映
        TextView text1 = (TextView)findViewById(R.id.textView1);
        text1.setText(str1);
        TextView text2 = (TextView)findViewById(R.id.textView2);
        text2.setText(str2);


        // コードからマークアップを反映させる
//        TextView text3 = (TextView)findViewById(R.id.textView1);
//        text3.setText(getText(R.string.sample4));

    }
}
