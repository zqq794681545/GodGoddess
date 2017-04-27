package com.godgoddess.base.action;

import javax.annotation.PreDestroy;

import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.godgoddess.base.entity.TBaseUserEntity;
import com.godgoddess.base.util.Md5;

@Component
public class Memory {
	
	@Autowired
	 private Ehcache ehcache;
	
	public void setValue(String key, Object value,int timeToIdleSeconds,int timeToLiveSeconds) {
         ehcache.put(new Element(key, value,timeToIdleSeconds,timeToLiveSeconds));
     }
     
     public Object getValue(String key) {
         Element element = ehcache.get(key);
         return element != null ? element.getObjectValue() : null;
     }
	
	@PreDestroy
    protected void shutdown() {
        if (ehcache != null) {
            ehcache.getCacheManager().shutdown();
        }
    }
	public TBaseUserEntity currentLoginUser() {
        Element element = ehcache.get("");
        return element == null ? null : (TBaseUserEntity) element.getObjectValue();
    }

	 public boolean checkLoginInfo(String token) {
        Element element = ehcache.get(token);
        return element != null && (TBaseUserEntity) element.getObjectValue() != null;
    }
	 public void clearLoginInfo() {
		 TBaseUserEntity tBaseUserEntity = currentLoginUser();
        if (tBaseUserEntity != null) {
            // 根据登录的用户名生成seed，然后清除登录信息
            String seed = Md5.md5Digest(tBaseUserEntity.getPhone());
            clearLoginInfoBySeed(seed);
        }
    }
	public void clearLoginInfoBySeed(String seed) {
		 // 根据seed找到对应的token
		Element element = ehcache.get(seed);
		 if (element != null) {
		     // 根据token清空之前的登录信息
		     ehcache.remove(seed);
		     ehcache.remove(element.getObjectValue());
		}
	}

}
