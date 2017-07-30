package com.example.zhongjie3.toolbardemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button toolbarButton;
    private Button zhihuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView()
    {
        toolbarButton = (Button)findViewById(R.id.toolBarButton);
        toolbarButton.setOnClickListener(this);
        zhihuButton = (Button)findViewById(R.id.zhihuButton);
        zhihuButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        Intent intent = null;
        switch (viewId)
        {
            case R.id.toolBarButton:
                intent = new Intent(MainActivity.this, ToolBarActivity.class);
                break;
            case R.id.zhihuButton:
                intent = new Intent(MainActivity.this, ZhiHuActivity.class);
                break;
        }
        startActivity(intent);
    }
}
