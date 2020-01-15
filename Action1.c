Action1()
{

	web_add_auto_header("Sec-Fetch-Mode", 
		"navigate");

	web_add_auto_header("Sec-Fetch-Site", 
		"same-origin");

	web_add_auto_header("Sec-Fetch-User", 
		"?1");

	web_add_auto_header("Upgrade-Insecure-Requests", 
		"1");

	lr_think_time(11);

	web_url("index.php_2", 
		"URL=https://demo.opencart.com/index.php?route=product/category&path=18", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demo.opencart.com/index.php?route=account/login", 
		"Snapshot=t7.inf", 
		"Mode=HTML", 
		LAST);

	lr_think_time(6);

	web_url("index.php_3", 
		"URL=https://demo.opencart.com/index.php?route=product/category&path=18&sort=rating&order=ASC", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demo.opencart.com/index.php?route=product/category&path=18", 
		"Snapshot=t8.inf", 
		"Mode=HTML", 
		LAST);

	web_url("index.php_4", 
		"URL=https://demo.opencart.com/index.php?route=product/category&path=18&sort=rating&order=ASC&limit=100", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demo.opencart.com/index.php?route=product/category&path=18&sort=rating&order=ASC", 
		"Snapshot=t9.inf", 
		"Mode=HTML", 
		LAST);

	return 0;
}
