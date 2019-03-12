---
layout: default
title: Quickstart Guide
---
# Owncloud Server Quickstart Guide 

## Introduction 

[ownCloud](https://owncloud.com/) is a self-hosted open source file sync and share server. Like many of the better known cloud providers, such as Dropbox or Google Drive, ownCloud enables you to access and synchronize your files, data, contacts or calendars between your devices and to share files with others. Where ownCloud differs from these other offerings is that it gives you your own private, on-premises cloud, removing any concern that your sensitive personal information may be subject to potential unauthorized access.  

There are a number of ways to setup and install an ownCloud server. You can download and install ownCloud with a tarball, for a customized install, on your own Linux server, using Docker or virtual machine images, or by availing of the hosted services that ownCloud are partnered with.  

Please refer to https://owncloud.org/download for links to the download files for each of these options. 

This Quickstart guide will go through the short installation steps required to install the server using the virtual image for Virtual Box on a personal computer.  This will include steps showing how an administrator adds new users followed by a demonstration of how a new user can add and sync files on the server with their local directories.  

As with any cloud service, the solution consists of two main components, the server and client: 

#### The Server 

The core software behind ownCloud is the server. It supports Linux (like) operating systems and manages your files, data and controls the access.

#### The Client 

The ownCloud desktop client enables you, as an ownCloud user, to keep your data in sync wherever you are. You can add directories on your local machine and sync the stored data with the server. 

#### Further Reading

For more information on the completing different manual or custom installations, prerequisites  or additional administration tasks for ownCloud, see: 

- [ ] [ownCloud Documentation](https://doc.owncloud.org/server/10.1/admin_manual/installation/) 

## Install the Server

The following section goes through the steps required to set up the ownCloud server. 

### Install VirtualBox

If you do not have Virtual Box installed, do so now.

1. Using your preferred browser, go to the [virtualbox](https://www.virtualbox.org/wiki/Downloads)  download page.   
2. Under the heading **VirtualBox <version> platform packages** choose the host for your operating system. In this example it was **Windows hosts**. 
3. Complete the installation wizard, accepting all defaults.

### Download ownCloud Image

 As we are installing the server using a virtual image we must first download the Virtual Box OVA. 

1. Go to  https://owncloud.org/download/ and navigate to the section **Appliance**. 

2. Click **Download VirtualBox** image to begin the download, noting where on your harddrive it will be stored. 

   The image is over 1GB in size, so it may take a couple of minutes to complete. 

### Import the VirtualBox OVA 

Next, you import the  VirtualBox `.ova` image file for the ownCloud server that you downloaded in the previous task. 

1. Open the **VirtualBox Manager**, select **File** → **Import Appliance** and click the folder icon under the title **Appliance to import**. 

2. Select the file `Univention-App-owncloud-virtualbox.ova` from where you have it downloaded and click **Next**. 

3. Accept the defaults or change the base folder, if required, and click **Import**.

   This opens the Software License Agreement for the Univention Corporate Server.

4. Click **Accept** to complete the import. 

   An **Importing Appliance** progress indicator opens. Once the import is completed the UCS 4.3-with-owncloud machine is visible in the left-hand side of VirtualBox manager, powered off. 

### Start the Server

Once imported you can start the server. 

1. Ensure that the machine you imported is selected and click the Start button on the top-right of the VirtualBox Manager. 

   This opens the ownCloud Appliance configuration setup.

2. Choose a language from the first **Choose your language** dropdown list and enter a city. This is speed up configuration to align with where you are operating the server from. 

   In our example, we entered English and Dublin. 

3. Click **Next**.

   This opens the **Localization settings**. 

4. Choose the system locale, time zone and keyboard layout. 

   In our example, we entered English (Ireland), Europe/Dublin, and English (UK).

5. Click **Next**. 

   This opens the **Domain and network configuration** section. 

6. You can choose to change FQDN and hosts settings, but for this Quickguide we accept the default values. 

7. Click **Next**. 

   This opens the **Domain Setup**.

8. You can choose one of the following opens to setup the domain:

   - [ ] **Manage users and permissions directly on this system**

   - [ ] **Join into an existing UCS domain**

   - [ ] **Join into an existing Microsoft Active Directory domain**

   In our example we just need to select **Manage users and permissions directly on this system** and click **Next**.

   This opens the **Account information**.  

9. Enter a suitable name for the organization that will be administering the server, a valid email address, as a license file to activate the application will be sent to this address later, and a password. 

   You have to re-enter the password to confirm it is correct. It is important to keep a note of this password, as it is required later when logging into the server using the Administration account credentials. 

10. Click **Next**. 

    This opens the **Host settings**. 

    There is no need to change these settings, but you can keep a note of them. However, this information will be accessible once the system is running. 

11. Click **Next**. 

    This opens the **Confirm configuration settings**. 

12. Verify the settings, ensuring that the checkbox for **Update system after setup** is selected and click **Configure System**. 

    **Note:** it may take some time to configure the system, the time taken may vary depending on your computer's resources and performance. 

13. Once configuration is completed, click **Finish**. 

### Register ownCloud

Now that the ownCloud server is ready, you have to register it with a valid license file. 

1. You may be asked in the console interface to enter your Administrator username and password. Enter the username ''*Administrator*"  and the password you entered in the **Account Information** section. 

   The **Welcome to ownCloud page** opens with the IP address for the server. 

2. Open a browser and enter the IP address that you have been given. 

   In our example the IP address is 192.168.1.10, but yours will be different. This opens the Admin login screen for ownCloud server. Ignore the warning 'This is not a secure connection'.

3. Enter the username ''*Administrator*" and the password that you provided in the **Account Information** section of the configuration. 

   This opens **License request for ownCloud Appliance**. 

4. Enter a valid email address where the license file can be sent and click **REQUEST ACTIVATION**. 

5. Go to your email client and download the license file locally. You need to be able to upload the license file to the Server in the next step. 

6. Click **UPLOAD LICENSE FILE** and select the USC license file you downloaded from the email sent from USC.  

   You will get a notice saying **'Activation successful!'**

7. Click **Finish**. 

   The Univention Portal is made available in the browser. This contains links to the Server app and the System and Domain Settings.  

### Add Users to the ownCloud Server

To enable a user to access the server and sync their locally stored data you have to first create the user in the User Admin system. 

1. In the Login page, enter "*Administrator*" and the password you provided in the **Account Information** section of the server configuration. 

   This opens the Favorites dashboard with links to the key functionality of the Server application. 

2. Click the **Users** bookmark or the link User for domain management to open the Users management section. 

3. Click **Add** and enter the user details, ensuring that you put in a Last name and Username. 

4. Click **Next** and enter and re-enter a password. 

5. Keep a note of the username and password as the user will need these to login to access ownCloud through the client. 

6. Select **User has to change password on next login** and click **Create**. 

   You are informed that the user <name> has been created. You can continue to create new users or you can click **Cancel** if you have finished.

## Install the Client

### User Access to ownCloud with Client

Once the ownCloud server is running, and you have added users to the Users for the domain, you can see if the user can successfully access the server using the ownCloud desktop client. 

1. Go to <https://owncloud.com/download/> and download the ownCloud Desktop Client for your operating system. 

   In this example, we selected **ownCloud Windows Client (.msi, EN for GPO) <version>**. 

2. Run the client installer and accept all default options in the ownCloud Setup Wizard. 

   Once installation is complete you may be prompted to restart your computer. 

3. Open the ownCloud desktop client and in **Connect with ownCloud** enter the IP Address of the ownCloud server, which you used earlier to access the Admin web interface, in the **Server Address** field.  

   This causes a Untrusted Certificate dialog to appear. 

4. Select the **Trust this certificate anyway** checkbox and click **OK**. 

5.  Using the Username and password you gave the user in the ownCloud Server User management section, and accept all defaults. 

6. To verify that it is working, create a local folder within the app and add a file to it. Then, reenter the IP Address you used for the ownCloud server in a browser and open ownCloud under
   Applications and verify that the users changes are there.   

   

   
















