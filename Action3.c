Action3()
{


	web_add_auto_header("Sec-Fetch-Mode", 
		"navigate");

	web_add_auto_header("Sec-Fetch-Site", 
		"same-origin");

	web_add_auto_header("Sec-Fetch-User", 
		"?1");

	web_add_auto_header("Upgrade-Insecure-Requests", 
		"1");

	web_url("index.php_8", 
		"URL=https://demo.opencart.com/index.php?route=account/logout", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demo.opencart.com/index.php?route=product/category&path=57&sort=rating&order=ASC&limit=100", 
		"Snapshot=t13.inf", 
		"Mode=HTML", 
		LAST);


	web_link("Your Store", 
		"Text=Your Store", 
		"Snapshot=t14.inf", 
		LAST);

	return 0;
}