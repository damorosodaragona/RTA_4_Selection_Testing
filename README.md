# whatTestProjectForTesting

This Project is used by "WhatTest" project to test itself.

To run the test in WhatTest:
   ```
 1. place this project in the same root of WhatTestProject, not in WhatTestProject but in the same parent folder.
    2. go in WhatTest project and open TestSelector.java in package test.testselector
        2a.find the String[] "classPath" and set it to that jar files, so change the string and put your path for that jar files.
   
   ```
 If you want place this project in another folder, to run the test in WhatTest you have to: 
        
```
   3. open TestSelector.java in package test.testselector 
    3a. in the setUp method change the string in PreviousPrject constructor and in NewProject construcor, respectively the first is the path of the classes of "p" module in this project, the second is the path of the classes of "p1" module in this project.
            so set this two strings one as the path of "whatTestProcjectForTesting/put/production/p" and the second one as the path of "whatTestProcjectForTesting/put/production/p"
```
            
 If you want run Junit4Test, open the java file TestSelectorJunit4 in Junit4Test in WhatTest project and follow instruction 2a, 3a. (so find that constants and methods in TestSelectorJunit4 and set it as explained).