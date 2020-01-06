  package shop.fims.config;
  
  import javax.sql.DataSource;
  
  import org.apache.ibatis.session.SqlSessionFactory; import
  org.mybatis.spring.SqlSessionFactoryBean; import
  org.mybatis.spring.SqlSessionTemplate; import
  org.mybatis.spring.annotation.MapperScan; import
  org.springframework.context.ApplicationContext; import
  org.springframework.context.annotation.Bean; import
  org.springframework.context.annotation.Configuration;
  
  @Configuration
  
  @MapperScan(value="shop.fims",
  sqlSessionFactoryRef="mybatisSqlSessionFactory") public class MybatisConfig {
  
  @Bean(name = "mybatisSqlSessionFactory") public SqlSessionFactory
  mybatisSqlSessionFactory(DataSource dataSource, ApplicationContext
  applicationContext) throws Exception { SqlSessionFactoryBean
  sqlSessionFactoryBean = new SqlSessionFactoryBean();
  sqlSessionFactoryBean.setDataSource(dataSource);
  sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources(
  "classpath:mapper/*.xml")); return sqlSessionFactoryBean.getObject();
  }
  
  @Bean(name = "mybatisSqlSessionTemplate") public SqlSessionTemplate
  mybatisSqlSessionTemplate(SqlSessionFactory sqlSessionFactory) throws
  Exception { return new SqlSessionTemplate(sqlSessionFactory); } }
 
