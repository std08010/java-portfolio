## Java
<p>My personal codebase while learning the Java language</p>
<h3 id="projects">Projects</h3>
<ul>
<li><em><strong>basics</strong></em><br>
some basic features of Java</li>
<li><em><strong>examples</strong></em><br>
various small examples of algorithms</li>
<li><em><strong>puzzles</strong></em><br>
my solutions to all the puzzles inside the books</li>
</ul>
<blockquote>
<p>Written with <a href="https://stackedit.io/">StackEdit</a>.</p>
</blockquote>


If you want to run classes that belong to a package you must provide as classpath the root folder where the .class files
are located. And you must provide also the full name of the class along with the package name. So the jvm will append the 
classpath folder and the package name, and it must find the .class file of the class you are trying to run.
<p>For example: java -classpath "F:\Workspaces\PortfolioProjects\java-portfolio\src\main\java" com.cipitech.samples.java.basics.MyFirstApp</p>
<p>Or from the IDE: java -classpath  F:\Workspaces\PortfolioProjects\java-portfolio\target\production\java-portfolio com.cipitech.samples.java.basics.MyFirstApp</p>
