## IntelliJ IDEA Hot-Swapping Configuration

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

### 3. Enable compiler auto-build (optional but recommended)
- Go to **Settings/Preferences > Build, Execution, Deployment > Compiler**
- Check **"Build project automatically"**
