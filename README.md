# Cloud Computing Assignment Number 1: Hotel

The goal of this assignment is to learn how to connect to amazon aws EC2 instance and deploy the web based project on to the server and give access to multiple user. The application will accept user inputs and the input will directed to the server and sent back to the user after processing.

## Getting Started

Copy paste the url provided here http://ec2-54-218-236-94.us-west-2.compute.amazonaws.com:8080/HotelApp/ to any browser to see the web application. Once the application is up and running, user will be able be to see User Inteface. User Interface includes Home section, About us section, Contact section, portfolio section, our skills section.

1) On the nav bar click on  Contact tab.
2) Fill out all the text box, this form has post method associated with it.
3) First name is the mandatory, make sure that the First name is not empty.
4) After filling out the details click on Click me.
5) Then you will be directed to the Review Page, where you will see thank you message with the name you specified at Contact form.

## Operations performed

Created Amazon linux EC2 instance using default security group.
Used putty to execute linux command and installed apache-tomcat 8.5.37.
To run the application used apache tomcat 8.5.37 server on local machine.
uploaded the application on the apache tomcat on the linux server.
To run the application on the server used the public DNS address of the EC2 instance and appended it with the port number of apache and the application name.

### Prerequisities

Internet connectivity, 
Browser

## References

Deploy Java Web App on Amazon Linux EC2 Instance Using Tomcat           
https://www.youtube.com/watch?v=_d-c9uGcUrU

Install a LAMP Web Server with the Amazon Linux AMI  
https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/install-LAMP.html

Configure Apache Web Server on Amazon Linux 2 to Use SSL/TLS
https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/SSL-on-an-instance.html

## Author

* **Sumit Ghewade** - *Initial work* - [ghewadesumit](https://github.com/ghewadesumit)
