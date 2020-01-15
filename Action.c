Action()
{

	web_set_sockets_option("SSL_VERSION", "TLS1.2");

	web_add_auto_header("Sec-Fetch-Mode", 
		"no-cors");

	web_add_auto_header("Sec-Fetch-Site", 
		"none");
lr_start_transaction("opencart");

	web_url("merchants.json", 
		"URL=https://www.gstatic.com/autofill/weekly/merchants.json", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=", 
		"Snapshot=t1.inf", 
		"Mode=HTML", 
		LAST);
lr_end_transaction("opencart", LR_AUTO);

	web_url("bins.json", 
		"URL=https://www.gstatic.com/autofill/hourly/bins.json", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=", 
		"Snapshot=t2.inf", 
		"Mode=HTML", 
		LAST);

	web_add_header("A-IM", 
		"x-bm,gzip");

	lr_think_time(5);

	web_url("seed", 
		"URL=https://clientservices.googleapis.com/chrome-variations/seed?osname=win&channel=stable&milestone=79", 
		"Resource=0", 
		"Referer=", 
		"Snapshot=t3.inf", 
		"Mode=HTML", 
		LAST);

	web_revert_auto_header("Sec-Fetch-Mode");

	web_revert_auto_header("Sec-Fetch-Site");

	web_add_auto_header("Upgrade-Insecure-Requests", 
		"1");
lr_start_transaction("login");

	web_url("demo.opencart.com", 
		"URL=http://demo.opencart.com/", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t4.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=https://ssl.gstatic.com/safebrowsing/csd/client_model_v5_variation_0.pb", "Referer=", ENDITEM, 
		"Url=https://ssl.gstatic.com/safebrowsing/csd/client_model_v5_ext_variation_0.pb", "Referer=", ENDITEM, 
		"Url=https://demo.opencart.com/catalog/view/javascript/font-awesome/fonts/fontawesome-webfont.woff2?v=4.7.0", "Referer=https://demo.opencart.com/catalog/view/javascript/font-awesome/css/font-awesome.min.css", ENDITEM, 
		"Url=https://fonts.gstatic.com/s/opensans/v17/mem5YaGs126MiZpBA-UN7rgOUuhp.woff2", "Referer=https://fonts.googleapis.com/css?family=Open+Sans:400,400i,300,700", ENDITEM, 
		"Url=https://fonts.gstatic.com/s/opensans/v17/mem8YaGs126MiZpBA-UFVZ0b.woff2", "Referer=https://fonts.googleapis.com/css?family=Open+Sans:400,400i,300,700", ENDITEM, 
		"Url=https://clients1.google.com/tbproxy/af/query?q=Chc2LjEuMTcxNS4xNDQyL2VuIChHR0xMKRMZ5YRr3Z-avlkjLWdns_4kFA==", "Referer=", ENDITEM, 
		LAST);
lr_end_transaction("login", LR_AUTO);

	web_add_auto_header("Sec-Fetch-Mode", 
		"navigate");

	web_add_auto_header("Sec-Fetch-Site", 
		"same-origin");

	web_add_auto_header("Sec-Fetch-User", 
		"?1");

	lr_think_time(5);

	web_link("Login", 
		"Text=Login", 
		"Snapshot=t5.inf", 
		EXTRARES, 
		"Url=https://clients1.google.com/tbproxy/af/query?q=Chc2LjEuMTcxNS4xNDQyL2VuIChHR0xMKRMZ5YRr3Z-avlkjLWdns_4kFBMZVyoHDriExaAjLXhvEhkkIy3OQUx6JBQ=", "Referer=", ENDITEM, 
		LAST);

	web_add_header("Origin", 
		"https://demo.opencart.com");

	lr_think_time(23);

	web_submit_data("index.php", 
		"Action=https://demo.opencart.com/index.php?route=account/login", 
		"Method=POST", 
		"EncType=multipart/form-data", 
		"RecContentType=text/html", 
		"Referer=https://demo.opencart.com/index.php?route=account/login", 
		"Snapshot=t6.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=email", "Value={mailone}", ENDITEM, 
		"Name=password", "Value=ajsisu", ENDITEM, 
		LAST);

	return 0;
}
