package jmp.spring.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class OdbcTest {
	
	@Test
	public void test() throws ClassNotFoundException {
		Connection con = null;

		// 시간을 찍기위한 변수
		long start = System.currentTimeMillis(); 

		// 클래스 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			for( int i=0; i<100;i++) {
				try {
					con = DriverManager.getConnection(
							"jdbc:oracle:thin:@localhost:1521:XE", "spring","spring");
					
					log.info(con);
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					log.info("conClose1 오류");
				} finally {
						try {
							if ( con != null )
								con.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							log.info("conClose2 오류");
							e.printStackTrace();
						}
				}
			}
			
			long end = System.currentTimeMillis();
			
			log.info(end-start+"ms");
			log.info((end-start)/1000+"초");

	}
}
