package cn.comradexy.demo.service;

import cn.comradexy.demo.mapper.ServeMapper;
import cn.comradexy.demo.model.domain.Serve;
import cn.comradexy.demo.separation.OperateType;
import cn.comradexy.demo.separation.Separated;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * service demo
 *
 * @Author: ComradeXY
 * @CreateTime: 2024-08-29
 * @Description: service demo
 */
@Service
public class ServeService implements IServeService {

    @Resource
    private ServeMapper serveMapper;

    @Separated(operateType = OperateType.SELECT_ONE)
    public Serve getServeById(Long id) {
        return serveMapper.selectById(id);
    }


}
