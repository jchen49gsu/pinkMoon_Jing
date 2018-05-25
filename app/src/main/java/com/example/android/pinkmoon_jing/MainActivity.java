package com.example.android.pinkmoon_jing;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.wx.wheelview.adapter.ArrayWheelAdapter;
import com.wx.wheelview.adapter.SimpleWheelAdapter;
import com.wx.wheelview.common.WheelData;
import com.wx.wheelview.util.WheelUtils;
import com.wx.wheelview.widget.WheelView;
import com.wx.wheelview.widget.WheelViewDialog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends Activity {

    private WheelView myWheelView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private List<String> createArrays() {
        String[] strings = {"Woman", "Man","--"};
        return Arrays.asList(strings);
    }

    public void showDialog(View view) {
        WheelViewDialog dialog = new WheelViewDialog(this);
        dialog.setTitle("please select").setItems(createArrays()).setButtonText("SUBMIT").setDialogStyle(Color
                .parseColor("#FF4081")).setCount(5).show();
    }
}
