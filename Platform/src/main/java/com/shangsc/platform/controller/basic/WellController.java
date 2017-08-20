package com.shangsc.platform.controller.basic;

import com.shangsc.platform.core.auth.anno.RequiresPermissions;
import com.shangsc.platform.core.controller.BaseController;

/**
 * @Author ssc
 * @Date 2017/8/20 16:39
 * @Version 1.0.0
 * @Desc
 */
public class WellController extends BaseController {

    @RequiresPermissions(value = {"/basic/well"})
    public void index() {
        render("well_index.jsp");
    }

}

