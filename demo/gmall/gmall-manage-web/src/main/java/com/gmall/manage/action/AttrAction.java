package com.gmall.manage.action;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gmall.bean.PmsBaseAttrInfo;
import com.gmall.bean.PmsBaseAttrValue;
import com.gmall.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @creatdate 2019-11-07 19:47
 */

@Controller
@CrossOrigin
public class AttrAction {

    @Reference
    AttrService service;

    @RequestMapping("attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){

      List<PmsBaseAttrInfo> infoList =  service.attrInfoList(catalog3Id);

      return infoList;

    }
    @RequestMapping("getAttrValueList")
    @ResponseBody
    public List<PmsBaseAttrValue> getAttrValueList(String attrId){

        List<PmsBaseAttrValue> valueList =  service.attrValueList(attrId);

        return valueList;

    }
    @RequestMapping("saveAttrInfo")
    @ResponseBody
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){
        String result = service.saveAttrInfo(pmsBaseAttrInfo);
        return "Success";
    }

}
