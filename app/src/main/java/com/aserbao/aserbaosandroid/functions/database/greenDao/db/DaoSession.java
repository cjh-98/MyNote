package com.aserbao.aserbaosandroid.functions.database.greenDao.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.cc.mynote.Pad;

import com.aserbao.aserbaosandroid.functions.database.greenDao.db.PadDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig padDaoConfig;

    private final PadDao padDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        padDaoConfig = daoConfigMap.get(PadDao.class).clone();
        padDaoConfig.initIdentityScope(type);

        padDao = new PadDao(padDaoConfig, this);

        registerDao(Pad.class, padDao);
    }
    
    public void clear() {
        padDaoConfig.clearIdentityScope();
    }

    public PadDao getPadDao() {
        return padDao;
    }

}