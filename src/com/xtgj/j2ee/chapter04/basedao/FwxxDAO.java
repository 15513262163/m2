package com.xtgj.j2ee.chapter04.basedao;

import java.util.List;
import com.xtgj.j2ee.chapter04.entity.FWXX;

public interface FwxxDAO {
	public void add(FWXX item);
	public void del(int fwid);
	public void update(FWXX item);
	public List search(FWXX condition);

}
