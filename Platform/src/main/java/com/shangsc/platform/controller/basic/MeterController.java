package com.shangsc.platform.controller.basic;

import com.jfinal.plugin.activerecord.Page;
import com.shangsc.platform.controller.export.WaterMeterExportService;
import com.shangsc.platform.core.auth.anno.RequiresPermissions;
import com.shangsc.platform.core.controller.BaseController;
import com.shangsc.platform.core.model.Condition;
import com.shangsc.platform.core.model.Operators;
import com.shangsc.platform.core.util.CommonUtils;
import com.shangsc.platform.core.util.JqGridModelUtils;
import com.shangsc.platform.core.view.InvokeResult;
import com.shangsc.platform.model.WaterMeter;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author ssc
 * @Date 2017/8/20 16:39
 * @Version 1.0.0
 * @Desc
 */
public class MeterController extends BaseController {

    @RequiresPermissions(value = {"/basic/meter"})
    public void index() {
        render("meter_index.jsp");
    }

    @RequiresPermissions(value={"/basic/meter"})
    public void getListData() {
        String keyword=this.getPara("name");
        Set<Condition> conditions=new HashSet<Condition>();
        if(CommonUtils.isNotEmpty(keyword)){
            conditions.add(new Condition("name", Operators.LIKE, keyword));
        }
        Page<WaterMeter> pageInfo = WaterMeter.me.getPage(getPage(), this.getRows(),conditions,this.getOrderby());
        this.renderJson(JqGridModelUtils.toJqGridView(pageInfo));
    }

    @RequiresPermissions(value={"/basic/meter"})
    public void add() {
        Integer id = this.getParaToInt("id");
        if(id!=null){
            this.setAttr("item", WaterMeter.me.findById(id));
        }
        this.setAttr("id", id);
        render("meter_add.jsp");
    }

    @RequiresPermissions(value={"/basic/meter"})
    public void save(){
        Long id = this.getParaToLong("id");
        Long companyId = this.getParaToLong("companyId");
        String innerCode = this.getPara("innerCode");
        String lineNum = this.getPara("lineNum");
        String meterNum = this.getPara("meterNum");
        Integer watersType = this.getParaToInt("watersType");
        Integer waterUseType = this.getParaToInt("waterUseType");
        String meterAttr = this.getPara("meterAttr");
        Integer chargeType = this.getParaToInt("chargeType");
        String billingCycle = this.getPara("billingCycle");
        InvokeResult result = WaterMeter.me.save(id, companyId, innerCode, lineNum, meterNum,
                watersType, waterUseType, meterAttr, chargeType, billingCycle);
        this.renderJson(result);
    }

    @RequiresPermissions(value={"/basic/meter"})
    public void delete(){
        Long id = this.getParaToLong("id");
        InvokeResult result = WaterMeter.me.deleteData(id);
        this.renderJson(result);
    }

    @RequiresPermissions(value={"/basic/meter"})
    public void export(){
        String keyword=this.getPara("name");
        Set<Condition> conditions=new HashSet<Condition>();
        if(CommonUtils.isNotEmpty(keyword)){
            conditions.add(new Condition("name", Operators.LIKE, keyword));
        }
        Page<WaterMeter> pageInfo = WaterMeter.me.getPage(getPage(), this.getRows(),conditions,this.getOrderby());

        WaterMeterExportService service = new WaterMeterExportService();
        String path =  service.export(pageInfo);

        renderFile(new File(path));

    }
}
