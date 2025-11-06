## IntelliJ IDEA Enhanced HotSwap in the Debugger Configuration

To enable hot-swapping and automatic recompilation in your Grails project:

### 1. Build project before reloading classes
- Go to **Settings/Preferences > Build, Execution, Deployment > Debugger > HotSwap**
- Check **"Build project before reloading classes"**
- Set **"Reload classes after compilation"** to **"Always"**
- Check **"Enable hot-swap agent for Groovy code"**

### 2. Use Gradle as build tool
- Go to **Settings/Preferences > Build, Execution, Deployment > Build Tools > Gradle**
- Set **"Build and run using"** to **"Gradle"**
- Set **"Run tests using"** to **"Gradle"**

### 3. Enable compiler auto-build
- Go to **Settings/Preferences > Build, Execution, Deployment > Compiler**
- Check **"Build project automatically"**

### 4. Run bootRun task in debug mode from IntelliJ 

![img_2.png](img_2.png)

**or** 

![img_1.png](img_1.png)

**or**

![img_4.png](img_4.png)

### 5. Edit existing method on a controller or service

- After editing, there will be a prompt to Apply HotSwap Changes
- Refresh browser to see changes

![img_5.png](img_5.png)

### 6. Adding a new Domain, Controller, Service and Views

Will work as long as added in the right order: Domain, Service, Controller, then Views and all methods are present the first time saved

### Adding methods not supported

![img_7.png](img_7.png)

### Domain changes are not supported, but it's one click to restart the server

Contsraints changes are not applied without a restart

Field/Schema changes will display a nice restart dialog

![img_6.png](img_6.png)
