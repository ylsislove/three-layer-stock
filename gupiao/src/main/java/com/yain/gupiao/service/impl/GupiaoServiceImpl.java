package com.yain.gupiao.service.impl;

import com.yain.gupiao.domain.Gupiao;
import com.yain.gupiao.repository.GupiaoRepository;
import com.yain.gupiao.service.GupiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * TODO
 *
 * @author Apple_Coco
 * @version V1.0 2019/10/13 13:10
 */
@Component
public class GupiaoServiceImpl implements GupiaoService {

    @Autowired
    private GupiaoRepository gupiaoRepository;

    @Override
    public Long findDataCount() {
        return gupiaoRepository.findDataCount();
    }

    @Override
    public List<Gupiao> findDataPage(int page, int limit) {
       return gupiaoRepository.findDataPage(page, limit);
    }

    @Override
    public List<Gupiao> findAllData() {
        return gupiaoRepository.findAllData();
    }

    @Override
    public Double calcFun1() {
        return gupiaoRepository.calcFun1();
    }

    @Override
    public Long calcFun2() {
        return gupiaoRepository.calcFun2();
    }

    @Override
    public Long calcFun3() {
        return gupiaoRepository.calcFun3();
    }

}
