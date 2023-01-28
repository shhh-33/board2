package ojc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * -------------------------------------
 * STS�뿉�꽌 Lombok�쓣 �궗�슜�븯湲� �쐞�빐�꽌�뒗 
 * -------------------------------------
 * 1. pom.xml�뿉 lombok dependency瑜� 異붽��븯怨�
 * 2. .m2 �븘�옒 lombok-1.16.16.jar瑜� 蹂듭궗�썑 lombok.jar濡� �씠由� 蹂�寃�
 * 3. SpringToolSuite4.ini �뙆�씪�쓽 留⑥븘�옒�뿉 -javaagent:lombok.jar 異붽�
 * 4. STS �떎�떆 �떆�옉
 * @author jclee
 *
 * �삤�씪�겢履쎌쓽 XUSER �뀒�씠釉붿뿉 ���쓳�릺�뒗 紐⑤뜽 �겢�옒�뒪
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
