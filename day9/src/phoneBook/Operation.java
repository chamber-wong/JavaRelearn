package phoneBook;
/**
 * 联系人管理系统
 * Opreation接口类
 * @author 弄风
 *
 */
public interface Operation {
	// 添加联系人
	public abstract LinkMan[] addLinkMan(LinkMan linkMan, LinkMan[] linkMans);

	// 按姓名删除联系人
	public abstract LinkMan[] deleteLinkManByName(String name, LinkMan[] linkMans);

	// 按联系号码删除联系人
	public abstract LinkMan[] deleteLinkManByNumber(String number, LinkMan[] linkMans);

	// 按姓名修改联系人号码
	public abstract LinkMan[] setLinkMan(String name, String number, LinkMan[] linkMans);

	// 按号码查询联系人
	public abstract LinkMan searchLinkMan(String name, LinkMan[] linkMans);

	// 查询所有的联系人
	public abstract void searchAll(LinkMan[] linkMans);
}
