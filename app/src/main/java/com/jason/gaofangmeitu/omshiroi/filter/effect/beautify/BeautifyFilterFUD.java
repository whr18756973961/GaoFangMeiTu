package com.jason.gaofangmeitu.omshiroi.filter.effect.beautify;

import android.content.Context;


import com.jason.gaofangmeitu.omshiroi.filter.base.SimpleFragmentShaderFilter;
import com.jason.gaofangmeitu.omshiroi.util.TextureUtils;
/**
 * Created by Ads on 2017/4/6.
 */

public class BeautifyFilterFUD extends SimpleFragmentShaderFilter {
    public BeautifyFilterFUD(Context context) {
        super(context, "filter/fsh/beautify/beautify_d.glsl");
    }
}
