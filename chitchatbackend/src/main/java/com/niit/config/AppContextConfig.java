package com.niit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.niit.model.Blog;
import com.niit.model.BlogComment;
import com.niit.model.Friend;
import com.niit.model.Job;
import com.niit.model.JobApplication;
import com.niit.model.Message;
import com.niit.model.OutputMessage;
import com.niit.model.PrivateMessage;
import com.niit.model.User;

import antlr.debug.Event;


@Configuration
@ComponentScan(basePackages="com.niit.chitchatbackend")
public class AppContextConfig {
	
	@Bean("dataSource")
	public DataSource getOracleDataSource()
	{
		BasicDataSource dataSource=new BasicDataSource();
		
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521/ORCL");
		dataSource.setUsername("scott");
		dataSource.setPassword("password");
		return dataSource;
	}
	
	private Properties getHibernateProperties()
	{
		Properties properties=new Properties();
		properties.put("hibernate.show", "true");
		properties.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
		properties.put("hibernate.hbm2ddl.auto", "update");
		return properties;
	}

	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource)
	{
		LocalSessionFactoryBuilder sessionBuilder=new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.addAnnotatedClass(Blog.class);
		sessionBuilder.addAnnotatedClass(BlogComment.class);
		sessionBuilder.addAnnotatedClass(Event.class);
		sessionBuilder.addAnnotatedClass(Friend.class);
		sessionBuilder.addAnnotatedClass(Job.class); 
		sessionBuilder.addAnnotatedClass(JobApplication.class);
		sessionBuilder.addAnnotatedClass(Message.class);
		sessionBuilder.addAnnotatedClass(User.class);
		sessionBuilder.addAnnotatedClass(PrivateMessage.class);
		sessionBuilder.addAnnotatedClass(OutputMessage.class);
		return sessionBuilder.buildSessionFactory();
	}
	
	@Autowired
	@Bean(name="transcationManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager transactionManager=new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}
}
