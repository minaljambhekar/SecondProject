## Project developed by Minal jambhekar##

For the "Chat" project I have created a frontend project and a restpart.
backend project to seperate the presentation logic from database.
Backend contains following folders which is user to connect to Orcle Database
Config folder contains information and data needed by server for autherisation 
purpose . It has database url id and password details for connecting frontend to database
##The backend contains following directory structure##
**/chitchatbackendJava/src/main/java/com/niit/chitchatbackend**
    
	
	com.niit.chitchatbackend
        - App.java
	com.niit.Config
		
		- AppContextConfig.java
		
	com.niit.DAO
		- BlogDAO.java
		- EventDAO.java
		- FriendDAO.java
		- JobDAO.java
		- UserDAO.java
	com.niit.DAOImpl
		- BlogDAOImpl.java
		- EventDAOImpl.java
		- FriendDAOImpl.java
		- JobDAOImpl.java
		- UserDAOImpl.java
		
	com.niit.Model
		- Blog.java
		- BlogComment.java
		- Event.java
		- Friend.java
		- Job.java
		- JobApplication.java
		- Message.java
		- OutputMessage.java
		- PrivateMessage.java
		- user.java
	
	**/chitchatRestJava/src/main/java/com/niit/chitchatRest**	
	com.niit.config
        - AppConfig.java
		- WebAppInitializer.java
		- WebSocketConfig.java
	com.niit.controller
	    - BlogRestController.java
		- ChatForumController.java
		- EventRestController.java
		- FriendRestController.java
		- JobRestController.java
		- UserRestController.java
##The frontend contains following directory structure##



	/chitchatfrontEndJava/src/main/webapp
		      - app.js
		      - index.html
		resources
			- style.css
	app-services
	        - autherisation.service.js
			- flash.service.js
			- blog.service.js
			- chat.service.js
			- job.service.js
			- user.service.js
			- friend.service.js
			- privatechat.service.js
			
		blog
			- blogcontroller.js
			- createblog.view.html
			- Listblog.view.html
			- listnewblog.view.html
			- showblog.view.html
		
		chat
			- chat.controller.js
			- chat.view.html
		
		friend
			- friend.controller.js
			- friend.view.html
		home
			- homecontroller.js
			- home.view.html
		job
			- job.controller.js
			- jobdetail.view.html
			- searchjob.view.html
			- postjob.view.html
		privatechat
		     - privatechat.controller.js
		     - privatechat.view.html
		login
		     - login.controller.js
			 - login.view.html
		register
		     - register.controller.js
			 - register.view.html
		
		web-inf



##There are some Technologies are used in Project## Spring
1. Hibernate
2. HTML
3. Bootstrap
4. AngularJS
5. Oracle Express 10g
6.