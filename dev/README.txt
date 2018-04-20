Setting up the Eclipse environment to a different branch
--------------------------------------------------------

01. Copy 'windux' folder to the target branch (follow the next steps at the target branch)
02. Remove dev/testar_ws
03. Run dev/eclipse/eclipse.exe (do not edit anything: you are at the source branch workspace!)
04. Switch to a new workspace in target branch: dev/testar_ws (File -> Switch workspace -> Other)
05. Close Welcome tab (you have an empty workpace at target branch)
06. Change to Java perspective (View -> Open perspective -> Other -> Java)
07. Import ant projects from src to your empty workspace:
07a. Repeat for all projects: core, graph, linux, native, testar, windows
07b. Import ant project from src (File -> New -> Project -> Java -> Java project from existing Ant buildfile)
07c. Ant buildfile = src/project_name/build.xml (tick "link to the buildfile in the file system")
08. Set projects dependencies (Right click project -> Properties -> Java build path -> Projects -> Add):
08a. linux <- core
08b. windows <- core
08c. native <- core, linux, windows
08d. graph <- core, native
08e. testar <- core, graph, native
09. Compile TESTAR: project testar -> build.xml -> right click -> run as -> ant build)
10. Set run configuration:
10a. Right click testar project -> Run as -> Run configurations -> Java application -> Right click -> New
10b. Name = TESTAR
10c. Main class = Main - org.fruit.monkey
10d. Arguments -> Working directory -> Other -> File system = target_branch_path\windux\src\testar\target
11. Run TESTAR!