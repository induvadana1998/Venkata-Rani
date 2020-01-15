Action2()
{

	web_add_auto_header("Sec-Fetch-Mode", 
		"navigate");

	web_add_auto_header("Sec-Fetch-Site", 
		"same-origin");

	web_add_auto_header("Sec-Fetch-User", 
		"?1");

	web_add_auto_header("Upgrade-Insecure-Requests", 
		"1");

	lr_think_time(10);

	web_url("index.php_5", 
		"URL=https://demo.opencart.com/index.php?route=product/category&path=57", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demo.opencart.com/index.php?route=product/category&path=18&sort=rating&order=ASC&limit=100", 
		"Snapshot=t10.inf", 
		"Mode=HTML", 
		LAST);

	web_url("index.php_6", 
		"URL=https://demo.opencart.com/index.php?route=product/category&path=57&sort=p.price&order=DESC", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demo.opencart.com/index.php?route=product/category&path=57", 
		"Snapshot=t11.inf", 
		"Mode=HTML", 
		LAST);

	web_url("index.php_7", 
		"URL=https://demo.opencart.com/index.php?route=product/category&path=57&sort=p.price&order=DESC&limit=75", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demo.opencart.com/index.php?route=product/category&path=57&sort=p.price&order=DESC", 
		"Snapshot=t12.inf", 
		"Mode=HTML", 
		LAST);

	return 0;
}