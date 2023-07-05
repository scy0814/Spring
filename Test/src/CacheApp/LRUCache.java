package CacheApp;

import java.util.ArrayList;
import java.util.List;

public class LRUCache {
	private List<String> listCache;
	private int cacheSize;
	
	public LRUCache(int cSize) {
		cacheSize = cSize;
		listCache = new ArrayList<String>();
	}
	
	public boolean getCity(String City) {
		int idxCache = 0;
		boolean rtn=false;
		while(idxCache < listCache.size()) {
			String cache = listCache.get(idxCache);
			if(cache.equalsIgnoreCase(City)) {
				changeSlot(idxCache,City);
				rtn = true;
				break;
			}
		}
		return rtn;
	}
	public void changeSlot(int numOfSlot, String Value) {
		int idx = 0;
		while(idx < numOfSlot) {
			listCache.set(idx, listCache.get(idx+1));
			idx++;
		}
		listCache.set(numOfSlot, Value);
		System.out.println("[changeSlot] "+listCache);
	}
}
