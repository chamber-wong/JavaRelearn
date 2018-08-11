package wang.chamber.model;

public class URLParser {
	private String protocol;
	private String host;
	private String port;
	private String sourcePath;
	private String search;
	private String url;

	public URLParser(String url) {
		this.url = url;
		setProtocol();
		setHost();
		setPort();
		setSourcePath();
		setSearch();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 获取网络协议名称
	 * 
	 * @return
	 */
	private void setProtocol() {
		/*
		 * 需要考虑的情况: 1.大小写掺杂 2.除了http以外的所有协议名称(只需要满足首字符为字母,其他部位不能是除了字母和数字以外的字符)
		 */

		// 去除字符前后的空格
		url = url.trim();

		for (int i = 0; i < url.length() && (url.charAt(i) != '/'); i++) {
			// 提出:之前的字符
			if (url.charAt(i) == ':') {
				String protocol = url.substring(0, i).toLowerCase();
				// 对提出的字符进行合格性判断
				if (isValidProtocol(protocol)) {
					this.protocol = protocol;
					return;
				}
				break;
			}
		}
		this.protocol = null;
	}

	/**
	 * 获取域名
	 * 
	 * @return
	 */
	private void setHost() {
		/**
		 * 两种情况:(可能有端口) 1.http://idea.imsxm.com/--->http://idea.imsxm.com:80/
		 * 2.idea.imsxm.com/--->idea.imsxm.com:80/
		 */
		if (url.length() < 1) {
			this.host = null;
			return;
		}
		if (protocol == null) {
			String host;
			String h = url.substring(0, url.indexOf("/"));
			int index1 = h.indexOf(":");
			if (index1 == -1) {
				host = h;
			} else {
				host = h.substring(0, index1);
			}
			//对域名进行合格性判断
			if (isValidHost(host)) {
				this.host =  host;
			}else {
				this.host =  null;
			}
		} else{
			StringBuilder sBuilder = new StringBuilder(url);
			sBuilder.delete(0, sBuilder.indexOf("//") + 2);

			String host;
			String h = sBuilder.substring(0, sBuilder.indexOf("/"));
			int index1 = h.indexOf(":");
			if (index1 == -1) {
				host = h;
			} else {
				host = h.substring(0, index1);
			}
			//对域名进行合格性判断
			if (isValidHost(host)) {
				this.host =  host;
			}else {
				this.host =  null;
			}
		}
	}

	/**
	 * 获取端口号
	 * 
	 * @return
	 */
	private void setPort() {
		/**
		 * 同样需要判断是否有协议名称 
		 * 1.有可能有端口号,一定有: 
		 * 2.也有可能没有,在第一个//和第一个/中间一定没有:
		 */
		if (url.length() < 1) {
			this.port = null;
			return;
		}
		if (protocol == null) {
			int index = url.indexOf(":");
			if (index == -1) {
				this.port = null;
			} else {
				this.port = url.substring(index + 1, url.indexOf("/"));
			}
		} else {
			StringBuilder sBuilder = new StringBuilder(url);
			sBuilder.delete(0, sBuilder.indexOf("//") + 2);

			int index = sBuilder.indexOf(":");
			if (index == -1) {
				this.port = null;
			} else {
				this.port = sBuilder.substring(index + 1, sBuilder.indexOf("/"));
			}
		}
	}

	/**
	 * 获取资源地址
	 * 
	 * @return
	 */
	private void setSourcePath() {
		/*
		 * 先判断有没有协议名,根据/提取资源路径
		 */
		if (url.length() < 1) {
			this.sourcePath = null;
			return;
		}
		if (protocol == null) {
			int index1 = url.indexOf("/");
			int index2 = url.indexOf("?");
			String path;
			if (index2 == -1) {// 没有参数
				path = url.substring(index1 + 1);
			} else {// 有参数
				path = url.substring(index1 + 1, index2);
			}
			if (path.equals("") || path == null) {
				this.sourcePath = null;
			} else {
				this.sourcePath = path;
			}
		} else {
			StringBuilder sBuilder = new StringBuilder(url);
			sBuilder.delete(0, sBuilder.indexOf("//") + 2);

			int index1 = sBuilder.indexOf("/");
			int index2 = sBuilder.indexOf("?");
			String path;
			if (index2 == -1) {
				path = sBuilder.substring(index1 + 1);
			} else {
				path = sBuilder.substring(index1 + 1, index2);
			}
			if (path.equals("") || path == null) {
				this.sourcePath = null;
			} else {
				this.sourcePath = path;
			}
		}
	}

	/**
	 * 获取查询条件
	 * 
	 * @return
	 */
	private void setSearch() {
		/*
		 * 根据?提取参数列表
		 */
		if (url.length() < 1) {
			this.search = null;
			return;
		}
		if (protocol == null) {
			int index = url.indexOf("?");
			if (index == -1) {
				this.search = null;
			} else {
				this.search = url.substring(index + 1);
			}

		} else {
			StringBuilder sBuilder = new StringBuilder(url);
			sBuilder.delete(0, sBuilder.indexOf("//") + 2);

			int index = sBuilder.indexOf("?");
			if (index == -1) {
				this.search = null;
			} else {
				this.search = sBuilder.substring(index + 1);
			}
		}
	}

	/**
	 * 判断是否符合一个协议的名称
	 * 
	 * @param protocol
	 * @return
	 */
	private boolean isValidProtocol(String protocol) {
		int len = protocol.length();
		// 如果长度小于1,说明不是协议名
		if (len < 1)
			return false;
		char c = protocol.charAt(0);
		// 如果首字符不为字母,说明不是协议名
		if (!Character.isLetter(c))
			return false;
		// 判断每一个字符是否符合规范,如果不符合,直接说明不是协议名
		for (int i = 1; i < len; i++) {
			c = protocol.charAt(i);
			if (!Character.isLetterOrDigit(c)) {
				return false;
			}
		}
		// 所有判断都能通过,说明是协议名
		return true;
	}

	private boolean isValidHost(String host) {
		int len = host.length();
		// 如果长度小于1,说明不是域名
		if (len < 1)
			return false;
		char c = host.charAt(0);
		// 如果首字符不为字母,说明不是域名
		if (!Character.isLetter(c))
			return false;
		// 判断每一个字符是否符合规范,如果不符合,直接说明不是域名
		boolean b = false;
		for (int i = 1; i < len; i++) {
			c = host.charAt(i);
			if (!Character.isLetterOrDigit(c) && c!='.') {
				return false;
			}
			if (c == '.') {
				b = true;
			}
		}
		// 所有判断都能通过,说明是域名
		return b;
	}
	
	/**
	 * 重写toString方法
	 */
	public String toString() {
		if (host == null) {
			return "url不正确,无法打印";
		}
		return "协议名称为:\t\t" + protocol + "\n 域名为:\t\t" + host + "\n 端口为:\t\t" + port + "\n 资源路径为:\t" + sourcePath + "\n 参数为:\t\t" + search
				+ "\n 网址为:\t\t" + url;
	}

	public String getProtocol() {
		if (host == null) {
			return "url不正确,无法打印";
		}
		return protocol;
	}

	public String getHost() {
		if (host == null) {
			return "url不正确,无法打印";
		}
		return host;
	}

	public String getPort() {
		if (host == null) {
			return "url不正确,无法打印";
		}
		return port;
	}

	public String getSourcePath() {
		if (host == null) {
			return "url不正确,无法打印";
		}
		return sourcePath;
	}

	public String getSearch() {
		if (host == null) {
			return "url不正确,无法打印";
		}
		return search;
	}
	

}
