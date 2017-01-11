/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gwac.dao;

import com.gwac.model.ObjectIdentity;
import com.gwac.model.ObjectType;
import java.math.BigInteger;
import java.util.Iterator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author xy
 */
public class ObjectIdentityDaoImpl extends BaseHibernateDaoImpl<ObjectIdentity> implements ObjectIdentityDao {

  private static final Log log = LogFactory.getLog(ObjectIdentityDaoImpl.class);

  @Override
  public ObjectIdentity getByName(ObjectType objType, String objName) {
    Session session = getCurrentSession();
    String sql = "select * from object_identity where obj_type_id=? and obj_name=?";
    Query q = session.createSQLQuery(sql).addEntity(ObjectIdentity.class);
    q.setShort(0, objType.getObjTypeId());
    q.setString(1, objName);

    if (!q.list().isEmpty()) {
      return (ObjectIdentity) q.list().get(0);
    } else {
      ObjectIdentity obj = new ObjectIdentity();
      obj.setObjName(objName);
      obj.setObjTypeId(objType.getObjTypeId());
      super.save(obj);
      return obj;
    }
  }

}
