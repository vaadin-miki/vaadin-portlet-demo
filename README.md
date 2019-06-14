# vaadin-portlet-demo
Portlet demo with the latest Vaadin. Depends on a package that is currently in development.

# BEFORE YOU DEPLOY

This package heavily depends on `Flow-2.0-SNAPSHOT` from branch `4760-flow-20-portlet-preparations`, so make a local install of that branch (skip the tests). Once you do, find in your maven repository `flow-client` and copy `META-INF/resources/VAADIN` to root of static resources folder in your portal (so, for Liferay it would be `liferay/tomcat/webapps/ROOT/html`). Make sure the directory you put it to is named `html` (so `html/VAADIN/static/client/client-ABC.cache.js` is the location of the file).  

This package depends on a private repository `flow-portlet-support` and its branch `embedded`. Make sure you have access to that repository and make a local install of that.

# DEPLOYING

Do `mvn package`, then open the contents of the produced `.war` file. Move contents of `WEB-INF/classes/WEB-INF` (4 files) directly to `WEB-INF`.

Follow regular deployment procedure for your portal. For Liferay it would be just copying the file into `deploy` directory.

# ENABLING

You probably need to do it only once. Log in to your portal as admin and add the portlet to the page. It is found in group `Vaadin`. 

# YAY!

If everything went well, you can see in portal console information about Vaadin version and it running in debug mode. Congratulations!
 