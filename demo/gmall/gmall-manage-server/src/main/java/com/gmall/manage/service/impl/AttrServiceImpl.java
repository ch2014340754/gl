package com.gmall.manage.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.bean.PmsBaseAttrInfo;
import com.gmall.bean.PmsBaseAttrValue;
import com.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import com.gmall.manage.mapper.PmsBaseAttrValueMapper;
import com.gmall.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @creatdate 2019-11-07 19:57
 */
@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    PmsBaseAttrInfoMapper infoMapper;
    @Autowired
    PmsBaseAttrValueMapper valueMapper;

    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catelog3) {
        PmsBaseAttrInfo info = new PmsBaseAttrInfo();
        info.setCatalog3Id(catelog3);
        List<PmsBaseAttrInfo> attrInfos = infoMapper.select(info);
        return attrInfos;
    }

    @Override
    public List<PmsBaseAttrValue> attrValueList(String attrId) {
        PmsBaseAttrValue value = new PmsBaseAttrValue();
        value.setAttrId(attrId);
        List<PmsBaseAttrValue> values = valueMapper.select(value);
        return values;
    }

    @Override
    public String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {

        Integer id =  infoMapper.insertSelective(pmsBaseAttrInfo);
        System.out.println(id);

        for (PmsBaseAttrValue pmsBaseAttrValue : pmsBaseAttrInfo.getAttrValueList()) {
            pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
            valueMapper.insertSelective(pmsBaseAttrValue);
        }
        return null;
    }
}
