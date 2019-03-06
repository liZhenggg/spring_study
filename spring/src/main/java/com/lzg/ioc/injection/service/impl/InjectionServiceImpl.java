package main.java.com.lzg.ioc.injection.service.impl;

import main.java.com.lzg.ioc.injection.dao.InjectionDao;
import main.java.com.lzg.ioc.injection.service.InjectionService;

public class InjectionServiceImpl implements InjectionService {

    private InjectionDao injectionDao;

    //Spring 设值注入
//    public void setInjectionDao(InjectionDao injectionDao) {
//        this.injectionDao = injectionDao;
//    }

    //Spring 构造注入
    public InjectionServiceImpl(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }

    public void save(String arg) {
        System.out.println("Service接受参数：" + arg);
        arg = arg + ":" + this.hashCode();
        injectionDao.save(arg);
    }
}
