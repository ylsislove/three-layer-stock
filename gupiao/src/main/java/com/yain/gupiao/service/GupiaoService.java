package com.yain.gupiao.service;

import com.yain.gupiao.domain.Gupiao;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 *
 * @author Apple_Coco
 * @version V1.0 2019/10/13 12:48
 */
@Service
public interface GupiaoService {

    Long findDataCount();

    List<Gupiao> findDataPage(int page, int limit);

    List<Gupiao> findAllData();

    Double calcFun1();

    Long calcFun2();

    Long calcFun3();

}
