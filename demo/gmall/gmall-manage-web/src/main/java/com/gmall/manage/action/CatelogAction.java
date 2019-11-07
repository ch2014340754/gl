package com.gmall.manage.action;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gmall.bean.PmsBaseCatalog1;
import com.gmall.bean.PmsBaseCatalog2;
import com.gmall.bean.PmsBaseCatalog3;
import com.gmall.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @creatdate 2019-11-03 18:54
 */
@Controller
@CrossOrigin
public class CatelogAction {

    @Reference
    CatalogService catelogService;

    @RequestMapping("getCatalog1")
    @ResponseBody
    List<PmsBaseCatalog1> getCatalog1(){
        List<PmsBaseCatalog1> list1 = catelogService.getCatalog1();
        return list1;
    }

    @RequestMapping("getCatalog2")
    @ResponseBody
    List<PmsBaseCatalog2> getCatalog2(String catalog1Id ){
        List<PmsBaseCatalog2> list2 = catelogService.getCatalog2(catalog1Id);
        return list2;
    }

    @RequestMapping("getCatalog3")
    @ResponseBody
    List<PmsBaseCatalog3> getCatalog33(String catalog2Id ){
        List<PmsBaseCatalog3> list3 = catelogService.getCatalog3(catalog2Id);
        return list3;
    }
}
