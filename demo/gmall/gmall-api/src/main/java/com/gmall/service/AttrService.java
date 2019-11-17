package com.gmall.service;

import com.gmall.bean.PmsBaseAttrInfo;
import com.gmall.bean.PmsBaseAttrValue;

import java.util.List;

public interface AttrService {

    List<PmsBaseAttrInfo> attrInfoList(String catelog3);

    List<PmsBaseAttrValue> attrValueList(String attrId);

    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);
}
