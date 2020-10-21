package Course3;

public class advanceLocators {
		<input id="q" class="q" name="q">
		
		//by id
				driver.findElement(By.cssSelector('#q'));
		//by class
				driver.findElement(By.cssSelector('.q'));
		//by name
				driver.findElement(By.cssSelector("input[name='q']"));		
	
//#combine multiple css atributs
		<input class="q" type="text">
		//tag and class
		driver.findElement(By.cssSelector("input.q"));
		
		<input id="q" type="text">
//tag and id
		driver.findElement(By.cssSelector("input#q"));
		
		<input type="radio" value="radio button">
//tag and attribute
		driver.findElement(By.cssSelector("input[type='radio']"));	
		driver.findElement(By.cssSelector("input[value='radio button']"));
		
//#multiple classes
		<button type="button" class="btn btn-lg btn-primary">
		<button type="button" class="btn btn-lg btn-success">
		<button type="button" class="btn btn-lg btn-info">
		
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-success"));
		
//#Ways to match text
//exact match
		
		<div id="textfield">
		driver.findElement(By.cssSelector("div[id='textfield']"));
		
//by prefix
		
		<div id="textField_randomId">
		driver.findElement(By.cssSelector("div[id^='textField']"));
		
//by suffix
		
		<div id="randomId_textField">
		driver.findElement(By.cssSelector("div[id$='textField']"));
//by substring
		
				<div id="123_randomId_textField">
				driver.findElement(By.cssSelector("div[id*='textField']"));
				
//#find childs nodes
//child
				<div id="parent">
				<a id="child" href="/child">Child</a></div>
				driver.findElement(By.cssSelector("div#parent a"));
//nth child
				
				<ul id="list">
				<li>One</li>
				<li>Two</li>
				<li>Three</li>
				</ul>
				driver.findElement(By.cssSelector("#list li:nth-child(n)"));
		
		
		
}
