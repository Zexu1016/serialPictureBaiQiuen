package com.zexu.serialpicture.activity.Utils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {

    public static void show(Context ctx,String desc) {
        Toast.makeText(ctx, desc, Toast.LENGTH_SHORT).show();
    }
}
